package com.soundcloud.android.profile;

/* renamed from: com.soundcloud.android.profile.jb reason: case insensitive filesystem */
/* compiled from: UserDetailsFragment.kt */
final class C5802jb extends C7540vYa implements C6308dYa<C5797ib, C5797ib, Boolean> {
    public static final C5802jb a = new C5802jb();

    C5802jb() {
        super(2);
    }

    public final boolean a(C5797ib ibVar, C5797ib ibVar2) {
        C7471uYa.b(ibVar, "firstItem");
        C7471uYa.b(ibVar2, "secondItem");
        return C7471uYa.a((Object) ibVar.getClass(), (Object) ibVar2.getClass());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((C5797ib) obj, (C5797ib) obj2));
    }
}
