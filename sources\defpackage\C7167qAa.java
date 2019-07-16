package defpackage;

/* renamed from: qAa reason: default package and case insensitive filesystem */
/* compiled from: PublishTrackUpdateEventCommand_Factory */
public final class C7167qAa implements C4961HMa<C7098pAa> {
    private final C7054oVa<C5327TLa> a;

    public C7167qAa(C7054oVa<C5327TLa> ova) {
        this.a = ova;
    }

    public static C7167qAa a(C7054oVa<C5327TLa> ova) {
        return new C7167qAa(ova);
    }

    public C7098pAa get() {
        return new C7098pAa((C5327TLa) this.a.get());
    }
}
