package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipFile;

public class a {
    private static final AtomicReference<a> a = new AtomicReference<>(null);
    /* access modifiers changed from: private */
    public final c b;
    private final Set<String> c = new HashSet();

    private a(Context context) {
        try {
            this.b = new c(context);
        } catch (NameNotFoundException | IOException e) {
            throw new C1773vA("Failed to initialize FileStorage", e);
        }
    }

    public static boolean a() {
        return a.get() != null;
    }

    public static boolean a(Context context) {
        return a(context, true);
    }

    private static boolean a(Context context, boolean z) {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        a aVar = (a) a.get();
        if (a.compareAndSet(null, new a(context))) {
            C1803wA wAVar = new C1803wA(context, b.a(), new C1833xA(context, aVar.b, new XA()), aVar.b, new JB());
            FB.a(wAVar);
            IB.a(new m(aVar));
            b.a().execute(new o(context));
        }
        try {
            aVar.b(context, z);
            return true;
        } catch (Exception e) {
            Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[SYNTHETIC, Splitter:B:15:0x001f] */
    private static boolean a(q qVar) throws IOException {
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(qVar.b());
            try {
                boolean z = zipFile2.getEntry("classes.dex") != null;
                zipFile2.close();
                return z;
            } catch (IOException e) {
                e = e;
                zipFile = zipFile2;
                if (zipFile != null) {
                }
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e3) {
                    _A.a(e, e3);
                }
            }
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0145  */
    private final synchronized void b(Context context, boolean z) throws IOException {
        boolean z2;
        if (z) {
            this.b.a();
        } else {
            b.a().execute(new n(this));
        }
        List<String> c2 = c(context);
        Set<q> d = this.b.d();
        HashSet hashSet = new HashSet();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            String a2 = ((q) it.next()).a();
            if (c2.contains(a2)) {
                if (z) {
                    this.b.f(a2);
                } else {
                    hashSet.add(a2);
                }
                it.remove();
            }
        }
        if (!hashSet.isEmpty()) {
            b.a().execute(new p(this, hashSet));
        }
        HashSet hashSet2 = new HashSet();
        for (q a3 : d) {
            String a4 = a3.a();
            if (!LB.b(a4)) {
                hashSet2.add(a4);
            }
        }
        for (String str : c2) {
            if (!LB.b(str)) {
                hashSet2.add(str);
            }
        }
        HashSet<q> hashSet3 = new HashSet<>(d.size());
        for (q qVar : d) {
            if (LB.a(qVar.a()) || hashSet2.contains(LB.c(qVar.a()))) {
                hashSet3.add(qVar);
            }
        }
        f fVar = new f(this.b);
        AA a5 = C1893zA.a();
        ClassLoader classLoader = context.getClassLoader();
        if (z) {
            a5.a(classLoader, fVar.a());
        } else {
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                Set a6 = fVar.a((q) it2.next());
                if (a6 == null) {
                    it2.remove();
                } else {
                    a5.a(classLoader, a6);
                }
            }
        }
        HashSet<File> hashSet4 = new HashSet<>();
        for (q qVar2 : hashSet3) {
            if (a(qVar2)) {
                if (!a5.a(classLoader, this.b.c(qVar2.a()), qVar2.b(), z)) {
                    z2 = false;
                    if (!z2) {
                        hashSet4.add(qVar2.b());
                    } else {
                        String valueOf = String.valueOf(qVar2.b());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                        sb.append("split was not installed ");
                        sb.append(valueOf);
                        Log.w("SplitCompat", sb.toString());
                    }
                }
            }
            z2 = true;
            if (!z2) {
            }
        }
        AssetManager assets = context.getAssets();
        for (File path : hashSet4) {
            int intValue = ((Integer) XA.a((Object) assets, "addAssetPath", Integer.class, String.class, path.getPath())).intValue();
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("addAssetPath completed with ");
            sb2.append(intValue);
            Log.d("SplitCompat", sb2.toString());
        }
        for (q qVar3 : hashSet3) {
            if (hashSet4.contains(qVar3.b())) {
                String a7 = qVar3.a();
                StringBuilder sb3 = new StringBuilder(String.valueOf(a7).length() + 30);
                sb3.append("Split '");
                sb3.append(a7);
                sb3.append("' installation emulated");
                Log.d("SplitCompat", sb3.toString());
                this.c.add(qVar3.a());
            } else {
                String a8 = qVar3.a();
                StringBuilder sb4 = new StringBuilder(String.valueOf(a8).length() + 35);
                sb4.append("Split '");
                sb4.append(a8);
                sb4.append("' installation not emulated.");
                Log.d("SplitCompat", sb4.toString());
            }
        }
    }

    public static boolean b(Context context) {
        return a(context, false);
    }

    private static List<String> c(Context context) throws IOException {
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            return packageInfo.splitNames == null ? new ArrayList() : Arrays.asList(packageInfo.splitNames);
        } catch (NameNotFoundException e) {
            throw new IOException(String.format("Cannot load data for application '%s'", new Object[]{packageName}), e);
        }
    }
}
