package defpackage;

/* renamed from: ljb reason: default package and case insensitive filesystem */
/* compiled from: signatureEnhancement.kt */
public final class C6864ljb {
    private final C6796kjb a;
    private final boolean b;

    public C6864ljb(C6796kjb kjb, boolean z) {
        C7471uYa.b(kjb, "qualifier");
        this.a = kjb;
        this.b = z;
    }

    public static /* synthetic */ C6864ljb a(C6864ljb ljb, C6796kjb kjb, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            kjb = ljb.a;
        }
        if ((i & 2) != 0) {
            z = ljb.b;
        }
        return ljb.a(kjb, z);
    }

    public final C6796kjb a() {
        return this.a;
    }

    public final C6864ljb a(C6796kjb kjb, boolean z) {
        C7471uYa.b(kjb, "qualifier");
        return new C6864ljb(kjb, z);
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6864ljb) {
                C6864ljb ljb = (C6864ljb) obj;
                if (C7471uYa.a((Object) this.a, (Object) ljb.a)) {
                    if (this.b == ljb.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C6796kjb kjb = this.a;
        int hashCode = (kjb != null ? kjb.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6864ljb(C6796kjb kjb, boolean z, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(kjb, z);
    }
}
