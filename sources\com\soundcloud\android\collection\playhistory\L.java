package com.soundcloud.android.collection.playhistory;

/* compiled from: PlayHistoryFragment.kt */
final class L extends C7540vYa implements C6308dYa<Q, Q, Boolean> {
    public static final L a = new L();

    L() {
        super(2);
    }

    public final boolean a(Q q, Q q2) {
        C7471uYa.b(q, "firstItem");
        C7471uYa.b(q2, "secondItem");
        return q.a() == q2.a();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((Q) obj, (Q) obj2));
    }
}
