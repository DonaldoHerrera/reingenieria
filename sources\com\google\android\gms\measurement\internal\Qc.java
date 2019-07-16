package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class Qc implements Runnable {
    private final URL a;
    private final byte[] b = null;
    private final Nc c;
    private final String d;
    private final Map<String, String> e;
    private final /* synthetic */ Oc f;

    public Qc(Oc oc, String str, URL url, byte[] bArr, Map<String, String> map, Nc nc) {
        this.f = oc;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(nc);
        this.a = url;
        this.c = nc;
        this.d = str;
        this.e = null;
    }

    private final void b(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        Gb d2 = this.f.d();
        Pc pc = new Pc(this, i, exc, bArr, map);
        d2.a((Runnable) pc);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.c.a(this.d, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    public final void run() {
        int i;
        HttpURLConnection httpURLConnection;
        Map map;
        int i2;
        Map map2;
        int responseCode;
        Map headerFields;
        this.f.h();
        try {
            httpURLConnection = this.f.a(this.a);
            try {
                if (this.e != null) {
                    for (Entry entry : this.e.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
            } catch (IOException e2) {
                e = e2;
                map = null;
                i = 0;
                if (httpURLConnection != null) {
                }
                b(i, e, null, map);
            } catch (Throwable th) {
                th = th;
                map2 = null;
                i2 = 0;
                if (httpURLConnection != null) {
                }
                b(i2, null, null, map2);
                throw th;
            }
            try {
                headerFields = httpURLConnection.getHeaderFields();
            } catch (IOException e3) {
                e = e3;
                i = responseCode;
                map = null;
                if (httpURLConnection != null) {
                }
                b(i, e, null, map);
            } catch (Throwable th2) {
                th = th2;
                i2 = responseCode;
                map2 = null;
                if (httpURLConnection != null) {
                }
                b(i2, null, null, map2);
                throw th;
            }
            try {
                byte[] a2 = Oc.a(httpURLConnection);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b(responseCode, null, a2, headerFields);
            } catch (IOException e4) {
                Exception exc = e4;
                i = responseCode;
                map = headerFields;
                e = exc;
                if (httpURLConnection != null) {
                }
                b(i, e, null, map);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                i2 = responseCode;
                map2 = headerFields;
                th = th4;
                if (httpURLConnection != null) {
                }
                b(i2, null, null, map2);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            map = null;
            httpURLConnection = null;
            i = 0;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            b(i, e, null, map);
        } catch (Throwable th5) {
            th = th5;
            map2 = null;
            httpURLConnection = null;
            i2 = 0;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            b(i2, null, null, map2);
            throw th;
        }
    }
}
