package defpackage;

import android.os.Build.VERSION;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: tb reason: default package and case insensitive filesystem */
/* compiled from: EnvironmentCompat */
public final class C1717tb {
    public static String a(File file) {
        if (VERSION.SDK_INT >= 19) {
            return Environment.getStorageState(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve canonical path: ");
            sb.append(e);
            Log.w("EnvironmentCompat", sb.toString());
        }
        return "unknown";
    }
}
