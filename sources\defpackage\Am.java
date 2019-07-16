package defpackage;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.google.android.exoplayer2.J;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: Am reason: default package */
/* compiled from: DefaultAudioSink */
public final class Am implements C1698sm {
    public static boolean a = false;
    public static boolean b = false;
    private long A;
    private long B;
    private int C;
    private int D;
    private long E;
    private float F;
    private C1639qm[] G;
    private ByteBuffer[] H;
    private ByteBuffer I;
    private ByteBuffer J;
    private byte[] K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private int P;
    private C1788vm Q;
    private boolean R;
    /* access modifiers changed from: private */
    public long S;
    private final C1516mm c;
    private final a d;
    private final boolean e;
    private final C1848xm f;
    private final Jm g;
    private final C1639qm[] h;
    private final C1639qm[] i;
    /* access modifiers changed from: private */
    public final ConditionVariable j;
    private final C1758um k;
    private final ArrayDeque<e> l;
    /* access modifiers changed from: private */
    public defpackage.C1698sm.c m;
    private AudioTrack n;
    private b o;
    private b p;
    private AudioTrack q;
    private C1485lm r;
    private J s;
    private J t;
    private long u;
    private long v;
    private ByteBuffer w;
    private int x;
    private long y;
    private long z;

    /* renamed from: Am$a */
    /* compiled from: DefaultAudioSink */
    public interface a {
        long a(long j);

        J a(J j);

        C1639qm[] a();

        long b();
    }

    /* renamed from: Am$b */
    /* compiled from: DefaultAudioSink */
    private static final class b {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final boolean j;
        public final C1639qm[] k;

        public b(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2, boolean z3, C1639qm[] qmVarArr) {
            this.a = z;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            if (i8 == 0) {
                i8 = a();
            }
            this.h = i8;
            this.i = z2;
            this.j = z3;
            this.k = qmVarArr;
        }

        public boolean a(b bVar) {
            return bVar.g == this.g && bVar.e == this.e && bVar.f == this.f;
        }

        public long b(long j2) {
            return (j2 * 1000000) / ((long) this.e);
        }

        public long c(long j2) {
            return (j2 * 1000000) / ((long) this.c);
        }

        @TargetApi(21)
        private AudioTrack b(boolean z, C1485lm lmVar, int i2) {
            AudioAttributes audioAttributes;
            if (z) {
                audioAttributes = new Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                audioAttributes = lmVar.a();
            }
            AudioTrack audioTrack = new AudioTrack(audioAttributes, new AudioFormat.Builder().setChannelMask(this.f).setEncoding(this.g).setSampleRate(this.e).build(), this.h, 1, i2 != 0 ? i2 : 0);
            return audioTrack;
        }

        public long a(long j2) {
            return (j2 * ((long) this.e)) / 1000000;
        }

