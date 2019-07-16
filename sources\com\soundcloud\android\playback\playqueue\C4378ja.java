package com.soundcloud.android.playback.playqueue;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

/* renamed from: com.soundcloud.android.playback.playqueue.ja reason: case insensitive filesystem */
/* compiled from: HeaderPlayQueueItemRenderer */
class C4378ja extends C5541_ta<C4382la> {
    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.playqueue_header_item, viewGroup, false);
    }

    public void a(int i, View view, C4382la laVar) {
        ((TextView) view.findViewById(i.title)).setText(laVar.j());
        view.setAlpha(db.a(laVar.c(), laVar.b()));
    }
}
