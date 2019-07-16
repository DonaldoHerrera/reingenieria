package defpackage;

import java.util.Collection;

/* renamed from: tCa reason: default package and case insensitive filesystem */
/* compiled from: RemovePostsCommand */
class C7378tCa extends C1286fT<Collection<C6760kCa>, C6499gLa> {
    C7378tCa(C5500ZKa zKa) {
        super(zKa);
    }

    /* access modifiers changed from: protected */
    public C6499gLa a(C5500ZKa zKa, Collection<C6760kCa> collection) {
        C5266RKa rKa = null;
        for (C6760kCa kca : collection) {
            C3508cda c = kca.c();
            rKa = zKa.a((C5116MLa) d.c, C6907mLa.a().a(d.f, (Object) Long.valueOf(c.c())).a(d.e, (Object) Integer.valueOf(c.x() ^ true ? 1 : 0)).a(d.d, (Object) kca.a() ? "repost" : "post"));
        }
        return rKa;
    }
}
