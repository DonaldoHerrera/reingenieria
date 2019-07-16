package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: jj reason: default package and case insensitive filesystem */
/* compiled from: QueueFileLogStore */
class C1420jj implements c {
    final /* synthetic */ byte[] a;
    final /* synthetic */ int[] b;
    final /* synthetic */ C1451kj c;

    C1420jj(C1451kj kjVar, byte[] bArr, int[] iArr) {
        this.c = kjVar;
        this.a = bArr;
        this.b = iArr;
    }

    public void a(InputStream inputStream, int i) throws IOException {
        try {
            inputStream.read(this.a, this.b[0], i);
            int[] iArr = this.b;
            iArr[0] = iArr[0] + i;
        } finally {
            inputStream.close();
        }
    }
}
