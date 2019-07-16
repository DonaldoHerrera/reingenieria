package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* renamed from: _yb reason: default package */
/* compiled from: ExchangeFinder */
final class _yb {
    private final C6551gzb a;
    private final Qxb b;
    private final C5683bzb c;
    private final Yxb d;
    private final C6889lyb e;
    private a f;
    private final C6415ezb g;
    private C5615azb h;
    private boolean i;
    private Dyb j;

    _yb(C6551gzb gzb, C5683bzb bzb, Qxb qxb, Yxb yxb, C6889lyb lyb) {
        this.a = gzb;
        this.c = bzb;
        this.b = qxb;
        this.d = yxb;
        this.e = lyb;
        this.g = new C6415ezb(qxb, bzb.f, yxb, lyb);
    }

    private boolean e() {
        C5615azb azb = this.a.i;
        return azb != null && azb.l == 0 && Kyb.a(azb.e().a().k(), this.b.k());
    }

    public C6755jzb a(C7440tyb tyb, a aVar, boolean z) {
        try {
            return a(aVar.d(), aVar.b(), aVar.c(), tyb.F(), tyb.L(), z).a(tyb, aVar);
        } catch (C6347dzb e2) {
            d();
            throw e2;
        } catch (IOException e3) {
            d();
            throw new C6347dzb(e3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return r2;
     */
    public boolean b() {
        synchronized (this.c) {
            boolean z = true;
            if (this.j != null) {
                return true;
            }
            if (e()) {
                this.j = this.a.i.e();
                return true;
            } else if (this.f == null || !this.f.b()) {
                if (!this.g.a()) {
                    z = false;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.i;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        synchronized (this.c) {
            this.i = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.a(r9) != false) goto L_0x0018;
     */
    private C5615azb a(int i2, int i3, int i4, int i5, boolean z, boolean z2) throws IOException {
        while (true) {
            C5615azb a2 = a(i2, i3, i4, i5, z);
            synchronized (this.c) {
                if (a2.m == 0) {
                    return a2;
                }
            }
            a2.d();
        }
        while (true) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e1  */
    private C5615azb a(int i2, int i3, int i4, int i5, boolean z) throws IOException {
        Socket socket;
        Socket g2;
        C5615azb azb;
        C5615azb azb2;
        Dyb dyb;
        C5615azb azb3;
        boolean z2;
        boolean z3;
        List list;
        Dyb e2;
        synchronized (this.c) {
            if (!this.a.f()) {
                this.i = false;
                C5615azb azb4 = this.a.i;
                socket = null;
                g2 = (this.a.i == null || !this.a.i.k) ? null : this.a.g();
                if (this.a.i != null) {
                    azb2 = this.a.i;
                    azb = null;
                } else {
                    azb = azb4;
                    azb2 = null;
                }
                if (azb2 == null) {
                    if (this.c.a(this.b, this.a, null, false)) {
                        azb3 = this.a.i;
                        dyb = null;
                        z2 = true;
                    } else {
                        if (this.j != null) {
                            e2 = this.j;
                            this.j = null;
                        } else if (e()) {
                            e2 = this.a.i.e();
                        }
                        dyb = e2;
                        azb3 = azb2;
                        z2 = false;
                    }
                }
                azb3 = azb2;
                dyb = null;
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        Kyb.a(g2);
        if (azb != null) {
            this.e.b(this.d, (C5681byb) azb);
        }
        if (z2) {
            this.e.a(this.d, (C5681byb) azb3);
        }
        if (azb3 != null) {
            return azb3;
        }
        if (dyb == null) {
            a aVar = this.f;
            if (aVar == null || !aVar.b()) {
                this.f = this.g.b();
                z3 = true;
                synchronized (this.c) {
                    if (!this.a.f()) {
                        if (z3) {
                            list = this.f.a();
                            if (this.c.a(this.b, this.a, list, false)) {
                                azb3 = this.a.i;
                                z2 = true;
                            }
                        } else {
                            list = null;
                        }
                        if (!z2) {
                            if (dyb == null) {
                                dyb = this.f.c();
                            }
                            azb3 = new C5615azb(this.c, dyb);
                            this.h = azb3;
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                }
                if (!z2) {
                    this.e.a(this.d, (C5681byb) azb3);
                    return azb3;
                }
                azb3.a(i2, i3, i4, i5, z, this.d, this.e);
                this.c.f.a(azb3.e());
                synchronized (this.c) {
                    this.h = null;
                    if (this.c.a(this.b, this.a, list, true)) {
                        azb3.k = true;
                        socket = azb3.f();
                        azb3 = this.a.i;
                    } else {
                        this.c.b(azb3);
                        this.a.a(azb3);
                    }
                }
                Kyb.a(socket);
                this.e.a(this.d, (C5681byb) azb3);
                return azb3;
            }
        }
        z3 = false;
        synchronized (this.c) {
        }
        if (!z2) {
        }
    }

    /* access modifiers changed from: 0000 */
    public C5615azb a() {
        return this.h;
    }
}
