package com.soundcloud.android.features.record;

import android.content.Intent;

/* compiled from: RecordIntentProvider */
public interface J {

    /* compiled from: RecordIntentProvider */
    public enum a {
        START,
        STOP,
        VIEW,
        UNKNOWN
    }

    Intent a(a aVar);

    a a(Intent intent);
}
