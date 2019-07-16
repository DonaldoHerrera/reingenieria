package com.soundcloud.android.collection.playhistory;

import com.google.common.base.Function;

/* compiled from: PlayHistoryRecord */
public abstract class ua {
    static final Function<ua, C3508cda> a = C2766a.a;

    /* compiled from: PlayHistoryRecord */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(C3508cda cda);

        public abstract ua a();

        public abstract a b(C3508cda cda);
    }

    public static ua a(long j, C3508cda cda, C3508cda cda2) {
        return a().a(j).b(cda).a(cda2).a();
    }

    public abstract C3508cda b();

    public int c() {
        if (b().u()) {
            return 1;
        }
        if (b().y()) {
            return 2;
        }
        if (b().f()) {
            return 3;
        }
        return b().J() ? 4 : 0;
    }

    public boolean d() {
        return c() == 4;
    }

    public boolean e() {
        return c() == 3;
    }

    public boolean f() {
        return c() == 1;
    }

    public boolean g() {
        return c() == 2;
    }

    public abstract long h();

    public abstract C3508cda i();

    public static ua a(long j, C3508cda cda) {
        return a().a(j).b(C3508cda.a).a(cda).a();
    }

    public static a a() {
        return new a();
    }

    public static C3508cda a(int i, long j) {
        if (i == 1) {
            return C3508cda.c(j);
        }
        if (i == 2) {
            return C3508cda.e(j);
        }
        if (i == 3) {
            return C3508cda.a(j);
        }
        if (i != 4) {
            return C3508cda.a;
        }
        return C3508cda.f(j);
    }
}
