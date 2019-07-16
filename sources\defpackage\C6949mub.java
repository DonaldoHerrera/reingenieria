package defpackage;

import java.util.List;

/* renamed from: mub reason: default package and case insensitive filesystem */
/* compiled from: NewCapturedType.kt */
public final class C6949mub extends Etb {
    private final C6609hub a;
    private final C7018nub b;
    private final C6405eub c;
    private final C6723jeb d;
    private final boolean e;

    public /* synthetic */ C6949mub(C6609hub hub, C7018nub nub, C6405eub eub, C6723jeb jeb, boolean z, int i, C7264rYa rya) {
        if ((i & 8) != 0) {
            jeb = C6723jeb.c.a();
        }
        this(hub, nub, eub, jeb, (i & 16) != 0 ? false : z);
    }

    public boolean Aa() {
        return this.e;
    }

    public final C6405eub Ca() {
        return this.c;
    }

    public C6723jeb getAnnotations() {
        return this.d;
    }

    public Eqb ha() {
        Eqb a2 = C7154ptb.a("No member resolution should be done on captured type!", true);
        C7471uYa.a((Object) a2, "ErrorUtils.createErrorSc…on captured type!\", true)");
        return a2;
    }

    public List<Stb> ya() {
        return C6918mWa.a();
    }

    public C7018nub za() {
        return this.b;
    }

    public C6949mub(C6609hub hub, C7018nub nub, C6405eub eub, C6723jeb jeb, boolean z) {
        C7471uYa.b(hub, "captureStatus");
        C7471uYa.b(nub, "constructor");
        C7471uYa.b(jeb, "annotations");
        this.a = hub;
        this.b = nub;
        this.c = eub;
        this.d = jeb;
        this.e = z;
    }

    public C6949mub(C6609hub hub, C6405eub eub, Stb stb) {
        C7471uYa.b(hub, "captureStatus");
        C7471uYa.b(stb, "projection");
        this(hub, new C7018nub(stb, null, 2, null), eub, null, false, 24, null);
    }

    public C6949mub a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        C6949mub mub = new C6949mub(this.a, za(), this.c, jeb, Aa());
        return mub;
    }

    public C6949mub a(boolean z) {
        C6949mub mub = new C6949mub(this.a, za(), this.c, getAnnotations(), z);
        return mub;
    }
}
