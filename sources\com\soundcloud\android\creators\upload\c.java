package com.soundcloud.android.creators.upload;

import android.view.View;
import android.view.View.OnLongClickListener;

/* compiled from: lambda */
public final /* synthetic */ class c implements OnLongClickListener {
    private final /* synthetic */ RecordingMetaDataLayout a;

    public /* synthetic */ c(RecordingMetaDataLayout recordingMetaDataLayout) {
        this.a = recordingMetaDataLayout;
    }

    public final boolean onLongClick(View view) {
        return this.a.c(view);
    }
}
