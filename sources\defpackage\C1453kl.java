package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: kl reason: default package and case insensitive filesystem */
/* compiled from: BaseSpringSystem */
public class C1453kl {
    private final Map<String, C1577ol> a = new HashMap();
    private final Set<C1577ol> b = new CopyOnWriteArraySet();
    private final C1697sl c;
    private final CopyOnWriteArraySet<C1757ul> d = new CopyOnWriteArraySet<>();
    private boolean e = true;

    public C1453kl(C1697sl slVar) {
        if (slVar != null) {
            this.c = slVar;
            this.c.a(this);
            return;
        }
        throw new IllegalArgumentException("springLooper is required");
    }

    public C1577ol a() {
        C1577ol olVar = new C1577ol(this);
        b(olVar);
        return olVar;
    }

    public boolean b() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public void b(C1577ol olVar) {
        if (olVar == null) {
            throw new IllegalArgumentException("spring is required");
        } else if (!this.a.containsKey(olVar.d())) {
            this.a.put(olVar.d(), olVar);
        } else {
            throw new IllegalArgumentException("spring is already registered");
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C1577ol olVar) {
        if (olVar != null) {
            this.b.remove(olVar);
            this.a.remove(olVar.d());
            return;
        }
        throw new IllegalArgumentException("spring is required");
    }

    /* access modifiers changed from: 0000 */
    public void a(double d2) {
        for (C1577ol olVar : this.b) {
            if (olVar.i()) {
                olVar.a(d2 / 1000.0d);
            } else {
                this.b.remove(olVar);
            }
        }
    }

    public void b(double d2) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((C1757ul) it.next()).a(this);
        }
        a(d2);
        if (this.b.isEmpty()) {
            this.e = true;
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((C1757ul) it2.next()).b(this);
        }
        if (this.e) {
            this.c.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        C1577ol olVar = (C1577ol) this.a.get(str);
        if (olVar != null) {
            this.b.add(olVar);
            if (b()) {
                this.e = false;
                this.c.a();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("springId ");
        sb.append(str);
        sb.append(" does not reference a registered spring");
        throw new IllegalArgumentException(sb.toString());
    }
}
