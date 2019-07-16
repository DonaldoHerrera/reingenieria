package com.google.android.material.bottomsheet;

import android.os.Bundle;
import android.view.View;

/* compiled from: BottomSheetDialog */
class e extends C0273Wb {
    final /* synthetic */ h d;

    e(h hVar) {
        this.d = hVar;
    }

    public void a(View view, Mc mc) {
        super.a(view, mc);
        if (this.d.d) {
            mc.a(1048576);
            mc.g(true);
            return;
        }
        mc.g(false);
    }

    public boolean a(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            h hVar = this.d;
            if (hVar.d) {
                hVar.cancel();
                return true;
            }
        }
        return super.a(view, i, bundle);
    }
}
