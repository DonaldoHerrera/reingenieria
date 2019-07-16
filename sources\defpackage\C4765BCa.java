package defpackage;

import com.soundcloud.android.collections.data.C2853i;
import com.soundcloud.android.collections.data.C2853i.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: BCa reason: default package and case insensitive filesystem */
/* compiled from: CollectionsUpdatesMessage.kt */
public final class C4765BCa {
    public static final List<C2853i> a(C4827DCa dCa) {
        C7471uYa.b(dCa, "$this$toChanges");
        List<C4796CCa> b = dCa.b();
        if (b == null) {
            b = C6918mWa.a();
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) b, 10));
        for (C4796CCa a : b) {
            arrayList.add(a(a));
        }
        List<C4796CCa> a2 = dCa.a();
        if (a2 == null) {
            a2 = C6918mWa.a();
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C4796CCa a3 : a2) {
            arrayList2.add(a(a3));
        }
        return C7676xWa.c((Collection) arrayList, (Iterable) arrayList2);
    }

    public static final C2853i a(C4796CCa cCa) {
        C7471uYa.b(cCa, "$this$toChange");
        String a = cCa.a();
        if (a != null) {
            String upperCase = a.toUpperCase();
            C7471uYa.a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            return new C2853i(a(a.valueOf(upperCase)), cCa.b(), cCa.c());
        }
        throw new OVa("null cannot be cast to non-null type java.lang.String");
    }

    public static final a a(a aVar) {
        C7471uYa.b(aVar, "$this$toAction");
        return aVar == a.ABSENT ? a.REMOVE : a.ADD;
    }
}
