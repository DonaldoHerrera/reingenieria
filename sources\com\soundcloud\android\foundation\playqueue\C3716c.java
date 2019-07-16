package com.soundcloud.android.foundation.playqueue;

import com.soundcloud.android.foundation.events.B;

/* renamed from: com.soundcloud.android.foundation.playqueue.c reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C3716c implements C7733yKa {
    private final /* synthetic */ PlaySessionSource a;
    private final /* synthetic */ int b;

    public /* synthetic */ C3716c(PlaySessionSource playSessionSource, int i) {
        this.a = playSessionSource;
        this.b = i;
    }

    public final void accept(Object obj) {
        this.a.i = new B(this.b, (C3508cda) obj);
    }
}
