package com.soundcloud.android.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.core.content.a;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoadingTracksLayout extends LinearLayout {
    private static int[] a = {h.skeleton_track_cell_frame_1, h.skeleton_track_cell_frame_2, h.skeleton_track_cell_frame_3, h.skeleton_track_cell_frame_4, h.skeleton_track_cell_frame_5, h.skeleton_track_cell_frame_6, h.skeleton_track_cell_frame_7, h.skeleton_track_cell_frame_8, h.skeleton_track_cell_frame_9, h.skeleton_track_cell_frame_10, h.skeleton_track_cell_frame_9, h.skeleton_track_cell_frame_8, h.skeleton_track_cell_frame_7, h.skeleton_track_cell_frame_6, h.skeleton_track_cell_frame_5, h.skeleton_track_cell_frame_4, h.skeleton_track_cell_frame_3, h.skeleton_track_cell_frame_2, h.skeleton_track_cell_frame_1};
    List<ImageView> b = Collections.emptyList();
    private boolean c;

    public LoadingTracksLayout(Context context) {
        super(context);
        b();
    }

    private int a(int i) {
        int i2 = i - 3;
        return i2 < 0 ? i2 + a.length : i2;
    }

    private void b() {
        setBackgroundColor(-1);
        setOrientation(1);
    }

    private void c() {
        removeAllViews();
        Context context = getContext();
        this.b = new ArrayList();
        LayoutInflater from = LayoutInflater.from(context);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        do {
            ImageView imageView = (ImageView) from.inflate(l.emptyview_tracks_loading_items, this, false);
            imageView.setImageDrawable(a(context, i));
            imageView.measure(0, 0);
            addView(imageView, new LayoutParams(-1, -2));
            this.b.add(imageView);
            i = a(i);
            i2 += imageView.getMeasuredHeight();
            if (i2 < getMeasuredHeight()) {
                from.inflate(l.item_divider, this, true);
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        post(new C6221j(this));
        if (this.c) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c();
    }

    private AnimationDrawable a(Context context, int i) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        int i2 = 0;
        while (true) {
            int[] iArr = a;
            if (i2 >= iArr.length) {
                return animationDrawable;
            }
            animationDrawable.addFrame(a.c(context, iArr[(i + i2) % iArr.length]), 60);
            i2++;
        }
    }

    public LoadingTracksLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public void a() {
        this.c = true;
        for (ImageView drawable : this.b) {
            ((AnimationDrawable) drawable.getDrawable()).start();
        }
    }

    public LoadingTracksLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
