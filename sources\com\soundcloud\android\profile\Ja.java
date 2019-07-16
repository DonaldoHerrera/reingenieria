package com.soundcloud.android.profile;

/* compiled from: ProfileImageSource.kt */
public final class Ja {
    private final C3508cda a;
    private final String b;
    private final String c;
    private final Fd d;
    private final boolean e;

    public Ja(C3508cda cda, String str, String str2, Fd fd, boolean z) {
        C7471uYa.b(cda, "creator");
        this.a = cda;
        this.b = str;
        this.c = str2;
        this.d = fd;
        this.e = z;
    }

    public static /* synthetic */ Ja a(Ja ja, C3508cda cda, String str, String str2, Fd fd, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cda = ja.a;
        }
        if ((i & 2) != 0) {
            str = ja.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = ja.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            fd = ja.d;
        }
        Fd fd2 = fd;
        if ((i & 16) != 0) {
            z = ja.e;
        }
        return ja.a(cda, str3, str4, fd2, z);
    }

    public final Ja a(C3508cda cda, String str, String str2, Fd fd, boolean z) {
        C7471uYa.b(cda, "creator");
        Ja ja = new Ja(cda, str, str2, fd, z);
        return ja;
    }

    public final String a() {
        return this.b;
    }

    public final C3508cda b() {
        return this.a;
    }

    public final Fd c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ja) {
                Ja ja = (Ja) obj;
                if (C7471uYa.a((Object) this.a, (Object) ja.a) && C7471uYa.a((Object) this.b, (Object) ja.b) && C7471uYa.a((Object) this.c, (Object) ja.c) && C7471uYa.a((Object) this.d, (Object) ja.d)) {
                    if (this.e == ja.e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Fd fd = this.d;
        if (fd != null) {
            i = fd.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileImageSource(creator=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", visualUrl=");
        sb.append(this.c);
        sb.append(", palette=");
        sb.append(this.d);
        sb.append(", shouldDefaultToPalette=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public Ja(C3784hea hea) {
        C7471uYa.b(hea, "user");
        this(hea.a, hea.l, hea.f(), null, false);
    }
}
