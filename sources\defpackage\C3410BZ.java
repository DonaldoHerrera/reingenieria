package defpackage;

import com.soundcloud.android.foundation.events.J;

/* renamed from: BZ reason: default package and case insensitive filesystem */
/* compiled from: AdDeliveryEvent */
public abstract class C3410BZ extends J {

    /* renamed from: BZ$a */
    /* compiled from: AdDeliveryEvent */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(C4928GKa<C3508cda> gKa);

        public abstract a a(C3508cda cda);

        public abstract a a(String str);

        public abstract a a(boolean z);

        public abstract C3410BZ a();

        public abstract a b(C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> gKa);

        public abstract a b(boolean z);
    }

    public static C3410BZ a(C3508cda cda, String str, C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> gKa) {
        return new a().b(J.b()).a(J.c()).a(cda).a(C4928GKa.a()).a(str).a(true).b(false).b(gKa).a();
    }

    public abstract String h();

    public abstract C3508cda i();

    public abstract boolean j();

    public abstract C4928GKa<C3508cda> k();

    public abstract C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> l();

    public abstract boolean m();

    /* access modifiers changed from: 0000 */
    public abstract a n();

    public static C3410BZ a(C4928GKa<C3508cda> gKa, C3508cda cda, String str, boolean z, boolean z2, C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> gKa2) {
        return a(cda, str, gKa2).n().a(gKa).a(z2).b(z).a();
    }
}
