package defpackage;

/* renamed from: _ia reason: default package */
/* compiled from: AutoValue_NavigationTarget_OfflineSettingsMetaData */
final class _ia extends e {
    private final boolean a;

    _ia(boolean z) {
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
        if (!(obj instanceof e)) {
            return false;
        }
        if (this.a != ((e) obj).a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OfflineSettingsMetaData{showOnboarding=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
