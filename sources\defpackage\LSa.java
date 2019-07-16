package defpackage;

/* renamed from: LSa reason: default package */
/* compiled from: ObservableFromPublisher */
public final class LSa<T> extends APa<T> {
    final _Ab<? extends T> a;

    /* renamed from: LSa$a */
    /* compiled from: ObservableFromPublisher */
    static final class a<T> implements C7462uPa<T>, VPa {
        final GPa<? super T> a;
        C5619bBb b;

        a(GPa<? super T> gPa) {
            this.a = gPa;
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public void dispose() {
            this.b.cancel();
            this.b = C7605wUa.CANCELLED;
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void a(T t) {
            this.a.a(t);
        }

        public void a(C5619bBb bbb) {
            if (C7605wUa.a(this.b, bbb)) {
                this.b = bbb;
                this.a.a((VPa) this);
                bbb.a(Long.MAX_VALUE);
            }
        }

        public boolean a() {
            return this.b == C7605wUa.CANCELLED;
        }
    }

    public LSa(_Ab<? extends T> _ab) {
        this.a = _ab;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa));
    }
}
