package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class c {
    private final File a;
    private final long b;

    public c(Context context) throws IOException, NameNotFoundException {
        this(context.getFilesDir(), (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
    }

    private c(File file, long j) {
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 82);
        sb.append("FileStorage: initializing (files directory = ");
        sb.append(absolutePath);
        sb.append(", versionCode = ");
        sb.append(j);
        sb.append(")");
        Log.d("SplitCompat", sb.toString());
        this.a = file;
        this.b = j;
    }

    private static File c(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (file.isDirectory()) {
                return file;
            }
            String str = "Unable to create directory: ";
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IOException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else if (file.isDirectory()) {
            return file;
        } else {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    private static void d(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File d : listFiles) {
                    d(d);
                }
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    private final File f() throws IOException {
        File file = new File(g(), "verified-splits");
        c(file);
        return file;
    }

    private final File g() throws IOException {
        File file = new File(h(), Long.toString(this.b));
        c(file);
        return file;
    }

    private final File g(String str) throws IOException {
        File file = new File(i(), str);
        c(file);
        return file;
    }

    private final File h() throws IOException {
        File file = new File(this.a, "splitcompat");
        c(file);
        return file;
    }

    private static String h(String str) {
        String valueOf = String.valueOf(str);
        String str2 = ".apk";
        return str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
    }

    private final File i() throws IOException {
        File file = new File(g(), "native-libraries");
        c(file);
        return file;
    }

    public final File a(File file) throws IOException {
        return new File(f(), file.getName());
    }

    public final File a(String str) throws IOException {
        return new File(c(), h(str));
    }

    public final File a(String str, String str2) throws IOException {
        return new File(g(str), str2);
    }

    public final void a() throws IOException {
        File h = h();
        String[] list = h.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.b))) {
                    File file = new File(h, str);
                    String valueOf = String.valueOf(file);
                    long j = this.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(valueOf);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    Log.d("SplitCompat", sb.toString());
                    d(file);
                }
            }
        }
    }

    public final File b() throws IOException {
        return new File(g(), "lock.tmp");
    }

    public final File b(String str) throws IOException {
        return new File(f(), h(str));
    }

    /* access modifiers changed from: 0000 */
    public final void b(File file) throws IOException {
        XA.a(file.getParentFile().getParentFile().equals(i()), (Object) "File to remove is not a native library");
        d(file);
    }

    public final File c() throws IOException {
        File file = new File(g(), "unverified-splits");
        c(file);
        return file;
    }

    public final File c(String str) throws IOException {
        File file = new File(g(), "dex");
        c(file);
        File file2 = new File(file, str);
        c(file2);
        return file2;
    }

    /* access modifiers changed from: 0000 */
    public final Set<q> d() throws IOException {
        File f = f();
        HashSet hashSet = new HashSet();
        File[] listFiles = f.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new q(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    public final void d(String str) throws IOException {
        d(g(str));
    }

    /* access modifiers changed from: 0000 */
    public final List<String> e() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = i().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final Set<File> e(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] listFiles = g(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    public final void f(String str) throws IOException {
        d(b(str));
    }
}
