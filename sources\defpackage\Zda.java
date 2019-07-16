package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: Zda reason: default package */
/* compiled from: ApiTrackMedia.kt */
public final class Zda {
    private final String a;

    @JsonCreator
    public Zda(@JsonProperty("payload") String str) {
        C7471uYa.b(str, "payload");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.Zda) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Zda) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiTrackMedia(payload=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
