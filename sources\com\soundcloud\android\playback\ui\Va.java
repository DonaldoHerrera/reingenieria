package com.soundcloud.android.playback.ui;

import android.view.View;

/* compiled from: EmptyViewControllerFactory */
public class Va {
    public Ua a(View view) {
        a(view, 1);
        return new Ua(view);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
