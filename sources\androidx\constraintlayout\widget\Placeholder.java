package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;

public class Placeholder extends View {
    private int a = -1;
    private View b = null;
    private int c = 4;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.c);
        this.a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == d.ConstraintLayout_placeholder_content) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == d.ConstraintLayout_placeholder_emptyVisibility) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                }
            }
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.a == -1 && !isInEditMode()) {
            setVisibility(this.c);
        }
        this.b = constraintLayout.findViewById(this.a);
        View view = this.b;
        if (view != null) {
            ((LayoutParams) view.getLayoutParams()).aa = true;
            this.b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.b;
    }

    public int getEmptyVisibility() {
        return this.c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, 1, rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        if (this.a != i) {
            View view = this.b;
            if (view != null) {
                view.setVisibility(0);
                ((LayoutParams) this.b.getLayoutParams()).aa = false;
                this.b = null;
            }
            this.a = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.c = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    public void a(ConstraintLayout constraintLayout) {
        if (this.b != null) {
            LayoutParams layoutParams = (LayoutParams) getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.b.getLayoutParams();
            layoutParams2.la.n(0);
            layoutParams.la.o(layoutParams2.la.s());
            layoutParams.la.g(layoutParams2.la.i());
            layoutParams2.la.n(8);
        }
    }
}
