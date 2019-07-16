package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: GAb reason: default package */
/* compiled from: Sink */
public interface GAb extends Closeable, Flushable {
    void a(C6825lAb lab, long j) throws IOException;

    void close() throws IOException;

    void flush() throws IOException;

    JAb k();
}
