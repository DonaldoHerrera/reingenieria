package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.C0614n;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.r;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: Em reason: default package */
/* compiled from: MediaCodecAudioRenderer */
public class Em extends Mo implements Kq {
    private boolean Aa;
    /* access modifiers changed from: private */
    public boolean Ba;
    private long Ca;
    private int Da;
    private final Context ma;
    /* access modifiers changed from: private */
    public final defpackage.C1668rm.a na;
    private final C1698sm oa;
    private final long[] pa;
    private int qa;
    private boolean ra;
    private boolean sa;
    private boolean ta;
    private MediaFormat ua;
    private int va;
    private int wa;
    private int xa;
    private int ya;
    private long za;

    /* renamed from: Em$a */
    /* compiled from: MediaCodecAudioRenderer */
    private final class a implements c {
        private a() {
        }

        public void a(int i) {
            Em.this.na.a(i);
            Em.this.a(i);
        }

        public void a() {
            Em.this.G();
            Em.this.Ba = true;
        }

        public void a(int i, long j, long j2) {
            Em.this.na.a(i, j, j2);
            Em.this.a(i, j, j2);
        }
    }

    public Em(Context context, Oo oo, n<r> nVar, boolean z, Handler handler, C1668rm rmVar, C1516mm mmVar, C1639qm... qmVarArr) {
        C1516mm mmVar2 = mmVar;
        this(context, oo, nVar, z, handler, rmVar, new Am(mmVar, qmVarArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ("AXON 7 mini".equals(defpackage.C0471ar.d) != false) goto L_0x001a;
     */
    private static boolean V() {
        if (C0471ar.a == 23) {
            if (!"ZTE B2017G".equals(C0471ar.d)) {
            }
            return true;
        }
        return false;
    }

    private void W() {
        long a2 = this.oa.a(a());
        if (a2 != Long.MIN_VALUE) {
            if (!this.Ba) {
                a2 = Math.max(this.za, a2);
            }
            this.za = a2;
            this.Ba = false;
        }
    }

    private static boolean g(String str) {
        if (C0471ar.a < 21 && "OMX.SEC.mp3.dec".equals(str)) {
            if ("samsung".equals(C0471ar.c) && (C0471ar.b.startsWith("baffin") || C0471ar.b.startsWith("grand") || C0471ar.b.startsWith("fortuna") || C0471ar.b.startsWith("gprimelte") || C0471ar.b.startsWith("j2y18lte") || C0471ar.b.startsWith("ms01"))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void F() throws C0618s {
        try {
            this.oa.f();
        } catch (d e) {
            throw C0618s.a(e, q());
        }
    }

    /* access modifiers changed from: protected */
    public void G() {
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
    }

    /* access modifiers changed from: protected */
    public void a(int i, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    public void b(Format format) throws C0618s {
        super.b(format);
        this.na.a(format);
        this.va = "audio/raw".equals(format.i) ? format.x : 2;
        this.wa = format.v;
        this.xa = format.y;
        this.ya = format.z;
    }

    public J c() {
        return this.oa.c();
    }

    public long f() {
        if (getState() == 2) {
            W();
        }
        return this.za;
    }

    public Kq n() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void t() {
        try {
            this.Ca = -9223372036854775807L;
            this.Da = 0;
            this.oa.flush();
            try {
                super.t();
            } finally {
                this.na.a(this.la);
            }
        } catch (Throwable th) {
            super.t();
            throw th;
        } finally {
            this.na.a(this.la);
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
        try {
            super.u();
        } finally {
            this.oa.reset();
        }
    }

    /* access modifiers changed from: protected */
    public void v() {
        super.v();
        this.oa.play();
    }

    /* access modifiers changed from: protected */
    public void w() {
        W();
        this.oa.pause();
        super.w();
    }

    public Em(Context context, Oo oo, n<r> nVar, boolean z, Handler handler, C1668rm rmVar, C1698sm smVar) {
        super(1, oo, nVar, z, false, 44100.0f);
        this.ma = context.getApplicationContext();
        this.oa = smVar;
        this.Ca = -9223372036854775807L;
        this.pa = new long[10];
        this.na = new defpackage.C1668rm.a(handler, rmVar);
        smVar.a((c) new a());
    }

    /* access modifiers changed from: protected */
    public void c(long j) {
        while (this.Da != 0 && j >= this.pa[0]) {
            this.oa.g();
            this.Da--;
            long[] jArr = this.pa;
            System.arraycopy(jArr, 1, jArr, 0, this.Da);
        }
    }

    /* access modifiers changed from: protected */
    public int a(Oo oo, n<r> nVar, Format format) throws b {
        boolean z;
        String str = format.i;
        if (!Lq.d(str)) {
            return 0;
        }
        int i = C0471ar.a >= 21 ? 32 : 0;
        boolean a2 = C0614n.a(nVar, format.l);
        int i2 = 4;
        int i3 = 8;
        if (a2 && a(format.v, str) && oo.a() != null) {
            return i | 8 | 4;
        }
        int i4 = 1;
        if (("audio/raw".equals(str) && !this.oa.a(format.v, format.x)) || !this.oa.a(format.v, 2)) {
            return 1;
        }
        DrmInitData drmInitData = format.l;
        if (drmInitData != null) {
            z = false;
            for (int i5 = 0; i5 < drmInitData.d; i5++) {
                z |= drmInitData.a(i5).f;
            }
        } else {
            z = false;
        }
        List a3 = oo.a(format.i, z, false);
        if (a3.isEmpty()) {
            if (z && !oo.a(format.i, false, false).isEmpty()) {
                i4 = 2;
            }
            return i4;
        } else if (!a2) {
            return 2;
        } else {
            Lo lo = (Lo) a3.get(0);
            boolean a4 = lo.a(format);
            if (a4 && lo.b(format)) {
                i3 = 16;
            }
            if (!a4) {
                i2 = 3;
            }
            return i3 | i | i2;
        }
    }

    private static boolean f(String str) {
        if (C0471ar.a < 24 && "OMX.SEC.aac.dec".equals(str)) {
            if ("samsung".equals(C0471ar.c) && (C0471ar.b.startsWith("zeroflte") || C0471ar.b.startsWith("herolte") || C0471ar.b.startsWith("heroqlte"))) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        return this.oa.d() || super.b();
    }

    /* access modifiers changed from: protected */
    public List<Lo> a(Oo oo, Format format, boolean z) throws b {
        if (a(format.v, format.i)) {
            Lo a2 = oo.a();
            if (a2 != null) {
                return Collections.singletonList(a2);
            }
        }
        return oo.a(format.i, z, false);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i, String str) {
        return this.oa.a(i, Lq.a(str));
    }

    /* access modifiers changed from: protected */
    public void a(Lo lo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f) {
        this.qa = a(lo, format, r());
        this.sa = f(lo.a);
        this.ta = g(lo.a);
        this.ra = lo.g;
        MediaFormat a2 = a(format, this.ra ? "audio/raw" : lo.b, this.qa, f);
        mediaCodec.configure(a2, null, mediaCrypto, 0);
        if (this.ra) {
            this.ua = a2;
            this.ua.setString("mime", format.i);
            return;
        }
        this.ua = null;
    }

    /* access modifiers changed from: protected */
    public int a(MediaCodec mediaCodec, Lo lo, Format format, Format format2) {
        if (a(lo, format2) <= this.qa && format.y == 0 && format.z == 0 && format2.y == 0 && format2.z == 0) {
            if (lo.a(format, format2, true)) {
                return 3;
            }
            if (a(format, format2)) {
                return 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public float a(float f, Format format, Format[] formatArr) {
        int i = -1;
        for (Format format2 : formatArr) {
            int i2 = format2.w;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* access modifiers changed from: protected */
    public void a(String str, long j, long j2) {
        this.na.a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C0618s {
        int i;
        int[] iArr;
        MediaFormat mediaFormat2 = this.ua;
        if (mediaFormat2 != null) {
            i = Lq.a(mediaFormat2.getString("mime"));
            mediaFormat = this.ua;
        } else {
            i = this.va;
        }
        int i2 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.sa && integer == 6) {
            int i3 = this.wa;
            if (i3 < 6) {
                iArr = new int[i3];
                for (int i4 = 0; i4 < this.wa; i4++) {
                    iArr[i4] = i4;
                }
                this.oa.a(i2, integer, integer2, 0, iArr, this.xa, this.ya);
            }
        }
        iArr = null;
        try {
            this.oa.a(i2, integer, integer2, 0, iArr, this.xa, this.ya);
        } catch (defpackage.C1698sm.a e) {
            throw C0618s.a(e, q());
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) throws C0618s {
        super.a(z);
        this.na.b(this.la);
        int i = p().b;
        if (i != 0) {
            this.oa.a(i);
        } else {
            this.oa.e();
        }
    }

    /* access modifiers changed from: protected */
    public void a(Format[] formatArr, long j) throws C0618s {
        super.a(formatArr, j);
        if (this.Ca != -9223372036854775807L) {
            int i = this.Da;
            if (i == this.pa.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many stream changes, so dropping change at ");
                sb.append(this.pa[this.Da - 1]);
                Iq.d("MediaCodecAudioRenderer", sb.toString());
            } else {
                this.Da = i + 1;
            }
            this.pa[this.Da - 1] = this.Ca;
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j, boolean z) throws C0618s {
        super.a(j, z);
        this.oa.flush();
        this.za = j;
        this.Aa = true;
        this.Ba = true;
        this.Ca = -9223372036854775807L;
        this.Da = 0;
    }

    public boolean a() {
        return super.a() && this.oa.a();
    }

    public J a(J j) {
        return this.oa.a(j);
    }

    /* access modifiers changed from: protected */
    public void a(Qm qm) {
        if (this.Aa && !qm.c()) {
            if (Math.abs(qm.d - this.za) > 500000) {
                this.za = qm.d;
            }
            this.Aa = false;
        }
        this.Ca = Math.max(qm.d, this.Ca);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r1 != -9223372036854775807L) goto L_0x001b;
     */
    public boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, Format format) throws C0618s {
        long j4;
        if (this.ta && j3 == 0 && (i2 & 4) != 0) {
            j4 = this.Ca;
        }
        j4 = j3;
        if (this.ra && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.la.f++;
            this.oa.g();
            return true;
        } else {
            try {
                if (!this.oa.a(byteBuffer, j4)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.la.e++;
                return true;
            } catch (b | d e) {
                throw C0618s.a(e, q());
            }
        }
    }

    public void a(int i, Object obj) throws C0618s {
        if (i == 2) {
            this.oa.a(((Float) obj).floatValue());
        } else if (i == 3) {
            this.oa.a((C1485lm) obj);
        } else if (i != 5) {
            super.a(i, obj);
        } else {
            this.oa.a((C1788vm) obj);
        }
    }

    /* access modifiers changed from: protected */
    public int a(Lo lo, Format format, Format[] formatArr) {
        int a2 = a(lo, format);
        if (formatArr.length == 1) {
            return a2;
        }
        int i = a2;
        for (Format format2 : formatArr) {
            if (lo.a(format, format2, false)) {
                i = Math.max(i, a(lo, format2));
            }
        }
        return i;
    }

    private int a(Lo lo, Format format) {
        if ("OMX.google.raw.decoder".equals(lo.a)) {
            int i = C0471ar.a;
            if (i < 24 && (i != 23 || !C0471ar.c(this.ma))) {
                return -1;
            }
        }
        return format.j;
    }

    /* access modifiers changed from: protected */
    public boolean a(Format format, Format format2) {
        return C0471ar.a((Object) format.i, (Object) format2.i) && format.v == format2.v && format.w == format2.w && format.a(format2);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    public MediaFormat a(Format format, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.v);
        mediaFormat.setInteger("sample-rate", format.w);
        Ro.a(mediaFormat, format.k);
        Ro.a(mediaFormat, "max-input-size", i);
        if (C0471ar.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !V()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (C0471ar.a <= 28) {
            if ("audio/ac4".equals(format.i)) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        return mediaFormat;
    }
}
