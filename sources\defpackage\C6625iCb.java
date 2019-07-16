package defpackage;

import com.google.common.base.Ascii;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: iCb reason: default package and case insensitive filesystem */
/* compiled from: Chronology */
public abstract class C6625iCb implements Comparable<C6625iCb> {
    public static final CDb<C6625iCb> a = new C6557hCb();
    private static final ConcurrentHashMap<String, C6625iCb> b = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, C6625iCb> c = new ConcurrentHashMap<>();
    private static final Method d;

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", new Class[]{String.class});
        } catch (Throwable unused) {
            method = null;
        }
        d = method;
    }

    protected C6625iCb() {
    }

    private static void a() {
        if (b.isEmpty()) {
            b((C6625iCb) C7034oCb.e);
            b((C6625iCb) CCb.e);
            b((C6625iCb) C7586wCb.e);
            b((C6625iCb) C7241rCb.f);
            b((C6625iCb) C6761kCb.e);
            b.putIfAbsent("Hijrah", C6761kCb.e);
            c.putIfAbsent("islamic", C6761kCb.e);
            Iterator it = ServiceLoader.load(C6625iCb.class, C6625iCb.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                C6625iCb icb = (C6625iCb) it.next();
                b.putIfAbsent(icb.getId(), icb);
                String calendarType = icb.getCalendarType();
                if (calendarType != null) {
                    c.putIfAbsent(calendarType, icb);
                }
            }
        }
    }

    public static C6625iCb b(C7036oDb odb) {
        C6355eDb.a(odb, "temporal");
        C6625iCb icb = (C6625iCb) odb.a(BDb.a());
        return icb != null ? icb : C7034oCb.e;
    }

    public static C6625iCb of(String str) {
        a();
        C6625iCb icb = (C6625iCb) b.get(str);
        if (icb != null) {
            return icb;
        }
        C6625iCb icb2 = (C6625iCb) c.get(str);
        if (icb2 != null) {
            return icb2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown chronology: ");
        sb.append(str);
        throw new C5687cBb(sb.toString());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new ACb(Ascii.VT, this);
    }

    public abstract XBb a(C7036oDb odb);

    /* access modifiers changed from: 0000 */
    public <D extends XBb> C6489gCb<D> c(C6967nDb ndb) {
        C6489gCb<D> gcb = (C6489gCb) ndb;
        if (equals(gcb.toLocalDate().getChronology())) {
            return gcb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Chrono mismatch, required: ");
        sb.append(getId());
        sb.append(", supplied: ");
        sb.append(gcb.toLocalDate().getChronology().getId());
        throw new ClassCastException(sb.toString());
    }

    public abstract XBb date(int i, int i2, int i3);

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6625iCb)) {
            return false;
        }
        if (compareTo((C6625iCb) obj) != 0) {
            z = false;
        }
        return z;
    }

    public abstract C6693jCb eraOf(int i);

    public abstract String getCalendarType();

    public abstract String getId();

    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public String toString() {
        return getId();
    }

    private static void b(C6625iCb icb) {
        b.putIfAbsent(icb.getId(), icb);
        String calendarType = icb.getCalendarType();
        if (calendarType != null) {
            c.putIfAbsent(calendarType, icb);
        }
    }

    public ZBb<?> c(C7036oDb odb) {
        try {
            return a(odb).a(C7239rBb.a(odb));
        } catch (C5687cBb e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            sb.append(odb.getClass());
            throw new C5687cBb(sb.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    public <D extends XBb> C5553aCb<D> b(C6967nDb ndb) {
        C5553aCb<D> acb = (C5553aCb) ndb;
        if (equals(acb.toLocalDate().getChronology())) {
            return acb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Chrono mismatch, required: ");
        sb.append(getId());
        sb.append(", supplied: ");
        sb.append(acb.toLocalDate().getChronology().getId());
        throw new ClassCastException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public <D extends XBb> D a(C6967nDb ndb) {
        D d2 = (XBb) ndb;
        if (equals(d2.getChronology())) {
            return d2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Chrono mismatch, expected: ");
        sb.append(getId());
        sb.append(", actual: ");
        sb.append(d2.getChronology().getId());
        throw new ClassCastException(sb.toString());
    }

    public C6353eCb<?> a(C6623iBb ibb, NBb nBb) {
        return C6489gCb.a(this, ibb, nBb);
    }

    /* access modifiers changed from: 0000 */
    public void a(Map<C7381tDb, Long> map, C6423fDb fdb, long j) {
        Long l = (Long) map.get(fdb);
        if (l == null || l.longValue() == j) {
            map.put(fdb, Long.valueOf(j));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid state, field: ");
        sb.append(fdb);
        String str = " ";
        sb.append(str);
        sb.append(l);
        sb.append(" conflicts with ");
        sb.append(fdb);
        sb.append(str);
        sb.append(j);
        throw new C5687cBb(sb.toString());
    }

    /* renamed from: a */
    public int compareTo(C6625iCb icb) {
        return getId().compareTo(icb.getId());
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(getId());
    }

    static C6625iCb a(DataInput dataInput) throws IOException {
        return of(dataInput.readUTF());
    }
}
