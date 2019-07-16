package defpackage;

/* renamed from: Jyb reason: default package */
/* compiled from: NamedRunnable */
public abstract class Jyb implements Runnable {
    protected final String a;

    public Jyb(String str, Object... objArr) {
        this.a = Kyb.a(str, objArr);
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
