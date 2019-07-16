package com.soundcloud.android.comments;

import java.util.List;

/* compiled from: CommentsPage.kt */
public final class T {
    private final List<C2921y> a;
    private final C4954HFa b;
    private final long c;
    private final boolean d;
    private final boolean e;
    private final C3508cda f;
    private final String g;
    private final String h;

    public T(List<? extends C2921y> list, C4954HFa hFa, long j, boolean z, boolean z2, C3508cda cda, String str, String str2) {
        C7471uYa.b(list, "comments");
        C7471uYa.b(hFa, "user");
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(str, "title");
        this.a = list;
        this.b = hFa;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = cda;
        this.g = str;
        this.h = str2;
    }

    public final List<C2921y> a() {
        return this.a;
    }

    public final boolean b() {
        return this.e;
    }

    public final String c() {
        return this.h;
    }

    public final long d() {
        return this.c;
    }

    public final String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof T) {
                T t = (T) obj;
                if (C7471uYa.a((Object) this.a, (Object) t.a) && C7471uYa.a((Object) this.b, (Object) t.b)) {
                    if (this.c == t.c) {
                        if (this.d == t.d) {
                            if (!(this.e == t.e) || !C7471uYa.a((Object) this.f, (Object) t.f) || !C7471uYa.a((Object) this.g, (Object) t.g) || !C7471uYa.a((Object) this.h, (Object) t.h)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C3508cda f() {
        return this.f;
    }

    public final C4954HFa g() {
        return this.b;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        List<C2921y> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C4954HFa hFa = this.b;
        int hashCode2 = (hashCode + (hFa != null ? hFa.hashCode() : 0)) * 31;
        long j = this.c;
        int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.e;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        C3508cda cda = this.f;
        int hashCode3 = (i4 + (cda != null ? cda.hashCode() : 0)) * 31;
        String str = this.g;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommentsPage(comments=");
        sb.append(this.a);
        sb.append(", user=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", isReplying=");
        sb.append(this.d);
        sb.append(", commentsEnabled=");
        sb.append(this.e);
        sb.append(", trackUrn=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", secretToken=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
