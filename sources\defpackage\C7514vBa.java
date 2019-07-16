package defpackage;

/* renamed from: vBa reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistsSyncProvider_Factory */
public final class C7514vBa implements C4961HMa<C7445uBa> {
    private final C7054oVa<C7652xBa> a;
    private final C7054oVa<C6332dsa> b;

    public C7514vBa(C7054oVa<C7652xBa> ova, C7054oVa<C6332dsa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C7514vBa a(C7054oVa<C7652xBa> ova, C7054oVa<C6332dsa> ova2) {
        return new C7514vBa(ova, ova2);
    }

    public C7445uBa get() {
        return new C7445uBa((C7652xBa) this.a.get(), (C6332dsa) this.b.get());
    }
}
