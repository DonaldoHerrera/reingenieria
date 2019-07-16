package defpackage;

/* renamed from: sB reason: default package and case insensitive filesystem */
public abstract class C1684sB implements Runnable {
    private final YB<?> a;

    C1684sB() {
        this.a = null;
    }

    public C1684sB(YB<?> yb) {
        this.a = yb;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: 0000 */
    public final YB<?> b() {
        return this.a;
    }

    public final void run() {
        try {
            a();
        } catch (Exception e) {
            YB<?> yb = this.a;
            if (yb != null) {
                yb.a(e);
            }
        }
    }
}
