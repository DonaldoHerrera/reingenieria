package bo.app;

import com.appboy.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

public final class p implements r {
    private static final String c = Hg.a(p.class);
    final ConcurrentHashMap<String, bo> a;
    final ConcurrentHashMap<String, bo> b;
    private final bh d;
    private final dl e;
    private final LinkedBlockingQueue<cr> f = new LinkedBlockingQueue<>(1000);
    private final Bf g;

    public p(dl dlVar, bh bhVar, Bf bf) {
        this.e = dlVar;
        this.d = bhVar;
        this.g = bf;
        this.a = new ConcurrentHashMap<>();
        this.b = new ConcurrentHashMap<>();
    }

    private void d(cr crVar) {
        crVar.d(this.d.f());
        crVar.a(this.g.u());
        crVar.a(this.d.b());
        crVar.a((cd) this.e.b());
        crVar.a(e());
    }

    private synchronized bn e() {
        ArrayList arrayList;
        Collection<bo> values = this.a.values();
        arrayList = new ArrayList();
        for (bo boVar : values) {
            arrayList.add(boVar);
            values.remove(boVar);
            String str = c;
            StringBuilder sb = new StringBuilder();
            sb.append("Event dispatched: ");
            sb.append(((JSONObject) boVar.forJsonPut()).toString());
            sb.append(" with uid: ");
            sb.append(boVar.d());
            Hg.a(str, sb.toString());
        }
        return new bn(new HashSet(arrayList));
    }

    public synchronized void a(bv bvVar) {
        if (!this.b.isEmpty()) {
            Hg.a(c, "Flushing pending events to dispatcher map");
            for (bo a2 : this.b.values()) {
                a2.a(bvVar);
            }
            this.a.putAll(this.b);
            this.b.clear();
        }
    }

    public synchronized void b(bo boVar) {
        if (boVar == null) {
            Hg.e(c, "Tried to add null AppboyEvent to pending dispatch.");
        } else {
            this.b.putIfAbsent(boVar.d(), boVar);
        }
    }

    public cr c() {
        cr crVar = (cr) this.f.poll();
        if (crVar != null) {
            b(crVar);
        }
        return crVar;
    }

    private void c(cr crVar) {
        if (this.d.c() != null) {
            crVar.a(this.d.c());
        }
        if (this.g.d() != null) {
            crVar.b(this.g.d().toString());
        }
        crVar.c("2.1.4");
        crVar.a(dn.a());
    }

    public cr b() {
        return b((cr) this.f.take());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
        return r2;
     */
    public synchronized cr b(cr crVar) {
        if (crVar == null) {
            return null;
        }
        c(crVar);
        if (crVar instanceof cy) {
            return crVar;
        }
        if (!(crVar instanceof cp)) {
            if (!(crVar instanceof cq)) {
                d(crVar);
                return crVar;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return h.e();
    }

    public void a(bo boVar) {
        if (boVar == null) {
            Hg.e(c, "Tried to add null AppboyEvent to dispatch.");
        } else {
            this.a.putIfAbsent(boVar.d(), boVar);
        }
    }

    public void a(cr crVar) {
        if (crVar == null) {
            throw new NullPointerException();
        } else if (d()) {
            Hg.c(c, "Network requests are offline, not adding request to queue.");
        } else {
            String str = c;
            StringBuilder sb = new StringBuilder();
            sb.append("Adding request to dispatcher with parameters: ");
            sb.append(crVar.h());
            Hg.c(str, sb.toString());
            this.f.add(crVar);
        }
    }

    public boolean a() {
        return !this.f.isEmpty();
    }
}
