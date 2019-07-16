package defpackage;

/* renamed from: Lm reason: default package */
/* compiled from: Buffer */
public abstract class Lm {
    private int a;

    public void b() {
        this.a = 0;
    }

    public final boolean c() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean d() {
        return d(4);
    }

    public final boolean e() {
        return d(1);
    }

    public final void b(int i) {
        this.a = i | this.a;
    }

    public final void c(int i) {
        this.a = (~i) & this.a;
    }

    /* access modifiers changed from: protected */
    public final boolean d(int i) {
        return (this.a & i) == i;
    }

    public final void e(int i) {
        this.a = i;
    }
}
