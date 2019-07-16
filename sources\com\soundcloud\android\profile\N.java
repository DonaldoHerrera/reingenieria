package com.soundcloud.android.profile;

/* compiled from: ProfileBucketsFragment.kt */
final class N extends C7540vYa implements C6308dYa<P, P, Boolean> {
    final /* synthetic */ ProfileBucketsFragment a;

    N(ProfileBucketsFragment profileBucketsFragment) {
        this.a = profileBucketsFragment;
        super(2);
    }

    public final boolean a(P p, P p2) {
        C7471uYa.b(p, "firstItem");
        C7471uYa.b(p2, "secondItem");
        return this.a.a(p, p2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((P) obj, (P) obj2));
    }
}
