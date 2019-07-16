package com.soundcloud.android.profile;

import java.util.List;

/* renamed from: com.soundcloud.android.profile.ca reason: case insensitive filesystem */
/* compiled from: ProfileBucketsPresenter.kt */
final /* synthetic */ class C5766ca extends C7402tYa implements C6376eYa<List<? extends P>, String, Boolean, C5831pa> {
    public static final C5766ca e = new C5766ca();

    C5766ca() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return a((List) obj, (String) obj2, ((Boolean) obj3).booleanValue());
    }

    public final String getName() {
        return "<init>";
    }

    public final C7610wZa h() {
        return HYa.a(C5831pa.class);
    }

    public final String j() {
        return "<init>(Ljava/util/List;Ljava/lang/String;Z)V";
    }

    public final C5831pa a(List<? extends P> list, String str, boolean z) {
        C7471uYa.b(list, "p1");
        C7471uYa.b(str, "p2");
        return new C5831pa(list, str, z);
    }
}
