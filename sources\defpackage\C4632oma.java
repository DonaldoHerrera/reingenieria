package defpackage;

import com.soundcloud.android.playback.core.d;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/playback/flipper/wakelock/LockUtil;", "", "powerManager", "Lcom/soundcloud/android/utilities/android/wakelock/PowerManagerWrapper;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "(Lcom/soundcloud/android/utilities/android/wakelock/PowerManagerWrapper;Lcom/soundcloud/android/playback/core/Logger;)V", "wakeLock", "Lcom/soundcloud/android/utilities/android/wakelock/PowerManagerWakeLockWrapper;", "lock", "", "unlock", "Companion", "flipper_release"}, mv = {1, 1, 15})
/* renamed from: oma reason: default package and case insensitive filesystem */
/* compiled from: LockUtil.kt */
public class C4632oma {
    public static final a a = new a(null);
    private final C7453uGa b;
    private final d c;

    /* renamed from: oma$a */
    /* compiled from: LockUtil.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4632oma(C7522vGa vga, d dVar) {
        C7471uYa.b(vga, "powerManager");
        C7471uYa.b(dVar, "logger");
        this.c = dVar;
        this.b = vga.a("LockUtilWakeLock");
    }

    public void a() {
        String str = "LockUtil";
        this.c.b(str, "WakeLockUtil.lock() called");
        if (!this.b.b()) {
            try {
                this.c.b(str, "Will acquire lock");
                this.b.a();
            } catch (Exception e) {
                d dVar = this.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Error getting Wake Lock: ");
                sb.append(e.getMessage());
                dVar.c(str, sb.toString());
            }
        }
    }

    public void b() {
        String str = "LockUtil";
        this.c.b(str, "WakeLockUtil.unlock() called");
        if (this.b.b()) {
            this.c.b(str, "Will release lock");
            this.b.c();
        }
    }
}
