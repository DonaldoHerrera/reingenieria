package defpackage;

/* renamed from: lOa reason: default package and case insensitive filesystem */
/* compiled from: RetryState */
public class C6842lOa {
    private final int a;
    private final C6570hOa b;
    private final C6774kOa c;

    public C6842lOa(C6570hOa hoa, C6774kOa koa) {
        this(0, hoa, koa);
    }

    public long a() {
        return this.b.a(this.a);
    }

    public C6842lOa b() {
        return new C6842lOa(this.b, this.c);
    }

    public C6842lOa c() {
        return new C6842lOa(this.a + 1, this.b, this.c);
    }

    public C6842lOa(int i, C6570hOa hoa, C6774kOa koa) {
        this.a = i;
        this.b = hoa;
        this.c = koa;
    }
}
