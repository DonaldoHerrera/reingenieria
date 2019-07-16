package defpackage;

/* renamed from: JI reason: default package and case insensitive filesystem */
/* compiled from: OMAdSessionWrapper_Factory */
public final class C2106JI implements C4961HMa<C2068HI> {
    private final C7054oVa<C7181qKa> a;

    public C2106JI(C7054oVa<C7181qKa> ova) {
        this.a = ova;
    }

    public static C2106JI a(C7054oVa<C7181qKa> ova) {
        return new C2106JI(ova);
    }

    public C2068HI get() {
        return new C2068HI((C7181qKa) this.a.get());
    }
}
