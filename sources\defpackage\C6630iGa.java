package defpackage;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import androidx.core.content.a;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Locale;

/* renamed from: iGa reason: default package and case insensitive filesystem */
/* compiled from: FileUtils.kt */
public final class C6630iGa {
    public static final boolean a() {
        return C7471uYa.a((Object) "mounted", (Object) Environment.getExternalStorageState());
    }

    public static final boolean b(File file) {
        C7471uYa.b(file, "$this$deleteFile");
        if (!file.exists()) {
            return false;
        }
        boolean delete = file.delete();
        if (delete) {
            return delete;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("could not delete ");
        sb.append(file);
        Log.w("FileUtils", sb.toString());
        return delete;
    }

    public static final String c(File file) {
        C7471uYa.b(file, "$this$extensionOrNull");
        if (!(LXa.c(file).length() > 0)) {
            return null;
        }
        String c = LXa.c(file);
        Locale locale = Locale.US;
        C7471uYa.a((Object) locale, "Locale.US");
        if (c != null) {
            String lowerCase = c.toLowerCase(locale);
            C7471uYa.a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new OVa("null cannot be cast to non-null type java.lang.String");
    }

    public static final boolean d(File file) {
        C7471uYa.b(file, "$this$isEmptyDir");
        if (!file.exists() || !file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Argument ");
            sb.append(file.toString());
            sb.append(" is not a directory (exists=");
            sb.append(file.exists());
            sb.append(", isDirectory=");
            sb.append(file.isDirectory());
            sb.append(", canWrite=");
            sb.append(file.canWrite());
            sb.append(", canRead=");
            sb.append(file.canRead());
            sb.append(')');
            throw new IllegalArgumentException(sb.toString());
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length != 0) {
            return false;
        }
        return true;
    }

    public static final boolean e(File file) {
        C7471uYa.b(file, "$this$mkdirsIfDoNotExist");
        if (file.exists()) {
            return false;
        }
        boolean mkdirs = file.mkdirs();
        if (mkdirs) {
            return mkdirs;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mkdir ");
        sb.append(file.getAbsolutePath());
        sb.append(" returned false");
        Log.w("FileUtils", sb.toString());
        return mkdirs;
    }

    public static final boolean f(File file) {
        boolean z;
        C7471uYa.b(file, "$this$nomedia");
        if (!file.isDirectory()) {
            return false;
        }
        File file2 = new File(file, ".nomedia");
        if (!file2.exists() || !file2.isFile()) {
            try {
                z = file2.createNewFile();
            } catch (IOException unused) {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public static final File[] g(File file) {
        return a(file, null, 1, null);
    }

    public static final File h(File file) {
        C7471uYa.b(file, "$this$removeExtension");
        return file.isDirectory() ? file : new File(file.getParent(), LXa.d(file));
    }

    public static /* synthetic */ File[] a(File file, FilenameFilter filenameFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            filenameFilter = null;
        }
        return a(file, filenameFilter);
    }

    public static final File c(File file, String str) {
        C7471uYa.b(file, "$this$createDir");
        C7471uYa.b(str, "folder");
        File file2 = new File(file, str);
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                return null;
            }
        } else if (!file2.mkdirs()) {
            return null;
        }
        return file2;
    }

    public static final File[] a(File file, FilenameFilter filenameFilter) {
        C7471uYa.b(file, "$this$nullSafeListFiles");
        File[] listFiles = filenameFilter != null ? file.listFiles(filenameFilter) : file.listFiles();
        return listFiles != null ? listFiles : new File[0];
    }

    public static final File b(File file, String str) {
        C7471uYa.b(file, "$this$changeExtension");
        C7471uYa.b(str, "ext");
        File parentFile = file.getParentFile();
        StringBuilder sb = new StringBuilder();
        sb.append(LXa.d(file));
        sb.append('.');
        sb.append(str);
        return new File(parentFile, sb.toString());
    }

    public static final boolean a(File file) {
        C7471uYa.b(file, "$this$cleanDir");
        if (!file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Argument ");
            sb.append(file.toString());
            sb.append(" is not a directory (exists=");
            sb.append(file.exists());
            sb.append(", isDirectory=");
            sb.append(file.isDirectory());
            sb.append(", canWrite=");
            sb.append(file.canWrite());
            sb.append(", canRead=");
            sb.append(file.canRead());
            sb.append(')');
            throw new IllegalArgumentException(sb.toString());
        } else if (d(file)) {
            return true;
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                C7471uYa.a((Object) file2, "file");
                z = !file2.isDirectory() ? !(!z || !b(file2)) : !(!z || !LXa.b(file2));
            }
            return z;
        }
    }

    public static final File a(File file, String str) {
        C7471uYa.b(file, "$this$appendToFilename");
        C7471uYa.b(str, "text");
        if (LXa.c(file).length() > 0) {
            File parentFile = file.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append(LXa.d(file));
            sb.append(str);
            sb.append('.');
            sb.append(LXa.c(file));
            return new File(parentFile, sb.toString());
        }
        File parentFile2 = file.getParentFile();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LXa.d(file));
        sb2.append(str);
        return new File(parentFile2, sb2.toString());
    }

    public static final File a(Context context, String str) {
        C7471uYa.b(context, "context");
        C7471uYa.b(str, "dir");
        File a = a(context);
        if (a != null) {
            return c(a, str);
        }
        return null;
    }

    public static final File a(Context context) {
        C7471uYa.b(context, "context");
        File[] b = a.b(context, (String) null);
        C7471uYa.a((Object) b, "ContextCompat.getExternalFilesDirs(context, null)");
        return (File) C6578hWa.f(b);
    }

    public static final long a(File... fileArr) {
        File[] a;
        long j;
        C7471uYa.b(fileArr, "directories");
        if (fileArr.length <= 0) {
            return 0;
        }
        File file = fileArr[0];
        long j2 = 0;
        for (File file2 : a(file, null, 1, null)) {
            if (!file2.isDirectory() || !(!C7471uYa.a((Object) file, (Object) file2))) {
                j = file2.length();
            } else {
                j = a(file2);
            }
            j2 += j;
        }
        return j2;
    }
}
