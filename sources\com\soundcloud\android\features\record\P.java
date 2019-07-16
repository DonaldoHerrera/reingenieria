package com.soundcloud.android.features.record;

import android.content.res.Resources;
import android.util.Log;
import com.soundcloud.android.creators.record.jni.NativeAmplitudeAnalyzer;
import com.soundcloud.android.features.record.filter.FadeFilter;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: RecordStream */
public class P {
    private final C3668u a;
    private final Resources b;
    private C3672y c;
    private AmplitudeData d;
    private final AmplitudeData e;
    private final r f;
    private float g;
    private boolean h;

    public P(C3668u uVar, Resources resources) {
        this.b = resources;
        if (uVar != null) {
            this.a = uVar;
            this.f = new NativeAmplitudeAnalyzer(uVar);
            this.d = new AmplitudeData();
            this.e = new AmplitudeData();
            this.c = new C3894vca(uVar);
            return;
        }
        throw new IllegalArgumentException("config is null");
    }

    public void a(C3672y yVar) {
        this.c = yVar;
    }

    public C3671x b() throws IOException {
        return this.c.u();
    }

    public long c() {
        return this.c.getDuration();
    }

    public float d() {
        return this.g;
    }

    public AmplitudeData e() {
        return this.e;
    }

    public void f() {
        try {
            this.c.close();
        } catch (IOException unused) {
        }
        this.c = new C3894vca(this.a);
        this.d.clear();
        this.e.clear();
        this.g = 0.0f;
    }

    public final void a(File file, File file2) {
        C3672y yVar;
        if (file == null && file2 == null) {
            yVar = new C3894vca(this.a);
        } else if (file2 != null && file == null) {
            yVar = new C3910xca(file2, this.a);
        } else if (file2 == null) {
            yVar = new C3918yca(file, this.a);
        } else {
            yVar = new C3902wca(new C3910xca(file2, this.a), new C3918yca(file, this.a));
        }
        a(yVar);
    }

    public int a(ByteBuffer byteBuffer, int i) throws IOException {
        byteBuffer.limit(i);
        this.g = this.f.frameAmplitude(byteBuffer, i);
        if (this.c instanceof C3894vca) {
            this.e.a(this.g);
            return -1;
        }
        this.d.a(this.g);
        if (this.h) {
            long j = (long) i;
            new FadeFilter(1, j).a(byteBuffer, 0, j);
            this.h = false;
        }
        return this.c.a(byteBuffer, i);
    }

    public P(C3668u uVar, Resources resources, File file, File file2, File file3) {
        String str;
        this(uVar, resources);
        a(file, file2);
        if (file3 != null) {
            try {
                if (file3.exists()) {
                    this.d = AmplitudeData.a(file3);
                    return;
                }
            } catch (IOException e2) {
                Log.w(ba.b, "error reading amplitude data", e2);
                return;
            }
        }
        String str2 = ba.b;
        StringBuilder sb = new StringBuilder();
        sb.append("Amplitude file not found at ");
        if (file3 == null) {
            str = "<null>";
        } else {
            str = file3.getPath();
        }
        sb.append(str);
        Log.d(str2, sb.toString());
    }

    public AmplitudeData a() {
        return this.d;
    }

    public boolean a(long j, int i) throws IOException {
        this.d.c((int) ((((double) j) / 1000.0d) * ((double) i)));
        return this.c.g(j);
    }

    public void a(File file) throws IOException {
        this.h = true;
        this.c.y();
        if (file != null) {
            this.d.b(file);
        }
    }
}
