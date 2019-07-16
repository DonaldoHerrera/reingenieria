package defpackage;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: wyb reason: default package and case insensitive filesystem */
/* compiled from: Request */
public final class C7647wyb {
    final C7095oyb a;
    final String b;
    final C7026nyb c;
    final C7854zyb d;
    final Map<Class<?>, Object> e;
    private volatile Xxb f;

    /* renamed from: wyb$a */
    /* compiled from: Request */
    public static class a {
        C7095oyb a;
        String b;
        defpackage.C7026nyb.a c;
        C7854zyb d;
        Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.b = "GET";
            this.c = new defpackage.C7026nyb.a();
        }

        public a a(C7095oyb oyb) {
            if (oyb != null) {
                this.a = oyb;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a b(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("http:");
                    sb.append(str.substring(3));
                    str = sb.toString();
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("https:");
                        sb2.append(str.substring(4));
                        str = sb2.toString();
                    }
                }
                a(C7095oyb.b(str));
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a c() {
            a("GET", (C7854zyb) null);
            return this;
        }

        public a c(C7854zyb zyb) {
            a("PUT", zyb);
            return this;
        }

        public a a(URL url) {
            if (url != null) {
                a(C7095oyb.b(url.toString()));
                return this;
            }
            throw new NullPointerException("url == null");
        }

        a(C7647wyb wyb) {
            Map<Class<?>, Object> map;
            this.e = Collections.emptyMap();
            this.a = wyb.a;
            this.b = wyb.b;
            this.d = wyb.d;
            if (wyb.e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(wyb.e);
            }
            this.e = map;
            this.c = wyb.c.b();
        }

        public a a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.c.c(str);
            return this;
        }

        public a a(C7026nyb nyb) {
            this.c = nyb.b();
            return this;
        }

        public a b(String str, String str2) {
            this.c.d(str, str2);
            return this;
        }

        public a a(Xxb xxb) {
            String xxb2 = xxb.toString();
            String str = "Cache-Control";
            if (xxb2.isEmpty()) {
                a(str);
                return this;
            }
            b(str, xxb2);
            return this;
        }

        public a b(C7854zyb zyb) {
            a("POST", zyb);
            return this;
        }

        public a b() {
            a(Kyb.e);
            return this;
        }

        public a a(C7854zyb zyb) {
            a("DELETE", zyb);
            return this;
        }

        public a a(String str, C7854zyb zyb) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() != 0) {
                String str2 = "method ";
                if (zyb != null && !C7028nzb.b(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    sb.append(" must not have a request body.");
                    throw new IllegalArgumentException(sb.toString());
                } else if (zyb != null || !C7028nzb.e(str)) {
                    this.b = str;
                    this.d = zyb;
                    return this;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str);
                    sb2.append(" must have a request body.");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                throw new IllegalArgumentException("method.length() == 0");
            }
        }

        public C7647wyb a() {
            if (this.a != null) {
                return new C7647wyb(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    C7647wyb(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = Kyb.a(aVar.e);
    }

    public String a(String str) {
        return this.c.b(str);
    }

    public List<String> b(String str) {
        return this.c.c(str);
    }

    public C7026nyb c() {
        return this.c;
    }

    public boolean d() {
        return this.a.h();
    }

    public String e() {
        return this.b;
    }

    public a f() {
        return new a(this);
    }

    public C7095oyb g() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        sb.append(", tags=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }

    public C7854zyb a() {
        return this.d;
    }

    public Xxb b() {
        Xxb xxb = this.f;
        if (xxb != null) {
            return xxb;
        }
        Xxb a2 = Xxb.a(this.c);
        this.f = a2;
        return a2;
    }
}
