package defpackage;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: Pyb reason: default package */
/* compiled from: CacheStrategy */
public final class Pyb {
    public final C7647wyb a;
    public final Ayb b;

    /* renamed from: Pyb$a */
    /* compiled from: CacheStrategy */
    public static class a {
        final long a;
        final C7647wyb b;
        final Ayb c;
        private Date d;
        private String e;
        private Date f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l = -1;

        public a(long j2, C7647wyb wyb, Ayb ayb) {
            this.a = j2;
            this.b = wyb;
            this.c = ayb;
            if (ayb != null) {
                this.i = ayb.L();
                this.j = ayb.J();
                C7026nyb f2 = ayb.f();
                int c2 = f2.c();
                for (int i2 = 0; i2 < c2; i2++) {
                    String a2 = f2.a(i2);
                    String b2 = f2.b(i2);
                    if ("Date".equalsIgnoreCase(a2)) {
                        this.d = C6891lzb.a(b2);
                        this.e = b2;
                    } else if ("Expires".equalsIgnoreCase(a2)) {
                        this.h = C6891lzb.a(b2);
                    } else if ("Last-Modified".equalsIgnoreCase(a2)) {
                        this.f = C6891lzb.a(b2);
                        this.g = b2;
                    } else if ("ETag".equalsIgnoreCase(a2)) {
                        this.k = b2;
                    } else if ("Age".equalsIgnoreCase(a2)) {
                        this.l = C6959mzb.a(b2, -1);
                    }
                }
            }
        }

        private long b() {
            Date date = this.d;
            long j2 = 0;
            if (date != null) {
                j2 = Math.max(0, this.j - date.getTime());
            }
            int i2 = this.l;
            if (i2 != -1) {
                j2 = Math.max(j2, TimeUnit.SECONDS.toMillis((long) i2));
            }
            long j3 = this.j;
            return j2 + (j3 - this.i) + (this.a - j3);
        }

        private long c() {
            long j2;
            long j3;
            Xxb b2 = this.c.b();
            if (b2.c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) b2.c());
            }
            long j4 = 0;
            if (this.h != null) {
                Date date = this.d;
                if (date != null) {
                    j3 = date.getTime();
                } else {
                    j3 = this.j;
                }
                long time = this.h.getTime() - j3;
                if (time > 0) {
                    j4 = time;
                }
                return j4;
            }
            if (this.f != null && this.c.K().g().k() == null) {
                Date date2 = this.d;
                if (date2 != null) {
                    j2 = date2.getTime();
                } else {
                    j2 = this.i;
                }
                long time2 = j2 - this.f.getTime();
                if (time2 > 0) {
                    j4 = time2 / 10;
                }
            }
            return j4;
        }

        private Pyb d() {
            if (this.c == null) {
                return new Pyb(this.b, null);
            }
            if (this.b.d() && this.c.e() == null) {
                return new Pyb(this.b, null);
            }
            if (!Pyb.a(this.c, this.b)) {
                return new Pyb(this.b, null);
            }
            Xxb b2 = this.b.b();
            if (b2.g() || a(this.b)) {
                return new Pyb(this.b, null);
            }
            Xxb b3 = this.c.b();
            long b4 = b();
            long c2 = c();
            if (b2.c() != -1) {
                c2 = Math.min(c2, TimeUnit.SECONDS.toMillis((long) b2.c()));
            }
            long j2 = 0;
            long millis = b2.e() != -1 ? TimeUnit.SECONDS.toMillis((long) b2.e()) : 0;
            if (!b3.f() && b2.d() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) b2.d());
            }
            if (!b3.g()) {
                long j3 = millis + b4;
                if (j3 < j2 + c2) {
                    defpackage.Ayb.a G = this.c.G();
                    String str = "Warning";
                    if (j3 >= c2) {
                        G.a(str, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (b4 > 86400000 && e()) {
                        G.a(str, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new Pyb(null, G.a());
                }
            }
            String str2 = this.k;
            String str3 = "If-Modified-Since";
            if (str2 != null) {
                str3 = "If-None-Match";
            } else if (this.f != null) {
                str2 = this.g;
            } else if (this.d == null) {
                return new Pyb(this.b, null);
            } else {
                str2 = this.e;
            }
            defpackage.C7026nyb.a b5 = this.b.c().b();
            Iyb.a.a(b5, str3, str2);
            defpackage.C7647wyb.a f2 = this.b.f();
            f2.a(b5.a());
            return new Pyb(f2.a(), this.c);
        }

        private boolean e() {
            return this.c.b().c() == -1 && this.h == null;
        }

        public Pyb a() {
            Pyb d2 = d();
            return (d2.a == null || !this.b.b().i()) ? d2 : new Pyb(null, null);
        }

        private static boolean a(C7647wyb wyb) {
            return (wyb.a("If-Modified-Since") == null && wyb.a("If-None-Match") == null) ? false : true;
        }
    }

    Pyb(C7647wyb wyb, Ayb ayb) {
        this.a = wyb;
        this.b = ayb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.b().a() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    public static boolean a(Ayb ayb, C7647wyb wyb) {
        int d = ayb.d();
        boolean z = false;
        if (!(d == 200 || d == 410 || d == 414 || d == 501 || d == 203 || d == 204)) {
            if (d != 307) {
                if (!(d == 308 || d == 404 || d == 405)) {
                    switch (d) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                    }
                }
            }
            if (ayb.a("Expires") == null) {
                if (ayb.b().c() == -1) {
                    if (!ayb.b().b()) {
                    }
                }
            }
        }
        if (!ayb.b().h() && !wyb.b().h()) {
            z = true;
        }
        return z;
    }
}
