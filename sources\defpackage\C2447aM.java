package defpackage;

/* renamed from: aM reason: default package and case insensitive filesystem */
/* compiled from: EventTrackingManager_Factory */
public final class C2447aM implements C4961HMa<C2428_L> {
    private final C7054oVa<C2052GM> a;

    public C2447aM(C7054oVa<C2052GM> ova) {
        this.a = ova;
    }

    public static C2447aM a(C7054oVa<C2052GM> ova) {
        return new C2447aM(ova);
    }

    public C2428_L get() {
        return new C2428_L((C2052GM) this.a.get());
    }
}
