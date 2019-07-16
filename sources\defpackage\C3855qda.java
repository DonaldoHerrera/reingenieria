package defpackage;

/* renamed from: qda reason: default package and case insensitive filesystem */
/* compiled from: PlayableItem.kt */
public abstract class C3855qda implements Wca {
    public abstract String A();

    public abstract String B();

    public final C3508cda c() {
        C3879tda t = t();
        if (t != null) {
            return t.a();
        }
        return null;
    }

    public abstract String d();

    public abstract C3508cda e();

    public abstract String f();

    public abstract long g();

    public abstract String h();

    public final C3508cda i() {
        C3903wda w = w();
        if (w != null) {
            C3508cda b = w.b();
            if (b != null) {
                return b;
            }
        }
        return e();
    }

    public final boolean j() {
        C3879tda t = t();
        return (t != null ? t.b() : null) != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    public final boolean k() {
        C3508cda cda;
        C3879tda t = t();
        if (t != null) {
            C3895vda b = t.b();
            if (b != null) {
                cda = b.c();
                return cda == null;
            }
        }
        cda = null;
        if (cda == null) {
        }
    }

    public final boolean l() {
        C3903wda w = w();
        return (w != null ? w.a() : null) != null;
    }

    public abstract boolean m();

    public final boolean n() {
        return t() != null;
    }

    public abstract boolean o();

    public abstract boolean p();

    public abstract int q();

    public abstract C3823mda r();

    public abstract String s();

    public abstract C3879tda t();

    public final String u() {
        C3879tda t = t();
        if (t != null) {
            C3895vda b = t.b();
            if (b != null) {
                return b.b();
            }
        }
        return null;
    }

    public final C3508cda v() {
        C3879tda t = t();
        if (t != null) {
            C3895vda b = t.b();
            if (b != null) {
                return b.c();
            }
        }
        return null;
    }

    public abstract C3903wda w();

    public final String x() {
        C3903wda w = w();
        if (w != null) {
            return w.a();
        }
        return null;
    }

    public final C3508cda y() {
        C3903wda w = w();
        if (w != null) {
            return w.b();
        }
        return null;
    }

    public abstract int z();
}
