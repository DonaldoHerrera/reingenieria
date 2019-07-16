package com.soundcloud.android.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.view.customfontviews.a;

public final class CustomFontTitleToolbar extends Toolbar {
    private TextView P;
    private boolean Q;

    public CustomFontTitleToolbar(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.P = (TextView) LayoutInflater.from(context).inflate(l.toolbar_title, this, false);
        addView(this.P);
        a.a(this.P, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.CustomFontTitleToolbar);
        if (obtainStyledAttributes.getBoolean(r.CustomFontTitleToolbar_darkMode, false)) {
            l();
        } else {
            m();
        }
        obtainStyledAttributes.recycle();
    }

    private C4928GKa<ThemeableMediaRouteButton> getCastButton() {
        int i = i.media_route_menu_item;
        if (getMenu() == null || getMenu().findItem(i) == null || !(getMenu().findItem(i).getActionView() instanceof ThemeableMediaRouteButton)) {
            return C4928GKa.a();
        }
        return C4928GKa.b((ThemeableMediaRouteButton) getMenu().findItem(i).getActionView());
    }

    private int getDarkColor() {
        return androidx.core.content.a.a(getContext(), f.charcoal);
    }

    private int getLightColor() {
        return -1;
    }

    private C4928GKa<Drawable> getNavigationDrawable() {
        return C4928GKa.b(getNavigationIcon());
    }

    /* access modifiers changed from: private */
    public void setDarkMode(Drawable drawable) {
        if (a(drawable)) {
            drawable.setColorFilter(getLightColor(), Mode.SRC_IN);
        } else {
            a(drawable, getDarkColor(), getLightColor());
        }
    }

    /* access modifiers changed from: private */
    public void setLightMode(Drawable drawable) {
        if (a(drawable)) {
            drawable.setColorFilter(getDarkColor(), Mode.SRC_IN);
        } else {
            a(drawable, getLightColor(), getDarkColor());
        }
    }

    public void l() {
        if (!this.Q) {
            this.Q = true;
            getNavigationDrawable().a((C7733yKa<? super T>) new C6214c<Object>(this));
            getCastButton().a((C7733yKa<? super T>) C6222k.a);
        }
    }

    public void m() {
        if (this.Q) {
            this.Q = false;
            getNavigationDrawable().a((C7733yKa<? super T>) new C6212a<Object>(this));
            getCastButton().a((C7733yKa<? super T>) C6215d.a);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.P.setText(charSequence);
    }

    public void setTitleAlpha(float f) {
        this.P.setAlpha(f);
    }

    public CustomFontTitleToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public CustomFontTitleToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private static boolean a(Drawable drawable) {
        return drawable.getColorFilter() == null;
    }

    private void a(Drawable drawable, int i, int i2) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{i, i2});
        ofArgb.addUpdateListener(new C6213b(drawable, ofArgb));
        ofArgb.start();
    }
}
