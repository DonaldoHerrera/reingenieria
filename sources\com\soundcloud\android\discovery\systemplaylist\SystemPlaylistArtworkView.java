package com.soundcloud.android.discovery.systemplaylist;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;

public class SystemPlaylistArtworkView extends FrameLayout {
    private LayoutInflater a;
    /* access modifiers changed from: private */
    public ViewFlipper b;
    private VPa c = C4881Eua.b();
    int d;

    public SystemPlaylistArtworkView(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.dispose();
    }

    public void a(N n, C3528t tVar) {
        a(n, tVar.e());
    }

    private void a(N n, Vca vca) {
        this.b.removeAllViews();
        this.a.inflate(this.d, this.b);
        ImageView imageView = (ImageView) this.b.getChildAt(0);
        if (vca != null) {
            n.c(vca.a(), vca.b(), C3721b.b(imageView.getResources()), imageView);
        } else {
            n.a(imageView);
        }
    }

    public SystemPlaylistArtworkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public SystemPlaylistArtworkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        int i;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.SystemPlaylistArtworkView);
            boolean z = obtainStyledAttributes.getBoolean(r.SystemPlaylistArtworkView_large, false);
            obtainStyledAttributes.recycle();
            i = z ? l.system_playlist_artwork_container_large : l.system_playlist_artwork_container;
            this.d = z ? l.system_playlist_artwork_large : l.system_playlist_artwork;
        } else {
            i = l.system_playlist_artwork_container;
            this.d = l.system_playlist_artwork;
        }
        this.a = (LayoutInflater) context.getSystemService("layout_inflater");
        this.a.inflate(i, this);
        this.b = (ViewFlipper) findViewById(i.artwork_animator);
    }
}
