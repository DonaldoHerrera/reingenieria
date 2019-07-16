package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: Nn reason: default package */
/* compiled from: OggPacket */
final class Nn {
    private final On a = new On();
    private final Pq b = new Pq(new byte[65025], 0);
    private int c = -1;
    private int d;
    private boolean e;

    Nn() {
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        int i;
        C1852xq.b(anVar != null);
        if (this.e) {
            this.e = false;
            this.b.B();
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.a(anVar, true)) {
                    return false;
                }
                On on = this.a;
                int i2 = on.i;
                if ((on.c & 1) == 1 && this.b.d() == 0) {
                    i2 += a(0);
                    i = this.d + 0;
                } else {
                    i = 0;
                }
                anVar.c(i2);
                this.c = i;
            }
            int a2 = a(this.c);
            int i3 = this.c + this.d;
            if (a2 > 0) {
                if (this.b.b() < this.b.d() + a2) {
                    Pq pq = this.b;
                    pq.a = Arrays.copyOf(pq.a, pq.d() + a2);
                }
                Pq pq2 = this.b;
                anVar.readFully(pq2.a, pq2.d(), a2);
                Pq pq3 = this.b;
                pq3.d(pq3.d() + a2);
                this.e = this.a.k[i3 + -1] != 255;
            }
            if (i3 == this.a.h) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public Pq b() {
        return this.b;
    }

    public void c() {
        this.a.a();
        this.b.B();
        this.c = -1;
        this.e = false;
    }

    public void d() {
        Pq pq = this.b;
        byte[] bArr = pq.a;
        if (bArr.length != 65025) {
            pq.a = Arrays.copyOf(bArr, Math.max(65025, pq.d()));
        }
    }

    public On a() {
        return this.a;
    }

    private int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            On on = this.a;
            if (i5 >= on.h) {
                break;
            }
            int[] iArr = on.k;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
