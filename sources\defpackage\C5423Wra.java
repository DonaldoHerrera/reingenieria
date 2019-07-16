package defpackage;

/* renamed from: Wra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistOperations.kt */
final class C5423Wra<T> implements C6776kQa<Integer> {
    final /* synthetic */ C4909Fra a;
    final /* synthetic */ C3508cda b;

    C5423Wra(C4909Fra fra, C3508cda cda) {
        this.a = fra;
        this.b = cda;
    }

    /* renamed from: a */
    public final void accept(Integer num) {
        C5327TLa a2 = this.a.j;
        C5443XLa<Jaa> xLa = C3876taa.q;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYLIST_CHANGED");
        a2.c(xLa, Maa.b(this.b, num));
    }
}
