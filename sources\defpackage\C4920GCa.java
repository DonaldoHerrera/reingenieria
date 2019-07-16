package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: GCa reason: default package and case insensitive filesystem */
/* compiled from: EntityUpdatesMessage.kt */
public final class C4920GCa {
    private final Date a;

    @JsonCreator
    public C4920GCa() {
        this(null, 1, null);
    }

    @JsonCreator
    public C4920GCa(@JsonProperty("sent_at") @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'") Date date) {
        this.a = date;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C4920GCa) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4920GCa) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Date date = this.a;
        if (date != null) {
            return date.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Meta(timestamp=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C4920GCa(Date date, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            date = null;
        }
        this(date);
    }
}
