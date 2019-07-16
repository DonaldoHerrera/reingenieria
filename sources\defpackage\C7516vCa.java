package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: vCa reason: default package and case insensitive filesystem */
/* compiled from: StorePostsCommand */
public class C7516vCa extends C1286fT<Collection<C6760kCa>, C6499gLa> {
    C7516vCa(C5500ZKa zKa) {
        super(zKa);
    }

    private List<C5085LLa> d() {
        return Arrays.asList(new C5085LLa[]{d.f, d.e, d.d, d.g});
    }

    /* access modifiers changed from: protected */
    public C6499gLa a(C5500ZKa zKa, Collection<C6760kCa> collection) {
        a aVar = new a(d());
        for (C6760kCa a : collection) {
            aVar.a(a(a));
        }
        return zKa.a((C5116MLa) d.c, aVar.a());
    }

    private List<Object> a(C6760kCa kca) {
        C3508cda c = kca.c();
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(c.c());
        objArr[1] = Integer.valueOf(c.x() ^ true ? 1 : 0);
        objArr[2] = kca.a() ? "repost" : "post";
        objArr[3] = Long.valueOf(kca.b().getTime());
        return Arrays.asList(objArr);
    }
}
