package defpackage;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/soundcloud/android/rx/observers/LambdaCompletableObserver;", "Lcom/soundcloud/android/rx/observers/DefaultCompletableObserver;", "action", "Lio/reactivex/functions/Action;", "(Lio/reactivex/functions/Action;)V", "onComplete", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: Mua reason: default package and case insensitive filesystem */
/* compiled from: LambdaCompletableObserver.kt */
public final class C5130Mua extends C4943Gua {
    public static final a d = new a(null);
    private final C6368eQa e;

    /* renamed from: Mua$a */
    /* compiled from: LambdaCompletableObserver.kt */
    public static final class a {
        private a() {
        }

        public final C5130Mua a(PXa<RVa> pXa) {
            C7471uYa.b(pXa, "action");
            return new C5130Mua(new C5160Nua(pXa), null);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    private C5130Mua(C6368eQa eqa) {
        this.e = eqa;
    }

    public void onComplete() {
        this.e.run();
        super.onComplete();
    }

    public /* synthetic */ C5130Mua(C6368eQa eqa, C7264rYa rya) {
        this(eqa);
    }
}
