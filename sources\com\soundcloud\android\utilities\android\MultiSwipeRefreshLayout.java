package com.soundcloud.android.utilities.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MultiSwipeRefreshLayout extends SwipeRefreshLayout {
    private View[] Q;
    private boolean R;
    private boolean S;

    public MultiSwipeRefreshLayout(Context context) {
        super(context);
    }

    public boolean a() {
        View[] viewArr = this.Q;
        if (viewArr != null && viewArr.length > 0) {
            for (View view : viewArr) {
                if (view != null && view.isShown() && !a(view)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.R) {
            this.R = true;
            setRefreshing(this.S);
        }
    }

    public void setRefreshing(boolean z) {
        if (this.R) {
            super.setRefreshing(z);
        } else {
            this.S = z;
        }
    }

    public void setSwipeableChildren(int... iArr) {
        this.Q = new View[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.Q[i] = findViewById(iArr[i]);
        }
    }

    public MultiSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static boolean a(View view) {
        return C1778vc.a(view, -1);
    }

    public void setSwipeableChildren(View... viewArr) {
        this.Q = viewArr;
    }
}
