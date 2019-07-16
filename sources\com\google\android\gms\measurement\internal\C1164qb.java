package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.measurement.internal.qb reason: case insensitive filesystem */
final class C1164qb implements Runnable {
    private final URL a;
    private final byte[] b;
    private final C1154ob c;
    private final String d;
    private final Map<String, String> e;
    private final /* synthetic */ C1144mb f;

    public C1164qb(C1144mb mbVar, String str, URL url, byte[] bArr, Map<String, String> map, C1154ob obVar) {
        this.f = mbVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(obVar);
        this.a = url;
        this.b = bArr;
        this.c = obVar;
        this.d = str;
        this.e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[SYNTHETIC, Splitter:B:44:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101 A[SYNTHETIC, Splitter:B:57:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    public final void run() {
        Map map;
        Throwable th;
        int i;
        HttpURLConnection httpURLConnection;
        Map map2;
        String str = "Error closing HTTP compressed POST connection output stream. appId";
        this.f.h();
        OutputStream outputStream = null;
        try {
            httpURLConnection = this.f.a(this.a);
            try {
                if (this.e != null) {
                    for (Entry entry : this.e.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.b != null) {
                    byte[] c2 = this.f.m().c(this.b);
                    this.f.e().A().a("Uploading data. size", Integer.valueOf(c2.length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(c2.length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(c2);
                        outputStream2.close();
                    } catch (IOException e2) {
                        map2 = null;
                        th = e2;
                        outputStream = outputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                        map = null;
                        outputStream = outputStream2;
                        i = 0;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        Gb d2 = this.f.d();
                        C1149nb nbVar = new C1149nb(this.d, this.c, i, null, null, map);
                        d2.a((Runnable) nbVar);
                        throw th;
                    }
                }
                i = httpURLConnection.getResponseCode();
                try {
                    map = httpURLConnection.getHeaderFields();
                    try {
                        byte[] a2 = C1144mb.a(httpURLConnection);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        Gb d3 = this.f.d();
                        C1149nb nbVar2 = new C1149nb(this.d, this.c, i, null, a2, map);
                        d3.a((Runnable) nbVar2);
                    } catch (IOException e3) {
                        e = e3;
                        th = e;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        Gb d4 = this.f.d();
                        C1149nb nbVar3 = new C1149nb(this.d, this.c, i, th, null, map);
                        d4.a((Runnable) nbVar3);
                    } catch (Throwable th3) {
                        th = th3;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        Gb d22 = this.f.d();
                        C1149nb nbVar4 = new C1149nb(this.d, this.c, i, null, null, map);
                        d22.a((Runnable) nbVar4);
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    map = null;
                    th = e;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    Gb d42 = this.f.d();
                    C1149nb nbVar32 = new C1149nb(this.d, this.c, i, th, null, map);
                    d42.a((Runnable) nbVar32);
                } catch (Throwable th4) {
                    th = th4;
                    map = null;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    Gb d222 = this.f.d();
                    C1149nb nbVar42 = new C1149nb(this.d, this.c, i, null, null, map);
                    d222.a((Runnable) nbVar42);
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                map2 = null;
                th = e;
                i = 0;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                Gb d422 = this.f.d();
                C1149nb nbVar322 = new C1149nb(this.d, this.c, i, th, null, map);
                d422.a((Runnable) nbVar322);
            } catch (Throwable th5) {
                th = th5;
                map = null;
                i = 0;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                Gb d2222 = this.f.d();
                C1149nb nbVar422 = new C1149nb(this.d, this.c, i, null, null, map);
                d2222.a((Runnable) nbVar422);
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            httpURLConnection = null;
            map2 = null;
            th = e;
            i = 0;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e7) {
                    this.f.e().s().a(str, C1124ib.a(this.d), e7);
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            Gb d4222 = this.f.d();
            C1149nb nbVar3222 = new C1149nb(this.d, this.c, i, th, null, map);
            d4222.a((Runnable) nbVar3222);
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            map = null;
            i = 0;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e8) {
                    this.f.e().s().a(str, C1124ib.a(this.d), e8);
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            Gb d22222 = this.f.d();
            C1149nb nbVar4222 = new C1149nb(this.d, this.c, i, null, null, map);
            d22222.a((Runnable) nbVar4222);
            throw th;
        }
    }
}
