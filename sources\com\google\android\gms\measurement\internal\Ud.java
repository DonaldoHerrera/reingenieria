package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

final class Ud extends SSLSocketFactory {
    private final SSLSocketFactory a;

    Ud() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private final SSLSocket a(SSLSocket sSLSocket) {
        return new Wd(this, sSLSocket);
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return a((SSLSocket) this.a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    private Ud(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return a((SSLSocket) this.a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return a((SSLSocket) this.a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return a((SSLSocket) this.a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return a((SSLSocket) this.a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() throws IOException {
        return a((SSLSocket) this.a.createSocket());
    }
}
