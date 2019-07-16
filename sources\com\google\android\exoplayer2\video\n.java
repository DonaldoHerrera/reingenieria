package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.C0614n;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.r;
import com.google.android.gms.common.Scopes;
import com.soundcloud.flippernative.AndroidPlatformDecoder;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaCodecVideoRenderer */
public class n extends Mo {
    private static final int[] ma = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean na;
    private static boolean oa;
    private Surface Aa;
    private int Ba;
    private boolean Ca;
    private long Da;
    private long Ea;
    private long Fa;
    private int Ga;
    private int Ha;
    private int Ia;
    private long Ja;
    private int Ka;
    private float La;
    private int Ma;
    private int Na;
    private int Oa;
    private float Pa;
    private int Qa;
    private int Ra;
    private int Sa;
    private float Ta;
    private boolean Ua;
    private int Va;
    b Wa;
    private long Xa;
    private long Ya;
    private int Za;
    private o _a;
    private final Context pa;
    private final p qa;
    private final com.google.android.exoplayer2.video.r.a ra;
    private final long sa;
    private final int ta;
    private final boolean ua;
    private final long[] va;
    private final long[] wa;
    private a xa;
    private boolean ya;
    private Surface za;

    /* compiled from: MediaCodecVideoRenderer */
    protected static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    @TargetApi(23)
    /* compiled from: MediaCodecVideoRenderer */
    private final class b implements OnFrameRenderedListener {
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            n nVar = n.this;
            if (this == nVar.Wa) {
                nVar.e(j);
            }
        }

        private b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    public n(Context context, Oo oo, long j, com.google.android.exoplayer2.drm.n<r> nVar, boolean z, Handler handler, r rVar, int i) {
        this(context, oo, j, nVar, z, false, handler, rVar, i);
    }

    private void V() {
        this.Ca = false;
        if (C0471ar.a >= 23 && this.Ua) {
            MediaCodec z = z();
            if (z != null) {
                this.Wa = new b(z);
            }
        }
    }

    private void W() {
        this.Qa = -1;
        this.Ra = -1;
        this.Ta = -1.0f;
        this.Sa = -1;
    }

    private static boolean X() {
        return "NVIDIA".equals(C0471ar.c);
    }

    private void Y() {
        if (this.Ga > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.ra.a(this.Ga, elapsedRealtime - this.Fa);
            this.Ga = 0;
            this.Fa = elapsedRealtime;
        }
    }

    private void Z() {
        if (this.Ma != -1 || this.Na != -1) {
            if (this.Qa != this.Ma || this.Ra != this.Na || this.Sa != this.Oa || this.Ta != this.Pa) {
                this.ra.b(this.Ma, this.Na, this.Oa, this.Pa);
                this.Qa = this.Ma;
                this.Ra = this.Na;
                this.Sa = this.Oa;
                this.Ta = this.Pa;
            }
        }
    }

    private void aa() {
        if (this.Ca) {
            this.ra.b(this.za);
        }
    }

    private void ba() {
        if (this.Qa != -1 || this.Ra != -1) {
            this.ra.b(this.Qa, this.Ra, this.Sa, this.Ta);
        }
    }

    private void ca() {
        this.Ea = this.sa > 0 ? SystemClock.elapsedRealtime() + this.sa : -9223372036854775807L;
    }

    private static boolean g(long j) {
        return j < -30000;
    }

    private static boolean h(long j) {
        return j < -500000;
    }

    /* access modifiers changed from: protected */
    public boolean B() {
        return this.Ua;
    }

