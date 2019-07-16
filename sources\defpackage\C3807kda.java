package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: kda reason: default package and case insensitive filesystem */
/* compiled from: OfflineProperties.kt */
public final class C3807kda {
    private final Map<C3508cda, C3823mda> a;
    private final C3823mda b;

    public C3807kda() {
        this(null, null, 3, null);
    }

    public C3807kda(Map<C3508cda, ? extends C3823mda> map, C3823mda mda) {
        C7471uYa.b(map, "offlineEntitiesStates");
        C7471uYa.b(mda, "likedTracksState");
        this.a = map;
        this.b = mda;
    }

    public final C3823mda a() {
        return this.b;
    }

    public final Map<C3508cda, C3823mda> b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3807kda) {
                C3807kda kda = (C3807kda) obj;
                if (C7471uYa.a((Object) this.a, (Object) kda.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Map<C3508cda, C3823mda> map = this.a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        C3823mda mda = this.b;
        if (mda != null) {
            i = mda.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OfflineProperties(offlineEntitiesStates=");
        sb.append(this.a);
        sb.append(", likedTracksState=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3807kda(Map map, C3823mda mda, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            map = LWa.a();
        }
        if ((i & 2) != 0) {
            mda = C3823mda.NOT_OFFLINE;
        }
        this(map, mda);
    }

    public final C3823mda a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        Object obj = this.a.get(cda);
        if (obj == null) {
            obj = C3823mda.NOT_OFFLINE;
        }
        return (C3823mda) obj;
    }

    public final C3807kda a(C3807kda kda) {
        C7471uYa.b(kda, "newState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.a);
        linkedHashMap.putAll(kda.a);
        return new C3807kda(linkedHashMap, kda.b);
    }
}
