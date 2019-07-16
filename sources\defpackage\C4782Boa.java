package defpackage;

/* renamed from: Boa reason: default package and case insensitive filesystem */
/* compiled from: AddToPlaylistAdapter.kt */
public final class C4782Boa extends C5407WEa<C5333Toa> {
    private final C5062Koa g;
    private final C5536_oa h;

    public C4782Boa(C5062Koa koa, C5536_oa _oa) {
        C7471uYa.b(koa, "addToPlaylistItemRenderer");
        C7471uYa.b(_oa, "createPlaylistItemPlaylistItemRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(c.CREATE_PLAYLIST.ordinal(), _oa), new C5693cFa(c.ADD_TO_PLAYLIST.ordinal(), koa)});
        this.g = koa;
        this.h = _oa;
    }

    public int f(int i) {
        return ((C5333Toa) g(i)).a().ordinal();
    }

    public final APa<Long> j() {
        return this.g.a();
    }

    public final APa<RVa> k() {
        return this.h.a();
    }
}
