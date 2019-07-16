package defpackage;

import java.util.Comparator;

/* renamed from: CS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistOperations.kt */
final class C1978CS<T> implements Comparator<C3863rda> {
    public static final C1978CS a = new C1978CS();

    C1978CS() {
    }

    /* renamed from: a */
    public final int compare(C3863rda rda, C3863rda rda2) {
        C7471uYa.b(rda, "lhs");
        C7471uYa.b(rda2, "rhs");
        String B = rda.B();
        C7471uYa.a((Object) B, "lhs.title()");
        String B2 = rda2.B();
        C7471uYa.a((Object) B2, "rhs.title()");
        return Cxb.a(B, B2, true);
    }
}
