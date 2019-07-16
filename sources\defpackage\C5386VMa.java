package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: VMa reason: default package and case insensitive filesystem */
/* compiled from: FabricKitsFinder */
class C5386VMa implements Callable<Map<String, C5633bNa>> {
    final String a;

    C5386VMa(String str) {
        this.a = str;
    }

    private C5633bNa a(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty("fabric-identifier");
                String property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid format of fabric file,");
                    sb.append(zipEntry.getName());
                    throw new IllegalStateException(sb.toString());
                }
                C5633bNa bna = new C5633bNa(property, property2, property3);
                C7391tNa.a((Closeable) inputStream);
                return bna;
            } catch (IOException e) {
                e = e;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error when parsing fabric properties ");
                    sb2.append(zipEntry.getName());
                    C5328TMa.e().e("Fabric", sb2.toString(), e);
                    C7391tNa.a((Closeable) inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    C7391tNa.a((Closeable) inputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Error when parsing fabric properties ");
            sb22.append(zipEntry.getName());
            C5328TMa.e().e("Fabric", sb22.toString(), e);
            C7391tNa.a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C7391tNa.a((Closeable) inputStream);
            throw th;
        }
    }

    private Map<String, C5633bNa> b() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            C5633bNa bna = new C5633bNa("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(bna.b(), bna);
            C5328TMa.e().a("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    private Map<String, C5633bNa> c() throws Exception {
        HashMap hashMap = new HashMap();
        ZipFile a2 = a();
        Enumeration entries = a2.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > 7) {
                C5633bNa a3 = a(zipEntry, a2);
                if (a3 != null) {
                    hashMap.put(a3.b(), a3);
                    C5328TMa.e().a("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[]{a3.b(), a3.c()}));
                }
            }
        }
        if (a2 != null) {
            try {
                a2.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    public Map<String, C5633bNa> call() throws Exception {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(b());
        hashMap.putAll(c());
        C5701cNa e = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("finish scanning in ");
        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        e.a("Fabric", sb.toString());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public ZipFile a() throws IOException {
        return new ZipFile(this.a);
    }
}
