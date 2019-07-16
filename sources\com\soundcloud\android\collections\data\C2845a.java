package com.soundcloud.android.collections.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: com.soundcloud.android.collections.data.a reason: case insensitive filesystem */
/* compiled from: ApiLikeFoundation.kt */
public final class C2845a extends C2848d {
    private final Date a = new Date(1);
    private final C3508cda b;

    @JsonCreator
    public C2845a(@JsonProperty("target_urn") C3508cda cda) {
        C7471uYa.b(cda, "targetUrn");
        super(null);
        this.b = cda;
    }

    public Date a() {
        return this.a;
    }

    public C3508cda b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) b(), (java.lang.Object) ((com.soundcloud.android.collections.data.C2845a) r2).b()) != false) goto L_0x0019;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2845a) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda b2 = b();
        if (b2 != null) {
            return b2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiDeletedLike(targetUrn=");
        sb.append(b());
        sb.append(")");
        return sb.toString();
    }
}
