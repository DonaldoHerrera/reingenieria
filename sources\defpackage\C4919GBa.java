package defpackage;

/* renamed from: GBa reason: default package and case insensitive filesystem */
/* compiled from: RemoveLocalPlaylistsCommand_Factory */
public final class C4919GBa implements C4961HMa<C4888FBa> {
    private final C7054oVa<C5500ZKa> a;

    public C4919GBa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C4919GBa a(C7054oVa<C5500ZKa> ova) {
        return new C4919GBa(ova);
    }

    public C4888FBa get() {
        return new C4888FBa((C5500ZKa) this.a.get());
    }
}
