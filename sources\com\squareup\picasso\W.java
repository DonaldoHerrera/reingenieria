package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* compiled from: Utils */
final class W {
    static final StringBuilder a = new StringBuilder();
    private static final C7030oAb b = C7030oAb.c("RIFF");
    private static final C7030oAb c = C7030oAb.c("WEBP");

    /* compiled from: Utils */
    private static class a extends Thread {
        a(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: Utils */
    static class b implements ThreadFactory {
        b() {
        }

        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    static int a(Bitmap bitmap) {
        int allocationByteCount = VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(bitmap);
        throw new IllegalStateException(sb.toString());
    }

    static void b() {
        if (c()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean c(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        try {
            String str = "airplane_mode_on";
            if (VERSION.SDK_INT < 17) {
                if (System.getInt(contentResolver, str, 0) != 0) {
                    z = true;
                }
                return z;
            }
            if (Global.getInt(contentResolver, str, 0) != 0) {
                z = true;
            }
            return z;
        } catch (NullPointerException | SecurityException unused) {
        }
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static File b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static void a() {
        if (!c()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static String a(C6244i iVar) {
        return a(iVar, "");
    }

    static boolean b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static String a(C6244i iVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C6236a b2 = iVar.b();
        if (b2 != null) {
            sb.append(b2.b.d());
        }
        List c2 = iVar.c();
        if (c2 != null) {
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || b2 != null) {
                    sb.append(", ");
                }
                sb.append(((C6236a) c2.get(i)).b.d());
            }
        }
        return sb.toString();
    }

    static void a(String str, String str2, String str3) {
        a(str, str2, str3, "");
    }

    static void a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", objArr));
    }

    static String a(K k) {
        String a2 = a(k, a);
        a.setLength(0);
        return a2;
    }

    static String a(K k, StringBuilder sb) {
        String str = k.g;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(k.g);
        } else {
            Uri uri = k.e;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(k.f);
            }
        }
        sb.append(10);
        if (k.o != 0.0f) {
            sb.append("rotation:");
            sb.append(k.o);
            if (k.r) {
                sb.append('@');
                sb.append(k.p);
                sb.append('x');
                sb.append(k.q);
            }
            sb.append(10);
        }
        if (k.c()) {
            sb.append("resize:");
            sb.append(k.i);
            sb.append('x');
            sb.append(k.j);
            sb.append(10);
        }
        if (k.k) {
            sb.append("centerCrop:");
            sb.append(k.l);
            sb.append(10);
        } else if (k.m) {
            sb.append("centerInside");
            sb.append(10);
        }
        List<U> list = k.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(((U) k.h.get(i)).a());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    @TargetApi(18)
    static long a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = ((VERSION.SDK_INT < 18 ? (long) statFs.getBlockCount() : statFs.getBlockCountLong()) * (VERSION.SDK_INT < 18 ? (long) statFs.getBlockSize() : statFs.getBlockSizeLong())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    static int a(Context context) {
        ActivityManager activityManager = (ActivityManager) a(context, "activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7);
    }

    static <T> T a(Context context, String str) {
        return context.getSystemService(str);
    }

    static boolean a(C6961nAb nab) throws IOException {
        return nab.a(0, b) && nab.a(8, c);
    }

    static int a(Resources resources, K k) throws FileNotFoundException {
        int i;
        if (k.f == 0) {
            Uri uri = k.e;
            if (uri != null) {
                String authority = uri.getAuthority();
                if (authority != null) {
                    List pathSegments = k.e.getPathSegments();
                    if (pathSegments == null || pathSegments.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("No path segments: ");
                        sb.append(k.e);
                        throw new FileNotFoundException(sb.toString());
                    }
                    if (pathSegments.size() == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Last path segment is not a resource ID: ");
                            sb2.append(k.e);
                            throw new FileNotFoundException(sb2.toString());
                        }
                    } else if (pathSegments.size() == 2) {
                        i = resources.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("More than two path segments: ");
                        sb3.append(k.e);
                        throw new FileNotFoundException(sb3.toString());
                    }
                    return i;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No package provided: ");
                sb4.append(k.e);
                throw new FileNotFoundException(sb4.toString());
            }
        }
        return k.f;
    }

    static Resources a(Context context, K k) throws FileNotFoundException {
        if (k.f == 0) {
            Uri uri = k.e;
            if (uri != null) {
                String authority = uri.getAuthority();
                if (authority != null) {
                    try {
                        return context.getPackageManager().getResourcesForApplication(authority);
                    } catch (NameNotFoundException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unable to obtain resources for package: ");
                        sb.append(k.e);
                        throw new FileNotFoundException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No package provided: ");
                    sb2.append(k.e);
                    throw new FileNotFoundException(sb2.toString());
                }
            }
        }
        return context.getResources();
    }

    static void a(Looper looper) {
        V v = new V(looper);
        v.sendMessageDelayed(v.obtainMessage(), 1000);
    }
}
