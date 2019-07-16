package com.soundcloud.android.comments;

/* compiled from: CommentsPresenter.kt */
final class Ba<T> implements C6776kQa<Throwable> {
    final /* synthetic */ C6781kVa a;
    final /* synthetic */ Da b;

    Ba(C6781kVa kva, Da da) {
        this.a = kva;
        this.b = da;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        C7471uYa.b(th, "throwable");
        if (th instanceof ifa) {
            this.b.b(th);
        } else {
            C7316sHa.b(th, this.a.getClass());
        }
    }
}
