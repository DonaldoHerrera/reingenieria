package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.android.gms.internal.firebase-perf.C0899v;
import com.google.android.gms.internal.firebase-perf.M;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.perf.internal.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    private static InputStream a(M m, c cVar, zzbg zzbg) throws IOException {
        zzbg.a();
        long b = zzbg.b();
        C0899v a = C0899v.a(cVar);
        try {
            URLConnection a2 = m.a();
            if (a2 instanceof HttpsURLConnection) {
                return new e((HttpsURLConnection) a2, zzbg, a).getInputStream();
            }
            if (a2 instanceof HttpURLConnection) {
                return new b((HttpURLConnection) a2, zzbg, a).getInputStream();
            }
            return a2.getInputStream();
        } catch (IOException e) {
            a.b(b);
            a.e(zzbg.c());
            a.a(m.toString());
            h.a(a);
            throw e;
        }
    }

    private static Object b(M m, c cVar, zzbg zzbg) throws IOException {
        zzbg.a();
        long b = zzbg.b();
        C0899v a = C0899v.a(cVar);
        try {
            URLConnection a2 = m.a();
            if (a2 instanceof HttpsURLConnection) {
                return new e((HttpsURLConnection) a2, zzbg, a).getContent();
            }
            if (a2 instanceof HttpURLConnection) {
                return new b((HttpURLConnection) a2, zzbg, a).getContent();
            }
            return a2.getContent();
        } catch (IOException e) {
            a.b(b);
            a.e(zzbg.c());
            a.a(m.toString());
            h.a(a);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return b(new M(url), c.a(), new zzbg());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new e((HttpsURLConnection) obj, new zzbg(), C0899v.a(c.a()));
        }
        return obj instanceof HttpURLConnection ? new b((HttpURLConnection) obj, new zzbg(), C0899v.a(c.a())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return a(new M(url), c.a(), new zzbg());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return a(new M(url), clsArr, c.a(), new zzbg());
    }

    private static Object a(M m, Class[] clsArr, c cVar, zzbg zzbg) throws IOException {
        zzbg.a();
        long b = zzbg.b();
        C0899v a = C0899v.a(cVar);
        try {
            URLConnection a2 = m.a();
            if (a2 instanceof HttpsURLConnection) {
                return new e((HttpsURLConnection) a2, zzbg, a).getContent(clsArr);
            }
            if (a2 instanceof HttpURLConnection) {
                return new b((HttpURLConnection) a2, zzbg, a).getContent(clsArr);
            }
            return a2.getContent(clsArr);
        } catch (IOException e) {
            a.b(b);
            a.e(zzbg.c());
            a.a(m.toString());
            h.a(a);
            throw e;
        }
    }
}
