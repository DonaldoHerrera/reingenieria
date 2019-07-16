package com.soundcloud.android.playback.playqueue;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.soundcloud.android.playback.playqueue.i reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4375i implements OnTouchListener {
    private final /* synthetic */ C4390pa a;
    private final /* synthetic */ C5378VEa b;

    public /* synthetic */ C4375i(C4390pa paVar, C5378VEa vEa) {
        this.a = paVar;
        this.b = vEa;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.a(this.b, view, motionEvent);
    }
}
