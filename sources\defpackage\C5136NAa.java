package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: NAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncResponse.kt */
public final class C5136NAa {
    private final List<C5074LAa> a;
    private final List<C5074LAa> b;
    private final List<C5074LAa> c;

    @JsonCreator
    public C5136NAa() {
        this(null, null, null, 7, null);
    }

    @JsonCreator
    public C5136NAa(@JsonProperty("tracks") List<C5074LAa> list, @JsonProperty("playlists") List<C5074LAa> list2, @JsonProperty("users") List<C5074LAa> list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final List<C5074LAa> a() {
        return this.b;
    }

    public final List<C5074LAa> b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5136NAa) {
                C5136NAa nAa = (C5136NAa) obj;
                if (C7471uYa.a((Object) this.a, (Object) nAa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) nAa.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C5074LAa> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C5074LAa> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C5074LAa> list3 = this.c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdatedEntities(tracks=");
        sb.append(this.a);
        sb.append(", playlists=");
        sb.append(this.b);
        sb.append(", users=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C5136NAa(List list, List list2, List list3, int i, C7264rYa rya) {
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
