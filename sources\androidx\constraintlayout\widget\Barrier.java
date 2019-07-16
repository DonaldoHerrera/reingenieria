package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;

public class Barrier extends ConstraintHelper {
    private int g;
    private int h;
    private C1535na i;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.i = new C1535na();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == d.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == d.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.i.c(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.d = this.i;
        a();
    }

    public int getType() {
        return this.g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.i.c(z);
    }

    public void setType(int i2) {
        this.g = i2;
        this.h = i2;
        if (VERSION.SDK_INT < 17) {
            int i3 = this.g;
            if (i3 == 5) {
                this.h = 0;
            } else if (i3 == 6) {
                this.h = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i4 = this.g;
                if (i4 == 5) {
                    this.h = 1;
                } else if (i4 == 6) {
                    this.h = 0;
                }
            } else {
                int i5 = this.g;
                if (i5 == 5) {
                    this.h = 0;
                } else if (i5 == 6) {
                    this.h = 1;
                }
            }
        }
        this.i.t(this.h);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        super.setVisibility(8);
    }
}
