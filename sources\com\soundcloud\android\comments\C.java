package com.soundcloud.android.comments;

import java.util.List;

/* compiled from: CommentsPresenter.kt */
public final class C {
    private final List<C3791ida> a;
    private final long b;
    private final boolean c;
    private final C3508cda d;
    private final C3508cda e;
    private final String f;
    private final String g;

    public C(List<C3791ida> list, long j, boolean z, C3508cda cda, C3508cda cda2, String str, String str2) {
        C7471uYa.b(list, "comments");
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(cda2, "trackCreatorUrn");
        C7471uYa.b(str, "title");
        this.a = list;
        this.b = j;
        this.c = z;
        this.d = cda;
        this.e = cda2;
        this.f = str;
        this.g = str2;
    }

    public final List<C3791ida> a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final String c() {
        return this.g;
    }

    public final long d() {
        return this.b;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C) {
                C c2 = (C) obj;
                if (C7471uYa.a((Object) this.a, (Object) c2.a)) {
                    if (this.b == c2.b) {
                        if (!(this.c == c2.c) || !C7471uYa.a((Object) this.d, (Object) c2.d) || !C7471uYa.a((Object) this.e, (Object) c2.e) || !C7471uYa.a((Object) this.f, (Object) c2.f) || !C7471uYa.a((Object) this.g, (Object) c2.g)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C3508cda f() {
        return this.e;
    }

    public final C3508cda g() {
        return this.d;
    }

    public int hashCode() {
        List<C3791ida> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        long j = this.b;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        C3508cda cda = this.d;
        int hashCode2 = (i3 + (cda != null ? cda.hashCode() : 0)) * 31;
        C3508cda cda2 = this.e;
        int hashCode3 = (hashCode2 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        String str = this.f;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommentsDomainModel(comments=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", commentsEnabled=");
        sb.append(this.c);
        sb.append(", trackUrn=");
        sb.append(this.d);
        sb.append(", trackCreatorUrn=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", secretToken=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
