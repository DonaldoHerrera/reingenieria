package com.soundcloud.android.profile;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.soundcloud.android.profile.pd reason: case insensitive filesystem */
/* compiled from: UserProfileOperations.kt */
final class C5834pd<T, R> implements C7118pQa<T, R> {
    public static final C5834pd a = new C5834pd();

    C5834pd() {
    }

    /* renamed from: a */
    public final C5379VFa apply(C2035FP fp) {
        String str = "it";
        C7471uYa.b(fp, str);
        Pca b = fp.b();
        C7471uYa.a((Object) b, "it.socialMediaLinks");
        List<C1935AP> f = b.f();
        C7471uYa.a((Object) f, "it.socialMediaLinks.collection");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) f, 10));
        for (C1935AP ap : f) {
            a aVar = C4892FFa.a;
            C7471uYa.a((Object) ap, str);
            arrayList.add(aVar.a(ap));
        }
        String str2 = (String) fp.a().d();
        C3776gea c = fp.c();
        C7471uYa.a((Object) c, "it.user");
        return new C5379VFa(arrayList, str2, C3775gda.a(c));
    }
}
