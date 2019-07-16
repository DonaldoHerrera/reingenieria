package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
/* renamed from: KAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncRequest.kt */
public final class C5043KAa {
    private final C4887FAa a;
    private final C4887FAa b;
    private final C4887FAa c;

    @JsonCreator
    public C5043KAa() {
        this(null, null, null, 7, null);
    }

    @JsonCreator
    public C5043KAa(C4887FAa fAa, C4887FAa fAa2, C4887FAa fAa3) {
        this.a = fAa;
        this.b = fAa2;
        this.c = fAa3;
    }

    @JsonProperty("followings")
    public final C4887FAa a() {
        return this.c;
    }

    @JsonProperty("likes")
    public final C4887FAa b() {
        return this.a;
    }

    @JsonProperty("posts")
    public final C4887FAa c() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5043KAa) {
                C5043KAa kAa = (C5043KAa) obj;
                if (C7471uYa.a((Object) this.a, (Object) kAa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) kAa.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C4887FAa fAa = this.a;
        int i = 0;
        int hashCode = (fAa != null ? fAa.hashCode() : 0) * 31;
        C4887FAa fAa2 = this.b;
        int hashCode2 = (hashCode + (fAa2 != null ? fAa2.hashCode() : 0)) * 31;
        C4887FAa fAa3 = this.c;
        if (fAa3 != null) {
            i = fAa3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot(likes=");
        sb.append(this.a);
        sb.append(", posts=");
        sb.append(this.b);
        sb.append(", followings=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C5043KAa(C4887FAa fAa, C4887FAa fAa2, C4887FAa fAa3, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            fAa = null;
        }
        if ((i & 2) != 0) {
            fAa2 = null;
        }
        if ((i & 4) != 0) {
            fAa3 = null;
        }
        this(fAa, fAa2, fAa3);
    }
}
