package androidx.fragment.app;

import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.u.a;
import androidx.lifecycle.v;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel */
class w extends t {
    private static final a a = new v();
    private final HashSet<Fragment> b = new HashSet<>();
    private final HashMap<String, w> c = new HashMap<>();
    private final HashMap<String, v> d = new HashMap<>();
    private final boolean e;
    private boolean f = false;
    private boolean g = false;

    w(boolean z) {
        this.e = z;
    }

    static w a(v vVar) {
        return (w) new u(vVar, a).a(w.class);
    }

    /* access modifiers changed from: 0000 */
    public Collection<Fragment> b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public v d(Fragment fragment) {
        v vVar = (v) this.d.get(fragment.mWho);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v();
        this.d.put(fragment.mWho, vVar2);
        return vVar2;
    }

    /* access modifiers changed from: 0000 */
    public void e(Fragment fragment) {
        this.b.remove(fragment);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.b.equals(wVar.b) || !this.c.equals(wVar.c) || !this.d.equals(wVar.d)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public boolean f(Fragment fragment) {
        if (!this.b.contains(fragment)) {
            return true;
        }
        if (this.e) {
            return this.f;
        }
        return !this.g;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.iterator();
        while (true) {
            str = ", ";
            if (!it.hasNext()) {
                break;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void b(Fragment fragment) {
        w wVar = (w) this.c.get(fragment.mWho);
        if (wVar != null) {
            wVar.a();
            this.c.remove(fragment.mWho);
        }
        v vVar = (v) this.d.get(fragment.mWho);
        if (vVar != null) {
            vVar.a();
            this.d.remove(fragment.mWho);
        }
    }

    /* access modifiers changed from: 0000 */
    public w c(Fragment fragment) {
        w wVar = (w) this.c.get(fragment.mWho);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.e);
        this.c.put(fragment.mWho, wVar2);
        return wVar2;
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f = true;
    }

    /* access modifiers changed from: 0000 */
    public void a(Fragment fragment) {
        this.b.add(fragment);
    }
}
