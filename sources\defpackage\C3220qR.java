package defpackage;

/* renamed from: qR reason: default package and case insensitive filesystem */
/* compiled from: FollowingOperations.kt */
final class C3220qR<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C3240rR a;
    final /* synthetic */ C3508cda b;
    final /* synthetic */ boolean c;

    C3220qR(C3240rR rRVar, C3508cda cda, boolean z) {
        this.a = rRVar;
        this.b = cda;
        this.c = z;
    }

    /* renamed from: a */
    public final IPa<Long> apply(Long l) {
        C7471uYa.b(l, "count");
        return IPa.a((MPa<? extends T1>) this.a.c.a(this.b, l.longValue()), (MPa<? extends T2>) this.a.f.a(this.b, this.c), (C6504gQa<? super T1, ? super T2, ? extends R>) new C3201pR<Object,Object,Object>(l));
    }
}
