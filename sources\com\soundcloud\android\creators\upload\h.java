package com.soundcloud.android.creators.upload;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: lambda */
public final /* synthetic */ class h implements OnClickListener {
    private final /* synthetic */ UploadMonitorPresenter a;

    public /* synthetic */ h(UploadMonitorPresenter uploadMonitorPresenter) {
        this.a = uploadMonitorPresenter;
    }

    public final void onClick(View view) {
        this.a.b(view);
    }
}
