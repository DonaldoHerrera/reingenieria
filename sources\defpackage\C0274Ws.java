package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: Ws reason: default package and case insensitive filesystem */
public final class C0274Ws {
    private C1860xy a;
    private C1830wy b = new C1830wy();
    private C1830wy c = new C1830wy();
    private int d = 10;
    private int e = 16384;
    private boolean f = true;
    private boolean g = true;
    private C1710sy h;
    private final C0473at i;
    private String j;
    private C1740ty k;
    private int l = 20000;
    private int m = 20000;
    private C0504bt n;
    private C1246du o;
    private C1800vy p;
    private boolean q = true;
    private boolean r = true;
    @Deprecated
    private boolean s = false;
    private C1308fu t = C1308fu.a;

    C0274Ws(C0473at atVar, String str) {
        this.i = atVar;
        a((String) null);
    }

    public final String a() {
        return this.j;
    }

    public final C0274Ws b(int i2) {
        if (i2 >= 0) {
            this.m = i2;
            return this;
        }
        throw new IllegalArgumentException();
    }

    public final boolean c() {
        return this.r;
    }

    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r15v0, types: [hu] */
    /* JADX WARNING: type inference failed for: r12v4, types: [hu] */
    /* JADX WARNING: type inference failed for: r2v14, types: [uy, hu] */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r15v3, types: [bu] */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0281 A[Catch:{ all -> 0x02ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02a9 A[LOOP:0: B:6:0x0019->B:124:0x02a9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x028b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0222 A[Catch:{ all -> 0x02ac }] */
    /* JADX WARNING: Unknown variable types count: 5 */
    public final C0279Xs d() throws IOException {
        StringBuilder sb;
        StringBuilder sb2;
        String m2;
        C1710sy syVar;
        int i2;
        String str;
        ? r12;
        C1215ct e2;
        C0279Xs xs;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        ? r122;
        String str3;
        long j2;
        C0274Ws ws = this;
        if (ws.d >= 0) {
            int i3 = ws.d;
            Pu.a(ws.j);
            Pu.a(ws.k);
            int i4 = i3;
            C0279Xs xs2 = null;
            while (true) {
                if (xs2 != null) {
                    xs2.f();
                }
                C1860xy xyVar = ws.a;
                if (xyVar != null) {
                    xyVar.a(ws);
                }
                String k2 = ws.k.k();
                C1245dt a2 = ws.i.a(ws.j, k2);
                Logger logger = C0473at.a;
                boolean z4 = ws.f && logger.isLoggable(Level.CONFIG);
                String str4 = "GET";
                if (z4) {
                    sb2 = new StringBuilder();
                    sb2.append("-------------- REQUEST  --------------");
                    sb2.append(C1339gu.a);
                    sb2.append(ws.j);
                    sb2.append(' ');
                    sb2.append(k2);
                    sb2.append(C1339gu.a);
                    if (ws.g) {
                        sb = new StringBuilder("curl -v --compressed");
                        if (!ws.j.equals(str4)) {
                            sb.append(" -X ");
                            sb.append(ws.j);
                        }
                        m2 = ws.b.m();
                        if (m2 != null) {
                            ws.b.g("Google-HTTP-Java-Client/1.26.0-SNAPSHOT (gzip)");
                        } else {
                            C1830wy wyVar = ws.b;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(m2).length() + 47);
                            sb3.append(m2);
                            sb3.append(" Google-HTTP-Java-Client/1.26.0-SNAPSHOT (gzip)");
                            wyVar.g(sb3.toString());
                        }
                        C1830wy.a(ws.b, sb2, sb, logger, a2);
                        ws.b.g(m2);
                        syVar = ws.h;
                        if (syVar != 0) {
                            syVar.a();
                        }
                        String str5 = "'";
                        if (syVar == 0) {
                            String type = ws.h.getType();
                            ? buVar = z4 ? new C0505bu(syVar, C0473at.a, Level.CONFIG, ws.e) : syVar;
                            C1800vy vyVar = ws.p;
                            if (vyVar == null) {
                                j2 = ws.h.getLength();
                                syVar = buVar;
                                str3 = null;
                            } else {
                                str3 = vyVar.getName();
                                ? uyVar = new C1770uy(buVar, ws.p);
                                syVar = uyVar;
                                j2 = Wt.a(uyVar);
                            }
                            if (z4) {
                                String str6 = " -H '";
                                if (type != null) {
                                    str = str4;
                                    String str7 = "Content-Type: ";
                                    String valueOf = String.valueOf(type);
                                    String concat = valueOf.length() != 0 ? str7.concat(valueOf) : new String(str7);
                                    sb2.append(concat);
                                    sb2.append(C1339gu.a);
                                    if (sb != null) {
                                        i2 = i4;
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(concat).length() + 6);
                                        sb4.append(str6);
                                        sb4.append(concat);
                                        sb4.append(str5);
                                        sb.append(sb4.toString());
                                    } else {
                                        i2 = i4;
                                    }
                                } else {
                                    i2 = i4;
                                    str = str4;
                                }
                                if (str3 != null) {
                                    String str8 = "Content-Encoding: ";
                                    String valueOf2 = String.valueOf(str3);
                                    String concat2 = valueOf2.length() != 0 ? str8.concat(valueOf2) : new String(str8);
                                    sb2.append(concat2);
                                    sb2.append(C1339gu.a);
                                    if (sb != null) {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(concat2).length() + 6);
                                        sb5.append(str6);
                                        sb5.append(concat2);
                                        sb5.append(str5);
                                        sb.append(sb5.toString());
                                    }
                                }
                                if (j2 >= 0) {
                                    StringBuilder sb6 = new StringBuilder(36);
                                    sb6.append("Content-Length: ");
                                    sb6.append(j2);
                                    sb2.append(sb6.toString());
                                    sb2.append(C1339gu.a);
                                }
                            } else {
                                i2 = i4;
                                str = str4;
                            }
                            if (sb != null) {
                                sb.append(" -d '@-'");
                            }
                            a2.b(type);
                            a2.a(str3);
                            a2.a(j2);
                            a2.a((C1370hu) r122);
                            r12 = r122;
                        } else {
                            i2 = i4;
                            str = str4;
                            r12 = syVar;
                        }
                        if (z4) {
                            String str9 = "execute";
                            String str10 = "com.google.api.client.http.HttpRequest";
                            logger.logp(Level.CONFIG, str10, str9, sb2.toString());
                            if (sb != null) {
                                sb.append(" -- '");
                                sb.append(k2.replaceAll(str5, "'\"'\"'"));
                                sb.append(str5);
                                if (r12 != 0) {
                                    sb.append(" << $$$");
                                }
                                logger.logp(Level.CONFIG, str10, str9, sb.toString());
                            }
                        }
                        boolean z5 = i2 <= 0;
                        ws = this;
                        a2.a(ws.l, ws.m);
                        e2 = a2.e();
                        xs = new C0279Xs(ws, e2);
                        if (xs.g()) {
                            int d2 = xs.d();
                            String l2 = xs.i().l();
                            if (ws.q) {
                                if (d2 != 307) {
                                    switch (d2) {
                                        case 301:
                                        case 302:
                                        case 303:
                                            break;
                                        default:
                                            z3 = false;
                                            break;
                                    }
                                }
                                z3 = true;
                                if (z3 && l2 != null) {
                                    ws.a(new C1740ty(ws.k.a(l2)));
                                    if (d2 == 303) {
                                        ws.a(str);
                                        str2 = null;
                                        ws.h = null;
                                    } else {
                                        str2 = null;
                                    }
                                    ws.b.a(str2);
                                    ws.b.c(str2);
                                    ws.b.d(str2);
                                    ws.b.b(str2);
                                    ws.b.e(str2);
                                    ws.b.f(str2);
                                    z2 = true;
                                    z = z5 & z2;
                                    if (z) {
                                        xs.f();
                                    }
                                }
                            }
                            z2 = false;
                            z = z5 & z2;
                            if (z) {
                            }
                        } else {
                            z = false;
                        }
                        i4 = i2 - 1;
                        if (z) {
                            C0504bt btVar = ws.n;
                            if (btVar != null) {
                                btVar.a(xs);
                            }
                            if (!ws.r || xs.g()) {
                                return xs;
                            }
                            try {
                                throw new C0292_s(xs);
                            } catch (Throwable th) {
                                xs.a();
                                throw th;
                            }
                        } else {
                            xs2 = xs;
                        }
                    }
                } else {
                    sb2 = null;
                }
                sb = null;
                m2 = ws.b.m();
                if (m2 != null) {
                }
                C1830wy.a(ws.b, sb2, sb, logger, a2);
                ws.b.g(m2);
                syVar = ws.h;
                if (syVar != 0) {
                }
                String str52 = "'";
                if (syVar == 0) {
                }
                if (z4) {
                }
                if (i2 <= 0) {
                }
                ws = this;
                a2.a(ws.l, ws.m);
                try {
                    e2 = a2.e();
                    xs = new C0279Xs(ws, e2);
                    try {
                        if (xs.g()) {
                        }
                        i4 = i2 - 1;
                        if (z) {
                        }
                    } catch (Throwable th2) {
                        xs.a();
                        throw th2;
                    }
                } catch (IOException e3) {
                    throw e3;
                } catch (Throwable th3) {
                    InputStream b2 = e2.b();
                    if (b2 != null) {
                        b2.close();
                    }
                    throw th3;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final C0473at e() {
        return this.i;
    }

    public final C1740ty f() {
        return this.k;
    }

    public final C1710sy g() {
        return this.h;
    }

    public final int h() {
        return this.e;
    }

    public final boolean i() {
        return this.f;
    }

    public final C1830wy j() {
        return this.b;
    }

    public final C1830wy k() {
        return this.c;
    }

    public final C0504bt l() {
        return this.n;
    }

    public final C0274Ws a(String str) {
        if (str == null || C1890yy.a(str)) {
            this.j = str;
            return this;
        }
        throw new IllegalArgumentException();
    }

    public final C1246du b() {
        return this.o;
    }

    public final C0274Ws a(C1740ty tyVar) {
        Pu.a(tyVar);
        this.k = tyVar;
        return this;
    }

    public final C0274Ws a(C1710sy syVar) {
        this.h = syVar;
        return this;
    }

    public final C0274Ws a(C1800vy vyVar) {
        this.p = vyVar;
        return this;
    }

    public final C0274Ws a(int i2) {
        if (i2 >= 0) {
            this.l = i2;
            return this;
        }
        throw new IllegalArgumentException();
    }

    public final C0274Ws a(C1860xy xyVar) {
        this.a = xyVar;
        return this;
    }

    public final C0274Ws a(C0504bt btVar) {
        this.n = btVar;
        return this;
    }

    public final C0274Ws a(C1246du duVar) {
        this.o = duVar;
        return this;
    }
}
