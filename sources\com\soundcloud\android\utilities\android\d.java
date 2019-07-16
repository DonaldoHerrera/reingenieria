package com.soundcloud.android.utilities.android;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.constraintlayout.widget.Group;

/* compiled from: ConstraintLayoutExtensions.kt */
final class d implements OnClickListener {
    final /* synthetic */ Group a;
    final /* synthetic */ PXa b;

    d(Group group, PXa pXa) {
        this.a = group;
        this.b = pXa;
    }

    public final void onClick(View view) {
        this.b.d();
    }
}
