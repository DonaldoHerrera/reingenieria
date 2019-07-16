package defpackage;

/* renamed from: Zia reason: default package */
/* compiled from: AutoValue_NavigationTarget_NotificationPreferencesMetaData */
final class Zia extends d {
    private final boolean a;

    Zia(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        if (this.a != ((d) obj).a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationPreferencesMetaData{navigationDeeplink=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
