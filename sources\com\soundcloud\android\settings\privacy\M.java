package com.soundcloud.android.settings.privacy;

/* compiled from: CommunicationsSettingsPresenter.kt */
public final class M {
    private final boolean a;
    private final String b;
    private final String c;

    public M(boolean z, String str, String str2) {
        C7471uYa.b(str, "header");
        C7471uYa.b(str2, "description");
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof M) {
                M m = (M) obj;
                if (!(this.a == m.a) || !C7471uYa.a((Object) this.b, (Object) m.b) || !C7471uYa.a((Object) this.c, (Object) m.c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommunicationsSettingsViewModel(toggleValue=");
        sb.append(this.a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
