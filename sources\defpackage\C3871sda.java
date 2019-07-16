package defpackage;

/* renamed from: sda reason: default package and case insensitive filesystem */
/* compiled from: PlaylistsOptions.kt */
public final class C3871sda {
    private final C3911xda a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public C3871sda(C3911xda xda, boolean z, boolean z2, boolean z3) {
        C7471uYa.b(xda, "sortBy");
        this.a = xda;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    public final C3911xda d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3871sda) {
                C3871sda sda = (C3871sda) obj;
                if (C7471uYa.a((Object) this.a, (Object) sda.a)) {
                    if (this.b == sda.b) {
                        if (this.c == sda.c) {
                            if (this.d == sda.d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3911xda xda = this.a;
        int hashCode = (xda != null ? xda.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.c;
        if (z2) {
            z2 = true;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.d;
        if (z3) {
            z3 = true;
        }
        return i2 + (z3 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaylistsOptions(sortBy=");
        sb.append(this.a);
        sb.append(", showLikes=");
        sb.append(this.b);
        sb.append(", showPosts=");
        sb.append(this.c);
        sb.append(", showOfflineOnly=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3871sda(C3911xda xda, boolean z, boolean z2, boolean z3, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        this(xda, z, z2, z3);
    }
}
