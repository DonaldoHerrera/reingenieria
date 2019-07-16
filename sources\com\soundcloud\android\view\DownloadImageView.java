package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.offlinestate.c;
import com.soundcloud.android.offlinestate.c.a;

public class DownloadImageView extends AppCompatImageView implements a {
    private final Drawable c;
    private final Drawable d;
    private final Drawable e;
    private final Drawable f;
    private C3823mda g;
    private final c h = c.a((View) this, (a) this);

    public DownloadImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.DownloadImageView);
        this.c = obtainStyledAttributes.getDrawable(r.DownloadImageView_queued);
        this.e = obtainStyledAttributes.getDrawable(r.DownloadImageView_downloaded);
        this.d = obtainStyledAttributes.getDrawable(r.DownloadImageView_downloading);
        this.f = obtainStyledAttributes.getDrawable(r.DownloadImageView_unavailable);
        obtainStyledAttributes.recycle();
    }

    private void a() {
        setDownloadStateResource(this.d);
        setHasTransientState(true);
        C5466YFa.a((View) this);
    }

    private void d() {
        clearAnimation();
        setVisibility(8);
        setHasTransientState(false);
        setImageDrawable(null);
    }

    private void setDownloadStateResource(Drawable drawable) {
        clearAnimation();
        setHasTransientState(false);
        setVisibility(0);
        setImageDrawable(drawable);
    }

    public void setState(C3823mda mda) {
        C3823mda mda2 = this.g;
        if (mda2 == null) {
            a(mda);
        } else {
            this.h.a(mda2, mda);
        }
    }

    public void a(C3823mda mda) {
        this.g = mda;
        int i = C6233w.a[mda.ordinal()];
        if (i == 1) {
            d();
        } else if (i == 2) {
            setDownloadStateResource(this.f);
        } else if (i == 3) {
            setDownloadStateResource(this.c);
        } else if (i == 4) {
            a();
        } else if (i == 5) {
            setDownloadStateResource(this.e);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown state : ");
            sb.append(mda);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
