package defpackage;

/* renamed from: Yl reason: default package */
/* compiled from: rxjava2.kt */
public final class Yl {
    public static final <T> APa<T> a(APa<? extends Ul<? extends T>> aPa) {
        C7471uYa.b(aPa, "$receiver");
        APa b = aPa.b(Wl.class);
        C7471uYa.a((Object) b, "ofType(R::class.java)");
        APa<T> h = b.h(Xl.a);
        C7471uYa.a((Object) h, "ofType<Some<T>>().map { it.value }");
        return h;
    }
}
