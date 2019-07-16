package defpackage;

import java.io.Closeable;

/* renamed from: Ayb reason: default package */
/* compiled from: Response */
public final class Ayb implements Closeable {
    final C7647wyb a;
    final C7509uyb b;
    final int c;
    final String d;
    final C6957myb e;
    final C7026nyb f;
    final Cyb g;
    final Ayb h;
    final Ayb i;
    final Ayb j;
    final long k;
    final long l;
    final Zyb m;
    private volatile Xxb n;

    /* renamed from: Ayb$a */
    /* compiled from: Response */
    public static class a {
        C7647wyb a;
        C7509uyb b;
        int c;
        String d;
        C6957myb e;
        defpackage.C7026nyb.a f;
        Cyb g;
        Ayb h;
        Ayb i;
        Ayb j;
        long k;
        long l;
        Zyb m;

        public a() {
            this.c = -1;
            this.f = new defpackage.C7026nyb.a();
        }

        private void d(Ayb ayb) {
            if (ayb.g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(C7647wyb wyb) {
            this.a = wyb;
            return this;
        }

        public a b(String str, String str2) {
            this.f.d(str, str2);
            return this;
        }

        public a c(Ayb ayb) {
            if (ayb != null) {
                d(ayb);
            }
            this.j = ayb;
            return this;
        }

        public a a(C7509uyb uyb) {
            this.b = uyb;
            return this;
        }

        public a b(Ayb ayb) {
            if (ayb != null) {
                a("networkResponse", ayb);
            }
            this.h = ayb;
            return this;
        }

        public a a(int i2) {
            this.c = i2;
            return this;
        }

        a(Ayb ayb) {
            this.c = -1;
            this.a = ayb.a;
            this.b = ayb.b;
            this.c = ayb.c;
            this.d = ayb.d;
            this.e = ayb.e;
            this.f = ayb.f.b();
            this.g = ayb.g;
            this.h = ayb.h;
            this.i = ayb.i;
            this.j = ayb.j;
            this.k = ayb.k;
            this.l = ayb.l;
            this.m = ayb.m;
        }

        public a a(String str) {
            this.d = str;
            return this;
        }

        public a b(long j2) {
            this.k = j2;
            return this;
        }

        public a a(C6957myb myb) {
            this.e = myb;
            return this;
        }

        public a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public a a(C7026nyb nyb) {
            this.f = nyb.b();
            return this;
        }

        public a a(Cyb cyb) {
            this.g = cyb;
            return this;
        }

        public a a(Ayb ayb) {
            if (ayb != null) {
                a("cacheResponse", ayb);
            }
            this.i = ayb;
            return this;
        }

        private void a(String str, Ayb ayb) {
            if (ayb.g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (ayb.h != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (ayb.i != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (ayb.j != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        public a a(long j2) {
            this.l = j2;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public void a(Zyb zyb) {
            this.m = zyb;
        }

        public Ayb a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.c < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("code < 0: ");
                sb.append(this.c);
                throw new IllegalStateException(sb.toString());
            } else if (this.d != null) {
                return new Ayb(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    Ayb(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f.a();
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
    }

    public Ayb F() {
        return this.h;
    }

    public a G() {
        return new a(this);
    }

    public Ayb H() {
        return this.j;
    }

    public C7509uyb I() {
        return this.b;
    }

    public long J() {
        return this.l;
    }

    public C7647wyb K() {
        return this.a;
    }

    public long L() {
        return this.k;
    }

    public String a(String str) {
        return a(str, null);
    }

    public Xxb b() {
        Xxb xxb = this.n;
        if (xxb != null) {
            return xxb;
        }
        Xxb a2 = Xxb.a(this.f);
        this.n = a2;
        return a2;
    }

    public Ayb c() {
        return this.i;
    }

    public void close() {
        Cyb cyb = this.g;
        if (cyb != null) {
            cyb.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public int d() {
        return this.c;
    }

    public C6957myb e() {
        return this.e;
    }

    public C7026nyb f() {
        return this.f;
    }

    public boolean g() {
        int i2 = this.c;
        if (!(i2 == 307 || i2 == 308)) {
            switch (i2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public boolean h() {
        int i2 = this.c;
        return i2 >= 200 && i2 < 300;
    }

    public String i() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Response{protocol=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.a.g());
        sb.append('}');
        return sb.toString();
    }

    public String a(String str, String str2) {
        String b2 = this.f.b(str);
        return b2 != null ? b2 : str2;
    }

    public Cyb a() {
        return this.g;
    }
}
