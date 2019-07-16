package defpackage;

/* renamed from: Gra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistOperations.kt */
final class C4940Gra<T> implements C6776kQa<b> {
    final /* synthetic */ C4909Fra a;
    final /* synthetic */ C3508cda b;

    C4940Gra(C4909Fra fra, C3508cda cda) {
        this.a = fra;
        this.b = cda;
    }

    /* renamed from: a */
    public final void accept(b bVar) {
        C5327TLa a2 = this.a.j;
        C5443XLa<Jaa> xLa = C3876taa.q;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYLIST_CHANGED");
        a2.c(xLa, Maa.a(this.b, Integer.valueOf(bVar.a())));
    }
}
