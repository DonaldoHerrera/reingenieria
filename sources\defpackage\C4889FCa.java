package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: FCa reason: default package and case insensitive filesystem */
/* compiled from: EntityUpdatesMessage.kt */
public final class C4889FCa {
    private final List<C4858ECa> a;
    private final C4920GCa b;

    @JsonCreator
    public C4889FCa(@JsonProperty("entity_updates") List<C4858ECa> list, @JsonProperty("meta") C4920GCa gCa) {
        C7471uYa.b(list, "updates");
        C7471uYa.b(gCa, "meta");
        this.a = list;
        this.b = gCa;
    }

    public final List<C4858ECa> a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4889FCa) {
                C4889FCa fCa = (C4889FCa) obj;
                if (C7471uYa.a((Object) this.a, (Object) fCa.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C4858ECa> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C4920GCa gCa = this.b;
        if (gCa != null) {
            i = gCa.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntityUpdatesMessage(updates=");
        sb.append(this.a);
        sb.append(", meta=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
