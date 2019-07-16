package defpackage;

import defpackage.C7727yEa;

/* renamed from: wEa reason: default package and case insensitive filesystem */
/* compiled from: PagingPresenter.kt */
public abstract class C7589wEa<ViewModel, ErrorType, InitialParams, RefreshParams, View extends C7727yEa<ViewModel, ErrorType, InitialParams, RefreshParams>> extends C7037oEa<ViewModel, ViewModel, ErrorType, InitialParams, RefreshParams, View> {
    private final HPa k;

    public C7589wEa(HPa hPa) {
        C7471uYa.b(hPa, "thread");
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
}
