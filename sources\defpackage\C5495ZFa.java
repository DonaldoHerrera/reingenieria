package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import java.util.List;

/* renamed from: ZFa reason: default package and case insensitive filesystem */
/* compiled from: AppForegroundStateProvider.kt */
public class C5495ZFa {
    private final Context a;

    public C5495ZFa(Context context) {
        C7471uYa.b(context, "context");
        this.a = context;
    }

    public boolean a() {
        Object systemService = this.a.getSystemService("activity");
        if (systemService != null) {
            List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                String packageName = this.a.getPackageName();
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100 && C7471uYa.a((Object) runningAppProcessInfo.processName, (Object) packageName)) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new OVa("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
