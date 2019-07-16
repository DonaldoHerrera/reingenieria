package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: MX reason: default package and case insensitive filesystem */
/* compiled from: ApiPromotedTrackCard.kt */
public final class C3441MX {
    private final C3378yP a;

    @JsonCreator
    public C3441MX(@JsonProperty("promoted_track") C3378yP yPVar) {
        C7471uYa.b(yPVar, "promotedTrack");
        this.a = yPVar;
    }

    public final C3378yP a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C3441MX) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3441MX) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3378yP yPVar = this.a;
        if (yPVar != null) {
            return yPVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiPromotedTrackCard(promotedTrack=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
