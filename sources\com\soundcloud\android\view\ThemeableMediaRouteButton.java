package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.a;
import androidx.mediarouter.app.MediaRouteButton;
import com.soundcloud.android.ia.h;

public class ThemeableMediaRouteButton extends MediaRouteButton {
    public ThemeableMediaRouteButton(Context context) {
        super(context);
    }

    private void setTheme(int i) {
        setRemoteIndicatorDrawable(a.c(getContext(), i));
    }

    public void c() {
        setTheme(h.mr_button_dark);
    }

    public void d() {
        setTheme(h.mr_button_light);
    }

    public ThemeableMediaRouteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ThemeableMediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
