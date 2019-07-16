package defpackage;

/* renamed from: MB reason: default package */
final class MB implements Runnable {
    private final /* synthetic */ EB a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ NB d;

    MB(NB nb, EB eb, int i, int i2) {
        this.d = nb;
        this.a = eb;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        this.d.a(this.a.a(this.b, this.c));
    }
}
