package defpackage;

/* renamed from: iXa reason: default package and case insensitive filesystem */
/* compiled from: IntrinsicsJvm.kt */
class C6647iXa {
    public static <R, T> C5575aXa<RVa> a(C6308dYa<? super R, ? super C5575aXa<? super T>, ? extends Object> dya, R r, C5575aXa<? super T> axa) {
        C7471uYa.b(dya, "$this$createCoroutineUnintercepted");
        C7471uYa.b(axa, "completion");
        C7194qXa.a(axa);
        if (dya instanceof C6783kXa) {
            return ((C6783kXa) dya).a(r, axa);
        }
        C5711cXa context = axa.getContext();
        String str = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>";
        if (context == C6307dXa.a) {
            if (axa != null) {
                return new C6511gXa(axa, axa, dya, r);
            }
            throw new OVa(str);
        } else if (axa != null) {
            C6579hXa hxa = new C6579hXa(axa, context, axa, context, dya, r);
            return hxa;
        } else {
            throw new OVa(str);
        }
    }
}
