package defpackage;

import java.util.Map;

/* renamed from: Qtb reason: default package */
/* compiled from: TypeSubstitution.kt */
public final class Qtb extends Rtb {
    final /* synthetic */ Map d;
    final /* synthetic */ boolean e;

    Qtb(Map map, boolean z) {
        this.d = map;
        this.e = z;
    }

    public Stb a(Ptb ptb) {
        C7471uYa.b(ptb, "key");
        return (Stb) this.d.get(ptb);
    }

    public boolean d() {
        return this.d.isEmpty();
    }

    public boolean a() {
        return this.e;
    }
}
