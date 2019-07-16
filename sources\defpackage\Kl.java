package defpackage;

import android.graphics.Path;
import android.graphics.Path.Direction;

/* renamed from: Kl reason: default package */
/* compiled from: TapTargetView */
class Kl implements b {
    final /* synthetic */ Nl a;

    Kl(Nl nl) {
        this.a = nl;
    }

    public void a(float f) {
        float min = Math.min(1.0f, 2.0f * f);
        Nl nl = this.a;
        nl.P = ((float) nl.Q) * ((0.2f * min) + 1.0f);
        float f2 = 1.0f - min;
        nl.S = (int) (nl.q.c * f2 * 255.0f);
        nl.O.reset();
        Nl nl2 = this.a;
        Path path = nl2.O;
        int[] iArr = nl2.R;
        path.addCircle((float) iArr[0], (float) iArr[1], nl2.P, Direction.CW);
        Nl nl3 = this.a;
        float f3 = 1.0f - f;
        int i = nl3.e;
        nl3.V = ((float) i) * f3;
        nl3.W = (int) (f3 * 255.0f);
        nl3.T = (f + 1.0f) * ((float) i);
        nl3.U = (int) (f3 * ((float) nl3.U));
        nl3.aa = (int) (f2 * 255.0f);
        nl3.b();
        Nl nl4 = this.a;
        nl4.a(nl4.M);
    }
}
