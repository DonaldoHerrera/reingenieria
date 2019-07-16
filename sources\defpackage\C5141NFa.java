package defpackage;

import java.util.Map;

/* renamed from: NFa reason: default package and case insensitive filesystem */
/* compiled from: UserItemRepository.kt */
public class C5141NFa {
    private final C3792iea a;
    private final C3360xR b;
    private final C5425Wta c;

    public C5141NFa(C3792iea iea, C3360xR xRVar, C5425Wta wta) {
        C7471uYa.b(iea, "userRepository");
        C7471uYa.b(xRVar, "followingStateProvider");
        C7471uYa.b(wta, "entityItemCreator");
        this.a = iea;
        this.b = xRVar;
        this.c = wta;
    }

    public C5425Wta a() {
        return this.c;
    }

    public C3360xR b() {
        return this.b;
    }

    public C3792iea c() {
        return this.a;
    }

    public C7531vPa<C4954HFa> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        YUa yUa = YUa.a;
        C7531vPa a2 = c().a(cda);
        C7531vPa f = b().a().f();
        C7471uYa.a((Object) f, "followingStateProvider.f…Statuses().firstElement()");
        C7531vPa<C4954HFa> a3 = C7531vPa.a((C7669xPa<? extends T1>) a2, (C7669xPa<? extends T2>) f, (C6504gQa<? super T1, ? super T2, ? extends R>) new C5016JFa<Object,Object,Object>(this));
        C7471uYa.a((Object) a3, "Maybe.zip(s1, s2, BiFunc…-> zipper.invoke(t, u) })");
        return a3;
    }

    public C7531vPa<C4954HFa> b(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        YUa yUa = YUa.a;
        C7531vPa b2 = c().b(cda);
        C7531vPa f = b().a().f();
        C7471uYa.a((Object) f, "followingStateProvider.f…Statuses().firstElement()");
        C7531vPa<C4954HFa> a2 = C7531vPa.a((C7669xPa<? extends T1>) b2, (C7669xPa<? extends T2>) f, (C6504gQa<? super T1, ? super T2, ? extends R>) new C5048KFa<Object,Object,Object>(this));
        C7471uYa.a((Object) a2, "Maybe.zip(s1, s2, BiFunc…-> zipper.invoke(t, u) })");
        return a2;
    }

    public APa<Map<C3508cda, C4954HFa>> a(Iterable<C3508cda> iterable) {
        C7471uYa.b(iterable, "userUrns");
        _Ua _ua = _Ua.a;
        APa<Map<C3508cda, C4954HFa>> a2 = APa.a((EPa<? extends T1>) c().a(C7676xWa.q(iterable)), (EPa<? extends T2>) b().a(), (C6504gQa<? super T1, ? super T2, ? extends R>) new C4985IFa<Object,Object,Object>(this));
        C7471uYa.a((Object) a2, "Observables.combineLates…teBy { it.urn }\n        }");
        return a2;
    }
}
