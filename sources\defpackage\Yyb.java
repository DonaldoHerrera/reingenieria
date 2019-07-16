package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* renamed from: Yyb reason: default package */
/* compiled from: ConnectionSpecSelector */
final class Yyb {
    private final List<C6345dyb> a;
    private int b = 0;
    private boolean c;
    private boolean d;

    Yyb(List<C6345dyb> list) {
        this.a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.b; i < this.a.size(); i++) {
            if (((C6345dyb) this.a.get(i)).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public C6345dyb a(SSLSocket sSLSocket) throws IOException {
        C6345dyb dyb;
        int i = this.b;
        int size = this.a.size();
        while (true) {
            if (i >= size) {
                dyb = null;
                break;
            }
            dyb = (C6345dyb) this.a.get(i);
            if (dyb.a(sSLSocket)) {
                this.b = i + 1;
                break;
            }
            i++;
        }
        if (dyb != null) {
            this.c = b(sSLSocket);
            Iyb.a.a(dyb, sSLSocket, this.d);
            return dyb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.d);
        sb.append(", modes=");
        sb.append(this.a);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public boolean a(IOException iOException) {
        this.d = true;
        if (!this.c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return iOException instanceof SSLException;
        }
        return false;
    }
}
