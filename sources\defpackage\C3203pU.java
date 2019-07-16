package defpackage;

/* renamed from: pU reason: default package and case insensitive filesystem */
/* compiled from: PendingPlanOperations_Factory */
public final class C3203pU implements C4961HMa<C3184oU> {
    private final C7054oVa<C2343VT> a;

    public C3203pU(C7054oVa<C2343VT> ova) {
        this.a = ova;
    }

    public static C3203pU a(C7054oVa<C2343VT> ova) {
        return new C3203pU(ova);
    }

    public static C3184oU a(C2343VT vt) {
        return new C3184oU(vt);
    }

    public C3184oU get() {
        return new C3184oU((C2343VT) this.a.get());
    }
}
