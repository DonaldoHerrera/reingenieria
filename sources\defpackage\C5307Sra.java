package defpackage;

/* renamed from: Sra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistOperations.kt */
final class C5307Sra<T> implements C6776kQa<Eda> {
    final /* synthetic */ C4909Fra a;

    C5307Sra(C4909Fra fra) {
        this.a = fra;
    }

    /* renamed from: a */
    public final void accept(Eda eda) {
        C5327TLa a2 = this.a.j;
        C5443XLa<Jaa> xLa = C3876taa.q;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYLIST_CHANGED");
        a2.c(xLa, Kaa.a(eda));
    }
}
