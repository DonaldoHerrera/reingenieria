package defpackage;

import com.soundcloud.android.collections.data.C2853i;
import com.soundcloud.android.collections.data.C2853i.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: AAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncResponse.kt */
public final class C4732AAa {
    public static final List<C2853i> a(C5136NAa nAa) {
        C7471uYa.b(nAa, "$this$toChanges");
        List<C5074LAa> b = nAa.b();
        if (b == null) {
            b = C6918mWa.a();
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) b, 10));
        for (C5074LAa a : b) {
            arrayList.add(a(a));
        }
        List<C5074LAa> a2 = nAa.a();
        if (a2 == null) {
            a2 = C6918mWa.a();
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C5074LAa a3 : a2) {
            arrayList2.add(a(a3));
        }
        return C7676xWa.c((Collection) arrayList, (Iterable) arrayList2);
    }

    public static final C2853i a(C5074LAa lAa) {
        C7471uYa.b(lAa, "$this$toChange");
        String a = lAa.a();
        if (a != null) {
            String upperCase = a.toUpperCase();
            C7471uYa.a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            return new C2853i(a.valueOf(upperCase), lAa.b(), lAa.c());
        }
        throw new OVa("null cannot be cast to non-null type java.lang.String");
    }
}
