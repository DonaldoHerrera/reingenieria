package com.soundcloud.android.profile;

/* renamed from: com.soundcloud.android.profile.z reason: case insensitive filesystem */
/* compiled from: ProfileApiMobile */
public class C5879z {
    public static int a = 30;
    private final C4990IKa<Pca<C5775e>> b = new C5864w(this);
    private final C4990IKa<Pca<C3338wP>> c = new C5869x(this);
    private final C4990IKa<Pca<C3776gea>> d = new C5874y(this);
    private final efa e;

    public C5879z(efa efa) {
        this.e = efa;
    }

    private IPa<Pca<C3338wP>> j(String str) {
        return this.e.a(hfa.b(str).c().a(c.PAGE_SIZE, Integer.valueOf(a)).b(), this.c);
    }

    private IPa<Pca<C5775e>> k(String str) {
        return this.e.a(hfa.b(str).c().a(c.PAGE_SIZE, Integer.valueOf(a)).b(), this.b);
    }

    private IPa<Pca<C3338wP>> l(String str) {
        return this.e.a(hfa.b(str).c().a(c.PAGE_SIZE, Integer.valueOf(a)).b(), this.c);
    }

    private IPa<Pca<C5775e>> m(String str) {
        return this.e.a(hfa.b(str).c().b(), this.b);
    }

    private IPa<Pca<C5775e>> n(String str) {
        return this.e.a(hfa.b(str).c().a(c.PAGE_SIZE, Integer.valueOf(a)).b(), this.b);
    }

    public IPa<Pca<C3338wP>> a(C3508cda cda) {
        return l(C2226PO.USER_ALBUMS.a(cda));
    }

    public IPa<Pca<C3776gea>> b(C3508cda cda) {
        return this.e.a(hfa.b(C2226PO.FOLLOWERS.a(cda)).c().a("linked_partitioning", "1").a(c.PAGE_SIZE, Integer.valueOf(a)).b(), this.d);
    }

    public IPa<Pca<C3776gea>> c(C3508cda cda) {
        return this.e.a(hfa.b(C2226PO.FOLLOWINGS.a(cda)).c().a("linked_partitioning", "1").a(c.PAGE_SIZE, Integer.valueOf(a)).b(), this.d);
    }

    public IPa<Pca<C5775e>> d(C3508cda cda) {
        return i(C2226PO.USER_LIKES.a(cda));
    }

    public IPa<Pca<C3338wP>> e(C3508cda cda) {
        return j(C2226PO.USER_PLAYLISTS.a(cda));
    }

    public IPa<C5785g> f(C3508cda cda) {
        return this.e.a(hfa.b(C2226PO.PROFILE.a(cda)).c().b(), C5785g.class);
    }

    public IPa<C2035FP> g(C3508cda cda) {
        return this.e.a(hfa.b(C2226PO.PROFILE_INFO.a(cda)).c().b(), C2035FP.class);
    }

    public IPa<Pca<C5775e>> h(C3508cda cda) {
        return k(C2226PO.USER_REPOSTS.a(cda));
    }

    public IPa<Pca<C5775e>> i(C3508cda cda) {
        return m(C2226PO.USER_TOP_TRACKS.a(cda));
    }

    private IPa<Pca<C5775e>> i(String str) {
        return this.e.a(hfa.b(str).c().a(c.PAGE_SIZE, Integer.valueOf(a)).b(), this.b);
    }

    public IPa<Pca<C3338wP>> a(String str) {
        return l(str);
    }

    public IPa<Pca<C5775e>> d(String str) {
        return i(str);
    }

    public IPa<Pca<C3338wP>> e(String str) {
        return j(str);
    }

    public IPa<Pca<C5775e>> h(String str) {
        return n(str);
    }

    public IPa<Pca<C5775e>> f(String str) {
        return k(str);
    }

    public IPa<Pca<C5775e>> g(String str) {
        return m(str);
    }

    public IPa<Pca<C5775e>> j(C3508cda cda) {
        return n(C2226PO.USER_TRACKS.a(cda));
    }

    public IPa<Pca<C3776gea>> b(String str) {
        return this.e.a(hfa.b(str).c().a("linked_partitioning", "1").a(c.PAGE_SIZE, Integer.valueOf(a)).b(), this.d);
    }

    public IPa<Pca<C3776gea>> c(String str) {
        return this.e.a(hfa.b(str).c().a("linked_partitioning", "1").a(c.PAGE_SIZE, Integer.valueOf(a)).b(), this.d);
    }
}
