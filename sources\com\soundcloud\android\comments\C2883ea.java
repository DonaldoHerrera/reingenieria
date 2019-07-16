package com.soundcloud.android.comments;

/* renamed from: com.soundcloud.android.comments.ea reason: case insensitive filesystem */
/* compiled from: CommentsPresenter.kt */
final class C2883ea<T, R> implements C7118pQa<T, R> {
    public static final C2883ea a = new C2883ea();

    C2883ea() {
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
