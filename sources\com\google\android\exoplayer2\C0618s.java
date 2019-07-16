package com.google.android.exoplayer2;

import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s reason: case insensitive filesystem */
/* compiled from: ExoPlaybackException */
public final class C0618s extends Exception {
    public final int a;
    public final int b;
    private final Throwable c;

    private C0618s(int i, Throwable th, int i2) {
        super(th);
        this.a = i;
        this.c = th;
        this.b = i2;
    }

    public static C0618s a(IOException iOException) {
        return new C0618s(0, iOException, -1);
    }

    public IOException b() {
        C1852xq.b(this.a == 0);
        Throwable th = this.c;
        C1852xq.a(th);
        return (IOException) th;
    }

    public RuntimeException c() {
        C1852xq.b(this.a == 2);
        Throwable th = this.c;
        C1852xq.a(th);
        return (RuntimeException) th;
    }

    public static C0618s a(Exception exc, int i) {
        return new C0618s(1, exc, i);
    }

    public static C0618s a(RuntimeException runtimeException) {
        return new C0618s(2, runtimeException, -1);
    }

    public static C0618s a(OutOfMemoryError outOfMemoryError) {
        return new C0618s(4, outOfMemoryError, -1);
    }

    public Exception a() {
        boolean z = true;
        if (this.a != 1) {
            z = false;
        }
        C1852xq.b(z);
        Throwable th = this.c;
        C1852xq.a(th);
        return (Exception) th;
    }
}
