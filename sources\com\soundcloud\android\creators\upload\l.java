package com.soundcloud.android.creators.upload;

import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.features.record.Recording;
import java.io.File;
import java.io.IOException;

/* compiled from: ImageResizer */
public class l implements Runnable {
    private final Recording a;
    C2350WH<Xaa> b;

    l(Recording recording) {
        this.a = recording;
        SoundCloudApplication.f().a(this);
    }

    private void a() {
        SDb.a(UploadService.a).a("resizing %s", this.a.m);
        try {
            this.b.accept(Xaa.f(this.a));
            StringBuilder sb = new StringBuilder();
            sb.append("upload_tmp_");
            sb.append(this.a.getId());
            File createTempFile = File.createTempFile(sb.toString(), ".jpg");
            long currentTimeMillis = System.currentTimeMillis();
            if (C4740AIa.a(this.a.m, createTempFile, 2048, 2048)) {
                this.a.n = createTempFile;
                SDb.a(UploadService.a).a("resized %s => %s  in %d ms", this.a.m, this.a.n, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                this.b.accept(Xaa.g(this.a));
                return;
            }
            SDb.a(UploadService.a).f("did not resize image %s", this.a.m);
            this.a.n = this.a.m;
            this.b.accept(Xaa.g(this.a));
        } catch (IOException e) {
            SDb.a(UploadService.a).a((Throwable) e, "error resizing", new Object[0]);
            this.b.accept(Xaa.b(this.a));
        }
    }

    public void run() {
        b a2 = SDb.a(UploadService.a);
        StringBuilder sb = new StringBuilder();
        sb.append("ImageResizer.run(");
        sb.append(this.a);
        sb.append(")");
        a2.a(sb.toString(), new Object[0]);
        if (!this.a.J()) {
            this.b.accept(Xaa.b(this.a));
        } else {
            a();
        }
    }
}
