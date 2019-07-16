package com.soundcloud.android.collections.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: com.soundcloud.android.collections.data.c reason: case insensitive filesystem */
/* compiled from: ApiLikeFoundation.kt */
public final class C2847c extends C2848d {
    private final C3508cda a;
    private final Date b;

    @JsonCreator
    public C2847c(@JsonProperty("target_urn") C3508cda cda, @JsonProperty("created_at") Date date) {
        C7471uYa.b(cda, "targetUrn");
        C7471uYa.b(date, "createdAt");
        super(null);
        this.a = cda;
        this.b = date;
    }

    public Date a() {
        return this.b;
    }

    public C3508cda b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) r3.a()) != false) goto L_0x0027;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2847c) {
                C2847c cVar = (C2847c) obj;
                if (C7471uYa.a((Object) b(), (Object) cVar.b())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda b2 = b();
        int i = 0;
        int hashCode = (b2 != null ? b2.hashCode() : 0) * 31;
        Date a2 = a();
        if (a2 != null) {
            i = a2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiLike(targetUrn=");
        sb.append(b());
        sb.append(", createdAt=");
        sb.append(a());
        sb.append(")");
        return sb.toString();
    }
}
