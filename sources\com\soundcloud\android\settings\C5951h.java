package com.soundcloud.android.settings;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.offline.Oc;

/* renamed from: com.soundcloud.android.settings.h reason: case insensitive filesystem */
/* compiled from: ChangeStorageLocationPresenter.kt */
final class C5951h implements OnCheckedChangeListener {
    final /* synthetic */ C5947d a;

    C5951h(C5947d dVar) {
        this.a = dVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == i.internal_device_storage) {
            this.a.b(Oc.DEVICE_STORAGE);
        } else if (i == i.sd_card) {
            this.a.b(Oc.SD_CARD);
        }
    }
}
