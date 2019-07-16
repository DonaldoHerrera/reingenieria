package defpackage;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: qy reason: default package and case insensitive filesystem */
final class C1651qy extends BufferedOutputStream {
    C1651qy(C1680ry ryVar, OutputStream outputStream) {
        super(outputStream);
    }

    public final void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
    }
}
