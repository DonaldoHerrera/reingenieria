package defpackage;

import com.soundcloud.android.foundation.ads.C3675b.C0090b;
import com.soundcloud.android.foundation.ads.C3688o;
import com.soundcloud.android.foundation.ads.C3689p;
import com.soundcloud.android.foundation.ads.C3692t;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.ads.X;
import com.soundcloud.android.foundation.ads.Y;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.ads.ea;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.K.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: DZ reason: default package and case insensitive filesystem */
/* compiled from: AdEventExtensions.kt */
public final class C3416DZ {
    public static final K a(U u, Yaa yaa, I i) {
        C7471uYa.b(u, "$this$toSkipAdUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        f fVar = K.a;
        C3508cda f = u.f();
        String a = u.k().a();
        C3508cda i2 = u.i();
        List<Y> w = u.w();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) w, 10));
        for (Y a2 : w) {
            arrayList.add(Yaa.a(yaa, a2, (C0090b) null, 2, (Object) null));
        }
        return fVar.a(f, a, i2, (List<String>) arrayList, i);
    }

    public static final K b(aa aaVar, Yaa yaa, I i) {
        C7471uYa.b(aaVar, "$this$toFullScreenUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        f fVar = K.a;
        C3508cda f = aaVar.f();
        String a = aaVar.k().a();
        C3508cda i2 = aaVar.i();
        List<Y> E = aaVar.E();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) E, 10));
        for (Y a2 : E) {
            arrayList.add(Yaa.a(yaa, a2, (C0090b) null, 2, (Object) null));
        }
        return fVar.b(f, a, i2, arrayList, i);
    }

    public static final K c(aa aaVar, Yaa yaa, I i) {
        C7471uYa.b(aaVar, "$this$toMuteUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        f fVar = K.a;
        C3508cda f = aaVar.f();
        String a = aaVar.k().a();
        C3508cda i2 = aaVar.i();
        List<Y> F = aaVar.F();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) F, 10));
        for (Y a2 : F) {
            arrayList.add(Yaa.a(yaa, a2, (C0090b) null, 2, (Object) null));
        }
        return fVar.d(f, a, i2, arrayList, i);
    }

    public static final K d(aa aaVar, Yaa yaa, I i) {
        C7471uYa.b(aaVar, "$this$toShrinkUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        f fVar = K.a;
        C3508cda f = aaVar.f();
        String a = aaVar.k().a();
        C3508cda i2 = aaVar.i();
        List<Y> C = aaVar.C();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) C, 10));
        for (Y a2 : C) {
            arrayList.add(Yaa.a(yaa, a2, (C0090b) null, 2, (Object) null));
        }
        return fVar.c(f, a, i2, arrayList, i);
    }

    public static final K e(aa aaVar, Yaa yaa, I i) {
        C7471uYa.b(aaVar, "$this$toUnMuteUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        f fVar = K.a;
        C3508cda f = aaVar.f();
        String a = aaVar.k().a();
        C3508cda i2 = aaVar.i();
        List<Y> H = aaVar.H();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) H, 10));
        for (Y a2 : H) {
            arrayList.add(Yaa.a(yaa, a2, (C0090b) null, 2, (Object) null));
        }
        return fVar.e(f, a, i2, arrayList, i);
    }

    public static final K a(C3693u uVar, Yaa yaa, I i) {
        C7471uYa.b(uVar, "$this$toClickThroughUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        f fVar = K.a;
        C3508cda f = uVar.f();
        String a = uVar.k().a();
        C3508cda i2 = uVar.i();
        List<Y> C = uVar.C();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) C, 10));
        for (Y a2 : C) {
            arrayList.add(Yaa.a(yaa, a2, (C0090b) null, 2, (Object) null));
        }
        return fVar.a(f, a, i2, arrayList, C3689p.a(uVar.A()), C3689p.b(uVar.A()), i);
    }

    public static final K a(C3693u uVar, Yaa yaa, I i, String str) {
        String str2;
        C7471uYa.b(uVar, "$this$toClickThroughUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        C7471uYa.b(str, "clickThroughUrl");
        f fVar = K.a;
        C3508cda f = uVar.f();
        String a = uVar.k().a();
        C3508cda i2 = uVar.i();
        List C = uVar.C();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) C, 10));
        Iterator it = C.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(Yaa.a(yaa, (Y) it.next(), (C0090b) null, 2, (Object) null));
        }
        C3688o A = uVar.A();
        if (A != null) {
            str2 = C3689p.b(A);
        }
        return fVar.a(f, a, i2, arrayList, str, str2, i);
    }

    public static final K a(aa aaVar, Yaa yaa, I i) {
        C7471uYa.b(aaVar, "$this$toClickThroughUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        f fVar = K.a;
        C3508cda f = aaVar.f();
        String a = aaVar.k().a();
        C3508cda i2 = aaVar.i();
        List<Y> A = aaVar.A();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) A, 10));
        for (Y a2 : A) {
            arrayList.add(Yaa.a(yaa, a2, (C0090b) null, 2, (Object) null));
        }
        return fVar.a(f, a, i2, (List<String>) arrayList, aaVar.c(), i);
    }

    public static final K a(X x, Yaa yaa) {
        C7471uYa.b(x, "$this$toClickThroughUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        f fVar = K.a;
        C3508cda f = x.f();
        String a = x.k().a();
        List<Y> g = x.n().g();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) g, 10));
        for (Y a2 : g) {
            arrayList.add(Yaa.a(yaa, a2, (C0090b) null, 2, (Object) null));
        }
        return fVar.b(f, a, (List<String>) arrayList, x.n().c());
    }

    public static final K a(ea eaVar, Yaa yaa) {
        C7471uYa.b(eaVar, "$this$toClickThroughUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        f fVar = K.a;
        C3508cda f = eaVar.f();
        String a = eaVar.k().a();
        List<Y> m = eaVar.m();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) m, 10));
        for (Y a2 : m) {
            arrayList.add(Yaa.a(yaa, a2, (C0090b) null, 2, (Object) null));
        }
        return fVar.c(f, a, (List<String>) arrayList, eaVar.c());
    }

    public static final K a(C3692t tVar, Yaa yaa) {
        C7471uYa.b(tVar, "$this$toClickThroughUIEvent");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        f fVar = K.a;
        C3508cda f = tVar.f();
        String a = tVar.k().a();
        List<Y> n = tVar.n();
        C7471uYa.a((Object) n, "clickUrls()");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) n, 10));
        for (Y y : n) {
            C7471uYa.a((Object) y, "it");
            arrayList.add(Yaa.a(yaa, y, (C0090b) null, 2, (Object) null));
        }
        String m = tVar.m();
        C7471uYa.a((Object) m, "clickThroughUrl()");
        return fVar.a(f, a, (List<String>) arrayList, m);
    }
}
