package com.soundcloud.android.offline;

@Deprecated
/* renamed from: com.soundcloud.android.offline.tb reason: case insensitive filesystem */
/* compiled from: ClearOfflineContentCommand */
public class C4168tb extends C1255eT<Void, Boolean> {
    private final Vb a;
    private final C4088fe b;
    private final Se c;
    private final Gd d;
    private final De e;

    C4168tb(Vb vb, C4088fe feVar, Se se, Gd gd, De de) {
        this.a = vb;
        this.b = feVar;
        this.c = se;
        this.d = gd;
        this.e = de;
    }

    public Boolean a(Void voidR) {
        if (this.d.i().c() != null) {
            return Boolean.valueOf(false);
        }
        this.c.a();
        this.a.b();
        this.b.a(false);
        this.e.a();
        return Boolean.valueOf(true);
    }
}
