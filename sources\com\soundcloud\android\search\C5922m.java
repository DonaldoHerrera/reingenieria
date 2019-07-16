package com.soundcloud.android.search;

import com.soundcloud.android.deeplinks.f;

/* renamed from: com.soundcloud.android.search.m reason: case insensitive filesystem */
/* compiled from: SearchIntentResolverFactory */
class C5922m {
    private final C7054oVa<C4655rja> a;
    private final C7054oVa<f> b;
    private final C7054oVa<Ja> c;

    C5922m(C7054oVa<C4655rja> ova, C7054oVa<f> ova2, C7054oVa<Ja> ova3) {
        a(ova, 1);
        this.a = ova;
        a(ova2, 2);
        this.b = ova2;
        a(ova3, 3);
        this.c = ova3;
    }

    /* access modifiers changed from: 0000 */
    public C5920l a(a aVar) {
        a(aVar, 1);
        a aVar2 = aVar;
        Object obj = this.a.get();
        a(obj, 2);
        C4655rja rja = (C4655rja) obj;
        Object obj2 = this.b.get();
        a(obj2, 3);
        f fVar = (f) obj2;
        Object obj3 = this.c.get();
        a(obj3, 4);
        return new C5920l(aVar2, rja, fVar, (Ja) obj3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
