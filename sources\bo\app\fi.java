package bo.app;

import android.util.Base64;

public abstract class fi implements fb {
    private static final String a = Hg.a(fi.class);
    private long b;
    private long c;
    private bo d;

    protected fi() {
        this.c = dn.c();
        this.b = this.c / 1000;
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        if (Ng.d(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected error decoding Base64 encoded campaign Id ");
            sb.append(str);
            Hg.b(str2, sb.toString(), e);
            return null;
        }
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public bo e() {
        return this.d;
    }

    protected fi(bo boVar) {
        this();
        this.d = boVar;
    }
}
