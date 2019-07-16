package com.soundcloud.android.creators.record;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: lambda */
public final /* synthetic */ class b implements OnClickListener {
    private final /* synthetic */ RecordPermissionsActivity a;

    public /* synthetic */ b(RecordPermissionsActivity recordPermissionsActivity) {
        this.a = recordPermissionsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(dialogInterface, i);
    }
}