        public AudioTrack a(boolean z, C1485lm lmVar, int i2) throws defpackage.C1698sm.b {
            AudioTrack audioTrack;
            if (C0471ar.a >= 21) {
                audioTrack = b(z, lmVar, i2);
            } else {
                int d2 = C0471ar.d(lmVar.d);
                if (i2 == 0) {
                    audioTrack = new AudioTrack(d2, this.e, this.f, this.g, this.h, 1);
                } else {
                    audioTrack = new AudioTrack(d2, this.e, this.f, this.g, this.h, 1, i2);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new defpackage.C1698sm.b(state, this.e, this.f, this.h);
        }

        private int a() {
            if (this.a) {
                int minBufferSize = AudioTrack.getMinBufferSize(this.e, this.f, this.g);
                C1852xq.b(minBufferSize != -2);
                return C0471ar.a(minBufferSize * 4, ((int) a(250000)) * this.d, (int) Math.max((long) minBufferSize, a(750000) * ((long) this.d)));
            }
            int b2 = Am.c(this.g);
            if (this.g == 5) {
                b2 *= 2;
            }
            return (int) ((((long) b2) * 250000) / 1000000);
        }
    }

    /* renamed from: Am$c */
    /* compiled from: DefaultAudioSink */
    public static class c implements a {
        private final C1639qm[] a;
        private final Gm b = new Gm();
        private final Im c = new Im();

        public c(C1639qm... qmVarArr) {
            this.a = (C1639qm[]) Arrays.copyOf(qmVarArr, qmVarArr.length + 2);
            C1639qm[] qmVarArr2 = this.a;
            qmVarArr2[qmVarArr.length] = this.b;
            qmVarArr2[qmVarArr.length + 1] = this.c;
        }

        public C1639qm[] a() {
            return this.a;
        }

        public long b() {
            return this.b.k();
        }

        public J a(J j) {
            this.b.a(j.d);
            return new J(this.c.b(j.b), this.c.a(j.c), j.d);
        }

        public long a(long j) {
            return this.c.a(j);
        }
    }

    /* renamed from: Am$d */
    /* compiled from: DefaultAudioSink */
    public static final class d extends RuntimeException {
        /* synthetic */ d(String str, C1878ym ymVar) {
            this(str);
        }

        private d(String str) {
            super(str);
        }
    }

    /* renamed from: Am$e */
    /* compiled from: DefaultAudioSink */
    private static final class e {
        /* access modifiers changed from: private */
        public final J a;
        /* access modifiers changed from: private */
        public final long b;
        /* access modifiers changed from: private */
        public final long c;

        /* synthetic */ e(J j, long j2, long j3, C1878ym ymVar) {
            this(j, j2, j3);
        }

        private e(J j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    /* renamed from: Am$f */
    /* compiled from: DefaultAudioSink */
    private final class f implements defpackage.C1758um.a {
        private f() {
        }

        public void a(long j, long j2, long j3, long j4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j);
            String str = ", ";
            sb.append(str);
            sb.append(j2);
            sb.append(str);
            sb.append(j3);
            sb.append(str);
            sb.append(j4);
            sb.append(str);
            sb.append(Am.this.i());
            sb.append(str);
            sb.append(Am.this.j());
            String sb2 = sb.toString();
            if (!Am.b) {
                Iq.d("AudioTrack", sb2);
                return;
            }
            throw new d(sb2, null);
        }

        public void b(long j, long j2, long j3, long j4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j);
            String str = ", ";
            sb.append(str);
            sb.append(j2);
            sb.append(str);
            sb.append(j3);
            sb.append(str);
            sb.append(j4);
            sb.append(str);
            sb.append(Am.this.i());
            sb.append(str);
            sb.append(Am.this.j());
            String sb2 = sb.toString();
            if (!Am.b) {
                Iq.d("AudioTrack", sb2);
                return;
            }
            throw new d(sb2, null);
        }

        /* synthetic */ f(Am am, C1878ym ymVar) {
            this();
        }

        public void a(long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j);
            Iq.d("AudioTrack", sb.toString());
        }

        public void a(int i, long j) {
            if (Am.this.m != null) {
                Am.this.m.a(i, j, SystemClock.elapsedRealtime() - Am.this.S);
            }
        }
    }

    public Am(C1516mm mmVar, C1639qm[] qmVarArr) {
        this(mmVar, qmVarArr, false);
    }

