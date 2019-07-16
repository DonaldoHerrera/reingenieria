package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.Arrays;

public abstract class ConstraintHelper extends View {
    protected int[] a = new int[32];
    protected int b;
    protected Context c;
    protected C1866ya d;
    protected boolean e = false;
    private String f;

    public ConstraintHelper(Context context) {
        super(context);
        this.c = context;
        a((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == d.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f = obtainStyledAttributes.getString(index);
                    setIds(this.f);
                }
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
    }

    public void b(ConstraintLayout constraintLayout) {
    }

    public void c(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f);
        }
        C1866ya yaVar = this.d;
        if (yaVar != null) {
            yaVar.J();
            for (int i = 0; i < this.b; i++) {
                View a2 = constraintLayout.a(this.a[i]);
                if (a2 != null) {
                    this.d.b(constraintLayout.a(a2));
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.b = 0;
        for (int tag : iArr) {
            setTag(tag, null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.b + 1;
        int[] iArr = this.a;
        if (i2 > iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        iArr2[i3] = i;
        this.b = i3 + 1;
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        a(attributeSet);
    }

    public void a() {
        if (this.d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).la = this.d;
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
        a(attributeSet);
    }

    private void a(String str) {
        int i;
        if (str != null && this.c != null) {
            String trim = str.trim();
            try {
                i = c.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.c.getResources().getIdentifier(trim, "id", this.c.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                Object a2 = ((ConstraintLayout) getParent()).a(0, (Object) trim);
                if (a2 != null && (a2 instanceof Integer)) {
                    i = ((Integer) a2).intValue();
                }
            }
            if (i != 0) {
                setTag(i, null);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find id of \"");
                sb.append(trim);
                sb.append("\"");
                Log.w("ConstraintHelper", sb.toString());
            }
        }
    }
}
