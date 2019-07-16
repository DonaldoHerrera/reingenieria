package com.soundcloud.android.settings.privacy;

/* compiled from: AnalyticsSettingsPresenter.kt */
public final class z {
    private final boolean a;
    private final String b;

    public z(boolean z, String str) {
        C7471uYa.b(str, "header");
        this.a = z;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                if (!(this.a == zVar.a) || !C7471uYa.a((Object) this.b, (Object) zVar.b)) {
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
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnalyticsSettingsViewModel(toggleValue=");
        sb.append(this.a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
