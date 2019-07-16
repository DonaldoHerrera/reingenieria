package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: ACa reason: default package and case insensitive filesystem */
/* compiled from: CollectionsUpdatesMessage.kt */
public final class C4734ACa {
    private final C7792zCa a;
    private final C5011JAa b;

    @JsonCreator
    public C4734ACa(@JsonProperty("collections_updates") C7792zCa zca, @JsonProperty("meta") C5011JAa jAa) {
        C7471uYa.b(zca, "updates");
        C7471uYa.b(jAa, "meta");
        this.a = zca;
        this.b = jAa;
    }

    public final C7792zCa a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4734ACa) {
                C4734ACa aCa = (C4734ACa) obj;
                if (C7471uYa.a((Object) this.a, (Object) aCa.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C7792zCa zca = this.a;
        int i = 0;
        int hashCode = (zca != null ? zca.hashCode() : 0) * 31;
        C5011JAa jAa = this.b;
        if (jAa != null) {
            i = jAa.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionsUpdatesMessage(updates=");
        sb.append(this.a);
        sb.append(", meta=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
