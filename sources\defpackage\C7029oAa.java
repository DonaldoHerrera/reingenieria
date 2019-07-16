package defpackage;

/* renamed from: oAa reason: default package and case insensitive filesystem */
/* compiled from: PublishPlaylistUpdateEventCommand_Factory */
public final class C7029oAa implements C4961HMa<C6960nAa> {
    private final C7054oVa<C5327TLa> a;

    public C7029oAa(C7054oVa<C5327TLa> ova) {
        this.a = ova;
    }

    public static C7029oAa a(C7054oVa<C5327TLa> ova) {
        return new C7029oAa(ova);
    }

    public C6960nAa get() {
        return new C6960nAa((C5327TLa) this.a.get());
    }
}
