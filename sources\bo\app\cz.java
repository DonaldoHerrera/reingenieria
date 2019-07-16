package bo.app;

public abstract class cz<T> {
    private static final String a = Hg.a(cz.class);
    private final Object b = new Object();
    private boolean c = false;

    /* access modifiers changed from: 0000 */
    public abstract T a();

    /* access modifiers changed from: 0000 */
    public abstract void a(T t, boolean z);

    public T b() {
        synchronized (this.b) {
            if (this.c) {
                Hg.a(a, "Received call to export dirty object, but the cache was already locked.");
                return null;
            }
            this.c = true;
            T a2 = a();
            return a2;
        }
    }

    public boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.c;
        }
        return z;
    }

    public boolean b(T t, boolean z) {
        synchronized (this.b) {
            if (!this.c) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Tried to confirm outboundObject [");
                sb.append(t);
                sb.append("] with success [");
                sb.append(z);
                sb.append("], but the cache wasn't locked, so not doing anything.");
                Hg.e(str, sb.toString());
                return false;
            }
            a(t, z);
            this.c = false;
            synchronized (this) {
                Hg.c(a, "Notifying confirmAndUnlock listeners");
                notifyAll();
            }
            return true;
        }
    }
}
