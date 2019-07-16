package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: zAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncResponse.kt */
public final class C7788zAa {
    private final C5105MAa a;
    private final C5011JAa b;

    @JsonCreator
    public C7788zAa(@JsonProperty("collections_updates") C5105MAa mAa, @JsonProperty("meta") C5011JAa jAa) {
        C7471uYa.b(mAa, "updates");
        C7471uYa.b(jAa, "meta");
        this.a = mAa;
        this.b = jAa;
    }

    public final C5105MAa a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7788zAa) {
                C7788zAa zaa = (C7788zAa) obj;
                if (C7471uYa.a((Object) this.a, (Object) zaa.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C5105MAa mAa = this.a;
        int i = 0;
        int hashCode = (mAa != null ? mAa.hashCode() : 0) * 31;
        C5011JAa jAa = this.b;
        if (jAa != null) {
            i = jAa.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeltaSyncResponse(updates=");
        sb.append(this.a);
        sb.append(", meta=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
