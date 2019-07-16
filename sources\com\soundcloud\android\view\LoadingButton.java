package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.view.customfontviews.a;

public class LoadingButton extends RelativeLayout {
    private String a;
    private String b;
    private String c;
    private int d;
    private int e;
    private TextView f;
    private ProgressBar g;

    public LoadingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.LoadingButton, i, 0);
        this.a = c(obtainStyledAttributes);
        this.b = d(obtainStyledAttributes);
        this.c = e(obtainStyledAttributes);
        this.d = f(obtainStyledAttributes);
        this.e = b(obtainStyledAttributes);
        this.f.setTypeface(a.a(context, a(obtainStyledAttributes)));
        this.f.setText(this.b);
        this.f.setTextColor(this.d);
        this.f.setTextSize(0, g(obtainStyledAttributes));
        this.g.getIndeterminateDrawable().setColorFilter(this.e, Mode.SRC_IN);
        obtainStyledAttributes.recycle();
    }

    private String c(TypedArray typedArray) {
        return typedArray.getString(r.LoadingButton_loadingText);
    }

    private String d(TypedArray typedArray) {
        return typedArray.getString(r.LoadingButton_actionText);
    }

    private String e(TypedArray typedArray) {
        return typedArray.getString(r.LoadingButton_retryText);
    }

    private int f(TypedArray typedArray) {
        return typedArray.getColor(r.LoadingButton_textColor, 0);
    }

    private float g(TypedArray typedArray) {
        return (float) typedArray.getDimensionPixelSize(r.LoadingButton_textSize, 0);
    }

    public void a() {
        this.f.setText(this.c);
        this.g.setVisibility(8);
    }

    public void setActionText(String str) {
        this.b = str;
        this.f.setText(str);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f.setAlpha(z ? 1.0f : 0.5f);
    }

    public void setLoading(boolean z) {
        String str = this.a;
        if (str == null) {
            str = this.b;
        }
        TextView textView = this.f;
        if (!z) {
            str = this.b;
        }
        textView.setText(str);
        this.f.setTextColor(z ? this.e : this.d);
        this.g.setVisibility(z ? 0 : 8);
    }

    public LoadingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        LayoutInflater.from(context).inflate(l.loading_button, this);
        this.f = (TextView) findViewById(i.label);
        this.g = (ProgressBar) findViewById(i.progress);
        b(context, attributeSet, i);
        setClickable(true);
    }

    private String a(TypedArray typedArray) {
        return typedArray.getString(r.LoadingButton_custom_font);
    }

    private int b(TypedArray typedArray) {
        return typedArray.getColor(r.LoadingButton_loadingColor, 0);
    }
}
