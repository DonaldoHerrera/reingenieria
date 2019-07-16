package defpackage;

import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: rzb reason: default package and case insensitive filesystem */
/* compiled from: RetryAndFollowUpInterceptor */
public final class C7304rzb implements C7164pyb {
    private final C7440tyb a;

    public C7304rzb(C7440tyb tyb) {
        this.a = tyb;
    }

    private boolean a(IOException iOException, C6551gzb gzb, boolean z, C7647wyb wyb) {
        if (!this.a.L()) {
            return false;
        }
        if ((!z || !a(iOException, wyb)) && a(iOException, z) && gzb.b()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        r1.d();
     */
    public Ayb intercept(a aVar) throws IOException {
        C7647wyb x = aVar.x();
        C7097ozb ozb = (C7097ozb) aVar;
        C6551gzb f = ozb.f();
        Ayb ayb = null;
        int i = 0;
        while (true) {
            f.a(x);
            if (!f.f()) {
                try {
                    Ayb a2 = ozb.a(x, f, null);
                    if (ayb != null) {
                        a G = a2.G();
                        a G2 = ayb.G();
                        G2.a((Cyb) null);
                        G.c(G2.a());
                        a2 = G.a();
                    }
                    ayb = a2;
                    Zyb a3 = Iyb.a.a(ayb);
                    C7647wyb a4 = a(ayb, a3 != null ? a3.b().e() : null);
                    if (a4 == null) {
                        if (a3 != null && a3.f()) {
                            f.h();
                        }
                        return ayb;
                    }
                    C7854zyb a5 = a4.a();
                    if (a5 != null && a5.d()) {
                        return ayb;
                    }
                    Kyb.a((Closeable) ayb.a());
                    if (f.e()) {
                        a3.c();
                    }
                    i++;
                    if (i <= 20) {
                        x = a4;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many follow-up requests: ");
                        sb.append(i);
                        throw new ProtocolException(sb.toString());
                    }
                } catch (C6347dzb e) {
                    if (!a(e.b(), f, false, x)) {
                        throw e.a();
                    }
                } catch (IOException e2) {
                    if (!a(e2, f, !(e2 instanceof C7580vzb), x)) {
                        throw e2;
                    }
                } catch (Throwable th) {
                    f.d();
                    throw th;
                }
            } else {
                throw new IOException("Canceled");
            }
        }
    }

    private boolean a(IOException iOException, C7647wyb wyb) {
        C7854zyb a2 = wyb.a();
        return (a2 != null && a2.d()) || (iOException instanceof FileNotFoundException);
    }

    private boolean a(IOException iOException, boolean z) {
        boolean z2 = false;
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if ((iOException instanceof SocketTimeoutException) && !z) {
                z2 = true;
            }
            return z2;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private C7647wyb a(Ayb ayb, Dyb dyb) throws IOException {
        Proxy proxy;
        if (ayb != null) {
            int d = ayb.d();
            String e = ayb.K().e();
            String str = "GET";
            C7854zyb zyb = null;
            if (d == 307 || d == 308) {
                if (!e.equals(str) && !e.equals("HEAD")) {
                    return null;
                }
            } else if (d == 401) {
                return this.a.i().a(dyb, ayb);
            } else {
                if (d != 503) {
                    if (d == 407) {
                        if (dyb != null) {
                            proxy = dyb.b();
                        } else {
                            proxy = this.a.H();
                        }
                        if (proxy.type() == Type.HTTP) {
                            return this.a.I().a(dyb, ayb);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (d != 408) {
                        switch (d) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.a.L()) {
                        return null;
                    } else {
                        C7854zyb a2 = ayb.K().a();
                        if (a2 != null && a2.d()) {
                            return null;
                        }
                        if ((ayb.H() == null || ayb.H().d() != 408) && a(ayb, 0) <= 0) {
                            return ayb.K();
                        }
                        return null;
                    }
                } else if ((ayb.H() == null || ayb.H().d() != 503) && a(ayb, (int) BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                    return ayb.K();
                } else {
                    return null;
                }
            }
            if (!this.a.t()) {
                return null;
            }
            String a3 = ayb.a("Location");
            if (a3 == null) {
                return null;
            }
            C7095oyb f = ayb.K().g().f(a3);
            if (f == null) {
                return null;
            }
            if (!f.m().equals(ayb.K().g().m()) && !this.a.z()) {
                return null;
            }
            a f2 = ayb.K().f();
            if (C7028nzb.b(e)) {
                boolean d2 = C7028nzb.d(e);
                if (C7028nzb.c(e)) {
                    f2.a(str, (C7854zyb) null);
                } else {
                    if (d2) {
                        zyb = ayb.K().a();
                    }
                    f2.a(e, zyb);
                }
                if (!d2) {
                    f2.a("Transfer-Encoding");
                    f2.a(HttpHeaders.CONTENT_LENGTH);
                    f2.a(HttpHeaders.CONTENT_TYPE);
                }
            }
            if (!Kyb.a(ayb.K().g(), f)) {
                f2.a("Authorization");
            }
            f2.a(f);
            return f2.a();
        }
        throw new IllegalStateException();
    }

    private int a(Ayb ayb, int i) {
        String a2 = ayb.a("Retry-After");
        if (a2 == null) {
            return i;
        }
        return a2.matches("\\d+") ? Integer.valueOf(a2).intValue() : BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
