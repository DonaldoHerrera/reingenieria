package com.soundcloud.android.view.behavior;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.soundcloud.android.ia.i;

/* compiled from: ContentBottomPaddingHelper */
public class b {
    private final f a;

    public b(f fVar) {
        this.a = fVar;
    }

    private void b(int i, e eVar, View view) {
        Object tag = view.getTag(i.content_view_bottom_padded);
        if (tag == null || tag.equals(Boolean.valueOf(false))) {
            int paddingBottom = view.getPaddingBottom() + eVar.a();
            if (tag != null) {
                paddingBottom -= i;
            }
            a(view, paddingBottom, true);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(View view) {
        return view.getId() == i.player_root;
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, View view2, View view3) {
        e a2 = this.a.a(BottomSheetBehavior.b(view2));
        int height = view != null ? view.getHeight() : 0;
        if (a2.b() == 5) {
            a(height, a2, view3);
        } else {
            b(height, a2, view3);
        }
    }

    private void a(int i, e eVar, View view) {
        Object tag = view.getTag(i.content_view_bottom_padded);
        if (tag == null || tag.equals(Boolean.valueOf(true))) {
            int paddingBottom = view.getPaddingBottom() + i;
            if (tag != null) {
                paddingBottom -= eVar.a();
            }
            a(view, paddingBottom, false);
        }
    }

    private void a(View view, int i, boolean z) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
        view.setTag(i.content_view_bottom_padded, Boolean.valueOf(z));
    }
}
