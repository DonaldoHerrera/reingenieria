package com.soundcloud.android.cast;

import android.content.Context;
import androidx.mediarouter.app.C0388a;
import androidx.mediarouter.app.MediaRouteButton;
import com.soundcloud.android.view.ThemeableMediaRouteButton;

public class ThemeableMediaRouteActionProvider extends C0388a {
    public ThemeableMediaRouteActionProvider(Context context) {
        super(context);
    }

    public MediaRouteButton i() {
        return new ThemeableMediaRouteButton(a());
    }
}
