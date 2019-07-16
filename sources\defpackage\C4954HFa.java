package defpackage;

/* renamed from: HFa reason: default package and case insensitive filesystem */
/* compiled from: UserItem.kt */
public final class C4954HFa implements Wca {
    private final boolean a = this.d.g();
    private final C3508cda b;
    private final C4928GKa<String> c;
    public final C3784hea d;
    public final boolean e;

    public C4954HFa(C3784hea hea, boolean z) {
        C7471uYa.b(hea, "user");
        this.d = hea;
        this.e = z;
        C3784hea hea2 = this.d;
        this.b = hea2.a;
        C4928GKa<String> b2 = C4928GKa.b(hea2.l);
        C7471uYa.a((Object) b2, "Optional.fromNullable(user.avatarUrl)");
        this.c = b2;
    }

    public C3508cda a() {
        return this.b;
    }

    public C4928GKa<String> b() {
        return this.c;
    }

    public final C4928GKa<String> c() {
        C4928GKa<String> b2 = C4928GKa.b(this.d.b());
        C7471uYa.a((Object) b2, "Optional.fromNullable(user.country)");
        return b2;
    }

    public final long d() {
        return this.d.c();
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4954HFa) {
                C4954HFa hFa = (C4954HFa) obj;
                if (C7471uYa.a((Object) this.d, (Object) hFa.d)) {
                    if (this.e == hFa.e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.d.c;
    }

    public final String g() {
        return this.d.e();
    }

    public int hashCode() {
        C3784hea hea = this.d;
        int hashCode = (hea != null ? hea.hashCode() : 0) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserItem(user=");
        sb.append(this.d);
        sb.append(", isFollowedByMe=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
