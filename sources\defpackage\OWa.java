package defpackage;

/* renamed from: OWa reason: default package */
/* compiled from: SlidingWindow.kt */
public final class OWa extends XVa<T> {
    private int c;
    private int d;
    final /* synthetic */ PWa e;

    OWa(PWa pWa) {
        this.e = pWa;
        this.c = pWa.size();
        this.d = pWa.c;
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (this.c == 0) {
            b();
            return;
        }
        b(this.e.b[this.d]);
        this.d = (this.d + 1) % this.e.g();
        this.c--;
    }
}
