package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: LAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncResponse.kt */
public final class C5074LAa {
    private final String a;
    private final C3508cda b;
    private final Date c;

    @JsonCreator
    public C5074LAa(@JsonProperty("action") String str, @JsonProperty("target_urn") C3508cda cda, @JsonProperty("updated_at") Date date) {
        C7471uYa.b(str, "action");
        C7471uYa.b(cda, "targetUrn");
        C7471uYa.b(date, "timestamp");
        this.a = str;
        this.b = cda;
        this.c = date;
    }

    public final String a() {
        return this.a;
    }

    public final C3508cda b() {
        return this.b;
    }

    public final Date c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5074LAa) {
                C5074LAa lAa = (C5074LAa) obj;
                if (C7471uYa.a((Object) this.a, (Object) lAa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) lAa.b)) {
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
        C3508cda cda = this.b;
        int hashCode2 = (hashCode + (cda != null ? cda.hashCode() : 0)) * 31;
        Date date = this.c;
        if (date != null) {
            i = date.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Update(action=");
        sb.append(this.a);
        sb.append(", targetUrn=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
