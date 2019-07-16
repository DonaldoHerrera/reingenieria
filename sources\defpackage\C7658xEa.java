package defpackage;

import defpackage.C7727yEa;

/* renamed from: xEa reason: default package and case insensitive filesystem */
/* compiled from: SimplePresenter.kt */
public abstract class C7658xEa<ViewModel, ErrorType, Params, RefreshParams, View extends C7727yEa<ViewModel, ErrorType, Params, RefreshParams>> extends C7037oEa<ViewModel, ViewModel, ErrorType, Params, RefreshParams, View> {
    private final HPa k;

    public C7658xEa(HPa hPa) {
        C7471uYa.b(hPa, "mainThread");
        super(hPa);
        this.k = hPa;
    }

    /* access modifiers changed from: protected */
    public APa<ViewModel> a(ViewModel viewmodel) {
        C7471uYa.b(viewmodel, "domainModel");
        APa<ViewModel> c = APa.c(viewmodel);
        C7471uYa.a((Object) c, "Observable.just(domainModel)");
        return c;
    }

    /* access modifiers changed from: protected */
    public APa<d<ErrorType, ViewModel>> b(Params params) {
        return d(params);
    }

    /* access modifiers changed from: protected */
    public APa<d<ErrorType, ViewModel>> c(RefreshParams refreshparams) {
        return e(refreshparams);
    }

    public abstract APa<d<ErrorType, ViewModel>> d(Params params);

    public abstract APa<d<ErrorType, ViewModel>> e(RefreshParams refreshparams);
}
