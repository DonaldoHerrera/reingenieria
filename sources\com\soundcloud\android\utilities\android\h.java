package com.soundcloud.android.utilities.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: InflateExtensions.kt */
public final class h {
    public static final View a(ViewGroup viewGroup, int i) {
        C7471uYa.b(viewGroup, "$this$inflateUnattached");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(cont…te(layoutId, this, false)");
        return inflate;
    }
}
