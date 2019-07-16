package com.google.firebase.perf.network;

import android.util.Log;
import com.google.android.gms.internal.firebase-perf.C0899v;
import com.google.android.gms.internal.firebase-perf.zzbg;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

final class d {
    private final HttpURLConnection a;
    private final C0899v b;
    private long c = -1;
    private long d = -1;
    private final zzbg e;

    public d(HttpURLConnection httpURLConnection, zzbg zzbg, C0899v vVar) {
        this.a = httpURLConnection;
        this.b = vVar;
        this.e = zzbg;
        this.b.a(this.a.getURL().toString());
    }

    private final void E() {
        if (this.c == -1) {
            this.e.a();
            this.c = this.e.b();
            this.b.b(this.c);
        }
        String requestMethod = this.a.getRequestMethod();
        if (requestMethod != null) {
            this.b.b(requestMethod);
        } else if (this.a.getDoOutput()) {
            this.b.b("POST");
        } else {
            this.b.b("GET");
        }
    }

    public final String A() throws IOException {
        E();
        if (this.d == -1) {
            this.d = this.e.c();
            this.b.d(this.d);
        }
        try {
            String responseMessage = this.a.getResponseMessage();
            this.b.a(this.a.getResponseCode());
            return responseMessage;
        } catch (IOException e2) {
            this.b.e(this.e.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final URL B() {
        return this.a.getURL();
    }

    public final boolean C() {
        return this.a.getUseCaches();
    }

    public final boolean D() {
        return this.a.usingProxy();
    }

    public final void a() throws IOException {
        if (this.c == -1) {
            this.e.a();
            this.c = this.e.b();
            this.b.b(this.c);
        }
        try {
            this.a.connect();
        } catch (IOException e2) {
            this.b.e(this.e.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final void b() {
        this.b.e(this.e.c());
        this.b.d();
        this.a.disconnect();
    }

    public final boolean c() {
        return this.a.getAllowUserInteraction();
    }

    public final int d() {
        return this.a.getConnectTimeout();
    }

    public final Object e() throws IOException {
        E();
        this.b.a(this.a.getResponseCode());
        try {
            Object content = this.a.getContent();
            if (content instanceof InputStream) {
                this.b.c(this.a.getContentType());
                return new a((InputStream) content, this.b, this.e);
            }
            this.b.c(this.a.getContentType());
            this.b.f((long) this.a.getContentLength());
            this.b.e(this.e.c());
            this.b.d();
            return content;
        } catch (IOException e2) {
            this.b.e(this.e.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final String f() {
        E();
        return this.a.getContentEncoding();
    }

    public final int g() {
        E();
        return this.a.getContentLength();
    }

    public final long h() {
        E();
        return this.a.getContentLengthLong();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String i() {
        E();
        return this.a.getContentType();
    }

    public final long j() {
        E();
        return this.a.getDate();
    }

    public final boolean k() {
        return this.a.getDefaultUseCaches();
    }

    public final boolean l() {
        return this.a.getDoInput();
    }

    public final boolean m() {
        return this.a.getDoOutput();
    }

    public final InputStream n() {
        E();
        try {
            this.b.a(this.a.getResponseCode());
        } catch (IOException unused) {
            Log.d("FirebasePerformance", "IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.a.getErrorStream();
        return errorStream != null ? new a(errorStream, this.b, this.e) : errorStream;
    }

    public final long o() {
        E();
        return this.a.getExpiration();
    }

    public final Map<String, List<String>> p() {
        E();
        return this.a.getHeaderFields();
    }

    public final long q() {
        return this.a.getIfModifiedSince();
    }

    public final InputStream r() throws IOException {
        E();
        this.b.a(this.a.getResponseCode());
        this.b.c(this.a.getContentType());
        try {
            return new a(this.a.getInputStream(), this.b, this.e);
        } catch (IOException e2) {
            this.b.e(this.e.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final boolean s() {
        return this.a.getInstanceFollowRedirects();
    }

    public final long t() {
        E();
        return this.a.getLastModified();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final OutputStream u() throws IOException {
        try {
            return new c(this.a.getOutputStream(), this.b, this.e);
        } catch (IOException e2) {
            this.b.e(this.e.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final Permission v() throws IOException {
        try {
            return this.a.getPermission();
        } catch (IOException e2) {
            this.b.e(this.e.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final int w() {
        return this.a.getReadTimeout();
    }

    public final String x() {
        return this.a.getRequestMethod();
    }

    public final Map<String, List<String>> y() {
        return this.a.getRequestProperties();
    }

    public final int z() throws IOException {
        E();
        if (this.d == -1) {
            this.d = this.e.c();
            this.b.d(this.d);
        }
        try {
            int responseCode = this.a.getResponseCode();
            this.b.a(responseCode);
            return responseCode;
        } catch (IOException e2) {
            this.b.e(this.e.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final void c(int i) {
        this.a.setChunkedStreamingMode(i);
    }

    public final void d(int i) {
        this.a.setConnectTimeout(i);
    }

    public final void c(boolean z) {
        this.a.setDoInput(z);
    }

    public final void d(boolean z) {
        this.a.setDoOutput(z);
    }

    public final void f(int i) {
        this.a.setReadTimeout(i);
    }

    public final long b(String str, long j) {
        E();
        return this.a.getHeaderFieldLong(str, j);
    }

    public final void c(String str) throws ProtocolException {
        this.a.setRequestMethod(str);
    }

    public final void f(boolean z) {
        this.a.setUseCaches(z);
    }

    public final String b(int i) {
        E();
        return this.a.getHeaderFieldKey(i);
    }

    public final String b(String str) {
        return this.a.getRequestProperty(str);
    }

    public final Object a(Class[] clsArr) throws IOException {
        E();
        this.b.a(this.a.getResponseCode());
        try {
            Object content = this.a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.b.c(this.a.getContentType());
                return new a((InputStream) content, this.b, this.e);
            }
            this.b.c(this.a.getContentType());
            this.b.f((long) this.a.getContentLength());
            this.b.e(this.e.c());
            this.b.d();
            return content;
        } catch (IOException e2) {
            this.b.e(this.e.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final void b(boolean z) {
        this.a.setDefaultUseCaches(z);
    }

    public final void b(long j) {
        this.a.setIfModifiedSince(j);
    }

    public final void b(String str, String str2) {
        this.a.setRequestProperty(str, str2);
    }

    public final void e(int i) {
        this.a.setFixedLengthStreamingMode(i);
    }

    public final void e(boolean z) {
        this.a.setInstanceFollowRedirects(z);
    }

    public final String a(int i) {
        E();
        return this.a.getHeaderField(i);
    }

    public final String a(String str) {
        E();
        return this.a.getHeaderField(str);
    }

    public final long a(String str, long j) {
        E();
        return this.a.getHeaderFieldDate(str, j);
    }

    public final int a(String str, int i) {
        E();
        return this.a.getHeaderFieldInt(str, i);
    }

    public final void a(String str, String str2) {
        this.a.addRequestProperty(str, str2);
    }

    public final void a(boolean z) {
        this.a.setAllowUserInteraction(z);
    }

    public final void a(long j) {
        this.a.setFixedLengthStreamingMode(j);
    }
}
