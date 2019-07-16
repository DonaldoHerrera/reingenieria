package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.concurrent.TimeUnit;

/* renamed from: Xxb reason: default package */
/* compiled from: CacheControl */
public final class Xxb {
    public static final Xxb a;
    public static final Xxb b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    String o;

    /* renamed from: Xxb$a */
    /* compiled from: CacheControl */
    public static final class a {
        boolean a;
        boolean b;
        int c = -1;
        int d = -1;
        int e = -1;
        boolean f;
        boolean g;
        boolean h;

        public a a(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.d = seconds > 2147483647L ? BaseClientBuilder.API_PRIORITY_OTHER : (int) seconds;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public a b() {
            this.a = true;
            return this;
        }

        public a c() {
            this.b = true;
            return this;
        }

        public a d() {
            this.f = true;
            return this;
        }

        public Xxb a() {
            return new Xxb(this);
        }
    }

    static {
        a aVar = new a();
        aVar.b();
        a = aVar.a();
        a aVar2 = new a();
        aVar2.d();
        aVar2.a(BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS);
        b = aVar2.a();
    }

    private Xxb(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = i3;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = i4;
        this.k = i5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = str;
    }

    private String j() {
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("no-cache, ");
        }
        if (this.d) {
            sb.append("no-store, ");
        }
        String str = ", ";
        if (this.e != -1) {
            sb.append("max-age=");
            sb.append(this.e);
            sb.append(str);
        }
        if (this.f != -1) {
            sb.append("s-maxage=");
            sb.append(this.f);
            sb.append(str);
        }
        if (this.g) {
            sb.append("private, ");
        }
        if (this.h) {
            sb.append("public, ");
        }
        if (this.i) {
            sb.append("must-revalidate, ");
        }
        if (this.j != -1) {
            sb.append("max-stale=");
            sb.append(this.j);
            sb.append(str);
        }
        if (this.k != -1) {
            sb.append("min-fresh=");
            sb.append(this.k);
            sb.append(str);
        }
        if (this.l) {
            sb.append("only-if-cached, ");
        }
        if (this.m) {
            sb.append("no-transform, ");
        }
        if (this.n) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public boolean a() {
        return this.g;
    }

    public boolean b() {
        return this.h;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public boolean f() {
        return this.i;
    }

    public boolean g() {
        return this.c;
    }

    public boolean h() {
        return this.d;
    }

    public boolean i() {
        return this.l;
    }

    public String toString() {
        String str = this.o;
        if (str != null) {
            return str;
        }
        String j2 = j();
        this.o = j2;
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    public static Xxb a(C7026nyb nyb) {
        int i2;
        int i3;
        String str;
        C7026nyb nyb2 = nyb;
        int c2 = nyb.c();
        int i4 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = -1;
        int i6 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i7 = -1;
        int i8 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i4 < c2) {
            String a2 = nyb2.a(i4);
            String b2 = nyb2.b(i4);
            if (a2.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = b2;
                    for (i2 = 0; i2 < b2.length(); i2 = i3) {
                        int a3 = C6959mzb.a(b2, i2, "=,;");
                        String trim = b2.substring(i2, a3).trim();
                        if (a3 == b2.length() || b2.charAt(a3) == ',' || b2.charAt(a3) == ';') {
                            i3 = a3 + 1;
                            str = null;
                        } else {
                            int b3 = C6959mzb.b(b2, a3 + 1);
                            if (b3 >= b2.length() || b2.charAt(b3) != '\"') {
                                i3 = C6959mzb.a(b2, b3, ",;");
                                str = b2.substring(b3, i3).trim();
                            } else {
                                int i9 = b3 + 1;
                                int a4 = C6959mzb.a(b2, i9, "\"");
                                str = b2.substring(i9, a4);
                                i3 = a4 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(trim)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            z3 = true;
                        } else if ("max-age".equalsIgnoreCase(trim)) {
                            i5 = C6959mzb.a(str, -1);
                        } else if ("s-maxage".equalsIgnoreCase(trim)) {
                            i6 = C6959mzb.a(str, -1);
                        } else if ("private".equalsIgnoreCase(trim)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(trim)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(trim)) {
                            i7 = C6959mzb.a(str, (int) BaseClientBuilder.API_PRIORITY_OTHER);
                        } else if ("min-fresh".equalsIgnoreCase(trim)) {
                            i8 = C6959mzb.a(str, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(trim)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(trim)) {
                            z9 = true;
                        }
                        C7026nyb nyb3 = nyb;
                    }
                    i4++;
                    nyb2 = nyb;
                }
            } else if (!a2.equalsIgnoreCase("Pragma")) {
                i4++;
                nyb2 = nyb;
            }
            z = false;
            while (i2 < b2.length()) {
            }
            i4++;
            nyb2 = nyb;
        }
        Xxb xxb = new Xxb(z2, z3, i5, i6, z4, z5, z6, i7, i8, z7, z8, z9, !z ? null : str2);
        return xxb;
    }

    Xxb(a aVar) {
        this.c = aVar.a;
        this.d = aVar.b;
        this.e = aVar.c;
        this.f = -1;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = aVar.d;
        this.k = aVar.e;
        this.l = aVar.f;
        this.m = aVar.g;
        this.n = aVar.h;
    }
}
