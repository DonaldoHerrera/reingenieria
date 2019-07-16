package defpackage;

import android.os.PowerManager.WakeLock;

/* renamed from: uGa reason: default package and case insensitive filesystem */
/* compiled from: PowerManagerWakeLockWrapper.kt */
public class C7453uGa {
    private final WakeLock a;

    public C7453uGa(WakeLock wakeLock) {
        C7471uYa.b(wakeLock, "wakeLock");
        this.a = wakeLock;
    }

    public void a() {
        this.a.acquire();
    }

    public boolean b() {
        return this.a.isHeld();
    }

    public void c() {
        this.a.release();
    }
}
