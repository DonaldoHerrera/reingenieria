package bo.app;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

public final class ht {
    public static File a(Context context) {
        return a(context, true);
    }

    public static File b(Context context) {
        return a(context, "uil-images");
    }

    private static File c(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (!file.exists()) {
            if (!file.mkdirs()) {
                hr.c("Unable to create external cache directory", new Object[0]);
                return null;
            }
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException unused) {
                hr.b("Can't create \".nomedia\" file in application external cache directory", new Object[0]);
            }
        }
        return file;
    }

    private static boolean d(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static File a(Context context, boolean z) {
        String str = "";
        try {
            str = Environment.getExternalStorageState();
        } catch (IncompatibleClassChangeError | NullPointerException unused) {
        }
        File c = (!z || !"mounted".equals(str) || !d(context)) ? null : c(context);
        if (c == null) {
            c = context.getCacheDir();
        }
        if (c != null) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/data/data/");
        sb.append(context.getPackageName());
        sb.append("/cache/");
        String sb2 = sb.toString();
        hr.c("Can't define system cache directory! '%s' will be used.", sb2);
        return new File(sb2);
    }

    public static File a(Context context, String str) {
        File a = a(context);
        File file = new File(a, str);
        return (file.exists() || file.mkdir()) ? file : a;
    }
}
