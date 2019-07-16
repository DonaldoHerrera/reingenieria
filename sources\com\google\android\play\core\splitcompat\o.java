package com.google.android.play.core.splitcompat;

import android.content.Context;

final class o implements Runnable {
    private final /* synthetic */ Context a;

    o(Context context) {
        this.a = context;
    }

    public final void run() {
        NB.a(this.a).a(true);
    }
}
