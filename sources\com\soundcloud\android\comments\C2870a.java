package com.soundcloud.android.comments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: com.soundcloud.android.comments.a reason: case insensitive filesystem */
/* compiled from: TrackCommentOperations.kt */
public final class C2870a {
    private final C3508cda a;
    private final Date b;
    private final String c;
    private final C3776gea d;

    @JsonCreator
    public C2870a(@JsonProperty("urn") C3508cda cda, @JsonProperty("created_at") Date date, @JsonProperty("body") String str, @JsonProperty("commenter") C3776gea gea) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(date, "createdAt");
        C7471uYa.b(str, "body");
        C7471uYa.b(gea, "commenter");
        this.a = cda;
        this.b = date;
        this.c = str;
        this.d = gea;
    }

    public final String a() {
        return this.c;
    }

    public final C3776gea b() {
        return this.d;
    }

    public final Date c() {
        return this.b;
    }

    public final C3508cda d() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0033;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2870a) {
                C2870a aVar = (C2870a) obj;
                if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) aVar.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) aVar.c)) {
                        }
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
        Date date = this.b;
        int hashCode2 = (hashCode + (date != null ? date.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C3776gea gea = this.d;
        if (gea != null) {
            i = gea.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiComment(urn=");
        sb.append(this.a);
        sb.append(", createdAt=");
        sb.append(this.b);
        sb.append(", body=");
        sb.append(this.c);
        sb.append(", commenter=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
