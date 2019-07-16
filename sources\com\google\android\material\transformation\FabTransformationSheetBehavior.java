package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> g;

    public FabTransformationSheetBehavior() {
    }

    /* access modifiers changed from: protected */
    public a a(Context context, boolean z) {
        int i;
        if (z) {
            i = C1741tz.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C1741tz.mtrl_fab_transformation_sheet_collapse_spec;
        }
        a aVar = new a();
        aVar.a = Lz.a(context, i);
        aVar.b = new Nz(17, 0.0f, 0.0f);
        return aVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, View view2, boolean z, boolean z2) {
        a(view2, z);
        return super.a(view, view2, z, z2);
    }

    private void a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.g = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof d) && (((d) childAt.getLayoutParams()).d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.g;
                        if (map != null && map.containsKey(childAt)) {
                            C1778vc.f(childAt, ((Integer) this.g.get(childAt)).intValue());
                        }
                    } else {
                        if (VERSION.SDK_INT >= 16) {
                            this.g.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C1778vc.f(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.g = null;
            }
        }
    }
}
