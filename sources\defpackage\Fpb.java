package defpackage;

/* renamed from: Fpb reason: default package */
/* compiled from: CapturedTypeConstructor.kt */
public final class Fpb extends C6539gtb {
    final /* synthetic */ Wtb d;
    final /* synthetic */ boolean e;

    Fpb(Wtb wtb, boolean z, Wtb wtb2) {
        this.d = wtb;
        this.e = z;
        super(wtb2);
    }

    public Stb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "key");
        Stb a = super.a(xtb);
        if (a == null) {
            return null;
        }
        C5122Mcb c = xtb.za().c();
        if (!(c instanceof C4905Fdb)) {
            c = null;
        }
        return Gpb.b(a, (C4905Fdb) c);
    }

    public boolean b() {
        return this.e;
    }
}
