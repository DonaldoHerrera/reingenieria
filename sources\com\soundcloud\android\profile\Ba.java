package com.soundcloud.android.profile;

/* compiled from: ProfileImageHelper.kt */
final class Ba implements c {
    final /* synthetic */ JPa a;

    Ba(JPa jPa) {
        this.a = jPa;
    }

    public final void a(Fd fd) {
        JPa jPa = this.a;
        C7471uYa.a((Object) jPa, "e");
        if (jPa.a()) {
            return;
        }
        if (fd != null) {
            this.a.onSuccess(fd);
        } else {
            this.a.a((Throwable) new IllegalStateException("Empty palette"));
        }
    }
}
