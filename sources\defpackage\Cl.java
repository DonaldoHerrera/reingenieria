package defpackage;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: Cl reason: default package */
/* compiled from: TapTargetView */
class Cl extends ViewOutlineProvider {
    final /* synthetic */ Nl a;

    Cl(Nl nl) {
        this.a = nl;
    }

    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        Nl nl = this.a;
        int[] iArr = nl.R;
        if (iArr != null) {
            float f = (float) iArr[0];
            float f2 = nl.P;
            outline.setOval((int) (f - f2), (int) (((float) iArr[1]) - f2), (int) (((float) iArr[0]) + f2), (int) (((float) iArr[1]) + f2));
            outline.setAlpha(((float) this.a.S) / 255.0f);
            if (VERSION.SDK_INT >= 22) {
                outline.offset(0, this.a.m);
            }
        }
    }
}
