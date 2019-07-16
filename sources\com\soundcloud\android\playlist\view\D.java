package com.soundcloud.android.playlist.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: PlaylistDetailsAdapter.kt */
final class D implements OnTouchListener {
    final /* synthetic */ C a;
    final /* synthetic */ ViewHolder b;

    D(C c, ViewHolder viewHolder) {
        this.a = c;
        this.b = viewHolder;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C7471uYa.a((Object) motionEvent, "motionEvent");
        if (motionEvent.getActionMasked() == 0) {
            this.a.h.a(this.b);
        }
        return false;
    }
}
