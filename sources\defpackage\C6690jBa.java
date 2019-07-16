package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: jBa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PlaylistApiUpdateObject */
final class C6690jBa extends C7790zBa {
    private final String a;
    private final Boolean b;
    private final List<String> c;

    C6690jBa(String str, Boolean bool, List<String> list) {
        this.a = str;
        this.b = bool;
        if (list != null) {
            this.c = list;
            return;
        }
        throw new NullPointerException("Null trackUrns");
    }

    public Boolean a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    @JsonProperty("track_urns")
    public List<String> c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r4.c.equals(r5.c()) != false) goto L_0x0043;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7790zBa)) {
            return false;
        }
        C7790zBa zba = (C7790zBa) obj;
        String str = this.a;
        if (str != null ? str.equals(zba.b()) : zba.b() == null) {
            Boolean bool = this.b;
            if (bool != null ? bool.equals(zba.a()) : zba.a() == null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaylistApiUpdateObject{title=");
        sb.append(this.a);
        sb.append(", public=");
        sb.append(this.b);
        sb.append(", trackUrns=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
