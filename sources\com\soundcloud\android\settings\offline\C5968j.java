package com.soundcloud.android.settings.offline;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.soundcloud.android.settings.offline.j reason: case insensitive filesystem */
/* compiled from: OfflineSettingsFragment.kt */
final class C5968j implements OnClickListener {
    final /* synthetic */ OfflineSettingsFragment a;

    C5968j(OfflineSettingsFragment offlineSettingsFragment) {
        this.a = offlineSettingsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.Mb().a(Boolean.valueOf(true));
    }
}
