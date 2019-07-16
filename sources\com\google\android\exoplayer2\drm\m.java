package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.p;
import java.util.Map;

/* compiled from: DrmSession */
public interface m<T extends p> {

    /* compiled from: DrmSession */
    public static class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    a a();

    T b();

    Map<String, String> c();

    int getState();
}
