package com.google.firebase.perf.network;

import com.google.android.gms.internal.firebase-perf.C0899v;
import com.google.android.gms.internal.firebase-perf.zzbg;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class e extends HttpsURLConnection {
    private final d a;
    private final HttpsURLConnection b;

    e(HttpsURLConnection httpsURLConnection, zzbg zzbg, C0899v vVar) {
        super(httpsURLConnection.getURL());
        this.b = httpsURLConnection;
        this.a = new d(httpsURLConnection, zzbg, vVar);
    }

    public final void addRequestProperty(String str, String str2) {
        this.a.a(str, str2);
    }

    public final void connect() throws IOException {
        this.a.a();
    }

    public final void disconnect() {
        this.a.b();
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final boolean getAllowUserInteraction() {
        return this.a.c();
    }

    public final String getCipherSuite() {
        return this.b.getCipherSuite();
    }

    public final int getConnectTimeout() {
        return this.a.d();
    }

    public final Object getContent() throws IOException {
        return this.a.e();
    }

    public final String getContentEncoding() {
        return this.a.f();
    }

    public final int getContentLength() {
        return this.a.g();
    }

    public final long getContentLengthLong() {
        return this.a.h();
    }

    public final String getContentType() {
        return this.a.i();
    }

    public final long getDate() {
        return this.a.j();
    }

    public final boolean getDefaultUseCaches() {
        return this.a.k();
    }

    public final boolean getDoInput() {
        return this.a.l();
    }

    public final boolean getDoOutput() {
        return this.a.m();
    }

    public final InputStream getErrorStream() {
        return this.a.n();
    }

    public final long getExpiration() {
        return this.a.o();
    }

    public final String getHeaderField(int i) {
        return this.a.a(i);
    }

    public final long getHeaderFieldDate(String str, long j) {
        return this.a.a(str, j);
    }

    public final int getHeaderFieldInt(String str, int i) {
        return this.a.a(str, i);
    }

    public final String getHeaderFieldKey(int i) {
        return this.a.b(i);
    }

    public final long getHeaderFieldLong(String str, long j) {
        return this.a.b(str, j);
    }

    public final Map<String, List<String>> getHeaderFields() {
        return this.a.p();
    }

    public final HostnameVerifier getHostnameVerifier() {
        return this.b.getHostnameVerifier();
    }

    public final long getIfModifiedSince() {
        return this.a.q();
    }

    public final InputStream getInputStream() throws IOException {
        return this.a.r();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.a.s();
    }

    public final long getLastModified() {
        return this.a.t();
    }

    public final Certificate[] getLocalCertificates() {
        return this.b.getLocalCertificates();
    }

    public final Principal getLocalPrincipal() {
        return this.b.getLocalPrincipal();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.a.u();
    }

    public final Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.b.getPeerPrincipal();
    }

    public final Permission getPermission() throws IOException {
        return this.a.v();
    }

    public final int getReadTimeout() {
        return this.a.w();
    }

    public final String getRequestMethod() {
        return this.a.x();
    }

    public final Map<String, List<String>> getRequestProperties() {
        return this.a.y();
    }

    public final String getRequestProperty(String str) {
        return this.a.b(str);
    }

    public final int getResponseCode() throws IOException {
        return this.a.z();
    }

    public final String getResponseMessage() throws IOException {
        return this.a.A();
    }

    public final SSLSocketFactory getSSLSocketFactory() {
        return this.b.getSSLSocketFactory();
    }

    public final Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.b.getServerCertificates();
    }

    public final URL getURL() {
        return this.a.B();
    }

    public final boolean getUseCaches() {
        return this.a.C();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void setAllowUserInteraction(boolean z) {
        this.a.a(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.a.c(i);
    }

    public final void setConnectTimeout(int i) {
        this.a.d(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.a.b(z);
    }

    public final void setDoInput(boolean z) {
        this.a.c(z);
    }

    public final void setDoOutput(boolean z) {
        this.a.d(z);
    }

    public final void setFixedLengthStreamingMode(int i) {
        this.a.e(i);
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.b.setHostnameVerifier(hostnameVerifier);
    }

    public final void setIfModifiedSince(long j) {
        this.a.b(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.a.e(z);
    }

    public final void setReadTimeout(int i) {
        this.a.f(i);
    }

    public final void setRequestMethod(String str) throws ProtocolException {
        this.a.c(str);
    }

    public final void setRequestProperty(String str, String str2) {
        this.a.b(str, str2);
    }

    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.b.setSSLSocketFactory(sSLSocketFactory);
    }

    public final void setUseCaches(boolean z) {
        this.a.f(z);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean usingProxy() {
        return this.a.D();
    }

    public final Object getContent(Class[] clsArr) throws IOException {
        return this.a.a(clsArr);
    }

    public final String getHeaderField(String str) {
        return this.a.a(str);
    }

    public final void setFixedLengthStreamingMode(long j) {
        this.a.a(j);
    }
}
