package androidx.work.impl;

import androidx.room.C0432a;
import androidx.room.h;
import androidx.room.v;
import java.util.HashMap;

public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile C0305af m;
    private volatile Ne n;
    private volatile C1509mf o;
    private volatile Re p;
    private volatile We q;

    public Ne n() {
        Ne ne;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new Pe(this);
            }
            ne = this.n;
        }
        return ne;
    }

    public Re r() {
        Re re;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new Ue(this);
            }
            re = this.p;
        }
        return re;
    }

    public We s() {
        We we;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new Ye(this);
            }
            we = this.q;
        }
        return we;
    }

    public C0305af t() {
        C0305af afVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new C1447kf(this);
            }
            afVar = this.m;
        }
        return afVar;
    }

    public C1509mf u() {
        C1509mf mfVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new C1571of(this);
            }
            mfVar = this.o;
        }
        return mfVar;
    }

    /* access modifiers changed from: protected */
    public h d() {
        return new h(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    /* access modifiers changed from: protected */
    public Vd a(C0432a aVar) {
        v vVar = new v(aVar, new l(this, 6), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        a a = b.a(aVar.b);
        a.a(aVar.c);
        a.a((a) vVar);
        return aVar.a.a(a.a());
    }
}
