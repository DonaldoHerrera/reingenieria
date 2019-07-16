package com.soundcloud.android.creators.upload;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: lambda */
public final /* synthetic */ class f implements OnClickListener {
    private final /* synthetic */ UploadMonitorPresenter a;

    public /* synthetic */ f(UploadMonitorPresenter uploadMonitorPresenter) {
        this.a = uploadMonitorPresenter;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(dialogInterface, i);
    }
}
