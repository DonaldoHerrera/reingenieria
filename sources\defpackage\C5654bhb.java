package defpackage;

import java.util.EnumMap;

/* renamed from: bhb reason: default package and case insensitive filesystem */
/* compiled from: context.kt */
public final class C5654bhb {
    private final EnumMap<a, C6864ljb> a;

    public C5654bhb(EnumMap<a, C6864ljb> enumMap) {
        C7471uYa.b(enumMap, "nullabilityQualifiers");
        this.a = enumMap;
    }

    public final EnumMap<a, C6864ljb> a() {
        return this.a;
    }

    public final C6592hjb a(a aVar) {
        C6864ljb ljb = (C6864ljb) this.a.get(aVar);
        if (ljb == null) {
            return null;
        }
        C7471uYa.a((Object) ljb, "nullabilityQualifiers[ap…ilityType] ?: return null");
        return new C6592hjb(ljb.a(), null, false, ljb.b());
    }
}
