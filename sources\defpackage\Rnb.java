package defpackage;

/* renamed from: Rnb reason: default package */
/* compiled from: LazyFieldLite */
public class Rnb {
    private Fnb a;
    private Inb b;
    private volatile boolean c;
    protected volatile Wnb d;

    public int a() {
        if (this.c) {
            return this.d.c();
        }
        return this.a.size();
    }

    public Wnb b(Wnb wnb) {
        a(wnb);
        return this.d;
    }

    public Wnb c(Wnb wnb) {
        Wnb wnb2 = this.d;
        this.d = wnb;
        this.a = null;
        this.c = true;
        return wnb2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(1:12)(1:13)|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0023 */
    public void a(Wnb wnb) {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    if (this.a != null) {
                        this.d = (Wnb) wnb.e().a(this.a, this.b);
                    } else {
                        this.d = wnb;
                    }
                }
            }
        }
    }
}
