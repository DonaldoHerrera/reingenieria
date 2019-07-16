package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: GAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncRequest.kt */
public final class C4918GAa {
    private final String a;
    private final Date b;

    @JsonCreator
    public C4918GAa(String str, Date date) {
        C7471uYa.b(str, "targetUrn");
        C7471uYa.b(date, "timestamp");
        this.a = str;
        this.b = date;
    }

    @JsonProperty("target_urn")
    public final String a() {
        return this.a;
    }

    @JsonProperty("timestamp")
    @JsonFormat(locale = "en_US", pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    public final Date b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4918GAa) {
                C4918GAa gAa = (C4918GAa) obj;
                if (C7471uYa.a((Object) this.a, (Object) gAa.a)) {
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
        Date date = this.b;
        if (date != null) {
            i = date.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Entity(targetUrn=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
