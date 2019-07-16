package defpackage;

import android.content.Context;
import androidx.core.content.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: jGa reason: default package and case insensitive filesystem */
/* compiled from: IOUtils.kt */
public final class C6698jGa {
    public static final String a(InputStream inputStream) {
        C7471uYa.b(inputStream, "$this$readInputStream");
        byte[] a = AXa.a(inputStream);
        return new String(a, 0, a.length, C6411exb.a);
    }

    public static final long b(Context context) {
        C7471uYa.b(context, "context");
        File a = C6630iGa.a(context);
        if (a != null) {
            return b(a);
        }
        return 0;
    }

    public static final File c(Context context) {
        C7471uYa.b(context, "context");
        File[] b = a.b(context, (String) null);
        C7471uYa.a((Object) b, "ContextCompat.getExternalFilesDirs(context, null)");
        if ((b.length == 0) || b.length == 1) {
            return null;
        }
        return b[1];
    }

    public static final long d(Context context) {
        C7471uYa.b(context, "context");
        File c = c(context);
        if (c != null) {
            return a(c);
        }
        return 0;
    }

    public static final long e(Context context) {
        C7471uYa.b(context, "context");
        File c = c(context);
        if (c != null) {
            return b(c);
        }
        return 0;
    }

    public static final boolean f(Context context) {
        C7471uYa.b(context, "context");
        File c = c(context);
        if (c == null) {
            return false;
        }
        return C7471uYa.a((Object) "mounted", (Object) C1717tb.a(c));
    }

    public static final long b(File file) {
        C7471uYa.b(file, "file");
        return file.getTotalSpace();
    }

    public static final long a(InputStream inputStream, File file) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        C7471uYa.b(inputStream, "$this$copy");
        C7471uYa.b(file, "out");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                long a = AXa.a(inputStream, fileOutputStream, 0, 2, null);
                BXa.a(fileOutputStream, null);
                BXa.a(inputStream, null);
                return a;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                th3 = r6;
                th2 = th5;
            }
            BXa.a(fileOutputStream, th3);
            throw th2;
        } catch (Throwable th6) {
            BXa.a(inputStream, th);
            throw th6;
        }
    }

    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final File a(Context context, String str) {
        C7471uYa.b(context, "context");
        C7471uYa.b(str, "dir");
        File c = c(context);
        if (c != null) {
            return C6630iGa.c(c, str);
        }
        return null;
    }

    public static final long a(Context context) {
        C7471uYa.b(context, "context");
        File a = C6630iGa.a(context);
        if (a != null) {
            return a(a);
        }
        return 0;
    }

    public static final long a(File file) {
        C7471uYa.b(file, "file");
        return Math.max(file.getFreeSpace() - ((long) 104857600), 0);
    }
}
