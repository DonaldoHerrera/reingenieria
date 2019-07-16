package defpackage;

import java.util.Date;

/* renamed from: rda reason: default package and case insensitive filesystem */
/* compiled from: PlaylistItem */
public abstract class C3863rda extends C3855qda {

    /* renamed from: rda$a */
    /* compiled from: PlaylistItem */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(Eda eda);

        public abstract a a(Boolean bool);

        public abstract a a(C3879tda tda);

        public abstract a a(C3903wda wda);

        public abstract a a(boolean z);

        public abstract C3863rda a();

        public abstract a b(int i);

        public abstract a b(boolean z);

        public abstract a c(int i);
    }

    public static C3863rda a(Eda eda, boolean z, boolean z2, C3823mda mda) {
        return a(eda, mda, z, z2).a();
    }

    public String A() {
        if (H().p().c()) {
            return (String) H().p().b();
        }
        return null;
    }

    public String B() {
        return H().s();
    }

    public boolean C() {
        return H().c();
    }

    public String D() {
        return I();
    }

    public Date E() {
        return H().u();
    }

    public boolean F() {
        return H().i();
    }

    public abstract Boolean G();

    public abstract Eda H();

    public String I() {
        return (String) H().n().d("");
    }

    public C4928GKa<String> J() {
        return H().q();
    }

    public abstract a K();

    public abstract int L();

    public C4928GKa<String> b() {
        return H().h();
    }

    public String d() {
        return H().d();
    }

    public C3508cda e() {
        return H().e();
    }

    public String f() {
        if (H().g().c()) {
            return (String) H().g().b();
        }
        return null;
    }

    public long g() {
        return H().f();
    }

    public String h() {
        return F() ? (String) J().d("album") : "playlist";
    }

    public boolean m() {
        return H().j();
    }

    public String s() {
        return (String) H().m().d("");
    }

    public String toString() {
        return a().toString();
    }

    public C3863rda a(C3879tda tda, C3903wda wda) {
        return K().a(tda).a(wda).a();
    }

    public static a a(Eda eda, C3823mda mda, boolean z, boolean z2) {
        return new a().a(mda).a(z).a(eda.l()).b(z2).b(eda.o()).c(eda.t()).a(Boolean.valueOf(!mda.equals(C3823mda.NOT_OFFLINE))).a(eda);
    }

    public C3508cda a() {
        return H().v();
    }
}
