package com.soundcloud.android.comments;

/* compiled from: CommentsVisibilityProvider.kt */
public class Ea {
    private final C6713jVa<Boolean> a;

    public Ea() {
        C6713jVa<Boolean> f = C6713jVa.f(Boolean.valueOf(false));
        C7471uYa.a((Object) f, "BehaviorSubject.createDefault(false)");
        this.a = f;
    }

    public C6713jVa<Boolean> a() {
        return this.a;
    }

    public void b() {
        a().a(Boolean.valueOf(false));
    }

    public void c() {
        a().a(Boolean.valueOf(true));
    }
}
