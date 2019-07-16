package defpackage;

/* renamed from: Tpa reason: default package and case insensitive filesystem */
/* compiled from: LoadCurrentTrackCountCommand_Factory */
public final class C5334Tpa implements C4961HMa<C5305Spa> {
    private final C7054oVa<C5500ZKa> a;

    public C5334Tpa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C5334Tpa a(C7054oVa<C5500ZKa> ova) {
        return new C5334Tpa(ova);
    }

    public C5305Spa get() {
        return new C5305Spa((C5500ZKa) this.a.get());
    }
}
