package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: JAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncResponse.kt */
public final class C5011JAa {
    private final C3508cda a;
    private final C7443uAa b;
    private final Date c;

    @JsonCreator
    public C5011JAa(@JsonProperty("user_urn") C3508cda cda, @JsonProperty("errors") C7443uAa uaa, @JsonProperty("sent_at") @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'") Date date) {
        C7471uYa.b(cda, "userUrn");
        this.a = cda;
        this.b = uaa;
        this.c = date;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5011JAa) {
                C5011JAa jAa = (C5011JAa) obj;
                if (C7471uYa.a((Object) this.a, (Object) jAa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) jAa.b)) {
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
        C7443uAa uaa = this.b;
        int hashCode2 = (hashCode + (uaa != null ? uaa.hashCode() : 0)) * 31;
        Date date = this.c;
        if (date != null) {
            i = date.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Meta(userUrn=");
        sb.append(this.a);
        sb.append(", errors=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C5011JAa(C3508cda cda, C7443uAa uaa, Date date, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            uaa = null;
        }
        if ((i & 4) != 0) {
            date = null;
        }
        this(cda, uaa, date);
    }
}
