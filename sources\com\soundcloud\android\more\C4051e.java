package com.soundcloud.android.more;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.soundcloud.android.accounts.LogoutActivity;

/* renamed from: com.soundcloud.android.more.e reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4051e implements OnClickListener {
    private final /* synthetic */ Context a;

    public /* synthetic */ C4051e(Context context) {
        this.a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LogoutActivity.a(this.a);
    }
}
