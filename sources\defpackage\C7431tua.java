package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

@EVa(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\tB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/soundcloud/android/rx/MapFirstEmissionOperator;", "T", "Lio/reactivex/ObservableOperator;", "mapper", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "apply", "Lio/reactivex/Observer;", "child", "MapFirstEmissionObserver", "rx-utils"}, mv = {1, 1, 15})
/* renamed from: tua reason: default package and case insensitive filesystem */
/* compiled from: Operators.kt */
public final class C7431tua<T> implements DPa<T, T> {
    /* access modifiers changed from: private */
    public final _Xa<T, T> a;

    /* renamed from: tua$a */
    /* compiled from: Operators.kt */
    public final class a implements GPa<T> {
        private final AtomicInteger a = new AtomicInteger(0);
        private final GPa<? super T> b;
        final /* synthetic */ C7431tua c;

        public a(C7431tua tua, GPa<? super T> gPa) {
            C7471uYa.b(gPa, "child");
            this.c = tua;
            this.b = gPa;
        }

        public void a(T t) {
            if (this.a.getAndIncrement() == 0) {
                this.b.a(this.c.a.invoke(t));
            } else {
                this.b.a(t);
            }
        }

        public void onComplete() {
            this.b.onComplete();
        }

        public void a(VPa vPa) {
            C7471uYa.b(vPa, "d");
            this.b.a(vPa);
        }

        public void a(Throwable th) {
            C7471uYa.b(th, "e");
            this.b.a(th);
        }
    }

    public C7431tua(_Xa<? super T, ? extends T> _xa) {
        C7471uYa.b(_xa, "mapper");
        this.a = _xa;
    }

    public GPa<? super T> a(GPa<? super T> gPa) {
        C7471uYa.b(gPa, "child");
        return new a(this, gPa);
    }
}
