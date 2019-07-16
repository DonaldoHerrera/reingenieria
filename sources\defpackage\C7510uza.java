package defpackage;

/* renamed from: uza reason: default package and case insensitive filesystem */
/* compiled from: LikeCountWriter_Factory */
public final class C7510uza implements C4961HMa<C7441tza> {
    private final C7054oVa<C4898FLa> a;

    public C7510uza(C7054oVa<C4898FLa> ova) {
        this.a = ova;
    }

    public static C7510uza a(C7054oVa<C4898FLa> ova) {
        return new C7510uza(ova);
    }

    public C7441tza get() {
        return new C7441tza((C4898FLa) this.a.get());
    }
}
