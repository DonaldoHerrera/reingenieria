package com.google.android.play.core.splitcompat;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class f {
    private static final Pattern a = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    private final c b;

    f(c cVar) throws IOException {
        this.b = cVar;
    }

    /* access modifiers changed from: private */
    public final Set<File> a(Set<k> set, q qVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        a(qVar, set, (l) new j(hashSet, qVar, zipFile));
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f5 A[SYNTHETIC, Splitter:B:35:0x00f5] */
    private static void a(q qVar, i iVar) throws IOException {
        ZipFile zipFile;
        String str;
        String[] strArr;
        String format;
        try {
            zipFile = new ZipFile(qVar.b());
            try {
                String a2 = qVar.a();
                HashMap hashMap = new HashMap();
                Enumeration entries = zipFile.entries();
                while (true) {
                    str = "SplitCompat";
                    if (!entries.hasMoreElements()) {
                        break;
                    }
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = a.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Log.d(str, String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", new Object[]{a2, group2, group}));
                        Set set = (Set) hashMap.get(group);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(group, set);
                        }
                        set.add(new k(zipEntry, group2));
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (String str2 : Build.SUPPORTED_ABIS) {
                    if (hashMap.containsKey(str2)) {
                        Log.d(str, String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", new Object[]{str2}));
                        for (k kVar : (Set) hashMap.get(str2)) {
                            if (hashMap2.containsKey(kVar.a)) {
                                format = String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", new Object[]{kVar.a, str2});
                            } else {
                                hashMap2.put(kVar.a, kVar);
                                format = String.format("NativeLibraryExtractor: using library %s for ABI %s", new Object[]{kVar.a, str2});
                            }
                            Log.d(str, format);
                        }
                    } else {
                        Log.d(str, String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", new Object[]{str2}));
                    }
                }
                iVar.a(zipFile, new HashSet(hashMap2.values()));
                zipFile.close();
            } catch (IOException e) {
                e = e;
                if (zipFile != null) {
                }
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
            zipFile = null;
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

    /* access modifiers changed from: private */
    public final void a(q qVar, Set<k> set, l lVar) throws IOException {
        for (k kVar : set) {
            File a2 = this.b.a(qVar.a(), kVar.a);
            lVar.a(kVar, a2, a2.exists() && a2.length() == kVar.b.getSize());
        }
    }

    private static /* synthetic */ void a(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                _A.a(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    private static /* synthetic */ void a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                _A.a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        a((java.lang.Throwable) null, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        if (r4 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        a(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        a((java.lang.Throwable) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4 == null) goto L_?;
     */
    public static void b(ZipFile zipFile, ZipEntry zipEntry, File file) throws IOException {
        Throwable th;
        Throwable th2;
        byte[] bArr = new byte[4096];
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th2 = r6;
                th = th4;
            }
        }
        a(th2, fileOutputStream);
        throw th;
    }

    /* access modifiers changed from: 0000 */
    public final Set<File> a() throws IOException {
        boolean z;
        String str = "SplitCompat";
        Log.d(str, "NativeLibraryExtractor: synchronizing native libraries");
        Set<q> d = this.b.d();
        for (String str2 : this.b.e()) {
            Iterator it = d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((q) it.next()).a().equals(str2)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                Log.i(str, String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[]{str2}));
                this.b.d(str2);
            }
        }
        HashSet hashSet = new HashSet();
        for (q qVar : d) {
            HashSet hashSet2 = new HashSet();
            a(qVar, (i) new g(this, hashSet2, qVar));
            for (File file : this.b.e(qVar.a())) {
                if (!hashSet2.contains(file)) {
                    Log.i(str, String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[]{file.getAbsolutePath(), qVar.a(), qVar.b().getAbsolutePath()}));
                    this.b.b(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    public final Set<File> a(q qVar) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        a(qVar, (i) new e(this, qVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }
}
