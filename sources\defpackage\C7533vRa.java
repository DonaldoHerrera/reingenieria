package defpackage;

/* renamed from: vRa reason: default package and case insensitive filesystem */
/* compiled from: FlowableFromObservable */
public final class C7533vRa<T> extends C7393tPa<T> {
    private final APa<T> b;

    /* renamed from: vRa$a */
    /* compiled from: FlowableFromObservable */
    static final class a<T> implements GPa<T>, C5619bBb {
        final C5551aBb<? super T> a;
        VPa b;

        a(C5551aBb<? super T> abb) {
            this.a = abb;
        }

        public void a(long j) {
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public void cancel() {
            this.b.dispose();
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void a(T t) {
            this.a.a(t);
        }

        public void a(VPa vPa) {
            this.b = vPa;
            this.a.a((C5619bBb) this);
        }
    }

    public C7533vRa(APa<T> aPa) {
        this.b = aPa;
    }

    /* access modifiers changed from: protected */
    public void b(C5551aBb<? super T> abb) {
        this.b.a((GPa<? super T>) new a<Object>(abb));
    }
}
