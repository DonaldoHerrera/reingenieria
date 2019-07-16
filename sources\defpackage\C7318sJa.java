package defpackage;

import defpackage.C7727yEa;

/* renamed from: sJa reason: default package and case insensitive filesystem */
/* compiled from: LegacySimplePresenter.kt */
public abstract class C7318sJa<ViewModel, Params, RefreshParams, View extends C7727yEa<ViewModel, C6973nJa, Params, RefreshParams>> extends C7658xEa<ViewModel, C6973nJa, Params, RefreshParams, View> {
    public C7318sJa(HPa hPa) {
        C7471uYa.b(hPa, "mainThread");
        super(hPa);
    }

    public APa<d<C6973nJa, ViewModel>> d(Params params) {
        APa<d<C6973nJa, ViewModel>> i = f(params).h(C7042oJa.a).i(C7111pJa.a);
        C7471uYa.a((Object) i, "legacyLoad(pageParams).m…         }\n\n            }");
        return i;
    }

    public APa<d<C6973nJa, ViewModel>> e(RefreshParams refreshparams) {
        APa<d<C6973nJa, ViewModel>> i = g(refreshparams).h(C7180qJa.a).i(C7249rJa.a);
        C7471uYa.a((Object) i, "legacyRefresh(pageParams…          }\n            }");
        return i;
    }

    public abstract APa<ViewModel> f(Params params);

    public abstract APa<ViewModel> g(RefreshParams refreshparams);
}
