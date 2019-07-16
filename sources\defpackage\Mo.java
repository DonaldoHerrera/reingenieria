package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.B;
import com.google.android.exoplayer2.C0614n;
import com.google.android.exoplayer2.C0615o;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.m;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.r;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Mo reason: default package */
/* compiled from: MediaCodecRenderer */
public abstract class Mo extends C0614n {
    private static final byte[] j = C0471ar.a("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private long B = -9223372036854775807L;
    private float C = 1.0f;
    private MediaCodec D;
    private Format E;
    private float F = -1.0f;
    private ArrayDeque<Lo> G;
    private a H;
    private Lo I;
    private int J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private ByteBuffer[] T;
    private ByteBuffer[] U;
    private long V;
    private int W;
    private int X;
    private ByteBuffer Y;
    private boolean Z;
    private boolean aa;
    private int ba = 0;
    private int ca = 0;
    private int da = 0;
    private boolean ea;
    private boolean fa;
    private boolean ga;
    private boolean ha;
    private boolean ia;
    private boolean ja;
    private final Oo k;
    private boolean ka;
    private final n<r> l;
    protected Pm la;
    private final boolean m;
    private final boolean n;
    private final float o;
    private final Qm p = new Qm(0);
    private final Qm q = Qm.v();
    private final B r = new B();
    private final Yq<Format> s = new Yq<>();
    private final ArrayList<Long> t = new ArrayList<>();
    private final BufferInfo u = new BufferInfo();
    private Format v;
    private Format w;
    private m<r> x;
    private m<r> y;
    private MediaCrypto z;

    /* renamed from: Mo$a */
    /* compiled from: MediaCodecRenderer */
    public static class a extends Exception {
        public final String a;
        public final boolean b;
        public final String c;
        public final String d;
        public final a e;

        public a(Format format, Throwable th, boolean z, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoder init failed: [");
            sb.append(i);
            sb.append("], ");
            sb.append(format);
            this(sb.toString(), th, format.i, z, null, a(i), null);
        }

        /* access modifiers changed from: private */
        public a a(a aVar) {
            a aVar2 = new a(getMessage(), getCause(), this.a, this.b, this.c, this.d, aVar);
            return aVar2;
        }

        public a(Format format, Throwable th, boolean z, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoder init failed: ");
            sb.append(str);
            sb.append(", ");
            sb.append(format);
            this(sb.toString(), th, format.i, z, str, C0471ar.a >= 21 ? a(th) : null, null);
        }

        @TargetApi(21)
        private static String a(Throwable th) {
            if (th instanceof CodecException) {
                return ((CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private a(String str, Throwable th, String str2, boolean z, String str3, String str4, a aVar) {
            super(str, th);
            this.a = str2;
            this.b = z;
            this.c = str3;
            this.d = str4;
            this.e = aVar;
        }

        private static String a(int i) {
            String str = i < 0 ? "neg_" : "";
            StringBuilder sb = new StringBuilder();
            sb.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
            sb.append(str);
            sb.append(Math.abs(i));
            return sb.toString();
        }
    }

    public Mo(int i, Oo oo, n<r> nVar, boolean z2, boolean z3, float f) {
        super(i);
        C1852xq.a(oo);
        this.k = oo;
        this.l = nVar;
        this.m = z2;
        this.n = z3;
        this.o = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ("AFTB".equals(defpackage.C0471ar.d) != false) goto L_0x001e;
     */
    private boolean G() {
        if ("Amazon".equals(C0471ar.c)) {
            if (!"AFTM".equals(C0471ar.d)) {
            }
            return true;
        }
        return false;
    }

    private void H() {
        if (this.ea) {
            this.ca = 1;
            this.da = 1;
        }
    }

    private void I() throws C0618s {
        if (this.ea) {
            this.ca = 1;
            this.da = 3;
            return;
        }
        P();
    }

    private void J() throws C0618s {
        if (C0471ar.a < 23) {
            I();
            return;
        }
        if (this.ea) {
            this.ca = 1;
            this.da = 2;
        } else {
            U();
        }
    }

    private boolean K() throws C0618s {
        int i;
        int i2;
        MediaCodec mediaCodec = this.D;
        if (mediaCodec == null || this.ca == 2 || this.ga) {
            return false;
        }
        if (this.W < 0) {
            this.W = mediaCodec.dequeueInputBuffer(0);
            int i3 = this.W;
            if (i3 < 0) {
                return false;
            }
            this.p.c = a(i3);
            this.p.b();
        }
        if (this.ca == 1) {
            if (!this.S) {
                this.fa = true;
                this.D.queueInputBuffer(this.W, 0, 0, 0, 4);
                R();
            }
            this.ca = 2;
            return false;
        } else if (this.Q) {
            this.Q = false;
            this.p.c.put(j);
            this.D.queueInputBuffer(this.W, 0, j.length, 0, 0);
            R();
            this.ea = true;
            return true;
        } else {
            if (this.ia) {
                i2 = -4;
                i = 0;
            } else {
                if (this.ba == 1) {
                    for (int i4 = 0; i4 < this.E.k.size(); i4++) {
                        this.p.c.put((byte[]) this.E.k.get(i4));
                    }
                    this.ba = 2;
                }
                int position = this.p.c.position();
                i = position;
                i2 = a(this.r, this.p, false);
            }
            if (i2 == -3) {
                return false;
            }
            if (i2 == -5) {
                if (this.ba == 2) {
                    this.p.b();
                    this.ba = 1;
                }
                b(this.r.a);
                return true;
            } else if (this.p.d()) {
                if (this.ba == 2) {
                    this.p.b();
                    this.ba = 1;
                }
                this.ga = true;
                if (!this.ea) {
                    M();
                    return false;
                }
                try {
                    if (!this.S) {
                        this.fa = true;
                        this.D.queueInputBuffer(this.W, 0, 0, 0, 4);
                        R();
                    }
                    return false;
                } catch (CryptoException e) {
                    throw C0618s.a(e, q());
                }
            } else if (!this.ja || this.p.e()) {
                this.ja = false;
                boolean g = this.p.g();
                this.ia = d(g);
                if (this.ia) {
                    return false;
                }
                if (this.L && !g) {
                    Mq.a(this.p.c);
                    if (this.p.c.position() == 0) {
                        return true;
                    }
                    this.L = false;
                }
                try {
                    long j2 = this.p.d;
                    if (this.p.c()) {
                        this.t.add(Long.valueOf(j2));
                    }
                    if (this.ka) {
                        this.s.a(j2, this.v);
                        this.ka = false;
                    }
                    this.p.f();
                    a(this.p);
                    if (g) {
                        this.D.queueSecureInputBuffer(this.W, 0, a(this.p, i), j2, 0);
                    } else {
                        this.D.queueInputBuffer(this.W, 0, this.p.c.limit(), j2, 0);
                    }
                    R();
                    this.ea = true;
                    this.ba = 0;
                    this.la.c++;
                    return true;
                } catch (CryptoException e2) {
                    throw C0618s.a(e2, q());
                }
            } else {
                this.p.b();
                if (this.ba == 2) {
                    this.ba = 1;
                }
                return true;
            }
        }
    }

    private boolean L() {
        return this.X >= 0;
    }

    private void M() throws C0618s {
        int i = this.da;
        if (i == 1) {
            x();
        } else if (i == 2) {
            U();
        } else if (i != 3) {
            this.ha = true;
            F();
        } else {
            P();
        }
    }

    private void N() {
        if (C0471ar.a < 21) {
            this.U = this.D.getOutputBuffers();
        }
    }

    private void O() throws C0618s {
        MediaFormat outputFormat = this.D.getOutputFormat();
        if (this.J != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.R = true;
            return;
        }
        if (this.P) {
            outputFormat.setInteger("channel-count", 1);
        }
        a(this.D, outputFormat);
    }

    private void P() throws C0618s {
        E();
        D();
    }

    private void Q() {
        if (C0471ar.a < 21) {
            this.T = null;
            this.U = null;
        }
    }

    private void R() {
        this.W = -1;
        this.p.c = null;
    }

    private void S() {
        this.X = -1;
        this.Y = null;
    }

    private void T() throws C0618s {
        if (C0471ar.a >= 23) {
            float a2 = a(this.C, this.E, r());
            float f = this.F;
            if (f != a2) {
                if (a2 == -1.0f) {
                    I();
                } else if (f != -1.0f || a2 > this.o) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", a2);
                    this.D.setParameters(bundle);
                    this.F = a2;
                }
            }
        }
    }

    @TargetApi(23)
    private void U() throws C0618s {
        r rVar = (r) this.y.b();
        if (rVar == null) {
            P();
        } else if (C0615o.e.equals(rVar.a)) {
            P();
        } else if (!x()) {
            try {
                this.z.setMediaDrmSession(rVar.b);
                b(this.y);
                this.ca = 0;
                this.da = 0;
            } catch (MediaCryptoException e) {
                throw C0618s.a(e, q());
            }
        }
    }

    private List<Lo> b(boolean z2) throws b {
        List<Lo> a2 = a(this.k, this.v, z2);
        if (a2.isEmpty() && z2) {
            a2 = a(this.k, this.v, false);
            if (!a2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Drm session requires secure decoder for ");
                sb.append(this.v.i);
                sb.append(", but no secure decoder available. Trying to proceed with ");
                sb.append(a2);
                sb.append(".");
                Iq.d("MediaCodecRenderer", sb.toString());
            }
        }
        return a2;
    }

    private boolean c(boolean z2) throws C0618s {
        this.q.b();
        int a2 = a(this.r, this.q, z2);
        if (a2 == -5) {
            b(this.r.a);
            return true;
        }
        if (a2 == -4 && this.q.d()) {
            this.ga = true;
            M();
        }
        return false;
    }

    private boolean e(long j2) {
        return this.B == -9223372036854775807L || SystemClock.elapsedRealtime() - j2 < this.B;
    }

    private boolean f(long j2) {
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.t.get(i)).longValue() == j2) {
                this.t.remove(i);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final Lo A() {
        return this.I;
    }

    /* access modifiers changed from: protected */
    public boolean B() {
        return false;
    }

    /* access modifiers changed from: protected */
    public long C() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void D() throws C0618s {
        if (this.D == null && this.v != null) {
            b(this.y);
            String str = this.v.i;
            m<r> mVar = this.x;
            if (mVar != null) {
                if (this.z == null) {
                    r rVar = (r) mVar.b();
                    if (rVar != null) {
                        try {
                            this.z = new MediaCrypto(rVar.a, rVar.b);
                            this.A = !rVar.c && this.z.requiresSecureDecoderComponent(str);
                        } catch (MediaCryptoException e) {
                            throw C0618s.a(e, q());
                        }
                    } else if (this.x.a() == null) {
                        return;
                    }
                }
                if (G()) {
                    int state = this.x.getState();
                    if (state == 1) {
                        throw C0618s.a(this.x.a(), q());
                    } else if (state != 4) {
                        return;
                    }
                }
            }
            try {
                a(this.z, this.A);
            } catch (a e2) {
                throw C0618s.a(e2, q());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void E() {
        this.G = null;
        this.I = null;
        this.E = null;
        R();
        S();
        Q();
        this.ia = false;
        this.V = -9223372036854775807L;
        this.t.clear();
        try {
            if (this.D != null) {
                this.la.b++;
                this.D.stop();
                this.D.release();
            }
            this.D = null;
            try {
                if (this.z != null) {
                    this.z.release();
                }
            } finally {
                this.z = null;
                this.A = false;
                b(null);
            }
        } catch (Throwable th) {
            this.D = null;
            try {
                if (this.z != null) {
                    this.z.release();
                }
                throw th;
            } finally {
                this.z = null;
                this.A = false;
                b(null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void F() throws C0618s {
    }

    /* access modifiers changed from: protected */
    public abstract float a(float f, Format format, Format[] formatArr);

    /* access modifiers changed from: protected */
    public abstract int a(Oo oo, n<r> nVar, Format format) throws b;

    /* access modifiers changed from: protected */
    public abstract int a(MediaCodec mediaCodec, Lo lo, Format format, Format format2);

    public final int a(Format format) throws C0618s {
        try {
            return a(this.k, this.l, format);
        } catch (b e) {
            throw C0618s.a(e, q());
        }
    }

    /* access modifiers changed from: protected */
    public abstract List<Lo> a(Oo oo, Format format, boolean z2) throws b;

    /* access modifiers changed from: protected */
    public abstract void a(Lo lo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f) throws b;

    /* access modifiers changed from: protected */
    public abstract void a(Qm qm);

    /* access modifiers changed from: protected */
    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C0618s;

    /* access modifiers changed from: protected */
    public abstract void a(String str, long j2, long j3);

    /* access modifiers changed from: protected */
    public abstract boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j4, boolean z2, Format format) throws C0618s;

    /* access modifiers changed from: protected */
    public boolean a(Lo lo) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void c(long j2);

    /* access modifiers changed from: protected */
    public final Format d(long j2) {
        Format format = (Format) this.s.a(j2);
        if (format != null) {
            this.w = format;
        }
        return format;
    }

    public final int o() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public void t() {
        this.v = null;
        if (this.y == null && this.x == null) {
            y();
        } else {
            u();
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
        try {
            E();
        } finally {
            c(null);
        }
    }

    /* access modifiers changed from: protected */
    public void v() {
    }

    /* access modifiers changed from: protected */
    public void w() {
    }

    /* access modifiers changed from: protected */
    public final boolean x() throws C0618s {
        boolean y2 = y();
        if (y2) {
            D();
        }
        return y2;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        if (this.D == null) {
            return false;
        }
        if (this.da == 3 || this.M || (this.N && this.fa)) {
            E();
            return true;
        }
        this.D.flush();
        R();
        S();
        this.V = -9223372036854775807L;
        this.fa = false;
        this.ea = false;
        this.ja = true;
        this.Q = false;
        this.R = false;
        this.Z = false;
        this.ia = false;
        this.t.clear();
        this.ca = 0;
        this.da = 0;
        this.ba = this.aa ? 1 : 0;
        return false;
    }

    /* access modifiers changed from: protected */
    public final MediaCodec z() {
        return this.D;
    }

    private boolean d(boolean z2) throws C0618s {
        if (this.x == null || (!z2 && this.m)) {
            return false;
        }
        int state = this.x.getState();
        boolean z3 = true;
        if (state != 1) {
            if (state == 4) {
                z3 = false;
            }
            return z3;
        }
        throw C0618s.a(this.x.a(), q());
    }

    private static boolean e(String str) {
        return C0471ar.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2) throws C0618s {
        this.la = new Pm();
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z2) throws C0618s {
        this.ga = false;
        this.ha = false;
        x();
        this.s.a();
    }

    private static boolean d(String str) {
        int i = C0471ar.a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (C0471ar.a == 19 && C0471ar.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private void c(m<r> mVar) {
        m<r> mVar2 = this.y;
        this.y = mVar;
        a(mVar2);
    }

    private ByteBuffer b(int i) {
        if (C0471ar.a >= 21) {
            return this.D.getOutputBuffer(i);
        }
        return this.U[i];
    }

    public final void a(float f) throws C0618s {
        this.C = f;
        if (this.D != null && this.da != 3 && getState() != 0) {
            T();
        }
    }

    private static boolean c(String str) {
        return C0471ar.a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private void b(m<r> mVar) {
        m<r> mVar2 = this.x;
        this.x = mVar;
        a(mVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    public void a(long j2, long j3) throws C0618s {
        if (this.ha) {
            F();
        } else if (this.v != null || c(true)) {
            D();
            if (this.D != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                _q.a("drainAndFeed");
                do {
                } while (b(j2, j3));
                while (K()) {
                    if (!e(elapsedRealtime)) {
                        break;
                    }
                    while (K()) {
                    }
                }
                _q.a();
            } else {
                this.la.d += b(j2);
                c(false);
            }
            this.la.a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c6, code lost:
        if (r5.o == r2.o) goto L_0x00ca;
     */
    public void b(Format format) throws C0618s {
        Format format2 = this.v;
        this.v = format;
        boolean z2 = true;
        this.ka = true;
        if (!C0471ar.a((Object) format.l, format2 == null ? null : format2.l)) {
            if (format.l != null) {
                n<r> nVar = this.l;
                if (nVar != null) {
                    m<r> a2 = nVar.a(Looper.myLooper(), format.l);
                    if (a2 == this.y || a2 == this.x) {
                        this.l.a(a2);
                    }
                    c(a2);
                } else {
                    throw C0618s.a(new IllegalStateException("Media requires a DrmSessionManager"), q());
                }
            } else {
                c(null);
            }
        }
        if (this.D == null) {
            D();
        } else if ((this.y != null || this.x == null) && ((this.y == null || this.x != null) && ((this.y == null || this.I.f) && (C0471ar.a >= 23 || this.y == this.x)))) {
            int a3 = a(this.D, this.I, this.E, format);
            if (a3 == 0) {
                I();
            } else if (a3 == 1) {
                this.E = format;
                T();
                if (this.y != this.x) {
                    J();
                } else {
                    H();
                }
            } else if (a3 != 2) {
                if (a3 == 3) {
                    this.E = format;
                    T();
                    if (this.y != this.x) {
                        J();
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (this.K) {
                I();
            } else {
                this.aa = true;
                this.ba = 1;
                int i = this.J;
                if (i != 2) {
                    if (i == 1) {
                        int i2 = format.n;
                        Format format3 = this.E;
                        if (i2 == format3.n) {
                        }
                    }
                    z2 = false;
                }
                this.Q = z2;
                this.E = format;
                T();
                if (this.y != this.x) {
                    J();
                }
            }
        } else {
            I();
        }
    }

    private void a(MediaCrypto mediaCrypto, boolean z2) throws a {
        if (this.G == null) {
            try {
                List b = b(z2);
                if (this.n) {
                    this.G = new ArrayDeque<>(b);
                } else {
                    this.G = new ArrayDeque<>(Collections.singletonList(b.get(0)));
                }
                this.H = null;
            } catch (b e) {
                throw new a(this.v, (Throwable) e, z2, -49998);
            }
        }
        if (!this.G.isEmpty()) {
            while (this.D == null) {
                Lo lo = (Lo) this.G.peekFirst();
                if (a(lo)) {
                    try {
                        a(lo, mediaCrypto);
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to initialize decoder: ");
                        sb.append(lo);
                        Iq.b("MediaCodecRenderer", sb.toString(), e2);
                        this.G.removeFirst();
                        a aVar = new a(this.v, (Throwable) e2, z2, lo.a);
                        a aVar2 = this.H;
                        if (aVar2 == null) {
                            this.H = aVar;
                        } else {
                            this.H = aVar2.a(aVar);
                        }
                        if (this.G.isEmpty()) {
                            throw this.H;
                        }
                    }
                } else {
                    return;
                }
            }
            this.G = null;
            return;
        }
        throw new a(this.v, (Throwable) null, z2, -49999);
    }

    private void a(Lo lo, MediaCrypto mediaCrypto) throws Exception {
        float f;
        String str = lo.a;
        if (C0471ar.a < 23) {
            f = -1.0f;
        } else {
            f = a(this.C, this.v, r());
        }
        if (f <= this.o) {
            f = -1.0f;
        }
        MediaCodec mediaCodec = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            sb.append("createCodec:");
            sb.append(str);
            _q.a(sb.toString());
            mediaCodec = MediaCodec.createByCodecName(str);
            _q.a();
            _q.a("configureCodec");
            a(lo, mediaCodec, this.v, mediaCrypto, f);
            _q.a();
            _q.a("startCodec");
            mediaCodec.start();
            _q.a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            a(mediaCodec);
            this.D = mediaCodec;
            this.I = lo;
            this.F = f;
            this.E = this.v;
            this.J = a(str);
            this.K = e(str);
            this.L = a(str, this.E);
            this.M = d(str);
            this.N = b(str);
            this.O = c(str);
            this.P = b(str, this.E);
            this.S = b(lo) || B();
            R();
            S();
            this.V = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.aa = false;
            this.ba = 0;
            this.fa = false;
            this.ea = false;
            this.ca = 0;
            this.da = 0;
            this.Q = false;
            this.R = false;
            this.Z = false;
            this.ja = true;
            this.la.a++;
            a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Exception e) {
            if (mediaCodec != null) {
                Q();
                mediaCodec.release();
            }
            throw e;
        }
    }

    public boolean b() {
        return this.v != null && !this.ia && (s() || L() || (this.V != -9223372036854775807L && SystemClock.elapsedRealtime() < this.V));
    }

    private boolean b(long j2, long j3) throws C0618s {
        boolean z2;
        int i;
        if (!L()) {
            if (!this.O || !this.fa) {
                i = this.D.dequeueOutputBuffer(this.u, C());
            } else {
                try {
                    i = this.D.dequeueOutputBuffer(this.u, C());
                } catch (IllegalStateException unused) {
                    M();
                    if (this.ha) {
                        E();
                    }
                    return false;
                }
            }
            if (i < 0) {
                if (i == -2) {
                    O();
                    return true;
                } else if (i == -3) {
                    N();
                    return true;
                } else {
                    if (this.S && (this.ga || this.ca == 2)) {
                        M();
                    }
                    return false;
                }
            } else if (this.R) {
                this.R = false;
                this.D.releaseOutputBuffer(i, false);
                return true;
            } else {
                BufferInfo bufferInfo = this.u;
                if (bufferInfo.size != 0 || (bufferInfo.flags & 4) == 0) {
                    this.X = i;
                    this.Y = b(i);
                    ByteBuffer byteBuffer = this.Y;
                    if (byteBuffer != null) {
                        byteBuffer.position(this.u.offset);
                        ByteBuffer byteBuffer2 = this.Y;
                        BufferInfo bufferInfo2 = this.u;
                        byteBuffer2.limit(bufferInfo2.offset + bufferInfo2.size);
                    }
                    this.Z = f(this.u.presentationTimeUs);
                    d(this.u.presentationTimeUs);
                } else {
                    M();
                    return false;
                }
            }
        }
        if (!this.O || !this.fa) {
            MediaCodec mediaCodec = this.D;
            ByteBuffer byteBuffer3 = this.Y;
            int i2 = this.X;
            BufferInfo bufferInfo3 = this.u;
            z2 = a(j2, j3, mediaCodec, byteBuffer3, i2, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.Z, this.w);
        } else {
            try {
                z2 = a(j2, j3, this.D, this.Y, this.X, this.u.flags, this.u.presentationTimeUs, this.Z, this.w);
            } catch (IllegalStateException unused2) {
                M();
                if (this.ha) {
                    E();
                }
                return false;
            }
        }
        if (z2) {
            c(this.u.presentationTimeUs);
            boolean z3 = (this.u.flags & 4) != 0;
            S();
            if (!z3) {
                return true;
            }
            M();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3.f != false) goto L_0x0030;
     */
    private static boolean b(Lo lo) {
        String str = lo.a;
        if (C0471ar.a > 17 || (!"OMX.rk.video_decoder.avc".equals(str) && !"OMX.allwinner.video.decoder.avc".equals(str))) {
            if ("Amazon".equals(C0471ar.c)) {
                if ("AFTS".equals(C0471ar.d)) {
                }
            }
            return false;
        }
        return true;
    }

    private void a(MediaCodec mediaCodec) {
        if (C0471ar.a < 21) {
            this.T = mediaCodec.getInputBuffers();
            this.U = mediaCodec.getOutputBuffers();
        }
    }

    private ByteBuffer a(int i) {
        if (C0471ar.a >= 21) {
            return this.D.getInputBuffer(i);
        }
        return this.T[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if ("stvm8".equals(defpackage.C0471ar.b) != false) goto L_0x0028;
     */
    private static boolean b(String str) {
        if (C0471ar.a > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (C0471ar.a <= 19) {
                if (!"hb2000".equals(C0471ar.b)) {
                }
                if (!"OMX.amlogic.avc.decoder.awesome".equals(str)) {
                }
            }
            return false;
        }
        return true;
    }

    private void a(m<r> mVar) {
        if (mVar != null && mVar != this.y && mVar != this.x) {
            this.l.a(mVar);
        }
    }

    private static boolean b(String str, Format format) {
        if (C0471ar.a > 18 || format.v != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    public boolean a() {
        return this.ha;
    }

    private static CryptoInfo a(Qm qm, int i) {
        CryptoInfo a2 = qm.b.a();
        if (i == 0) {
            return a2;
        }
        if (a2.numBytesOfClearData == null) {
            a2.numBytesOfClearData = new int[1];
        }
        int[] iArr = a2.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if ("tilapia".equals(defpackage.C0471ar.b) != false) goto L_0x0076;
     */
    private int a(String str) {
        if (C0471ar.a <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (C0471ar.d.startsWith("SM-T585") || C0471ar.d.startsWith("SM-A510") || C0471ar.d.startsWith("SM-A520") || C0471ar.d.startsWith("SM-J700"))) {
            return 2;
        }
        if (C0471ar.a < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
            if (!"flounder".equals(C0471ar.b)) {
                if (!"flounder_lte".equals(C0471ar.b)) {
                    if (!"grouper".equals(C0471ar.b)) {
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    private static boolean a(String str, Format format) {
        return C0471ar.a < 21 && format.k.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }
}
