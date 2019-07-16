package com.soundcloud.android.settings.offline;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: com.soundcloud.android.settings.offline.i reason: case insensitive filesystem */
/* compiled from: OfflineSettingsFragment.kt */
final class C5967i implements OnCancelListener {
    final /* synthetic */ OfflineSettingsFragment a;

    C5967i(OfflineSettingsFragment offlineSettingsFragment) {
        this.a = offlineSettingsFragment;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.Ib().a(RVa.a);
    }
}
