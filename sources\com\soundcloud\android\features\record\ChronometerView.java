package com.soundcloud.android.features.record;

import android.content.Context;
import android.util.AttributeSet;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.concurrent.TimeUnit;

public class ChronometerView extends CustomFontTextView {
    private long d = -1;
    private long e = -1;
    private String f;
    private int g;

    public ChronometerView(Context context) {
        super(context);
    }

    public void a(long j, long j2) {
        a(j2);
        long j3 = j / 1000;
        if (j3 != this.e || this.g != 2) {
            this.e = j3;
            this.g = 2;
            StringBuilder sb = new StringBuilder();
            sb.append(C7315sGa.a(j, TimeUnit.MILLISECONDS));
            sb.append(" / ");
            sb.append(this.f);
            setText(sb);
        }
    }

    public void setDurationOnly(long j) {
        if (a(j) || this.g != 1) {
            this.g = 1;
            setText(this.f);
        }
    }

    public ChronometerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChronometerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private boolean a(long j) {
        long j2 = j / 1000;
        if (j2 == this.d) {
            return false;
        }
        this.d = j2;
        this.f = C7315sGa.a(j2, TimeUnit.SECONDS);
        return true;
    }
}
