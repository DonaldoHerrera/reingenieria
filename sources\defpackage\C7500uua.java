package defpackage;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\nB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\b2\u0010\b\u0001\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\bH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/rx/ObservableDoOnFirst;", "T", "Lio/reactivex/ObservableOperator;", "onFirst", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "apply", "Lio/reactivex/Observer;", "observer", "DoOnEmptySubscriber", "rx-utils"}, mv = {1, 1, 15})
/* renamed from: uua reason: default package and case insensitive filesystem */
/* compiled from: ObservableDoOnFirst.kt */
public final class C7500uua<T> implements DPa<T, T> {
    private final _Xa<T, RVa> a;

    /* renamed from: uua$a */
    /* compiled from: ObservableDoOnFirst.kt */
    private static final class a<T> implements GPa<T> {
        private final GPa<? super T> a;
        private final _Xa<T, RVa> b;
        private boolean c;

        public a(GPa<? super T> gPa, _Xa<? super T, RVa> _xa, boolean z) {
            C7471uYa.b(gPa, "child");
            C7471uYa.b(_xa, "onFirst");
            this.a = gPa;
            this.b = _xa;
            this.c = z;
        }

        public void a(VPa vPa) {
            C7471uYa.b(vPa, "d");
            this.a.a(vPa);
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public /* synthetic */ a(GPa gPa, _Xa _xa, boolean z, int i, C7264rYa rya) {
            if ((i & 4) != 0) {
                z = false;
            }
            this(gPa, _xa, z);
        }

        public void a(T t) {
            if (!this.c) {
                this.c = true;
                try {
                    this.b.invoke(t);
                } catch (Throwable th) {
                    _Pa.b(th);
                    a(th);
                    return;
                }
            }
            this.a.a(t);
        }

        public void a(Throwable th) {
            C7471uYa.b(th, "e");
            this.a.a(th);
        }
    }

    public C7500uua(_Xa<? super T, RVa> _xa) {
        C7471uYa.b(_xa, "onFirst");
        this.a = _xa;
    }

    public GPa<? super T> a(GPa<? super T> gPa) {
        C7471uYa.b(gPa, "observer");
        a aVar = new a(gPa, this.a, false, 4, null);
        return aVar;
    }
}
