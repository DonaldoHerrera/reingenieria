package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.A;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior.a;

/* compiled from: BottomSheetDialog */
public class h extends A {
    private BottomSheetBehavior<FrameLayout> c;
    boolean d = true;
    private boolean e = true;
    private boolean f;
    private a g = new g(this);

    public h(Context context, int i) {
        super(context, b(context, i));
        a(1);
    }

    private View a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), Az.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(C1891yz.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(C1891yz.design_bottom_sheet);
        this.c = BottomSheetBehavior.b(frameLayout2);
        this.c.a(this.g);
        this.c.b(this.d);
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C1891yz.touch_outside).setOnClickListener(new d(this));
        C1778vc.a((View) frameLayout2, (C0273Wb) new e(this));
        frameLayout2.setOnTouchListener(new f(this));
        return frameLayout;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        if (!this.f) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.e = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f = true;
        }
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.c;
        if (bottomSheetBehavior != null && bottomSheetBehavior.c() == 5) {
            this.c.c(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.d != z) {
            this.d = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.b(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.d) {
            this.d = true;
        }
        this.e = z;
        this.f = true;
    }

    public void setContentView(int i) {
        super.setContentView(a(i, null, null));
    }

    public void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    private static int b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C1771uz.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return Cz.Theme_Design_Light_BottomSheetDialog;
    }
}
