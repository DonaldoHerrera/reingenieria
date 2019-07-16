package defpackage;

@EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00030\u000bH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/uniflow/UniflowBaseView;", "ViewModel", "ErrorType", "InitialParams", "RefreshParams", "", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "nextPageSignal", "Lio/reactivex/Observable;", "onRefreshed", "refreshSignal", "requestContent", "uniflow-core"}, mv = {1, 1, 15})
/* renamed from: yEa reason: default package and case insensitive filesystem */
/* compiled from: PagedTransformingPresenter.kt */
public interface C7727yEa<ViewModel, ErrorType, InitialParams, RefreshParams> {

    /* renamed from: yEa$a */
    /* compiled from: PagedTransformingPresenter.kt */
    public static final class a {
        public static <ViewModel, ErrorType, InitialParams, RefreshParams> APa<RVa> a(C7727yEa<ViewModel, ErrorType, InitialParams, RefreshParams> yea) {
            APa<RVa> e = APa.e();
            C7471uYa.a((Object) e, "Observable.empty<Unit>()");
            return e;
        }
    }

    void a(C6832lEa<ViewModel, ErrorType> lea);

    void b();

    APa<InitialParams> c();

    APa<RVa> e();

    APa<RefreshParams> f();
}
