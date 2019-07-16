package com.soundcloud.android.soul.components.empty.view;

import android.content.res.TypedArray;
import android.view.View;

/* compiled from: EmptyFullscreenView.kt */
public final class b {
    /* access modifiers changed from: private */
    public static final Integer c(TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, -1);
        if (resourceId != -1) {
            return Integer.valueOf(resourceId);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final String d(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void c(View view) {
        view.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void d(View view) {
        view.setVisibility(0);
    }
}
