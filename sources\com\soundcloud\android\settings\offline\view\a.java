package com.soundcloud.android.settings.offline.view;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* compiled from: OfflineStorageView */
class a implements OnSeekBarChangeListener {
    private boolean a = false;
    final /* synthetic */ OfflineStorageView b;

    a(OfflineStorageView offlineStorageView) {
        this.b = offlineStorageView;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.a = !this.b.i.a(i);
            this.b.g();
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        long j;
        if (this.b.h != null) {
            if (this.b.i.k()) {
                j = Long.MAX_VALUE;
            } else {
                j = this.b.i.a();
            }
            this.b.h.a(j, this.a);
            this.a = false;
        }
    }
}
