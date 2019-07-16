package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: ECa reason: default package and case insensitive filesystem */
/* compiled from: EntityUpdatesMessage.kt */
public final class C4858ECa {
    private final C3508cda a;
    private final C3508cda b;
    private final Date c;

    @JsonCreator
    public C4858ECa(@JsonProperty("entity_urn") C3508cda cda, @JsonProperty("owner") C3508cda cda2, @JsonProperty("timestamp") Date date) {
        C7471uYa.b(cda, "entity");
        C7471uYa.b(cda2, "owner");
        C7471uYa.b(date, "timestamp");
        this.a = cda;
        this.b = cda2;
        this.c = date;
    }

    public final C3508cda a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4858ECa) {
                C4858ECa eCa = (C4858ECa) obj;
                if (C7471uYa.a((Object) this.a, (Object) eCa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) eCa.b)) {
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
        C3508cda cda2 = this.b;
        int hashCode2 = (hashCode + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        Date date = this.c;
        if (date != null) {
            i = date.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntityUpdate(entity=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
