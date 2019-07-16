package defpackage;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0019B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u000e2\u0010\u0010\u0017\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010\u0018H\u0014R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/soundcloud/rx/eventbus/EventSubject;", "T", "Lio/reactivex/subjects/Subject;", "wrappedSubject", "onError", "Lio/reactivex/functions/Consumer;", "", "(Lio/reactivex/subjects/Subject;Lio/reactivex/functions/Consumer;)V", "getThrowable", "hasComplete", "", "hasObservers", "hasThrowable", "onComplete", "", "e", "onNext", "t", "(Ljava/lang/Object;)V", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "subscribeActual", "observer", "Lio/reactivex/Observer;", "Companion", "core"}, mv = {1, 1, 15})
/* renamed from: WLa reason: default package and case insensitive filesystem */
/* compiled from: EventSubject.kt */
public final class C5414WLa<T> extends C6985nVa<T> {
    public static final a a = new a(null);
    private final C6985nVa<T> b;
    private final C6776kQa<Throwable> c;

    /* renamed from: WLa$a */
    /* compiled from: EventSubject.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final <T> C5414WLa<T> a(C6776kQa<Throwable> kqa) {
            C6781kVa s = C6781kVa.s();
            C7471uYa.a((Object) s, "PublishSubject.create()");
            return new C5414WLa<>(s, kqa);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final <T> C5414WLa<T> a(T t, C6776kQa<Throwable> kqa) {
            C6713jVa jva;
            if (t == null) {
                jva = C6713jVa.s();
            } else {
                jva = C6713jVa.f(t);
            }
            C7471uYa.a((Object) jva, "if (defaultValue == null…faultValue)\n            }");
            return new C5414WLa<>(jva, kqa);
        }
    }

    public C5414WLa(C6985nVa<T> nva, C6776kQa<Throwable> kqa) {
        C7471uYa.b(nva, "wrappedSubject");
        this.b = nva;
        this.c = kqa;
    }

    public void a(T t) {
        this.b.a(t);
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.b.c(gPa);
    }

    public void onComplete() {
    }

    public void a(Throwable th) {
        C7471uYa.b(th, "e");
        C6776kQa<Throwable> kqa = this.c;
        if (kqa != null) {
            kqa.accept(th);
        }
    }

    public void a(VPa vPa) {
        C7471uYa.b(vPa, "d");
        this.b.a(vPa);
    }
}
