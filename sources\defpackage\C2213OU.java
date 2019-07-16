package defpackage;

/* renamed from: OU reason: default package and case insensitive filesystem */
/* compiled from: ExperimentVariant.kt */
public final class C2213OU {
    private final String a;
    private final int b;

    public C2213OU(String str, int i) {
        C7471uYa.b(str, "variantName");
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2213OU) {
                C2213OU ou = (C2213OU) obj;
                if (C7471uYa.a((Object) this.a, (Object) ou.a)) {
                    if (this.b == ou.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExperimentVariant(variantName=");
        sb.append(this.a);
        sb.append(", variantId=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
