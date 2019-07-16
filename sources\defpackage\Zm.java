package defpackage;

import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: Zm reason: default package */
/* compiled from: DummyTrackOutput */
public final class Zm implements C1424jn {
    public int a(C0313an anVar, int i, boolean z) throws IOException, InterruptedException {
        int b = anVar.b(i);
        if (b != -1) {
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void a(long j, int i, int i2, int i3, a aVar) {
    }

    public void a(Format format) {
    }

    public void a(Pq pq, int i) {
        pq.f(i);
    }
}
