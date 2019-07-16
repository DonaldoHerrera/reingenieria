package com.google.android.play.core.splitcompat;

import android.util.Log;

final class n implements Runnable {
    private final /* synthetic */ a a;

    n(a aVar) {
        this.a = aVar;
    }

    public final void run() {
        try {
            this.a.b.a();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
