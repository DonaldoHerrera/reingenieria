package com.soundcloud.android.settings;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.soundcloud.android.offline.Oc;

/* renamed from: com.soundcloud.android.settings.e reason: case insensitive filesystem */
/* compiled from: ChangeStorageLocationPresenter.kt */
final class C5948e implements OnClickListener {
    final /* synthetic */ C5947d a;
    final /* synthetic */ Oc b;

    C5948e(C5947d dVar, Oc oc) {
        this.a = dVar;
        this.b = oc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b);
    }
}
