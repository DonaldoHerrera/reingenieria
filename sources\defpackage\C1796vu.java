package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: vu reason: default package and case insensitive filesystem */
public class C1796vu {
    private static final Logger a = Logger.getLogger(C1796vu.class.getName());
    private final C0269Vs b;
    private final C0261Tw c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final C1246du h;
    private final boolean i;
    private final boolean j;

    /* renamed from: vu$a */
    public static abstract class a {
        final C0473at a;
        C0261Tw b;
        C0284Ys c;
        final C1246du d;
        String e;
        String f;
        String g;

        protected a(C0473at atVar, String str, String str2, C1246du duVar, C0284Ys ys) {
            Pu.a(atVar);
            this.a = atVar;
            this.d = duVar;
            a(str);
            b(str2);
            this.c = ys;
        }

        public a a(String str) {
            this.e = C1796vu.a(str);
            return this;
        }

        public a b(String str) {
            this.f = C1796vu.b(str);
            return this;
        }

        public a c(String str) {
            this.g = str;
            return this;
        }

        public a a(C0261Tw tw) {
            this.b = tw;
            return this;
        }
    }

    protected C1796vu(a aVar) {
        C0269Vs vs;
        this.c = aVar.b;
        this.d = a(aVar.e);
        this.e = b(aVar.f);
        this.f = aVar.g;
        if (Uu.a((String) null)) {
            a.logp(Level.WARNING, "com.google.api.client.googleapis.services.AbstractGoogleClient", "<init>", "Application name is not set. Call Builder#setApplicationName.");
        }
        this.g = null;
        C0284Ys ys = aVar.c;
        if (ys == null) {
            vs = aVar.a.a((C0284Ys) null);
        } else {
            vs = aVar.a.a(ys);
        }
        this.b = vs;
        this.h = aVar.d;
        this.i = false;
        this.j = false;
    }

    public final String a() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final C0269Vs b() {
        return this.b;
    }

    public C1246du c() {
        return this.h;
    }

    static String b(String str) {
        if (str != null) {
            String str2 = "/";
            if (str.length() == 1) {
                if (str2.equals(str)) {
                    return "";
                }
                throw new IllegalArgumentException("service path must equal \"/\" if it is of length 1.");
            } else if (str.length() <= 0) {
                return str;
            } else {
                if (!str.endsWith(str2)) {
                    str = String.valueOf(str).concat(str2);
                }
                return str.startsWith(str2) ? str.substring(1) : str;
            }
        } else {
            throw new NullPointerException("service path cannot be null");
        }
    }

    /* access modifiers changed from: protected */
    public void a(C1827wv<?> wvVar) throws IOException {
        C0261Tw tw = this.c;
        if (tw != null) {
            tw.a(wvVar);
        }
    }

    static String a(String str) {
        if (str != null) {
            String str2 = "/";
            return !str.endsWith(str2) ? String.valueOf(str).concat(str2) : str;
        }
        throw new NullPointerException("root URL cannot be null.");
    }
}
