package defpackage;

/* renamed from: sKa reason: default package and case insensitive filesystem */
/* compiled from: PrivacySettings.kt */
public final class C7319sKa {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public C7319sKa(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7319sKa) {
                C7319sKa ska = (C7319sKa) obj;
                if (this.a == ska.a) {
                    if (this.b == ska.b) {
                        if (this.c == ska.c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.b;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.c;
        if (!z3) {
            i = z3;
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivacySettings(hasAnalyticsOptIn=");
        sb.append(this.a);
        sb.append(", hasTargetedAdvertisingOptIn=");
        sb.append(this.b);
        sb.append(", hasCommunicationsOptIn=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
