package defpackage;

/* renamed from: Kub reason: default package */
/* compiled from: CapturedTypeApproximation.kt */
public final class Kub extends Rtb {
    Kub() {
    }

    public Stb a(Ptb ptb) {
        C7471uYa.b(ptb, "key");
        if (!(ptb instanceof Cpb)) {
            ptb = null;
        }
        Cpb cpb = (Cpb) ptb;
        if (cpb == null) {
            return null;
        }
        if (cpb.a().a()) {
            return new Utb(C6473fub.OUT_VARIANCE, cpb.a().getType());
        }
        return cpb.a();
    }
}
