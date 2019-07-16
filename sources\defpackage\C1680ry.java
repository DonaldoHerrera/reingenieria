package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: ry reason: default package and case insensitive filesystem */
public final class C1680ry implements C1800vy {
    public final void a(C1370hu huVar, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new C1651qy(this, outputStream));
        huVar.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }

    public final String getName() {
        return "gzip";
    }
}
