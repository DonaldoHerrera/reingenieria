package defpackage;

/* renamed from: th reason: default package and case insensitive filesystem */
/* compiled from: RetryManager */
class C1723th {
    long a;
    private C6842lOa b;

    public C1723th(C6842lOa loa) {
        if (loa != null) {
            this.b = loa;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    public boolean a(long j) {
        return j - this.a >= this.b.a() * 1000000;
    }

    public void b(long j) {
        this.a = j;
        this.b = this.b.c();
    }

    public void a() {
        this.a = 0;
        this.b = this.b.b();
    }
}
