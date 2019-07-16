package com.soundcloud.android.view;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.i;

/* renamed from: com.soundcloud.android.view.t reason: case insensitive filesystem */
/* compiled from: CustomBottomSheetDialogFragment.kt */
public abstract class C6230t extends i {
    private final void a(View view) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        BottomSheetBehavior b = BottomSheetBehavior.b((View) parent);
        C7471uYa.a((Object) b, "BottomSheetBehavior.from(it)");
        Resources resources = getResources();
        C7471uYa.a((Object) resources, "resources");
        b.b(resources.getDisplayMetrics().heightPixels / 2);
    }

    public abstract int Qb();

    public void setupDialog(Dialog dialog, int i) {
        C7471uYa.b(dialog, "dialog");
        super.setupDialog(dialog, i);
        View inflate = View.inflate(getContext(), Qb(), null);
        dialog.setContentView(inflate);
        C7471uYa.a((Object) inflate, "view");
        a(inflate);
    }
}
