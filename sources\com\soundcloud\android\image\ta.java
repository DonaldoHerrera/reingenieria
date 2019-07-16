package com.soundcloud.android.image;

import android.content.res.Resources;
import android.widget.ImageView;

/* compiled from: SimpleBlurredImageLoader */
public class ta {
    private N a;
    private Resources b;
    private final HPa c;
    private final HPa d;

    public ta(N n, Resources resources, HPa hPa, HPa hPa2) {
        this.a = n;
        this.b = resources;
        this.c = hPa;
        this.d = hPa2;
    }

    public void a(Vca vca, ImageView imageView) {
        this.a.a(this.b, vca.a(), vca.b(), ba.NONE, this.c, this.d, Integer.valueOf(22)).c((C6776kQa<? super T>) new aa<Object>(imageView));
    }
}
