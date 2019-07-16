package defpackage;

import java.util.EnumMap;
import java.util.HashMap;

/* renamed from: Qbb reason: default package and case insensitive filesystem */
/* compiled from: KotlinBuiltIns */
class C5241Qbb implements PXa<b> {
    final /* synthetic */ C5301Sbb a;

    C5241Qbb(C5301Sbb sbb) {
        this.a = sbb;
    }

    public b d() {
        C5331Tbb[] values;
        EnumMap enumMap = new EnumMap(C5331Tbb.class);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (C5331Tbb tbb : C5331Tbb.values()) {
            Etb a2 = this.a.b(tbb.d().a());
            Etb a3 = this.a.b(tbb.b().a());
            enumMap.put(tbb, a3);
            hashMap.put(a2, a3);
            hashMap2.put(a3, a2);
        }
        return new b(enumMap, hashMap, hashMap2, null);
    }
}