    private void h() {
        int i2 = 0;
        while (true) {
            C1639qm[] qmVarArr = this.G;
            if (i2 < qmVarArr.length) {
                C1639qm qmVar = qmVarArr[i2];
                qmVar.flush();
                this.H[i2] = qmVar.b();
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public long i() {
        b bVar = this.p;
        return bVar.a ? this.y / ((long) bVar.b) : this.z;
    }

    /* access modifiers changed from: private */
    public long j() {
        b bVar = this.p;
        return bVar.a ? this.A / ((long) bVar.d) : this.B;
    }

    private void k() throws defpackage.C1698sm.b {
        this.j.block();
        b bVar = this.p;
        C1852xq.a(bVar);
        this.q = bVar.a(this.R, this.r, this.P);
        int audioSessionId = this.q.getAudioSessionId();
        if (a && C0471ar.a < 21) {
            AudioTrack audioTrack = this.n;
            if (!(audioTrack == null || audioSessionId == audioTrack.getAudioSessionId())) {
                m();
            }
            if (this.n == null) {
                this.n = d(audioSessionId);
            }
        }
        if (this.P != audioSessionId) {
            this.P = audioSessionId;
            defpackage.C1698sm.c cVar = this.m;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        this.t = this.p.j ? this.d.a(this.t) : J.a;
        o();
        C1758um umVar = this.k;
        AudioTrack audioTrack2 = this.q;
        b bVar2 = this.p;
        umVar.a(audioTrack2, bVar2.g, bVar2.d, bVar2.h);
        n();
        int i2 = this.Q.a;
        if (i2 != 0) {
            this.q.attachAuxEffect(i2);
            this.q.setAuxEffectSendLevel(this.Q.b);
        }
    }

    private boolean l() {
        return this.q != null;
    }

    private void m() {
        AudioTrack audioTrack = this.n;
        if (audioTrack != null) {
            this.n = null;
            new C1908zm(this, audioTrack).start();
        }
    }

    private void n() {
        if (l()) {
            if (C0471ar.a >= 21) {
                a(this.q, this.F);
            } else {
                b(this.q, this.F);
            }
        }
    }

    private void o() {
        C1639qm[] qmVarArr = this.p.k;
        ArrayList arrayList = new ArrayList();
        for (C1639qm qmVar : qmVarArr) {
            if (qmVar.isActive()) {
                arrayList.add(qmVar);
            } else {
                qmVar.flush();
            }
        }
        int size = arrayList.size();
        this.G = (C1639qm[]) arrayList.toArray(new C1639qm[size]);
        this.H = new ByteBuffer[size];
        h();
    }

    public void f() throws defpackage.C1698sm.d {
        if (!this.N && l() && b()) {
            this.k.b(j());
            this.q.stop();
            this.x = 0;
            this.N = true;
        }
    }

    public void flush() {
        if (l()) {
            this.y = 0;
            this.z = 0;
            this.A = 0;
            this.B = 0;
            this.C = 0;
            J j2 = this.s;
            if (j2 != null) {
                this.t = j2;
                this.s = null;
            } else if (!this.l.isEmpty()) {
                this.t = ((e) this.l.getLast()).a;
            }
            this.l.clear();
            this.u = 0;
            this.v = 0;
            this.g.l();
            h();
            this.I = null;
            this.J = null;
            this.N = false;
            this.M = -1;
            this.w = null;
            this.x = 0;
            this.D = 0;
            if (this.k.a()) {
                this.q.pause();
            }
            AudioTrack audioTrack = this.q;
            this.q = null;
            b bVar = this.o;
            if (bVar != null) {
                this.p = bVar;
                this.o = null;
            }
            this.k.c();
            this.j.close();
            new C1878ym(this, audioTrack).start();
        }
    }

    public void g() {
        if (this.D == 1) {
            this.D = 2;
        }
    }

    public void pause() {
        this.O = false;
        if (l() && this.k.b()) {
            this.q.pause();
        }
    }

    public void play() {
        this.O = true;
        if (l()) {
            this.k.d();
            this.q.play();
        }
    }

    public void reset() {
        flush();
        m();
        for (C1639qm reset : this.h) {
            reset.reset();
        }
        for (C1639qm reset2 : this.i) {
            reset2.reset();
        }
        this.P = 0;
        this.O = false;
    }

    public Am(C1516mm mmVar, C1639qm[] qmVarArr, boolean z2) {
        this(mmVar, (a) new c(qmVarArr), z2);
    }

    private void c(long j2) throws defpackage.C1698sm.d {
        ByteBuffer byteBuffer;
        int length = this.G.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.H[i2 - 1];
            } else {
                byteBuffer = this.I;
                if (byteBuffer == null) {
                    byteBuffer = C1639qm.a;
                }
            }
            if (i2 == length) {
                b(byteBuffer, j2);
            } else {
                C1639qm qmVar = this.G[i2];
                qmVar.a(byteBuffer);
                ByteBuffer b2 = qmVar.b();
                this.H[i2] = b2;
                if (b2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    public void a(defpackage.C1698sm.c cVar) {
        this.m = cVar;
    }

    public boolean d() {
        return l() && this.k.c(j());
    }

    public void e() {
        if (this.R) {
            this.R = false;
            this.P = 0;
            flush();
        }
    }

    public Am(C1516mm mmVar, a aVar, boolean z2) {
        this.c = mmVar;
        C1852xq.a(aVar);
        this.d = aVar;
        this.e = z2;
        this.j = new ConditionVariable(true);
        this.k = new C1758um(new f(this, null));
        this.f = new C1848xm();
        this.g = new Jm();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C1818wm[]{new Fm(), this.f, this.g});
        Collections.addAll(arrayList, aVar.a());
        this.h = (C1639qm[]) arrayList.toArray(new C1639qm[0]);
        this.i = new C1639qm[]{new Cm()};
        this.F = 1.0f;
        this.D = 0;
        this.r = C1485lm.a;
        this.P = 0;
        this.Q = new C1788vm(0, 0.0f);
        this.t = J.a;
        this.M = -1;
        this.G = new C1639qm[0];
        this.H = new ByteBuffer[0];
        this.l = new ArrayDeque<>();
    }

    private void b(ByteBuffer byteBuffer, long j2) throws defpackage.C1698sm.d {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.J;
            boolean z2 = true;
            int i2 = 0;
            if (byteBuffer2 != null) {
                C1852xq.a(byteBuffer2 == byteBuffer);
            } else {
                this.J = byteBuffer;
                if (C0471ar.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.K;
                    if (bArr == null || bArr.length < remaining) {
                        this.K = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.K, 0, remaining);
                    byteBuffer.position(position);
                    this.L = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C0471ar.a < 21) {
                int a2 = this.k.a(this.A);
                if (a2 > 0) {
                    i2 = this.q.write(this.K, this.L, Math.min(remaining2, a2));
                    if (i2 > 0) {
                        this.L += i2;
                        byteBuffer.position(byteBuffer.position() + i2);
                    }
                }
            } else if (this.R) {
                if (j2 == -9223372036854775807L) {
                    z2 = false;
                }
                C1852xq.b(z2);
                i2 = a(this.q, byteBuffer, remaining2, j2);
            } else {
                i2 = a(this.q, byteBuffer, remaining2);
            }
            this.S = SystemClock.elapsedRealtime();
            if (i2 >= 0) {
                if (this.p.a) {
                    this.A += (long) i2;
                }
                if (i2 == remaining2) {
                    if (!this.p.a) {
                        this.B += (long) this.C;
                    }
                    this.J = null;
                }
                return;
            }
            throw new defpackage.C1698sm.d(i2);
        }
    }

    private static AudioTrack d(int i2) {
        AudioTrack audioTrack = new AudioTrack(3, 4000, 4, 2, 2, 0, i2);
        return audioTrack;
    }

    public boolean a(int i2, int i3) {
        boolean z2 = true;
        if (C0471ar.f(i3)) {
            if (i3 == 4 && C0471ar.a < 21) {
                z2 = false;
            }
            return z2;
        }
        C1516mm mmVar = this.c;
        if (mmVar == null || !mmVar.a(i3) || (i2 != -1 && i2 > this.c.a())) {
            z2 = false;
        }
        return z2;
    }

    public long a(boolean z2) {
        if (!l() || this.D == 0) {
            return Long.MIN_VALUE;
        }
        return this.E + a(b(Math.min(this.k.a(z2), this.p.b(j()))));
    }

    public J c() {
        return this.t;
    }

    /* access modifiers changed from: private */
    public static int c(int i2) {
        if (i2 == 5) {
            return 80000;
        }
        if (i2 == 6) {
            return 768000;
        }
        if (i2 == 7) {
            return 192000;
        }
        if (i2 == 8) {
            return 2250000;
        }
        if (i2 == 14) {
            return 3062500;
        }
        if (i2 == 17) {
            return 336000;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d7  */
    public void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int i7) throws defpackage.C1698sm.a {
        int[] iArr2;
        boolean z2;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int a2;
        int i12 = i3;
        if (C0471ar.a < 21 && i12 == 8 && iArr == null) {
            iArr2 = new int[6];
            for (int i13 = 0; i13 < iArr2.length; i13++) {
                iArr2[i13] = i13;
            }
        } else {
            iArr2 = iArr;
        }
        boolean f2 = C0471ar.f(i2);
        if (f2) {
            i8 = i2;
            if (i8 != 4) {
                z2 = true;
                boolean z4 = !this.e && a(i12, 4) && C0471ar.e(i2);
                C1639qm[] qmVarArr = !z4 ? this.i : this.h;
                if (!z2) {
                    this.g.a(i6, i7);
                    this.f.a(iArr2);
                    int length = qmVarArr.length;
                    int i14 = i4;
                    i10 = i12;
                    int i15 = i8;
                    int i16 = 0;
                    boolean z5 = false;
                    while (i16 < length) {
                        C1639qm qmVar = qmVarArr[i16];
                        try {
                            z5 |= qmVar.a(i14, i10, i15);
                            if (qmVar.isActive()) {
                                i10 = qmVar.c();
                                i14 = qmVar.d();
                                i15 = qmVar.e();
                            }
                            i16++;
                        } catch (defpackage.C1639qm.a e2) {
                            throw new defpackage.C1698sm.a((Throwable) e2);
                        }
                    }
                    z3 = z5;
                    i11 = i14;
                    i9 = i15;
                } else {
                    i11 = i4;
                    i10 = i12;
                    i9 = i8;
                    z3 = false;
                }
                a2 = a(i10, f2);
                if (a2 == 0) {
                    int i17 = -1;
                    int b2 = f2 ? C0471ar.b(i2, i3) : -1;
                    if (f2) {
                        i17 = C0471ar.b(i9, i10);
                    }
                    b bVar = new b(f2, b2, i4, i17, i11, a2, i9, i5, z2, z2 && !z4, qmVarArr);
                    if (l()) {
                        if (!bVar.a(this.p)) {
                            flush();
                        } else if (z3) {
                            this.o = bVar;
                            return;
                        }
                    }
                    this.p = bVar;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported channel count: ");
                sb.append(i10);
                throw new defpackage.C1698sm.a(sb.toString());
            }
        } else {
            i8 = i2;
        }
        z2 = false;
        if (!this.e) {
        }
        C1639qm[] qmVarArr2 = !z4 ? this.i : this.h;
        if (!z2) {
        }
        a2 = a(i10, f2);
        if (a2 == 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    private boolean b() throws defpackage.C1698sm.d {
        boolean z2;
        int i2;
        C1639qm[] qmVarArr;
        ByteBuffer byteBuffer;
        if (this.M == -1) {
            this.M = this.p.i ? 0 : this.G.length;
        } else {
            z2 = false;
            i2 = this.M;
            qmVarArr = this.G;
            if (i2 >= qmVarArr.length) {
                C1639qm qmVar = qmVarArr[i2];
                if (z2) {
                    qmVar.f();
                }
                c(-9223372036854775807L);
                if (!qmVar.a()) {
                    return false;
                }
                this.M++;
                return false;
            }
            byteBuffer = this.J;
            if (byteBuffer != null) {
                b(byteBuffer, -9223372036854775807L);
                if (this.J != null) {
                    return false;
                }
            }
            this.M = -1;
            return true;
        }
        z2 = true;
        i2 = this.M;
        qmVarArr = this.G;
        if (i2 >= qmVarArr.length) {
            byteBuffer = this.J;
        }
        byteBuffer = this.J;
        if (byteBuffer != null) {
        }
        this.M = -1;
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, long j2) throws defpackage.C1698sm.b, defpackage.C1698sm.d {
        String str;
        String str2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j2;
        ByteBuffer byteBuffer3 = this.I;
        C1852xq.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.o != null) {
            if (!b()) {
                return false;
            }
            this.p = this.o;
            this.o = null;
            this.t = this.p.j ? this.d.a(this.t) : J.a;
            o();
        }
        if (!l()) {
            k();
            if (this.O) {
                play();
            }
        }
        if (!this.k.e(j())) {
            return false;
        }
        String str3 = "AudioTrack";
        if (this.I != null) {
            str = str3;
        } else if (!byteBuffer.hasRemaining()) {
            return true;
        } else {
            b bVar = this.p;
            if (!bVar.a && this.C == 0) {
                this.C = a(bVar.g, byteBuffer2);
                if (this.C == 0) {
                    return true;
                }
            }
            if (this.s == null) {
                str2 = str3;
            } else if (!b()) {
                return false;
            } else {
                J j4 = this.s;
                this.s = null;
                J a2 = this.d.a(j4);
                ArrayDeque<e> arrayDeque = this.l;
                str2 = str3;
                e eVar = new e(a2, Math.max(0, j3), this.p.b(j()), null);
                arrayDeque.add(eVar);
                o();
            }
            if (this.D == 0) {
                this.E = Math.max(0, j3);
                this.D = 1;
                str = str2;
            } else {
                long c2 = this.E + this.p.c(i() - this.g.k());
                if (this.D != 1 || Math.abs(c2 - j3) <= 200000) {
                    str = str2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Discontinuity detected [expected ");
                    sb.append(c2);
                    sb.append(", got ");
                    sb.append(j3);
                    sb.append("]");
                    str = str2;
                    Iq.b(str, sb.toString());
                    this.D = 2;
                }
                if (this.D == 2) {
                    long j5 = j3 - c2;
                    this.E += j5;
                    this.D = 1;
                    defpackage.C1698sm.c cVar = this.m;
                    if (!(cVar == null || j5 == 0)) {
                        cVar.a();
                    }
                }
            }
            if (this.p.a) {
                this.y += (long) byteBuffer.remaining();
            } else {
                this.z += (long) this.C;
            }
            this.I = byteBuffer2;
        }
        if (this.p.i) {
            c(j3);
        } else {
            b(this.I, j3);
        }
        if (!this.I.hasRemaining()) {
            this.I = null;
            return true;
        } else if (!this.k.d(j())) {
            return false;
        } else {
            Iq.d(str, "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    private long b(long j2) {
        long j3;
        long a2;
        e eVar = null;
        while (!this.l.isEmpty() && j2 >= ((e) this.l.getFirst()).c) {
            eVar = (e) this.l.remove();
        }
        if (eVar != null) {
            this.t = eVar.a;
            this.v = eVar.c;
            this.u = eVar.b - this.E;
        }
        if (this.t.b == 1.0f) {
            return (j2 + this.u) - this.v;
        }
        if (this.l.isEmpty()) {
            j3 = this.u;
            a2 = this.d.a(j2 - this.v);
        } else {
            j3 = this.u;
            a2 = C0471ar.a(j2 - this.v, this.t.b);
        }
        return j3 + a2;
    }

    private static void b(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    public boolean a() {
        return !l() || (this.N && !d());
    }

    public J a(J j2) {
        b bVar = this.p;
        if (bVar == null || bVar.j) {
            J j3 = this.s;
            if (j3 == null) {
                j3 = !this.l.isEmpty() ? ((e) this.l.getLast()).a : this.t;
            }
            if (!j2.equals(j3)) {
                if (l()) {
                    this.s = j2;
                } else {
                    this.t = this.d.a(j2);
                }
            }
            return this.t;
        }
        this.t = J.a;
        return this.t;
    }

    public void a(C1485lm lmVar) {
        if (!this.r.equals(lmVar)) {
            this.r = lmVar;
            if (!this.R) {
                flush();
                this.P = 0;
            }
        }
    }

    public void a(C1788vm vmVar) {
        if (!this.Q.equals(vmVar)) {
            int i2 = vmVar.a;
            float f2 = vmVar.b;
            AudioTrack audioTrack = this.q;
            if (audioTrack != null) {
                if (this.Q.a != i2) {
                    audioTrack.attachAuxEffect(i2);
                }
                if (i2 != 0) {
                    this.q.setAuxEffectSendLevel(f2);
                }
            }
            this.Q = vmVar;
        }
    }

    public void a(int i2) {
        C1852xq.b(C0471ar.a >= 21);
        if (!this.R || this.P != i2) {
            this.R = true;
            this.P = i2;
            flush();
        }
    }

    public void a(float f2) {
        if (this.F != f2) {
            this.F = f2;
            n();
        }
    }

    private long a(long j2) {
        return j2 + this.p.b(this.d.b());
    }

    private static int a(int i2, boolean z2) {
        if (C0471ar.a <= 28 && !z2) {
            if (i2 == 7) {
                i2 = 8;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                i2 = 6;
            }
        }
        if (C0471ar.a <= 26) {
            if ("fugu".equals(C0471ar.b) && !z2 && i2 == 1) {
                i2 = 2;
            }
        }
        return C0471ar.a(i2);
    }

    private static int a(int i2, ByteBuffer byteBuffer) {
        int i3;
        if (i2 == 7 || i2 == 8) {
            return Bm.a(byteBuffer);
        }
        if (i2 == 5) {
            return C1362hm.a();
        }
        if (i2 == 6) {
            return C1362hm.b(byteBuffer);
        }
        if (i2 == 17) {
            return C1423jm.a(byteBuffer);
        }
        if (i2 == 14) {
            int a2 = C1362hm.a(byteBuffer);
            if (a2 == -1) {
                i3 = 0;
            } else {
                i3 = C1362hm.a(byteBuffer, a2) * 16;
            }
            return i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected audio encoding: ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    @TargetApi(21)
    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    @TargetApi(21)
    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (this.w == null) {
            this.w = ByteBuffer.allocate(16);
            this.w.order(ByteOrder.BIG_ENDIAN);
            this.w.putInt(1431633921);
        }
        if (this.x == 0) {
            this.w.putInt(4, i2);
            this.w.putLong(8, j2 * 1000);
            this.w.position(0);
            this.x = i2;
        }
        int remaining = this.w.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.w, remaining, 1);
            if (write < 0) {
                this.x = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int a2 = a(audioTrack, byteBuffer, i2);
        if (a2 < 0) {
            this.x = 0;
            return a2;
        }
        this.x -= a2;
        return a2;
    }

    @TargetApi(21)
    private static void a(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }
}
