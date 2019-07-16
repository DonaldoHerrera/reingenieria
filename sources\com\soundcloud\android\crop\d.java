package com.soundcloud.android.crop;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: CropImageActivity */
class d implements OnClickListener {
    final /* synthetic */ CropImageActivity a;

    d(CropImageActivity cropImageActivity) {
        this.a = cropImageActivity;
    }

    public void onClick(View view) {
        this.a.setResult(0);
        this.a.finish();
    }
}
