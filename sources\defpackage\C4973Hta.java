package defpackage;

/* renamed from: Hta reason: default package and case insensitive filesystem */
/* compiled from: PostsStorage_Factory */
public final class C4973Hta implements C4961HMa<C4942Gta> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C4898FLa> b;
    private final C7054oVa<C5694cGa> c;

    public C4973Hta(C7054oVa<C5500ZKa> ova, C7054oVa<C4898FLa> ova2, C7054oVa<C5694cGa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C4973Hta a(C7054oVa<C5500ZKa> ova, C7054oVa<C4898FLa> ova2, C7054oVa<C5694cGa> ova3) {
        return new C4973Hta(ova, ova2, ova3);
    }

    public C4942Gta get() {
        return new C4942Gta((C5500ZKa) this.a.get(), (C4898FLa) this.b.get(), (C5694cGa) this.c.get());
    }
}
