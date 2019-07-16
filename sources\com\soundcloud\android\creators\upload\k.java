package com.soundcloud.android.creators.upload;

import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.creators.record.jni.EncoderOptions;
import com.soundcloud.android.creators.record.jni.ProgressListener;
import com.soundcloud.android.creators.record.jni.VorbisEncoder;
import com.soundcloud.android.features.record.PlaybackStream;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.features.record.ia;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: Encoder */
public class k implements Runnable, ProgressListener {
    private final Recording a;
    private volatile boolean b;
    private long c;
    private final VPa d;
    private final C2350WH<Xaa> e;

    public k(Recording recording, C2350WH<Xaa> wh) {
        this.a = recording;
        this.e = wh;
        SoundCloudApplication.f().a(this);
        C2350WH<Xaa> wh2 = this.e;
        C5220Pua a2 = C5220Pua.a((C6776kQa<T>) new a<T>(this, recording));
        wh2.c(a2);
        this.d = a2;
    }

    public /* synthetic */ void a(Recording recording, Xaa xaa) throws Exception {
        if (xaa.d() && recording.getId() == xaa.b().getId()) {
            SDb.a(UploadService.a).a("canceling encoding of %s", recording);
            a();
        }
    }

    public void onProgress(long j, long j2) throws ia {
        SDb.a(UploadService.a).a("Encoder#onProgress(%d, %d)", Long.valueOf(j), Long.valueOf(j2));
        if (this.b) {
            throw new ia();
        } else if (this.c == 0 || System.currentTimeMillis() - this.c > 1000) {
            this.e.accept(Xaa.a(this.a, (int) Math.min(100, Math.round((((double) j) / ((double) j2)) * 100.0d))));
            this.c = System.currentTimeMillis();
        }
    }

    public void run() {
        b a2 = SDb.a(UploadService.a);
        StringBuilder sb = new StringBuilder();
        sb.append("Encoder.run(");
        sb.append(this.a);
        sb.append(")");
        a2.a(sb.toString(), new Object[0]);
        File g = this.a.g();
        File f = this.a.f();
        File file = null;
        try {
            PlaybackStream u = this.a.u();
            if (u != null) {
                if (!g.exists()) {
                    if (f.exists()) {
                        g = f;
                    } else {
                        throw new FileNotFoundException("No encoding file found");
                    }
                }
                File v = u.m() ? this.a.v() : this.a.f();
                EncoderOptions encoderOptions = new EncoderOptions(EncoderOptions.DEFAULT.quality, u.g(), u.d(), this, u.e());
                SDb.a(UploadService.a).a("encoding from source %s", g.getAbsolutePath());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("encoder-");
                sb2.append(this.a.getId());
                file = File.createTempFile(sb2.toString(), ".ogg", v.getParentFile());
                this.e.accept(Xaa.d(this.a));
                long currentTimeMillis = System.currentTimeMillis();
                VorbisEncoder.encodeFile(g, file, encoderOptions);
                if (!file.exists() || file.length() <= 0) {
                    SDb.a(UploadService.a).f("encoded file %s does not exist or is empty", file);
                    this.e.accept(Xaa.b(this.a));
                    C6630iGa.b(file);
                    this.d.dispose();
                    return;
                }
                SDb.a(UploadService.a).a("encoding finished in %d msecs", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                if (file.renameTo(v)) {
                    this.e.accept(Xaa.e(this.a));
                } else {
                    b a3 = SDb.a(UploadService.a);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("could not rename ");
                    sb3.append(file);
                    sb3.append(" to ");
                    sb3.append(v);
                    a3.f(sb3.toString(), new Object[0]);
                    this.e.accept(Xaa.b(this.a));
                }
                C6630iGa.b(file);
                this.d.dispose();
                return;
            }
            throw new IOException("No playbackstream available");
        } catch (ia e2) {
            SDb.a(UploadService.a).b(e2, "user cancelled encoding", new Object[0]);
        } catch (IOException e3) {
            SDb.a(UploadService.a).b(e3, "error encoding file", new Object[0]);
            this.e.accept(Xaa.b(this.a));
        } catch (Throwable th) {
            C6630iGa.b(null);
            this.d.dispose();
            throw th;
        }
    }

    private void a() {
        this.b = true;
    }
}
