package defpackage;

/* renamed from: BN reason: default package and case insensitive filesystem */
/* compiled from: DevTrackingRecordsProvider */
public class C1953BN {
    private final W<C2110JM> a = new W<>();
    private final C6713jVa<a> b = C6713jVa.f(a.DEFAULT);

    /* renamed from: BN$a */
    /* compiled from: DevTrackingRecordsProvider */
    public enum a {
        DEFAULT,
        ADD,
        DELETE_ALL
    }

    C1953BN() {
    }

    /* access modifiers changed from: 0000 */
    public void a(C2110JM jm) {
        if (this.a.b() == 50) {
            this.a.b(1);
        }
        this.a.a(jm);
        this.b.a(a.ADD);
    }

    public void b() {
        this.a.a();
        this.b.a(a.DELETE_ALL);
    }

    public W<C2110JM> c() {
        return this.a;
    }

    public APa<a> a() {
        return this.b;
    }
}
