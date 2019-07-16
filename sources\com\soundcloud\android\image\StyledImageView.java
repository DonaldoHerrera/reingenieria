package com.soundcloud.android.image;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.soundcloud.android.image.sa.h;
import com.soundcloud.android.image.sa.k;

public class StyledImageView extends FrameLayout {
    private final ImageView a = ((ImageView) findViewById(h.circular_artwork));
    private final ImageView b = ((ImageView) findViewById(h.square_artwork));
    private final ImageView c = ((ImageView) findViewById(h.station_indicator));

    public StyledImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(k.styled_image_view, this);
    }

    private void b(C3508cda cda, C4928GKa<String> gKa, N n, boolean z) {
        if (z) {
            n.c(cda, gKa, C3721b.b(getContext().getResources()), this.b);
            return;
        }
        n.a(cda, gKa, C3721b.b(getContext().getResources()), this.b, false);
    }

    public void a(C4928GKa<String> gKa, C4928GKa<W> gKa2, C3508cda cda, N n) {
        a(C4928GKa.c(cda), gKa, gKa2, n, false);
    }

    public void a(C4928GKa<String> gKa, C4928GKa<W> gKa2, C4928GKa<C3508cda> gKa3, N n) {
        a(gKa3, gKa, gKa2, n, true);
    }

    private void a(C4928GKa<C3508cda> gKa, C4928GKa<String> gKa2, C4928GKa<W> gKa3, N n, boolean z) {
        C3508cda cda = gKa.c() ? (C3508cda) gKa.b() : C3508cda.a;
        int i = wa.a[((W) gKa3.d(W.SQUARE)).ordinal()];
        if (i == 1) {
            b(cda, gKa2, n, z);
            this.b.setVisibility(0);
            this.a.setVisibility(8);
            this.c.setVisibility(8);
        } else if (i == 2) {
            a(cda, gKa2, n, z);
            this.a.setVisibility(0);
            this.b.setVisibility(8);
            this.c.setVisibility(8);
        } else if (i == 3) {
            b(cda, gKa2, n, z);
            this.b.setVisibility(0);
            this.c.setVisibility(0);
            this.a.setVisibility(8);
        } else {
            throw new IllegalArgumentException(String.format("Unknown ImageType %s", new Object[]{gKa3.b()}));
        }
    }

    private void a(C3508cda cda, C4928GKa<String> gKa, N n, boolean z) {
        if (z) {
            n.a(cda, gKa, C3721b.b(getContext().getResources()), this.a);
            return;
        }
        n.a(cda, gKa, C3721b.b(getContext().getResources()), this.a, true);
    }
}
