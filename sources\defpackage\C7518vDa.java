package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: vDa reason: default package and case insensitive filesystem */
/* compiled from: MediaPayload.kt */
public final class C7518vDa {
    private final String a;
    private final String b;

    @JsonCreator
    public C7518vDa(@JsonProperty("protocol") String str, @JsonProperty("mime_type") String str2) {
        C7471uYa.b(str, "protocol");
        C7471uYa.b(str2, "mimeType");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7518vDa) {
                C7518vDa vda = (C7518vDa) obj;
                if (C7471uYa.a((Object) this.a, (Object) vda.a)) {
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
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaStreamFormat(protocol=");
        sb.append(this.a);
        sb.append(", mimeType=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
