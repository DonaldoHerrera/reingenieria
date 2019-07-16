package defpackage;

/* renamed from: Tsa reason: default package and case insensitive filesystem */
/* compiled from: RemoveTrackFromPlaylistCommand_Factory */
public final class C5337Tsa implements C4961HMa<C5308Ssa> {
    private final C7054oVa<C5500ZKa> a;

    public C5337Tsa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C5337Tsa a(C7054oVa<C5500ZKa> ova) {
        return new C5337Tsa(ova);
    }

    public static C5308Ssa a(C5500ZKa zKa) {
        return new C5308Ssa(zKa);
    }

    public C5308Ssa get() {
        return new C5308Ssa((C5500ZKa) this.a.get());
    }
}
