package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/soundcloud/android/sync/push/EntityState;", "", "action", "", "targetUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "timestamp", "Ljava/util/Date;", "(Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/util/Date;)V", "getAction", "()Ljava/lang/String;", "getTargetUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getTimestamp", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "State", "deltasync_release"}, mv = {1, 1, 15})
/* renamed from: CCa reason: default package and case insensitive filesystem */
/* compiled from: CollectionsUpdatesMessage.kt */
public final class C4796CCa {
    private final String a;
    private final C3508cda b;
    private final Date c;

    /* renamed from: CCa$a */
    /* compiled from: CollectionsUpdatesMessage.kt */
    public enum a {
        PRESENT,
        ABSENT
    }

    @JsonCreator
    public C4796CCa(@JsonProperty("state") String str, @JsonProperty("target_urn") C3508cda cda, @JsonProperty("state_at") Date date) {
        C7471uYa.b(str, "action");
        C7471uYa.b(cda, "targetUrn");
        C7471uYa.b(date, "timestamp");
        this.a = str;
        this.b = cda;
        this.c = date;
    }

    public final String a() {
        return this.a;
    }

    public final C3508cda b() {
        return this.b;
    }

    public final Date c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4796CCa) {
                C4796CCa cCa = (C4796CCa) obj;
                if (C7471uYa.a((Object) this.a, (Object) cCa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) cCa.b)) {
                    }
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
        C3508cda cda = this.b;
        int hashCode2 = (hashCode + (cda != null ? cda.hashCode() : 0)) * 31;
        Date date = this.c;
        if (date != null) {
            i = date.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntityState(action=");
        sb.append(this.a);
        sb.append(", targetUrn=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
