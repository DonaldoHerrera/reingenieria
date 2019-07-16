package defpackage;

import android.graphics.Path;
import android.graphics.Path.Direction;

/* renamed from: Dl reason: default package */
/* compiled from: TapTargetView */
class Dl implements b {
    final /* synthetic */ Nl a;

    Dl(Nl nl) {
        this.a = nl;
    }

    public void a(float f) {
        Nl nl = this.a;
        float f2 = ((float) nl.Q) * f;
        boolean z = f2 > nl.P;
        if (!z) {
            this.a.b();
        }
        Nl nl2 = this.a;
        float f3 = nl2.q.c * 255.0f;
        nl2.P = f2;
        float f4 = 1.5f * f;
        nl2.S = (int) Math.min(f3, f4 * f3);
        this.a.O.reset();
        Nl nl3 = this.a;
        Path path = nl3.O;
        int[] iArr = nl3.R;
        path.addCircle((float) iArr[0], (float) iArr[1], nl3.P, Direction.CW);
        this.a.W = (int) Math.min(255.0f, f4 * 255.0f);
        if (z) {
            Nl nl4 = this.a;
            nl4.V = ((float) nl4.e) * Math.min(1.0f, f4);
        } else {
            Nl nl5 = this.a;
            nl5.V = ((float) nl5.e) * f;
            nl5.T *= f;
        }
        Nl nl6 = this.a;
        nl6.aa = (int) (nl6.a(f, 0.7f) * 255.0f);
        if (z) {
            this.a.b();
        }
        Nl nl7 = this.a;
        nl7.a(nl7.M);
    }
}
