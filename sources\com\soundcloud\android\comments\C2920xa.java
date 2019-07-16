package com.soundcloud.android.comments;

/* renamed from: com.soundcloud.android.comments.xa reason: case insensitive filesystem */
/* compiled from: CommentsPresenter.kt */
final class C2920xa<T, R> implements C7118pQa<Throwable, EPa<? extends d<? extends C6973nJa, ? extends C>>> {
    public static final C2920xa a = new C2920xa();

    C2920xa() {
    }

    /* renamed from: a */
    public final EPa<? extends d<C6973nJa, C>> apply(Throwable th) {
        C7471uYa.b(th, "throwable");
        if (C6972nIa.d(th)) {
            return APa.c(new a(new C6973nJa((Exception) th)));
        }
        return APa.b(th);
    }
}
