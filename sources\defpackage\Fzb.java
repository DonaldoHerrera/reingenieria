package defpackage;

/* renamed from: Fzb reason: default package */
/* compiled from: Http2Connection */
class Fzb extends Jyb {
    final /* synthetic */ int b;
    final /* synthetic */ C7649wzb c;
    final /* synthetic */ Gzb d;

    Fzb(Gzb gzb, String str, Object[] objArr, int i, C7649wzb wzb) {
        this.d = gzb;
        this.b = i;
        this.c = wzb;
        super(str, objArr);
    }

    public void b() {
        this.d.k.a(this.b, this.c);
        synchronized (this.d) {
            this.d.u.remove(Integer.valueOf(this.b));
        }
    }
}
