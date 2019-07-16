package com.soundcloud.android.settings.offline;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: OfflineSettingsFragment.kt */
final class l implements OnClickListener {
    final /* synthetic */ OfflineSettingsFragment a;

    l(OfflineSettingsFragment offlineSettingsFragment) {
        this.a = offlineSettingsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.vb().a(RVa.a);
    }
}
