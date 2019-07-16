package com.soundcloud.android.profile;

import java.util.List;

/* renamed from: com.soundcloud.android.profile.pa reason: case insensitive filesystem */
/* compiled from: ProfileBucketsPresenter.kt */
public final class C5831pa {
    private final List<P> a;
    private final String b;
    private final boolean c;

    public C5831pa(List<? extends P> list, String str, boolean z) {
        C7471uYa.b(list, "bucketItems");
        C7471uYa.b(str, "username");
        this.a = list;
        this.b = str;
        this.c = z;
    }

    public final List<P> a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5831pa) {
                C5831pa paVar = (C5831pa) obj;
                if (C7471uYa.a((Object) this.a, (Object) paVar.a) && C7471uYa.a((Object) this.b, (Object) paVar.b)) {
                    if (this.c == paVar.c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<P> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
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
        sb.append("ProfileBucketsViewModel(bucketItems=");
        sb.append(this.a);
        sb.append(", username=");
        sb.append(this.b);
        sb.append(", isLoggedInUser=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
