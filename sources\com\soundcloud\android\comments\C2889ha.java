package com.soundcloud.android.comments;

/* renamed from: com.soundcloud.android.comments.ha reason: case insensitive filesystem */
/* compiled from: CommentsPresenter.kt */
final class C2889ha<T, R> implements C7118pQa<T, R> {
    public static final C2889ha a = new C2889ha();

    C2889ha() {
    }

    /* renamed from: a */
    public final T apply(C6832lEa<T, C6973nJa> lea) {
        C7471uYa.b(lea, "it");
        Object b = lea.b();
        if (b != null) {
            return (T) b;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
