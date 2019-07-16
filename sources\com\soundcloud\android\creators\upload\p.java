package com.soundcloud.android.creators.upload;

import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.creators.record.jni.EncoderException;
import com.soundcloud.android.creators.record.jni.VorbisEncoder;
import com.soundcloud.android.features.record.Recording;
import java.io.File;

/* compiled from: Processor */
public class p implements Runnable {
    private final Recording a;
    C2350WH<Xaa> b;

    p(Recording recording) {
        this.a = recording;
        SoundCloudApplication.f().a(this);
    }

    public void run() {
        File f = this.a.f();
        File v = this.a.v();
        long g = this.a.u().g();
        long d = this.a.u().d();
        SDb.a(UploadService.a).a("Processor.run(%s, start=%d, end=%d)", this.a, Long.valueOf(g), Long.valueOf(d));
        if (g > 0 || d != -1) {
            try {
                this.b.accept(Xaa.d(this.a));
                VorbisEncoder.extract(this.a.f(), v, ((double) g) / 1000.0d, ((double) d) / 1000.0d);
                this.b.accept(Xaa.e(this.a));
            } catch (EncoderException e) {
                SDb.a(UploadService.a).b(e, "error processing %s", f);
                this.b.accept(Xaa.b(this.a));
            }
        } else {
            SDb.a(UploadService.a).a("no processing to be done", new Object[0]);
            this.b.accept(Xaa.e(this.a));
        }
    }
}
