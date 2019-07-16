package defpackage;

import com.google.android.exoplayer2.H;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: On reason: default package */
/* compiled from: OggPageHeader */
final class On {
    private static final int a = C0471ar.b("OggS");
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public final int[] k = new int[255];
    private final Pq l = new Pq(255);

    On() {
    }

    public void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
    }

    public boolean a(C0313an anVar, boolean z) throws IOException, InterruptedException {
        this.l.B();
        a();
        if (!(anVar.getLength() == -1 || anVar.getLength() - anVar.b() >= 27) || !anVar.a(this.l.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.l.v() == ((long) a)) {
            this.b = this.l.t();
            if (this.b == 0) {
                this.c = this.l.t();
                this.d = this.l.l();
                this.e = this.l.m();
                this.f = this.l.m();
                this.g = this.l.m();
                this.h = this.l.t();
                this.i = this.h + 27;
                this.l.B();
                anVar.a(this.l.a, 0, this.h);
                for (int i2 = 0; i2 < this.h; i2++) {
                    this.k[i2] = this.l.t();
                    this.j += this.k[i2];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new H("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new H("expected OggS capture pattern at begin of page");
        }
    }
}
