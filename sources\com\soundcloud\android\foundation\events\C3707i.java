package com.soundcloud.android.foundation.events;

/* renamed from: com.soundcloud.android.foundation.events.i reason: case insensitive filesystem */
/* compiled from: CurrentUserChangedEvent */
public abstract class C3707i {
    public static C3707i a() {
        return new C3705g(1, C3508cda.a);
    }

    public abstract C3508cda b();

    public abstract int c();

    public boolean d() {
        return c() == 1;
    }

    public boolean e() {
        return c() == 0;
    }

    public static C3707i a(C3508cda cda) {
        return new C3705g(0, cda);
    }
}
