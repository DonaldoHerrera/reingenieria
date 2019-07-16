package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0642j;
import com.google.android.gms.cast.framework.C0645m;
import com.google.android.gms.cast.framework.C0664p;
import com.google.android.gms.cast.framework.C0665q;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

public final class G extends C {
    private final RelativeLayout c;
    private final TextView d;
    private final CastSeekBar e;
    private final C1703sr f;

    public G(RelativeLayout relativeLayout, CastSeekBar castSeekBar, C1703sr srVar) {
        this.c = relativeLayout;
        this.d = (TextView) relativeLayout.findViewById(C0645m.tooltip);
        this.e = castSeekBar;
        this.f = srVar;
        TypedArray obtainStyledAttributes = this.d.getContext().obtainStyledAttributes(null, C0665q.CastExpandedController, C0642j.castExpandedControllerStyle, C0664p.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(C0665q.CastExpandedController_castSeekBarTooltipBackgroundColor, 0);
        obtainStyledAttributes.recycle();
        this.d.getBackground().setColorFilter(this.d.getContext().getResources().getColor(resourceId), Mode.SRC_IN);
    }

    private final void f() {
        C0650e a = a();
        if (a == null || !a.m() || e()) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        TextView textView = this.d;
        C1703sr srVar = this.f;
        textView.setText(srVar.c(srVar.a(this.e.getProgress())));
        int measuredWidth = (this.e.getMeasuredWidth() - this.e.getPaddingLeft()) - this.e.getPaddingRight();
        this.d.measure(MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.d.getMeasuredWidth();
        LayoutParams layoutParams = (LayoutParams) this.d.getLayoutParams();
        layoutParams.leftMargin = Math.min(Math.max(0, ((int) (((((double) this.e.getProgress()) * 1.0d) / ((double) this.e.getMaxProgress())) * ((double) measuredWidth))) - (measuredWidth2 / 2)), measuredWidth - measuredWidth2);
        this.d.setLayoutParams(layoutParams);
    }

    public final void a(long j) {
        f();
    }

    public final void b() {
        f();
    }

    public final void d() {
        super.d();
        f();
    }

    public final void a(boolean z) {
        super.a(z);
        f();
    }

    public final void a(C0636d dVar) {
        super.a(dVar);
        f();
    }
}