    /* access modifiers changed from: protected */
    public void E() {
        try {
            super.E();
        } finally {
            this.Ia = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    public void G() {
        if (!this.Ca) {
            this.Ca = true;
            this.ra.b(this.za);
        }
    }

    /* access modifiers changed from: protected */
    public int a(Oo oo, com.google.android.exoplayer2.drm.n<r> nVar, Format format) throws defpackage.Qo.b {
        boolean z;
        int i = 0;
        if (!Lq.f(format.i)) {
            return 0;
        }
        DrmInitData drmInitData = format.l;
        if (drmInitData != null) {
            z = false;
            for (int i2 = 0; i2 < drmInitData.d; i2++) {
                z |= drmInitData.a(i2).f;
            }
        } else {
            z = false;
        }
        List a2 = a(oo, format, z);
        int i3 = 2;
        if (a2.isEmpty()) {
            if (!z || oo.a(format.i, false, false).isEmpty()) {
                i3 = 1;
            }
            return i3;
        } else if (!C0614n.a(nVar, drmInitData)) {
            return 2;
        } else {
            Lo lo = (Lo) a2.get(0);
            boolean a3 = lo.a(format);
            int i4 = lo.b(format) ? 16 : 8;
            if (a3) {
                List a4 = oo.a(format.i, z, true);
                if (!a4.isEmpty()) {
                    Lo lo2 = (Lo) a4.get(0);
                    if (lo2.a(format) && lo2.b(format)) {
                        i = 32;
                    }
                }
            }
            return (a3 ? 4 : 3) | i4 | i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r9.Ua != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r9.za == r0) goto L_0x0022;
     */
    public boolean b() {
        if (super.b()) {
            if (!this.Ca) {
                Surface surface = this.Aa;
                if (surface != null) {
                }
                if (z() != null) {
                }
            }
            this.Ea = -9223372036854775807L;
            return true;
        }
        if (this.Ea == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Ea) {
            return true;
        }
        this.Ea = -9223372036854775807L;
        return false;
    }

    /* access modifiers changed from: protected */
    public void c(long j) {
        this.Ia--;
        while (true) {
            int i = this.Za;
            if (i != 0 && j >= this.wa[0]) {
                long[] jArr = this.va;
                this.Ya = jArr[0];
                this.Za = i - 1;
                System.arraycopy(jArr, 1, jArr, 0, this.Za);
                long[] jArr2 = this.wa;
                System.arraycopy(jArr2, 1, jArr2, 0, this.Za);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean d(long j, long j2) {
        return g(j) && j2 > 100000;
    }

    /* access modifiers changed from: protected */
    public void e(long j) {
        Format d = d(j);
        if (d != null) {
            a(z(), d.n, d.o);
        }
        Z();
        G();
        c(j);
    }

    /* access modifiers changed from: protected */
    public void t() {
        this.Xa = -9223372036854775807L;
        this.Ya = -9223372036854775807L;
        this.Za = 0;
        W();
        V();
        this.qa.a();
        this.Wa = null;
        try {
            super.t();
        } finally {
            this.ra.a(this.la);
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
        try {
            super.u();
        } finally {
            Surface surface = this.Aa;
            if (surface != null) {
                if (this.za == surface) {
                    this.za = null;
                }
                this.Aa.release();
                this.Aa = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void v() {
        super.v();
        this.Ga = 0;
        this.Fa = SystemClock.elapsedRealtime();
        this.Ja = SystemClock.elapsedRealtime() * 1000;
    }

    /* access modifiers changed from: protected */
    public void w() {
        this.Ea = -9223372036854775807L;
        Y();
        super.w();
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        try {
            return super.y();
        } finally {
            this.Ia = 0;
        }
    }

    public n(Context context, Oo oo, long j, com.google.android.exoplayer2.drm.n<r> nVar, boolean z, boolean z2, Handler handler, r rVar, int i) {
        super(2, oo, nVar, z, z2, 30.0f);
        this.sa = j;
        this.ta = i;
        this.pa = context.getApplicationContext();
        this.qa = new p(this.pa);
        this.ra = new com.google.android.exoplayer2.video.r.a(handler, rVar);
        this.ua = X();
        this.va = new long[10];
        this.wa = new long[10];
        this.Ya = -9223372036854775807L;
        this.Xa = -9223372036854775807L;
        this.Ea = -9223372036854775807L;
        this.Ma = -1;
        this.Na = -1;
        this.Pa = -1.0f;
        this.La = -1.0f;
        this.Ba = 1;
        W();
    }

    /* access modifiers changed from: protected */
    public void b(Format format) throws C0618s {
        super.b(format);
        this.ra.a(format);
        this.La = format.r;
        this.Ka = format.q;
    }

    /* access modifiers changed from: protected */
    public boolean c(long j, long j2) {
        return g(j);
    }

    /* access modifiers changed from: protected */
    public void c(MediaCodec mediaCodec, int i, long j) {
        _q.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        _q.a();
        this.la.f++;
    }

    /* access modifiers changed from: protected */
    public boolean b(long j, long j2) {
        return h(j);
    }

    private boolean c(Lo lo) {
        return C0471ar.a >= 23 && !this.Ua && !a(lo.a) && (!lo.f || DummySurface.a(this.pa));
    }

    /* access modifiers changed from: protected */
    public void b(MediaCodec mediaCodec, int i, long j) {
        Z();
        _q.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        _q.a();
        this.Ja = SystemClock.elapsedRealtime() * 1000;
        this.la.e++;
        this.Ha = 0;
        G();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void b(MediaCodec mediaCodec, int i, long j, long j2) {
        Z();
        _q.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        _q.a();
        this.Ja = SystemClock.elapsedRealtime() * 1000;
        this.la.e++;
        this.Ha = 0;
        G();
    }

    /* access modifiers changed from: protected */
    public List<Lo> a(Oo oo, Format format, boolean z) throws defpackage.Qo.b {
        return Collections.unmodifiableList(oo.a(format.i, z, this.Ua));
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) throws C0618s {
        super.a(z);
        int i = this.Va;
        this.Va = p().b;
        this.Ua = this.Va != 0;
        if (this.Va != i) {
            E();
        }
        this.ra.b(this.la);
        this.qa.b();
    }

    private static int b(Lo lo, Format format) {
        if (format.j == -1) {
            return a(lo, format.i, format.n, format.o);
        }
        int i = 0;
        for (int i2 = 0; i2 < format.k.size(); i2++) {
            i += ((byte[]) format.k.get(i2)).length;
        }
        return format.j + i;
    }

    /* access modifiers changed from: protected */
    public void a(Format[] formatArr, long j) throws C0618s {
        if (this.Ya == -9223372036854775807L) {
            this.Ya = j;
        } else {
            int i = this.Za;
            if (i == this.va.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(this.va[this.Za - 1]);
                Iq.d("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.Za = i + 1;
            }
            long[] jArr = this.va;
            int i2 = this.Za;
            jArr[i2 - 1] = j;
            this.wa[i2 - 1] = this.Xa;
        }
        super.a(formatArr, j);
    }

    /* access modifiers changed from: protected */
    public void a(long j, boolean z) throws C0618s {
        super.a(j, z);
        V();
        this.Da = -9223372036854775807L;
        this.Ha = 0;
        this.Xa = -9223372036854775807L;
        int i = this.Za;
        if (i != 0) {
            this.Ya = this.va[i - 1];
            this.Za = 0;
        }
        if (z) {
            ca();
        } else {
            this.Ea = -9223372036854775807L;
        }
    }

    public void a(int i, Object obj) throws C0618s {
        if (i == 1) {
            a((Surface) obj);
        } else if (i == 4) {
            this.Ba = ((Integer) obj).intValue();
            MediaCodec z = z();
            if (z != null) {
                z.setVideoScalingMode(this.Ba);
            }
        } else if (i == 6) {
            this._a = (o) obj;
        } else {
            super.a(i, obj);
        }
    }

    private void a(Surface surface) throws C0618s {
        if (surface == null) {
            Surface surface2 = this.Aa;
            if (surface2 != null) {
                surface = surface2;
            } else {
                Lo A = A();
                if (A != null && c(A)) {
                    this.Aa = DummySurface.a(this.pa, A.f);
                    surface = this.Aa;
                }
            }
        }
        if (this.za != surface) {
            this.za = surface;
            int state = getState();
            MediaCodec z = z();
            if (z != null) {
                if (C0471ar.a < 23 || surface == null || this.ya) {
                    E();
                    D();
                } else {
                    a(z, surface);
                }
            }
            if (surface == null || surface == this.Aa) {
                W();
                V();
                return;
            }
            ba();
            V();
            if (state == 2) {
                ca();
            }
        } else if (surface != null && surface != this.Aa) {
            ba();
            aa();
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(Lo lo) {
        return this.za != null || c(lo);
    }

    /* access modifiers changed from: protected */
    public void a(Lo lo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f) throws defpackage.Qo.b {
        this.xa = a(lo, format, r());
        MediaFormat a2 = a(format, this.xa, f, this.ua, this.Va);
        if (this.za == null) {
            C1852xq.b(c(lo));
            if (this.Aa == null) {
                this.Aa = DummySurface.a(this.pa, lo.f);
            }
            this.za = this.Aa;
        }
        mediaCodec.configure(a2, this.za, mediaCrypto, 0);
        if (C0471ar.a >= 23 && this.Ua) {
            this.Wa = new b(mediaCodec);
        }
    }

    /* access modifiers changed from: protected */
    public int a(MediaCodec mediaCodec, Lo lo, Format format, Format format2) {
        if (lo.a(format, format2, true)) {
            int i = format2.n;
            a aVar = this.xa;
            if (i <= aVar.a && format2.o <= aVar.b && b(lo, format2) <= this.xa.c) {
                return format.a(format2) ? 3 : 2;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public float a(float f, Format format, Format[] formatArr) {
        float f2 = -1.0f;
        for (Format format2 : formatArr) {
            float f3 = format2.p;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    public void a(String str, long j, long j2) {
        this.ra.a(str, j, j2);
        this.ya = a(str);
    }

    /* access modifiers changed from: protected */
    public void a(Qm qm) {
        this.Ia++;
        this.Xa = Math.max(qm.d, this.Xa);
        if (C0471ar.a < 23 && this.Ua) {
            e(qm.d);
        }
    }

    /* access modifiers changed from: protected */
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        String str = "crop-right";
        String str2 = "crop-top";
        String str3 = "crop-bottom";
        String str4 = "crop-left";
        boolean z = mediaFormat.containsKey(str) && mediaFormat.containsKey(str4) && mediaFormat.containsKey(str3) && mediaFormat.containsKey(str2);
        if (z) {
            i = (mediaFormat.getInteger(str) - mediaFormat.getInteger(str4)) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        if (z) {
            i2 = (mediaFormat.getInteger(str3) - mediaFormat.getInteger(str2)) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        a(mediaCodec, i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, Format format) throws C0618s {
        long j4 = j;
        long j5 = j2;
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j6 = j3;
        if (this.Da == -9223372036854775807L) {
            this.Da = j4;
        }
        long j7 = j6 - this.Ya;
        if (z) {
            c(mediaCodec2, i3, j7);
            return true;
        }
        long j8 = j6 - j4;
        if (this.za != this.Aa) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            boolean z2 = getState() == 2;
            if (!this.Ca || (z2 && d(j8, elapsedRealtime - this.Ja))) {
                long nanoTime = System.nanoTime();
                a(j7, nanoTime, format);
                if (C0471ar.a >= 21) {
                    b(mediaCodec, i, j7, nanoTime);
                } else {
                    b(mediaCodec2, i3, j7);
                }
                return true;
            }
            if (z2 && j4 != this.Da) {
                long j9 = j8 - (elapsedRealtime - j5);
                long nanoTime2 = System.nanoTime();
                long a2 = this.qa.a(j6, (j9 * 1000) + nanoTime2);
                long j10 = (a2 - nanoTime2) / 1000;
                if (b(j10, j5) && a(mediaCodec, i, j7, j)) {
                    return false;
                }
                if (c(j10, j5)) {
                    a(mediaCodec2, i3, j7);
                } else if (C0471ar.a >= 21) {
                    if (j10 < AndroidPlatformDecoder.DECODER_TIMEOUT_US) {
                        a(j7, a2, format);
                        b(mediaCodec, i, j7, a2);
                    }
                } else if (j10 < 30000) {
                    if (j10 > 11000) {
                        try {
                            Thread.sleep((j10 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    a(j7, a2, format);
                    b(mediaCodec2, i3, j7);
                }
                return true;
            }
            return false;
        } else if (!g(j8)) {
            return false;
        } else {
            c(mediaCodec2, i3, j7);
            return true;
        }
    }

    private void a(MediaCodec mediaCodec, int i, int i2) {
        this.Ma = i;
        this.Na = i2;
        this.Pa = this.La;
        if (C0471ar.a >= 21) {
            int i3 = this.Ka;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.Ma;
                this.Ma = this.Na;
                this.Na = i4;
                this.Pa = 1.0f / this.Pa;
            }
        } else {
            this.Oa = this.Ka;
        }
        mediaCodec.setVideoScalingMode(this.Ba);
    }

    private void a(long j, long j2, Format format) {
        o oVar = this._a;
        if (oVar != null) {
            oVar.a(j, j2, format);
        }
    }

    /* access modifiers changed from: protected */
    public void a(MediaCodec mediaCodec, int i, long j) {
        _q.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        _q.a();
        a(1);
    }

    /* access modifiers changed from: protected */
    public boolean a(MediaCodec mediaCodec, int i, long j, long j2) throws C0618s {
        int b2 = b(j2);
        if (b2 == 0) {
            return false;
        }
        this.la.i++;
        a(this.Ia + b2);
        x();
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        Pm pm = this.la;
        pm.g += i;
        this.Ga += i;
        this.Ha += i;
        pm.h = Math.max(this.Ha, pm.h);
        int i2 = this.ta;
        if (i2 > 0 && this.Ga >= i2) {
            Y();
        }
    }

    @TargetApi(23)
    private static void a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    private static void a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    public MediaFormat a(Format format, a aVar, float f, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.i);
        mediaFormat.setInteger("width", format.n);
        mediaFormat.setInteger("height", format.o);
        Ro.a(mediaFormat, format.k);
        Ro.a(mediaFormat, "frame-rate", format.p);
        Ro.a(mediaFormat, "rotation-degrees", format.q);
        Ro.a(mediaFormat, format.u);
        if ("video/dolby-vision".equals(format.i)) {
            Pair a2 = Qo.a(format.f);
            if (a2 != null) {
                Ro.a(mediaFormat, Scopes.PROFILE, ((Integer) a2.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", aVar.a);
        mediaFormat.setInteger("max-height", aVar.b);
        Ro.a(mediaFormat, "max-input-size", aVar.c);
        if (C0471ar.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            a(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public a a(Lo lo, Format format, Format[] formatArr) throws defpackage.Qo.b {
        int i = format.n;
        int i2 = format.o;
        int b2 = b(lo, format);
        if (formatArr.length == 1) {
            if (b2 != -1) {
                int a2 = a(lo, format.i, format.n, format.o);
                if (a2 != -1) {
                    b2 = Math.min((int) (((float) b2) * 1.5f), a2);
                }
            }
            return new a(i, i2, b2);
        }
        int i3 = i2;
        int i4 = b2;
        boolean z = false;
        int i5 = i;
        for (Format format2 : formatArr) {
            if (lo.a(format, format2, false)) {
                z |= format2.n == -1 || format2.o == -1;
                i5 = Math.max(i5, format2.n);
                i3 = Math.max(i3, format2.o);
                i4 = Math.max(i4, b(lo, format2));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(i5);
            String str = "x";
            sb.append(str);
            sb.append(i3);
            String str2 = "MediaCodecVideoRenderer";
            Iq.d(str2, sb.toString());
            Point a3 = a(lo, format);
            if (a3 != null) {
                i5 = Math.max(i5, a3.x);
                i3 = Math.max(i3, a3.y);
                i4 = Math.max(i4, a(lo, format.i, i5, i3));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(i5);
                sb2.append(str);
                sb2.append(i3);
                Iq.d(str2, sb2.toString());
            }
        }
        return new a(i5, i3, i4);
    }

    private static Point a(Lo lo, Format format) throws defpackage.Qo.b {
        int[] iArr;
        boolean z = format.o > format.n;
        int i = z ? format.o : format.n;
        int i2 = z ? format.n : format.o;
        float f = ((float) i2) / ((float) i);
        for (int i3 : ma) {
            int i4 = (int) (((float) i3) * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (C0471ar.a >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point a2 = lo.a(i5, i3);
                if (lo.a(a2.x, a2.y, (double) format.p)) {
                    return a2;
                }
            } else {
                int a3 = C0471ar.a(i3, 16) * 16;
                int a4 = C0471ar.a(i4, 16) * 16;
                if (a3 * a4 <= Qo.b()) {
                    int i6 = z ? a4 : a3;
                    if (z) {
                        a4 = a3;
                    }
                    return new Point(i6, a4);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r7.f != false) goto L_0x009f;
     */
    private static int a(Lo lo, String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
                    break;
                }
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
            default:
                c = 65535;
                break;
        }
        if (!(c == 0 || c == 1)) {
            if (c == 2) {
                if (!"BRAVIA 4K 2015".equals(C0471ar.d)) {
                    if ("Amazon".equals(C0471ar.c)) {
                        if (!"KFSOWI".equals(C0471ar.d)) {
                            if ("AFTS".equals(C0471ar.d)) {
                            }
                        }
                    }
                    i3 = C0471ar.a(i, 16) * C0471ar.a(i2, 16) * 16 * 16;
                    i4 = 2;
                    return (i3 * 3) / (i4 * 2);
                }
                return -1;
            } else if (c != 3) {
                if (c != 4 && c != 5) {
                    return -1;
                }
                i3 = i * i2;
                return (i3 * 3) / (i4 * 2);
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0601, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0602, code lost:
        switch(r1) {
            case 0: goto L_0x0606;
            case 1: goto L_0x0606;
            case 2: goto L_0x0606;
            case 3: goto L_0x0606;
            case 4: goto L_0x0606;
            case 5: goto L_0x0606;
            case 6: goto L_0x0606;
            case 7: goto L_0x0606;
            case 8: goto L_0x0606;
            case 9: goto L_0x0606;
            case 10: goto L_0x0606;
            case 11: goto L_0x0606;
            case 12: goto L_0x0606;
            case 13: goto L_0x0606;
            case 14: goto L_0x0606;
            case 15: goto L_0x0606;
            case 16: goto L_0x0606;
            case 17: goto L_0x0606;
            case 18: goto L_0x0606;
            case 19: goto L_0x0606;
            case 20: goto L_0x0606;
            case 21: goto L_0x0606;
            case 22: goto L_0x0606;
            case 23: goto L_0x0606;
            case 24: goto L_0x0606;
            case 25: goto L_0x0606;
            case 26: goto L_0x0606;
            case 27: goto L_0x0606;
            case 28: goto L_0x0606;
            case 29: goto L_0x0606;
            case 30: goto L_0x0606;
            case 31: goto L_0x0606;
            case 32: goto L_0x0606;
            case 33: goto L_0x0606;
            case 34: goto L_0x0606;
            case 35: goto L_0x0606;
            case 36: goto L_0x0606;
            case 37: goto L_0x0606;
            case 38: goto L_0x0606;
            case 39: goto L_0x0606;
            case 40: goto L_0x0606;
            case 41: goto L_0x0606;
            case 42: goto L_0x0606;
            case 43: goto L_0x0606;
            case 44: goto L_0x0606;
            case 45: goto L_0x0606;
            case 46: goto L_0x0606;
            case 47: goto L_0x0606;
            case 48: goto L_0x0606;
            case 49: goto L_0x0606;
            case 50: goto L_0x0606;
            case 51: goto L_0x0606;
            case 52: goto L_0x0606;
            case 53: goto L_0x0606;
            case 54: goto L_0x0606;
            case 55: goto L_0x0606;
            case 56: goto L_0x0606;
            case 57: goto L_0x0606;
            case 58: goto L_0x0606;
            case 59: goto L_0x0606;
            case 60: goto L_0x0606;
            case 61: goto L_0x0606;
            case 62: goto L_0x0606;
            case 63: goto L_0x0606;
            case 64: goto L_0x0606;
            case 65: goto L_0x0606;
            case 66: goto L_0x0606;
            case 67: goto L_0x0606;
            case 68: goto L_0x0606;
            case 69: goto L_0x0606;
            case 70: goto L_0x0606;
            case 71: goto L_0x0606;
            case 72: goto L_0x0606;
            case 73: goto L_0x0606;
            case 74: goto L_0x0606;
            case 75: goto L_0x0606;
            case 76: goto L_0x0606;
            case 77: goto L_0x0606;
            case 78: goto L_0x0606;
            case 79: goto L_0x0606;
            case 80: goto L_0x0606;
            case 81: goto L_0x0606;
            case 82: goto L_0x0606;
            case 83: goto L_0x0606;
            case 84: goto L_0x0606;
            case 85: goto L_0x0606;
            case 86: goto L_0x0606;
            case 87: goto L_0x0606;
            case 88: goto L_0x0606;
            case 89: goto L_0x0606;
            case 90: goto L_0x0606;
            case 91: goto L_0x0606;
            case 92: goto L_0x0606;
            case 93: goto L_0x0606;
            case 94: goto L_0x0606;
            case 95: goto L_0x0606;
            case 96: goto L_0x0606;
            case 97: goto L_0x0606;
            case 98: goto L_0x0606;
            case 99: goto L_0x0606;
            case 100: goto L_0x0606;
            case 101: goto L_0x0606;
            case 102: goto L_0x0606;
            case 103: goto L_0x0606;
            case 104: goto L_0x0606;
            case 105: goto L_0x0606;
            case 106: goto L_0x0606;
            case 107: goto L_0x0606;
            case 108: goto L_0x0606;
            case 109: goto L_0x0606;
            case 110: goto L_0x0606;
            case 111: goto L_0x0606;
            case 112: goto L_0x0606;
            case 113: goto L_0x0606;
            case 114: goto L_0x0606;
            case 115: goto L_0x0606;
            case 116: goto L_0x0606;
            case 117: goto L_0x0606;
            case 118: goto L_0x0606;
            case 119: goto L_0x0606;
            case 120: goto L_0x0606;
            case com.comscore.streaming.ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND :int: goto L_0x0606;
            case com.comscore.streaming.ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND :int: goto L_0x0606;
            case com.comscore.streaming.ContentType.USER_GENERATED_LIVE :int: goto L_0x0606;
            default: goto L_0x0605;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0606, code lost:
        oa = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0608, code lost:
        r1 = defpackage.C0471ar.d;
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0611, code lost:
        if (r2 == 2006354) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0616, code lost:
        if (r2 == 2006367) goto L_0x0619;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x061f, code lost:
        if (r1.equals("AFTN") == false) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0621, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0629, code lost:
        if (r1.equals("AFTA") == false) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x062c, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x062d, code lost:
        if (r0 == 0) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x062f, code lost:
        if (r0 == 1) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0632, code lost:
        oa = true;
     */
    public boolean a(String str) {
        char c;
        char c2 = 0;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (n.class) {
            if (!na) {
                if (C0471ar.a > 27 || (!"dangal".equals(C0471ar.b) && !"HWEML".equals(C0471ar.b))) {
                    if (C0471ar.a < 27) {
                        String str2 = C0471ar.b;
                        switch (str2.hashCode()) {
                            case -2144781245:
                                if (str2.equals("GIONEE_SWW1609")) {
                                    c = '*';
                                    break;
                                }
                            case -2144781185:
                                if (str2.equals("GIONEE_SWW1627")) {
                                    c = '+';
                                    break;
                                }
                            case -2144781160:
                                if (str2.equals("GIONEE_SWW1631")) {
                                    c = ',';
                                    break;
                                }
                            case -2097309513:
                                if (str2.equals("K50a40")) {
                                    c = '>';
                                    break;
                                }
                            case -2022874474:
                                if (str2.equals("CP8676_I02")) {
                                    c = 18;
                                    break;
                                }
                            case -1978993182:
                                if (str2.equals("NX541J")) {
                                    c = 'K';
                                    break;
                                }
                            case -1978990237:
                                if (str2.equals("NX573J")) {
                                    c = 'L';
                                    break;
                                }
                            case -1936688988:
                                if (str2.equals("PGN528")) {
                                    c = 'V';
                                    break;
                                }
                            case -1936688066:
                                if (str2.equals("PGN610")) {
                                    c = 'W';
                                    break;
                                }
                            case -1936688065:
                                if (str2.equals("PGN611")) {
                                    c = 'X';
                                    break;
                                }
                            case -1931988508:
                                if (str2.equals("AquaPowerM")) {
                                    c = 10;
                                    break;
                                }
                            case -1696512866:
                                if (str2.equals("XT1663")) {
                                    c = 'y';
                                    break;
                                }
                            case -1680025915:
                                if (str2.equals("ComioS1")) {
                                    c = 17;
                                    break;
                                }
                            case -1615810839:
                                if (str2.equals("Phantom6")) {
                                    c = 'Y';
                                    break;
                                }
                            case -1554255044:
                                if (str2.equals("vernee_M5")) {
                                    c = 'r';
                                    break;
                                }
                            case -1481772737:
                                if (str2.equals("panell_dl")) {
                                    c = 'R';
                                    break;
                                }
                            case -1481772730:
                                if (str2.equals("panell_ds")) {
                                    c = 'S';
                                    break;
                                }
                            case -1481772729:
                                if (str2.equals("panell_dt")) {
                                    c = 'T';
                                    break;
                                }
                            case -1320080169:
                                if (str2.equals("GiONEE_GBL7319")) {
                                    c = '(';
                                    break;
                                }
                            case -1217592143:
                                if (str2.equals("BRAVIA_ATV2")) {
                                    c = 14;
                                    break;
                                }
                            case -1180384755:
                                if (str2.equals("iris60")) {
                                    c = ':';
                                    break;
                                }
                            case -1139198265:
                                if (str2.equals("Slate_Pro")) {
                                    c = 'f';
                                    break;
                                }
                            case -1052835013:
                                if (str2.equals("namath")) {
                                    c = 'I';
                                    break;
                                }
                            case -993250464:
                                if (str2.equals("A10-70F")) {
                                    c = 3;
                                    break;
                                }
                            case -965403638:
                                if (str2.equals("s905x018")) {
                                    c = 'h';
                                    break;
                                }
                            case -958336948:
                                if (str2.equals("ELUGA_Ray_X")) {
                                    c = 28;
                                    break;
                                }
                            case -879245230:
                                if (str2.equals("tcl_eu")) {
                                    c = 'n';
                                    break;
                                }
                            case -842500323:
                                if (str2.equals("nicklaus_f")) {
                                    c = 'J';
                                    break;
                                }
                            case -821392978:
                                if (str2.equals("A7000-a")) {
                                    c = 6;
                                    break;
                                }
                            case -797483286:
                                if (str2.equals("SVP-DTV15")) {
                                    c = 'g';
                                    break;
                                }
                            case -794946968:
                                if (str2.equals("watson")) {
                                    c = 's';
                                    break;
                                }
                            case -788334647:
                                if (str2.equals("whyred")) {
                                    c = 't';
                                    break;
                                }
                            case -782144577:
                                if (str2.equals("OnePlus5T")) {
                                    c = 'M';
                                    break;
                                }
                            case -575125681:
                                if (str2.equals("GiONEE_CBL7513")) {
                                    c = '\'';
                                    break;
                                }
                            case -521118391:
                                if (str2.equals("GIONEE_GBL7360")) {
                                    c = ')';
                                    break;
                                }
                            case -430914369:
                                if (str2.equals("Pixi4-7_3G")) {
                                    c = 'Z';
                                    break;
                                }
                            case -290434366:
                                if (str2.equals("taido_row")) {
                                    c = 'i';
                                    break;
                                }
                            case -282781963:
                                if (str2.equals("BLACK-1X")) {
                                    c = 13;
                                    break;
                                }
                            case -277133239:
                                if (str2.equals("Z12_PRO")) {
                                    c = 'z';
                                    break;
                                }
                            case -173639913:
                                if (str2.equals("ELUGA_A3_Pro")) {
                                    c = 25;
                                    break;
                                }
                            case -56598463:
                                if (str2.equals("woods_fn")) {
                                    c = 'v';
                                    break;
                                }
                            case 2126:
                                if (str2.equals("C1")) {
                                    c = 16;
                                    break;
                                }
                            case 2564:
                                if (str2.equals("Q5")) {
                                    c = 'b';
                                    break;
                                }
                            case 2715:
                                if (str2.equals("V1")) {
                                    c = 'o';
                                    break;
                                }
                            case 2719:
                                if (str2.equals("V5")) {
                                    c = 'q';
                                    break;
                                }
                            case 3483:
                                if (str2.equals("mh")) {
                                    c = 'F';
                                    break;
                                }
                            case 73405:
                                if (str2.equals("JGZ")) {
                                    c = '=';
                                    break;
                                }
                            case 75739:
                                if (str2.equals("M5c")) {
                                    c = 'B';
                                    break;
                                }
                            case 76779:
                                if (str2.equals("MX6")) {
                                    c = 'H';
                                    break;
                                }
                            case 78669:
                                if (str2.equals("P85")) {
                                    c = 'P';
                                    break;
                                }
                            case 79305:
                                if (str2.equals("PLE")) {
                                    c = '\\';
                                    break;
                                }
                            case 80618:
                                if (str2.equals("QX1")) {
                                    c = 'd';
                                    break;
                                }
                            case 88274:
                                if (str2.equals("Z80")) {
                                    c = '{';
                                    break;
                                }
                            case 98846:
                                if (str2.equals("cv1")) {
                                    c = 21;
                                    break;
                                }
                            case 98848:
                                if (str2.equals("cv3")) {
                                    c = 22;
                                    break;
                                }
                            case 99329:
                                if (str2.equals("deb")) {
                                    c = 23;
                                    break;
                                }
                            case 101481:
                                if (str2.equals("flo")) {
                                    c = '%';
                                    break;
                                }
                            case 1513190:
                                if (str2.equals("1601")) {
                                    c = 0;
                                    break;
                                }
                            case 1514184:
                                if (str2.equals("1713")) {
                                    c = 1;
                                    break;
                                }
                            case 1514185:
                                if (str2.equals("1714")) {
                                    c = 2;
                                    break;
                                }
                            case 2436959:
                                if (str2.equals("P681")) {
                                    c = 'O';
                                    break;
                                }
                            case 2463773:
                                if (str2.equals("Q350")) {
                                    c = '^';
                                    break;
                                }
                            case 2464648:
                                if (str2.equals("Q427")) {
                                    c = '`';
                                    break;
                                }
                            case 2689555:
                                if (str2.equals("XE2X")) {
                                    c = 'x';
                                    break;
                                }
                            case 3154429:
                                if (str2.equals("fugu")) {
                                    c = '&';
                                    break;
                                }
                            case 3284551:
                                if (str2.equals("kate")) {
                                    c = '?';
                                    break;
                                }
                            case 3351335:
                                if (str2.equals("mido")) {
                                    c = 'G';
                                    break;
                                }
                            case 3386211:
                                if (str2.equals("p212")) {
                                    c = 'N';
                                    break;
                                }
                            case 41325051:
                                if (str2.equals("MEIZU_M5")) {
                                    c = 'E';
                                    break;
                                }
                            case 55178625:
                                if (str2.equals("Aura_Note_2")) {
                                    c = 12;
                                    break;
                                }
                            case 61542055:
                                if (str2.equals("A1601")) {
                                    c = 4;
                                    break;
                                }
                            case 65355429:
                                if (str2.equals("E5643")) {
                                    c = 24;
                                    break;
                                }
                            case 66214468:
                                if (str2.equals("F3111")) {
                                    c = 30;
                                    break;
                                }
                            case 66214470:
                                if (str2.equals("F3113")) {
                                    c = 31;
                                    break;
                                }
                            case 66214473:
                                if (str2.equals("F3116")) {
                                    c = ' ';
                                    break;
                                }
                            case 66215429:
                                if (str2.equals("F3211")) {
                                    c = '!';
                                    break;
                                }
                            case 66215431:
                                if (str2.equals("F3213")) {
                                    c = '\"';
                                    break;
                                }
                            case 66215433:
                                if (str2.equals("F3215")) {
                                    c = '#';
                                    break;
                                }
                            case 66216390:
                                if (str2.equals("F3311")) {
                                    c = '$';
                                    break;
                                }
                            case 76402249:
                                if (str2.equals("PRO7S")) {
                                    c = ']';
                                    break;
                                }
                            case 76404105:
                                if (str2.equals("Q4260")) {
                                    c = '_';
                                    break;
                                }
                            case 76404911:
                                if (str2.equals("Q4310")) {
                                    c = 'a';
                                    break;
                                }
                            case 80963634:
                                if (str2.equals("V23GB")) {
                                    c = 'p';
                                    break;
                                }
                            case 82882791:
                                if (str2.equals("X3_HK")) {
                                    c = 'w';
                                    break;
                                }
                            case 98715550:
                                if (str2.equals("i9031")) {
                                    c = '7';
                                    break;
                                }
                            case 102844228:
                                if (str2.equals("le_x6")) {
                                    c = '@';
                                    break;
                                }
                            case 165221241:
                                if (str2.equals("A2016a40")) {
                                    c = 5;
                                    break;
                                }
                            case 182191441:
                                if (str2.equals("CPY83_I00")) {
                                    c = 20;
                                    break;
                                }
                            case 245388979:
                                if (str2.equals("marino_f")) {
                                    c = 'D';
                                    break;
                                }
                            case 287431619:
                                if (str2.equals("griffin")) {
                                    c = '0';
                                    break;
                                }
                            case 307593612:
                                if (str2.equals("A7010a48")) {
                                    c = 8;
                                    break;
                                }
                            case 308517133:
                                if (str2.equals("A7020a48")) {
                                    c = 9;
                                    break;
                                }
                            case 316215098:
                                if (str2.equals("TB3-730F")) {
                                    c = 'j';
                                    break;
                                }
                            case 316215116:
                                if (str2.equals("TB3-730X")) {
                                    c = 'k';
                                    break;
                                }
                            case 316246811:
                                if (str2.equals("TB3-850F")) {
                                    c = 'l';
                                    break;
                                }
                            case 316246818:
                                if (str2.equals("TB3-850M")) {
                                    c = 'm';
                                    break;
                                }
                            case 407160593:
                                if (str2.equals("Pixi5-10_4G")) {
                                    c = '[';
                                    break;
                                }
                            case 507412548:
                                if (str2.equals("QM16XE_U")) {
                                    c = 'c';
                                    break;
                                }
                            case 793982701:
                                if (str2.equals("GIONEE_WBL5708")) {
                                    c = '-';
                                    break;
                                }
                            case 794038622:
                                if (str2.equals("GIONEE_WBL7365")) {
                                    c = '.';
                                    break;
                                }
                            case 794040393:
                                if (str2.equals("GIONEE_WBL7519")) {
                                    c = '/';
                                    break;
                                }
                            case 835649806:
                                if (str2.equals("manning")) {
                                    c = 'C';
                                    break;
                                }
                            case 917340916:
                                if (str2.equals("A7000plus")) {
                                    c = 7;
                                    break;
                                }
                            case 958008161:
                                if (str2.equals("j2xlteins")) {
                                    c = '<';
                                    break;
                                }
                            case 1060579533:
                                if (str2.equals("panell_d")) {
                                    c = 'Q';
                                    break;
                                }
                            case 1150207623:
                                if (str2.equals("LS-5017")) {
                                    c = 'A';
                                    break;
                                }
                            case 1176899427:
                                if (str2.equals("itel_S41")) {
                                    c = ';';
                                    break;
                                }
                            case 1280332038:
                                if (str2.equals("hwALE-H")) {
                                    c = '2';
                                    break;
                                }
                            case 1306947716:
                                if (str2.equals("EverStar_S")) {
                                    c = 29;
                                    break;
                                }
                            case 1349174697:
                                if (str2.equals("htc_e56ml_dtul")) {
                                    c = '1';
                                    break;
                                }
                            case 1522194893:
                                if (str2.equals("woods_f")) {
                                    c = 'u';
                                    break;
                                }
                            case 1691543273:
                                if (str2.equals("CPH1609")) {
                                    c = 19;
                                    break;
                                }
                            case 1709443163:
                                if (str2.equals("iball8735_9806")) {
                                    c = '8';
                                    break;
                                }
                            case 1865889110:
                                if (str2.equals("santoni")) {
                                    c = 'e';
                                    break;
                                }
                            case 1906253259:
                                if (str2.equals("PB2-670M")) {
                                    c = 'U';
                                    break;
                                }
                            case 1977196784:
                                if (str2.equals("Infinix-X572")) {
                                    c = '9';
                                    break;
                                }
                            case 2006372676:
                                if (str2.equals("BRAVIA_ATV3_4K")) {
                                    c = 15;
                                    break;
                                }
                            case 2029784656:
                                if (str2.equals("HWBLN-H")) {
                                    c = '3';
                                    break;
                                }
                            case 2030379515:
                                if (str2.equals("HWCAM-H")) {
                                    c = '4';
                                    break;
                                }
                            case 2033393791:
                                if (str2.equals("ASUS_X00AD_2")) {
                                    c = 11;
                                    break;
                                }
                            case 2047190025:
                                if (str2.equals("ELUGA_Note")) {
                                    c = 26;
                                    break;
                                }
                            case 2047252157:
                                if (str2.equals("ELUGA_Prim")) {
                                    c = 27;
                                    break;
                                }
                            case 2048319463:
                                if (str2.equals("HWVNS-H")) {
                                    c = '5';
                                    break;
                                }
                            case 2048855701:
                                if (str2.equals("HWWAS-H")) {
                                    c = '6';
                                    break;
                                }
                        }
                    }
                } else {
                    oa = true;
                }
                na = true;
            }
        }
        return oa;
    }
}
