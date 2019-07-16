package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.util.Set;

final class p implements Runnable {
    private final /* synthetic */ Set a;
    private final /* synthetic */ a b;

    p(a aVar, Set set) {
        this.b = aVar;
        this.a = set;
    }

    public final void run() {
        try {
            for (String f : this.a) {
                this.b.b.f(f);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
        }
    }
}
