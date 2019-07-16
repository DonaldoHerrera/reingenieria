package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(Include.NON_NULL)
/* renamed from: FAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncRequest.kt */
public final class C4887FAa {
    private final List<C4918GAa> a;
    private final List<C4918GAa> b;
    private final List<C4918GAa> c;

    @JsonCreator
    public C4887FAa() {
        this(null, null, null, 7, null);
    }

    @JsonCreator
    public C4887FAa(List<C4918GAa> list, List<C4918GAa> list2, List<C4918GAa> list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    @JsonProperty("playlists")
    public final List<C4918GAa> a() {
        return this.b;
    }

    @JsonProperty("tracks")
    public final List<C4918GAa> b() {
        return this.a;
    }

    @JsonProperty("users")
    public final List<C4918GAa> c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4887FAa) {
                C4887FAa fAa = (C4887FAa) obj;
                if (C7471uYa.a((Object) this.a, (Object) fAa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) fAa.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C4918GAa> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C4918GAa> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C4918GAa> list3 = this.c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Entities(tracks=");
        sb.append(this.a);
        sb.append(", playlists=");
        sb.append(this.b);
        sb.append(", users=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C4887FAa(List list, List list2, List list3, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            list3 = null;
        }
        this(list, list2, list3);
    }
}
