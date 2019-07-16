package com.soundcloud.android.profile;

/* compiled from: ProfileItem.kt */
public final class Ka {
    private final C4954HFa a;
    private final boolean b;

    public Ka(C4954HFa hFa, boolean z) {
        C7471uYa.b(hFa, "userItem");
        this.a = hFa;
        this.b = z;
    }

    public final C4954HFa a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ka) {
                Ka ka = (Ka) obj;
                if (C7471uYa.a((Object) this.a, (Object) ka.a)) {
                    if (this.b == ka.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C4954HFa hFa = this.a;
        int hashCode = (hFa != null ? hFa.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileItem(userItem=");
        sb.append(this.a);
        sb.append(", isLoggedInUser=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
