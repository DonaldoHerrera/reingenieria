package com.soundcloud.android.features.record;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.soundcloud.android.features.record.x reason: case insensitive filesystem */
/* compiled from: AudioReader */
public abstract class C3671x implements Closeable {
    public static final C3671x a = new C3870sca();

    public static C3671x a(File... fileArr) throws IOException {
        if (fileArr == null) {
            return a;
        }
        for (File a2 : fileArr) {
            C3671x a3 = a(a2);
            if (!(a3 instanceof C3870sca)) {
                return a3;
            }
        }
        return a;
    }

    public abstract File a();

    public abstract int b(ByteBuffer byteBuffer, int i) throws IOException;

    public abstract void b() throws IOException;

    public abstract long getDuration();

    public abstract long getPosition();

    public abstract void h(long j) throws IOException;

    public abstract C3668u w();

    public static C3671x a(File file) throws IOException {
        if (file == null || !file.exists()) {
            return a;
        }
        String c = C6630iGa.c(file);
        if (c == null) {
            return a;
        }
        if (c.equals("wav")) {
            return new C3886uca(file);
        }
        if (c.equals("ogg")) {
            return new C3878tca(file);
        }
        return a;
    }
}
