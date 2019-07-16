package defpackage;

import com.soundcloud.android.sync.ca;

/* renamed from: rR reason: default package and case insensitive filesystem */
/* compiled from: FollowingOperations.kt */
public class C3240rR {
    /* access modifiers changed from: private */
    public final C5327TLa a;
    /* access modifiers changed from: private */
    public final HPa b;
    /* access modifiers changed from: private */
    public final C3792iea c;
    /* access modifiers changed from: private */
    public final C5141NFa d;
    /* access modifiers changed from: private */
    public final ca e;
    /* access modifiers changed from: private */
    public final Cba f;

    public C3240rR(C5327TLa tLa, HPa hPa, C3792iea iea, C5141NFa nFa, ca caVar, Cba cba) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(iea, "userRepository");
        C7471uYa.b(nFa, "userItemRepository");
        C7471uYa.b(caVar, "syncOperations");
        C7471uYa.b(cba, "followingStorage");
        this.a = tLa;
        this.b = hPa;
        this.c = iea;
        this.d = nFa;
        this.e = caVar;
        this.f = cba;
    }

    private IPa<Long> c(C3508cda cda, boolean z) {
        IPa<Long> a2 = b(cda, z).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3220qR<Object,Object>(this, cda, z));
        C7471uYa.a((Object) a2, "obtainNewFollowersCount(…ount })\n                }");
        return a2;
    }

    public APa<C3508cda> a() {
        C5327TLa tLa = this.a;
        C5443XLa<C3900waa> xLa = C3876taa.t;
        C7471uYa.a((Object) xLa, "FOLLOWING_CHANGED");
        APa<C3508cda> h = tLa.a(xLa).a((C7256rQa<? super T>) C3039hR.a).h(C3058iR.a);
        C7471uYa.a((Object) h, "eventBus.queue(FOLLOWING…        .map { it.urn() }");
        return h;
    }

    public APa<C3508cda> b() {
        C5327TLa tLa = this.a;
        C5443XLa<C3900waa> xLa = C3876taa.t;
        C7471uYa.a((Object) xLa, "FOLLOWING_CHANGED");
        APa<C3508cda> h = tLa.a(xLa).a((C7256rQa<? super T>) C3077jR.a).h(C3096kR.a);
        C7471uYa.a((Object) h, "eventBus.queue(FOLLOWING…        .map { it.urn() }");
        return h;
    }

    private IPa<Long> b(C3508cda cda, boolean z) {
        C5573aVa ava = C5573aVa.a;
        IPa d2 = this.c.b(cda).f(C3020gR.a).d(Long.valueOf(-1));
        C7471uYa.a((Object) d2, "userRepository.userInfo(…oSingle(Consts.NOT_SET_L)");
        IPa<Long> a2 = IPa.a((MPa<? extends T1>) d2, (MPa<? extends T2>) this.f.a(cda), (C6504gQa<? super T1, ? super T2, ? extends R>) new C3001fR<Object,Object,Object>(z));
        C7471uYa.a((Object) a2, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        return a2;
    }

    public C6979nPa a(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "userUrn");
        C6979nPa h = c(cda, z).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3153nR<Object,Object>(this, z, cda)).c((C6776kQa<? super T>) new C3182oR<Object>(this)).b(this.b).h();
        C7471uYa.a((Object) h, "updateFollowing(userUrn,…         .toCompletable()");
        return h;
    }
}
