package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: DCa reason: default package and case insensitive filesystem */
/* compiled from: CollectionsUpdatesMessage.kt */
public final class C4827DCa {
    private final List<C4796CCa> a;
    private final List<C4796CCa> b;
    private final List<C4796CCa> c;

    @JsonCreator
    public C4827DCa() {
        this(null, null, null, 7, null);
    }

    @JsonCreator
    public C4827DCa(@JsonProperty("tracks") List<C4796CCa> list, @JsonProperty("playlists") List<C4796CCa> list2, @JsonProperty("users") List<C4796CCa> list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final List<C4796CCa> a() {
        return this.b;
    }

    public final List<C4796CCa> b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4827DCa) {
                C4827DCa dCa = (C4827DCa) obj;
                if (C7471uYa.a((Object) this.a, (Object) dCa.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) dCa.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C4796CCa> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C4796CCa> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C4796CCa> list3 = this.c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntityStates(tracks=");
        sb.append(this.a);
        sb.append(", playlists=");
        sb.append(this.b);
        sb.append(", users=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    @JsonCreator
    public /* synthetic */ C4827DCa(List list, List list2, List list3, int i, C7264rYa rya) {
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
