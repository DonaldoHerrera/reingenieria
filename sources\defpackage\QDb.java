package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: QDb reason: default package */
/* compiled from: ZoneRulesProvider */
public abstract class QDb {
    private static final CopyOnWriteArrayList<QDb> a = new CopyOnWriteArrayList<>();
    private static final ConcurrentMap<String, QDb> b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        PDb.a();
    }

    protected QDb() {
    }

    public static Set<String> a() {
        return Collections.unmodifiableSet(b.keySet());
    }

    private static void b(QDb qDb) {
        for (String str : qDb.b()) {
            C6355eDb.a(str, "zoneId");
            if (((QDb) b.putIfAbsent(str, qDb)) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to register zone as one already registered with that ID: ");
                sb.append(str);
                sb.append(", currently loading from provider: ");
                sb.append(qDb);
                throw new ODb(sb.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract NDb b(String str, boolean z);

    /* access modifiers changed from: protected */
    public abstract Set<String> b();

    public static NDb a(String str, boolean z) {
        C6355eDb.a(str, "zoneId");
        return a(str).b(str, z);
    }

    private static QDb a(String str) {
        QDb qDb = (QDb) b.get(str);
        if (qDb != null) {
            return qDb;
        }
        if (b.isEmpty()) {
            throw new ODb("No time-zone data files registered");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown time-zone ID: ");
        sb.append(str);
        throw new ODb(sb.toString());
    }

    public static void a(QDb qDb) {
        C6355eDb.a(qDb, "provider");
        b(qDb);
        a.add(qDb);
    }
}
