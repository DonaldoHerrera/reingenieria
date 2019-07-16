package defpackage;

import com.google.android.exoplayer2.B;
import com.google.android.exoplayer2.C0614n;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;

/* renamed from: dr reason: default package and case insensitive filesystem */
/* compiled from: CameraMotionRenderer */
public class C1243dr extends C0614n {
    private final B j = new B();
    private final Qm k = new Qm(1);
    private final Pq l = new Pq();
    private long m;
    private C1213cr n;
    private long o;

    public C1243dr() {
        super(5);
    }

    private void x() {
        this.o = 0;
        C1213cr crVar = this.n;
        if (crVar != null) {
            crVar.a();
        }
    }

    public int a(Format format) {
        return "application/x-camera-motion".equals(format.i) ? 4 : 0;
    }

    public boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void t() {
        x();
    }

    public void a(int i, Object obj) throws C0618s {
        if (i == 7) {
            this.n = (C1213cr) obj;
        } else {
            super.a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Format[] formatArr, long j2) throws C0618s {
        this.m = j2;
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z) throws C0618s {
        x();
    }

    public void a(long j2, long j3) throws C0618s {
        while (!g() && this.o < 100000 + j2) {
            this.k.b();
            if (a(this.j, this.k, false) == -4 && !this.k.d()) {
                this.k.f();
                Qm qm = this.k;
                this.o = qm.d;
                if (this.n != null) {
                    float[] a = a(qm.c);
                    if (a != null) {
                        C1213cr crVar = this.n;
                        C0471ar.a(crVar);
                        crVar.a(this.o - this.m, a);
                    }
                }
            } else {
                return;
            }
        }
    }

    public boolean a() {
        return g();
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.l.a(byteBuffer.array(), byteBuffer.limit());
        this.l.e(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.l.k());
        }
        return fArr;
    }
}
