package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.e = false;
    }

    public void c(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.b; i++) {
            View a = constraintLayout.a(this.a[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (elevation > 0.0f && VERSION.SDK_INT >= 21) {
                    a.setElevation(elevation);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(ConstraintLayout constraintLayout) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.la.o(0);
        layoutParams.la.g(0);
    }
}
