package com.soundcloud.android.playback;

import com.google.android.gms.common.internal.ImagesContract;

/* renamed from: com.soundcloud.android.playback.fd reason: case insensitive filesystem */
/* compiled from: StreamSelector.kt */
public final class C4308fd {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public C4308fd(String str, String str2, String str3, String str4, String str5) {
        C7471uYa.b(str, ImagesContract.URL);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x003d;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4308fd) {
                C4308fd fdVar = (C4308fd) obj;
                if (C7471uYa.a((Object) this.a, (Object) fdVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) fdVar.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) fdVar.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) fdVar.d)) {
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
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stream(url=");
        sb.append(this.a);
        sb.append(", protocol=");
        sb.append(this.b);
        sb.append(", preset=");
        sb.append(this.c);
        sb.append(", quality=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C4308fd(String str, String str2, String str3, String str4, String str5, int i, C7264rYa rya) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
