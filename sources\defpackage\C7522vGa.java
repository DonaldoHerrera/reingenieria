package defpackage;

import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

/* renamed from: vGa reason: default package and case insensitive filesystem */
/* compiled from: PowerManagerWrapper.kt */
public class C7522vGa {
    private final PowerManager a;

    public C7522vGa(PowerManager powerManager) {
        C7471uYa.b(powerManager, "powerManager");
        this.a = powerManager;
    }

    public C7453uGa a(String str) {
        C7471uYa.b(str, "tag");
        WakeLock newWakeLock = this.a.newWakeLock(1, str);
        C7471uYa.a((Object) newWakeLock, "powerManager.newWakeLock…r.PARTIAL_WAKE_LOCK, tag)");
        return new C7453uGa(newWakeLock);
    }

    public boolean a() {
        return this.a.isPowerSaveMode();
    }
}
