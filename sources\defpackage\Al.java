package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: Al reason: default package */
/* compiled from: TapTargetView */
class Al implements OnClickListener {
    final /* synthetic */ Nl a;

    Al(Nl nl) {
        this.a = nl;
    }

    public void onClick(View view) {
        Nl nl = this.a;
        if (nl.ha != null && nl.R != null && nl.c) {
            Nl nl2 = this.a;
            int centerX = nl2.r.centerX();
            int centerY = this.a.r.centerY();
            Nl nl3 = this.a;
            double a2 = nl2.a(centerX, centerY, (int) nl3.ca, (int) nl3.da);
            boolean z = true;
            boolean z2 = a2 <= ((double) this.a.V);
            Nl nl4 = this.a;
            int[] iArr = nl4.R;
            if (nl4.a(iArr[0], iArr[1], (int) nl4.ca, (int) nl4.da) > ((double) this.a.P)) {
                z = false;
            }
            if (z2) {
                this.a.c = false;
                Nl nl5 = this.a;
                nl5.ha.c(nl5);
            } else if (z) {
                Nl nl6 = this.a;
                nl6.ha.a(nl6);
            } else {
                Nl nl7 = this.a;
                if (nl7.G) {
                    nl7.c = false;
                    Nl nl8 = this.a;
                    nl8.ha.b(nl8);
                }
            }
        }
    }
}
