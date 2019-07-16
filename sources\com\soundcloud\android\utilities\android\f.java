package com.soundcloud.android.utilities.android;

import android.content.Context;
import android.provider.Settings.Global;

/* compiled from: ContextExtensions.kt */
public final class f {
    public static final float a(Context context, float f) {
        C7471uYa.b(context, "$this$getDefaultAnimationScale");
        return Global.getFloat(context.getContentResolver(), "animator_duration_scale", f);
    }
}
