package com.soundcloud.android.search;

/* compiled from: SearchResultsAdapter.kt */
public class K extends M {
    private final Ga g;
    private final C5943z h;
    private final Qa i;

    public K(Ga ga, C5943z zVar, Qa qa, G g2) {
        C7471uYa.b(ga, "trackItemRenderer");
        C7471uYa.b(zVar, "playlistItemRenderer");
        C7471uYa.b(qa, "userItemRenderer");
        C7471uYa.b(g2, "searchResultHeaderRenderer");
        super(ga, zVar, qa, g2);
        this.g = ga;
        this.h = zVar;
        this.i = qa;
    }

    public C6781kVa<C5941x> j() {
        return this.h.a();
    }

    public C6781kVa<Ea> k() {
        return this.g.a();
    }

    public C6781kVa<Na> l() {
        return this.i.a();
    }

    public C6781kVa<Sa> m() {
        return this.i.b();
    }
}
