package defpackage;

/* renamed from: PDa reason: default package and case insensitive filesystem */
/* compiled from: TakeWhenTransformer.kt */
public final class C5199PDa<S, T> implements FPa<S, S> {
    private final APa<T> a;

    public C5199PDa(APa<T> aPa) {
        C7471uYa.b(aPa, "trigger");
        this.a = aPa;
    }

    public EPa<S> a(APa<S> aPa) {
        C7471uYa.b(aPa, "upstream");
        APa a2 = this.a.a((EPa<? extends U>) aPa, (C6504gQa<? super T, ? super U, ? extends R>) C5169ODa.a);
        C7471uYa.a((Object) a2, "trigger.withLatestFrom<S…tion { _: T, x: S -> x })");
        return a2;
    }
}
