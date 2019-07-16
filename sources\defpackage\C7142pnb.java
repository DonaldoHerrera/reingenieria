package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: pnb reason: default package and case insensitive filesystem */
/* compiled from: ModuleMapping.kt */
public final class C7142pnb {
    private final LinkedHashMap<String, String> a = new LinkedHashMap<>();
    private final Set<String> b = new LinkedHashSet();
    private final String c;

    public C7142pnb(String str) {
        C7471uYa.b(str, "packageFqName");
        this.c = str;
    }

    public final Set<String> a() {
        Set<String> keySet = this.a.keySet();
        C7471uYa.a((Object) keySet, "packageParts.keys");
        return keySet;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7142pnb) {
            C7142pnb pnb = (C7142pnb) obj;
            if (C7471uYa.a((Object) pnb.c, (Object) this.c) && C7471uYa.a((Object) pnb.a, (Object) this.a) && C7471uYa.a((Object) pnb.b, (Object) this.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return TWa.b(a(), (Iterable<? extends T>) this.b).toString();
    }

    public final void a(String str, String str2) {
        C7471uYa.b(str, "partInternalName");
        this.a.put(str, str2);
    }

    public final void a(String str) {
        C7471uYa.b(str, "shortName");
        Set<String> set = this.b;
        if (set != null) {
            LYa.b(set).add(str);
            return;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
    }
}
