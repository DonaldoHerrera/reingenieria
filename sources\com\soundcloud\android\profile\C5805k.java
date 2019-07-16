package com.soundcloud.android.profile;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.utilities.android.MultiSwipeRefreshLayout;

/* renamed from: com.soundcloud.android.profile.k reason: case insensitive filesystem */
/* compiled from: BaseScrollableProfile.kt */
public final class C5805k {
    private Integer a;
    private Boolean b;

    public final MultiSwipeRefreshLayout a(View view) {
        MultiSwipeRefreshLayout multiSwipeRefreshLayout = view != null ? (MultiSwipeRefreshLayout) view.findViewById(i.str_layout) : null;
        if (!(multiSwipeRefreshLayout instanceof MultiSwipeRefreshLayout)) {
            return null;
        }
        return multiSwipeRefreshLayout;
    }

    public final void b(View view) {
        Integer num = this.a;
        if (num != null) {
            a(view, num);
            this.a = null;
        }
        Boolean bool = this.b;
        if (bool != null) {
            a(view, bool);
            this.a = null;
        }
    }

    public final void a(View view, Integer num) {
        if (view == null || num == null) {
            this.a = num;
            return;
        }
        View findViewById = view.findViewById(16908292);
        if (findViewById != null) {
            LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = num.intValue();
            }
        }
        if (findViewById != null) {
            findViewById.requestLayout();
        }
    }

    public final void a(View view, Boolean bool) {
        if (view == null || bool == null) {
            this.b = bool;
            return;
        }
        MultiSwipeRefreshLayout a2 = a(view);
        if (a2 != null) {
            a2.setEnabled(bool.booleanValue());
        }
    }
}
