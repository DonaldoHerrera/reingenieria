package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.view.View;

/* compiled from: ItemTouchUIUtilImpl */
class J implements I {
    static final I a = new J();

    J() {
    }

    public void a(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (VERSION.SDK_INT >= 21 && z && view.getTag(Id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(C1778vc.h(view));
            C1778vc.a(view, a(recyclerView, view) + 1.0f);
            view.setTag(Id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public void b(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    public void b(View view) {
    }

    private static float a(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float h = C1778vc.h(childAt);
                if (h > f) {
                    f = h;
                }
            }
        }
        return f;
    }

    public void a(View view) {
        if (VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(Id.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                C1778vc.a(view, ((Float) tag).floatValue());
            }
            view.setTag(Id.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}
