package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: Bl reason: default package */
/* compiled from: TapTargetView */
class Bl implements OnLongClickListener {
    final /* synthetic */ Nl a;

    Bl(Nl nl) {
        this.a = nl;
    }

    public boolean onLongClick(View view) {
        Nl nl = this.a;
        if (nl.ha == null || !nl.r.contains((int) nl.ca, (int) nl.da)) {
            return false;
        }
        Nl nl2 = this.a;
        nl2.ha.d(nl2);
        return true;
    }
}
