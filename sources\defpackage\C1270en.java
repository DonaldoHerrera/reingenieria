package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.h;
import com.google.android.exoplayer2.metadata.id3.h.a;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: en reason: default package and case insensitive filesystem */
/* compiled from: Id3Peeker */
public final class C1270en {
    private final Pq a = new Pq(10);

    public Metadata a(C0313an anVar, a aVar) throws IOException, InterruptedException {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                anVar.a(this.a.a, 0, 10);
                this.a.e(0);
                if (this.a.w() != h.b) {
                    break;
                }
                this.a.f(3);
                int s = this.a.s();
                int i2 = s + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    anVar.a(bArr, 10, s);
                    metadata = new h(aVar).a(bArr, i2);
                } else {
                    anVar.a(s);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        anVar.a();
        anVar.a(i);
        return metadata;
    }
}
