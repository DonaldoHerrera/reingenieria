package defpackage;

/* renamed from: rla reason: default package and case insensitive filesystem */
/* compiled from: SubscriptionStatus */
public final class C4657rla {
    private final String a;
    private final C4631ola b;

    private C4657rla(String str, C4631ola ola) {
        this.a = str;
        this.b = ola;
    }

    public static C4657rla a(String str, C4631ola ola) {
        return new C4657rla(str, ola);
    }

    public static C4657rla d() {
        return new C4657rla(null, null);
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.b != null;
    }

    public C4631ola a() {
        return this.b;
    }
}
