package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.a;
import com.google.android.gms.common.util.DeviceProperties;

public final class SignInButtonImpl extends Button {
    public SignInButtonImpl(Context context) {
        this(context, null);
    }

    private static int zaa(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void configure(Resources resources, SignInButtonConfig signInButtonConfig) {
        configure(resources, signInButtonConfig.getButtonSize(), signInButtonConfig.getColorScheme());
    }

    public SignInButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    public final void configure(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C1552nr.common_google_signin_btn_icon_dark;
        int i5 = C1552nr.common_google_signin_btn_icon_light;
        int zaa = zaa(i2, i4, i5, i5);
        int i6 = C1552nr.common_google_signin_btn_text_dark;
        int i7 = C1552nr.common_google_signin_btn_text_light;
        int zaa2 = zaa(i2, i6, i7, i7);
        String str = "Unknown button size: ";
        if (i == 0 || i == 1) {
            zaa = zaa2;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append(str);
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        Drawable i8 = a.i(resources.getDrawable(zaa));
        a.a(i8, resources.getColorStateList(C1521mr.common_google_signin_btn_tint));
        a.a(i8, Mode.SRC_ATOP);
        setBackgroundDrawable(i8);
        int i9 = C1521mr.common_google_signin_btn_text_dark;
        int i10 = C1521mr.common_google_signin_btn_text_light;
        ColorStateList colorStateList = resources.getColorStateList(zaa(i2, i9, i10, i10));
        Preconditions.checkNotNull(colorStateList);
        setTextColor(colorStateList);
        if (i == 0) {
            setText(resources.getString(C1583or.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(C1583or.common_signin_button_text_long));
        } else if (i == 2) {
            setText(null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(str);
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
