package defpackage;

/* renamed from: mib reason: default package and case insensitive filesystem */
/* compiled from: JavaTypeResolver.kt */
public final class C6931mib {
    private final Lgb a;
    private final C6999nib b;
    private final boolean c;
    private final C4905Fdb d;

    public C6931mib(Lgb lgb, C6999nib nib, boolean z, C4905Fdb fdb) {
        C7471uYa.b(lgb, "howThisTypeIsUsed");
        C7471uYa.b(nib, "flexibility");
        this.a = lgb;
        this.b = nib;
        this.c = z;
        this.d = fdb;
    }

    public static /* synthetic */ C6931mib a(C6931mib mib, Lgb lgb, C6999nib nib, boolean z, C4905Fdb fdb, int i, Object obj) {
        if ((i & 1) != 0) {
            lgb = mib.a;
        }
        if ((i & 2) != 0) {
            nib = mib.b;
        }
        if ((i & 4) != 0) {
            z = mib.c;
        }
        if ((i & 8) != 0) {
            fdb = mib.d;
        }
        return mib.a(lgb, nib, z, fdb);
    }

    public final C6931mib a(Lgb lgb, C6999nib nib, boolean z, C4905Fdb fdb) {
        C7471uYa.b(lgb, "howThisTypeIsUsed");
        C7471uYa.b(nib, "flexibility");
        return new C6931mib(lgb, nib, z, fdb);
    }

    public final C6999nib a() {
        return this.b;
    }

    public final Lgb b() {
        return this.a;
    }

    public final C4905Fdb c() {
        return this.d;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6931mib) {
                C6931mib mib = (C6931mib) obj;
                if (C7471uYa.a((Object) this.a, (Object) mib.a) && C7471uYa.a((Object) this.b, (Object) mib.b)) {
                    if (!(this.c == mib.c) || !C7471uYa.a((Object) this.d, (Object) mib.d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Lgb lgb = this.a;
        int i = 0;
        int hashCode = (lgb != null ? lgb.hashCode() : 0) * 31;
        C6999nib nib = this.b;
        int hashCode2 = (hashCode + (nib != null ? nib.hashCode() : 0)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        C4905Fdb fdb = this.d;
        if (fdb != null) {
            i = fdb.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JavaTypeAttributes(howThisTypeIsUsed=");
        sb.append(this.a);
        sb.append(", flexibility=");
        sb.append(this.b);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.c);
        sb.append(", upperBoundOfTypeParameter=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6931mib(Lgb lgb, C6999nib nib, boolean z, C4905Fdb fdb, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            nib = C6999nib.INFLEXIBLE;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            fdb = null;
        }
        this(lgb, nib, z, fdb);
    }

    public final C6931mib a(C6999nib nib) {
        C7471uYa.b(nib, "flexibility");
        return a(this, null, nib, false, null, 13, null);
    }
}
