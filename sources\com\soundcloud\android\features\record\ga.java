package com.soundcloud.android.features.record;

import android.content.Context;
import android.widget.RelativeLayout.LayoutParams;
import androidx.appcompat.widget.AppCompatImageButton;
import com.soundcloud.android.features.record.G.h;

/* compiled from: TrimHandleView */
public class ga extends AppCompatImageButton {
    private final a c;

    /* compiled from: TrimHandleView */
    public enum a {
        LEFT(ga.getLeftLayoutParams(), h.ic_record_handle_l),
        RIGHT(ga.getRightLayoutParams(), h.ic_record_handle_r);
        
        /* access modifiers changed from: private */
        public final LayoutParams d;
        /* access modifiers changed from: private */
        public final int e;

        private a(LayoutParams layoutParams, int i) {
            this.d = layoutParams;
            this.e = i;
        }
    }

    public ga(Context context, a aVar) {
        super(context);
        setLayoutParams(aVar.d);
        setBackgroundResource(aVar.e);
        setClickable(false);
        this.c = aVar;
    }

    /* access modifiers changed from: private */
    public static LayoutParams getLeftLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(12, 1);
        layoutParams.addRule(9, 1);
        return layoutParams;
    }

    public static LayoutParams getRightLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(12, 1);
        layoutParams.addRule(11, 1);
        return layoutParams;
    }

    public void a(int i) {
        if (this.c == a.LEFT) {
            getLayoutParams().leftMargin = i;
        } else {
            getLayoutParams().rightMargin = i;
        }
        requestLayout();
    }

    public LayoutParams getLayoutParams() {
        return (LayoutParams) super.getLayoutParams();
    }
}
