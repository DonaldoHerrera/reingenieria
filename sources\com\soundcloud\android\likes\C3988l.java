package com.soundcloud.android.likes;

import java.util.Set;

/* renamed from: com.soundcloud.android.likes.l reason: case insensitive filesystem */
/* compiled from: LikedStatuses.kt */
public final class C3988l {
    private final Set<C3508cda> a;

    public C3988l(Set<C3508cda> set) {
        C7471uYa.b(set, "likes");
        this.a = set;
    }

    public final Set<C3508cda> a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.likes.C3988l) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3988l) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Set<C3508cda> set = this.a;
        if (set != null) {
            return set.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LikedStatuses(likes=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    public final boolean a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        return this.a.contains(cda);
    }
}
