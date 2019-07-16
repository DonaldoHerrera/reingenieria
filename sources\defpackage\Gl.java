package defpackage;

/* renamed from: Gl reason: default package */
/* compiled from: TapTargetView */
class Gl implements b {
    final /* synthetic */ Nl a;

    Gl(Nl nl) {
        this.a = nl;
    }

    public void a(float f) {
        float a2 = this.a.a(f, 0.5f);
        Nl nl = this.a;
        float f2 = a2 + 1.0f;
        int i = nl.e;
        nl.T = f2 * ((float) i);
        nl.U = (int) ((1.0f - a2) * 255.0f);
        float f3 = (float) i;
        float a3 = nl.a(f);
        Nl nl2 = this.a;
        nl.V = f3 + (a3 * ((float) nl2.f));
        float f4 = nl2.P;
        int i2 = nl2.Q;
        if (f4 != ((float) i2)) {
            nl2.P = (float) i2;
        }
        this.a.b();
        Nl nl3 = this.a;
        nl3.a(nl3.M);
    }
}
