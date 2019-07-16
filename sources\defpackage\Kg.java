package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import java.util.Random;

/* renamed from: Kg reason: default package */
public final class Kg {
    private static final String a = String.format("%s.%s", new Object[]{"Appboy v2.1.4 ", Kg.class.getName()});
    private static final Random b = new Random();

    public static int a() {
        return b.nextInt();
    }

    public static void a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("No components found for the following intent: ");
            sb.append(intent.getAction());
            Log.d(str, sb.toString());
            return;
        }
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            context.sendBroadcast(intent2);
        }
    }
}
