package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: BottomSheetDialog */
class d implements OnClickListener {
    final /* synthetic */ h a;

    d(h hVar) {
        this.a = hVar;
    }

    public void onClick(View view) {
        h hVar = this.a;
        if (hVar.d && hVar.isShowing() && this.a.b()) {
            this.a.cancel();
        }
    }
}
