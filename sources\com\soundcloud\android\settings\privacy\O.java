package com.soundcloud.android.settings.privacy;

/* compiled from: PrivacySettingsToggleLayout.kt */
public final class O {
    private final String a;
    private final String b;
    private final boolean c;

    public O(String str, String str2, boolean z) {
        C7471uYa.b(str, "header");
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof O) {
                O o = (O) obj;
                if (C7471uYa.a((Object) this.a, (Object) o.a) && C7471uYa.a((Object) this.b, (Object) o.b)) {
                    if (this.c == o.c) {
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
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivacySettingsToggleLayoutState(header=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", isSwitchChecked=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ O(String str, String str2, boolean z, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        this(str, str2, z);
    }
}
