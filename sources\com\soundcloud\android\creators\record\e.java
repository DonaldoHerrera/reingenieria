package com.soundcloud.android.creators.record;

import android.content.Intent;
import android.net.Uri;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.features.record.Recording;
import java.io.File;

/* compiled from: UploadActivity */
class e extends C5037Jua<Recording> {
    final /* synthetic */ Intent d;
    final /* synthetic */ UploadActivity e;

    e(UploadActivity uploadActivity, Intent intent) {
        this.e = uploadActivity;
        this.d = intent;
    }

    public void onComplete() {
        this.e.finish();
    }

    public void a(Recording recording) {
        recording.e = this.d.getStringExtra(C2929h.n);
        recording.g = !this.d.getBooleanExtra(C2929h.p, true);
        recording.h = this.d.getStringArrayExtra(C2929h.q);
        recording.i = this.d.getStringExtra(C2929h.o);
        recording.j = this.d.getStringExtra(C2929h.r);
        Uri uri = (Uri) this.d.getParcelableExtra(C2929h.s);
        if (uri != null) {
            if ("file".equals(uri.getScheme())) {
                recording.m = new File(uri.getPath());
            }
        }
        this.e.z.a(C4621nja.a(C4928GKa.c(recording), C4928GKa.a()));
    }
}
