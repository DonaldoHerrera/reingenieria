package com.soundcloud.android.features.record;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.Log;
import com.soundcloud.android.features.record.G.n;
import com.soundcloud.android.features.record.filter.FadeFilter;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: SoundRecorder */
public class ba implements OnAudioFocusChangeListener {
    static final int a = AudioTrack.getNativeOutputSampleRate(1);
    static final String b = ba.class.getSimpleName();
    private static final String[] c = {"com.soundcloud.android.notificationState", "com.soundcloud.android.recordstarted", "com.soundcloud.android.recorderror", "com.soundcloud.android.recordsample", "com.soundcloud.android.recordprogress", "com.soundcloud.android.recordfinished", "com.soundcloud.android.playbackstarted", "com.soundcloud.android.playbackstopped", "com.soundcloud.android.playbackcomplete", "com.soundcloud.android.playbackprogress", "com.soundcloud.android.playbackprogress"};
    private static ba d;
    private static float[] e = {0.0f, 1.0f};
    /* access modifiers changed from: private */
    public long A = -1;
    /* access modifiers changed from: private */
    public long B = -1;
    /* access modifiers changed from: private */
    public final Context f;
    private final RecordAppWidgetProvider g;
    /* access modifiers changed from: private */
    public final AudioRecord h;
    /* access modifiers changed from: private */
    public final X i;
    /* access modifiers changed from: private */
    public final W j;
    private final int k;
    /* access modifiers changed from: private */
    public final C3668u l;
    /* access modifiers changed from: private */
    public final ByteBuffer m;
    /* access modifiers changed from: private */
    public final int n;
    /* access modifiers changed from: private */
    public final ByteBuffer o;
    /* access modifiers changed from: private */
    public final int p;
    /* access modifiers changed from: private */
    public final C1600pd q;
    /* access modifiers changed from: private */
    public final Cla r;
    /* access modifiers changed from: private */
    public final Ala s;
    /* access modifiers changed from: private */
    public volatile c t;
    /* access modifiers changed from: private */
    public P u;
    /* access modifiers changed from: private */
    public b v;
    /* access modifiers changed from: private */
    public Recording w;
    /* access modifiers changed from: private */
    public PlaybackStream x;
    /* access modifiers changed from: private */
    public a y;
    private boolean z = true;

    /* compiled from: SoundRecorder */
    private class a extends Thread {
        private final Queue<ha> a;

        a() {
            super("PlayerThread");
            this.a = new ConcurrentLinkedQueue();
            setPriority(10);
        }

        private void b(PlaybackStream playbackStream) throws IOException {
            while (true) {
                ha haVar = (ha) this.a.poll();
                if (haVar != null) {
                    FadeFilter a2 = haVar.a();
                    int a3 = (int) haVar.a(ba.this.l);
                    playbackStream.a(haVar.b(ba.this.l));
                    byte[] bArr = new byte[a3];
                    int i = 0;
                    while (i < a3) {
                        int i2 = a3 - i;
                        int a4 = playbackStream.a(ba.this.o, Math.min(ba.this.p, i2));
                        if (a4 <= 0) {
                            break;
                        }
                        int min = Math.min(a4, i2);
                        a2.a(ba.this.o, (long) i, (long) a3);
                        ba.this.o.get(bArr, i, min);
                        i += a4;
                        ba.this.o.clear();
                    }
                    ba.this.i.setPlaybackRate(haVar.e);
                    if (haVar.b()) {
                        for (int i3 = (a3 / ba.this.l.m) - 1; i3 >= 0; i3--) {
                            int write = ba.this.i.write(bArr, ba.this.l.m * i3, ba.this.l.m);
                            if (write < 0) {
                                a(write);
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < a3 / ba.this.l.m; i4++) {
                            int write2 = ba.this.i.write(bArr, ba.this.l.m * i4, ba.this.l.m);
                            if (write2 < 0) {
                                a(write2);
                            }
                        }
                    }
                    ba.this.o.clear();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(ha haVar) {
            this.a.add(haVar);
            long j = 0;
            for (ha haVar2 : this.a) {
                j += haVar2.d;
            }
            while (j > 500 && this.a.size() > 1) {
                j -= ((ha) this.a.poll()).d;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:62:0x014a, code lost:
            return;
         */
        public void run() {
            Ala d;
            Cla c;
            synchronized (ba.this.h) {
                if (ba.this.v()) {
                    ba.this.i.play();
                    while (true) {
                        try {
                            int i = aa.a[ba.this.t.ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                    if (ba.this.x != null) {
                                        ba.this.x.b(ba.this.A);
                                        ba.this.A = -1;
                                    }
                                }
                                if (ba.this.x != null) {
                                    a(ba.this.x);
                                }
                            } else {
                                b(ba.this.x);
                            }
                            if ((isInterrupted() || ba.this.t != c.SEEKING) && (ba.this.t != c.TRIMMING || this.a.isEmpty())) {
                            }
                        } catch (IOException e) {
                            try {
                                Log.w(ba.b, "error during playback", e);
                                ba.this.t = c.ERROR;
                                ba.this.i.stop();
                                d = ba.this.s;
                                c = ba.this.r;
                            } catch (Throwable th) {
                                ba.this.i.stop();
                                ba.this.s.a(ba.this.r);
                                throw th;
                            }
                        }
                    }
                    if (ba.this.t == c.TRIMMING) {
                        ba.this.t = c.IDLE;
                    }
                    ba.this.i.stop();
                    d = ba.this.s;
                    c = ba.this.r;
                    d.a(c);
                    if (this != ba.this.y || ba.this.x == null) {
                        Log.d(ba.b, "player loop exit: no stream available");
                    } else if (ba.this.t != c.IDLE) {
                        if (ba.this.t == c.PLAYING && ba.this.x.n()) {
                            ba.this.x.t();
                            ba.this.a("com.soundcloud.android.playbackcomplete");
                        } else if (ba.this.t == c.STOPPING) {
                            ba.this.a("com.soundcloud.android.playbackstopped");
                        }
                        if (ba.this.t != c.RECORDING) {
                            ba.this.t = c.IDLE;
                        }
                    }
                }
            }
        }

        a(ba baVar, ha haVar) {
            this();
            this.a.add(haVar);
        }

        private void a(PlaybackStream playbackStream) throws IOException {
            ba.this.i.setPlaybackRate(ba.this.l.j);
            playbackStream.k();
            ba.this.t = c.PLAYING;
            ba.this.a("com.soundcloud.android.playbackstarted");
            while (!isInterrupted() && ba.this.t == c.PLAYING) {
                int b2 = playbackStream.b(ba.this.o, ba.this.p);
                if (b2 > -1) {
                    int a2 = ba.this.i.a(ba.this.o, b2);
                    if (a2 < 0) {
                        a(a2);
                    }
                    ba.this.o.clear();
                } else {
                    return;
                }
            }
        }

        private void a(int i) {
            String str;
            String str2 = ba.b;
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack#write() returned ");
            if (i == -3) {
                str = "ERROR_INVALID_OPERATION";
            } else if (i == -2) {
                str = "ERROR_BAD_VALUE";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error ");
                sb2.append(i);
                str = sb2.toString();
            }
            sb.append(str);
            Log.e(str2, sb.toString());
            ba.this.t = c.ERROR;
        }
    }

    /* compiled from: SoundRecorder */
    private class b extends Thread {
        b() {
            super("ReaderThread");
            setPriority(10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0224, code lost:
            return;
         */
        public void run() {
            String str;
            synchronized (ba.this.h) {
                String str2 = ba.b;
                StringBuilder sb = new StringBuilder();
                sb.append("starting reader thread: state=");
                sb.append(ba.this.t);
                Log.d(str2, sb.toString());
                if (ba.this.h.getState() != 1) {
                    Log.w(ba.b, "audiorecorder is not initialized");
                    ba.this.t = c.ERROR;
                    ba.this.a("com.soundcloud.android.recorderror");
                    return;
                }
                ba.this.h.startRecording();
                ba.this.h.setPositionNotificationPeriod(ba.this.l.j);
                while (true) {
                    if (ba.this.t != c.READING && ba.this.t != c.RECORDING) {
                        break;
                    }
                    ba.this.m.rewind();
                    int read = ba.this.h.read(ba.this.m, ba.this.n);
                    if (read < 0) {
                        String str3 = ba.b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("AudioRecord.read() returned error: ");
                        sb2.append(read);
                        Log.w(str3, sb2.toString());
                        ba.this.t = c.ERROR;
                    } else if (read == 0) {
                        Log.w(ba.b, "AudioRecord.read() returned no data");
                    } else if (ba.this.t != c.RECORDING || ba.this.B > 0) {
                        try {
                            ba.this.m.limit(read);
                            int a2 = ba.this.u.a(ba.this.m, read);
                            if (a2 >= 0 && a2 < read) {
                                String str4 = ba.b;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("partial write ");
                                sb3.append(a2);
                                Log.w(str4, sb3.toString());
                            }
                            ba.this.q.a(new Intent("com.soundcloud.android.recordsample").putExtra("amplitude", ba.this.u.d()).putExtra("elapsedTime", ba.this.f()));
                        } catch (IOException e) {
                            Log.e(ba.b, "Error occured in updateListener, recording is aborted : ", e);
                            ba.this.t = c.ERROR;
                        }
                    } else {
                        Log.w(ba.b, "No more recording time, stopping");
                        ba.this.t = c.STOPPING;
                    }
                }
                String str5 = ba.b;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("exiting reader loop, stopping recording (state=");
                sb4.append(ba.this.t);
                sb4.append(")");
                Log.d(str5, sb4.toString());
                ba.this.h.stop();
                if (ba.this.w == null) {
                    str = null;
                } else if (ba.this.t != c.ERROR) {
                    try {
                        ba.this.u.a(ba.this.w.d());
                        if (ba.this.x == null) {
                            ba.this.x = new PlaybackStream(ba.this.u.b());
                        } else {
                            ba.this.x.q();
                            ba.this.x.s();
                        }
                        ba.this.c(ba.this.f);
                        str = "com.soundcloud.android.recordfinished";
                    } catch (IOException e2) {
                        ba.this.t = c.ERROR;
                        String str6 = ba.b;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Exception: ");
                        sb5.append(e2);
                        Log.w(str6, sb5.toString());
                        str = "com.soundcloud.android.recorderror";
                    }
                } else {
                    ba.this.x = null;
                    str = "com.soundcloud.android.recorderror";
                }
                ba.this.t = c.IDLE;
                ba.this.v = null;
                if (!TextUtils.isEmpty(str)) {
                    ba.this.a(str);
                }
            }
        }
    }

    /* compiled from: SoundRecorder */
    public enum c {
        IDLE,
        READING,
        RECORDING,
        ERROR,
        STOPPING,
        PLAYING,
        SEEKING,
        TRIMMING;
        
        public static final EnumSet<c> i = null;
        public static final EnumSet<c> j = null;

        static {
            c cVar;
            c cVar2;
            c cVar3;
            c cVar4;
            i = EnumSet.of(cVar, cVar2, cVar3, cVar4);
            j = EnumSet.of(PLAYING, SEEKING);
        }

        public boolean a() {
            return i.contains(this);
        }

        public boolean b() {
            return j.contains(this);
        }

        public boolean c() {
            return this == RECORDING;
        }

        public boolean d() {
            return this == TRIMMING;
        }
    }

    protected ba(Context context, C3668u uVar, J j2) {
        this.f = context;
        this.l = uVar;
        this.g = RecordAppWidgetProvider.a(j2);
        this.t = c.IDLE;
        this.h = uVar.a();
        this.h.setRecordPositionUpdateListener(new Y(this));
        int d2 = uVar.d();
        this.i = uVar.a(d2);
        this.i.setPlaybackPositionUpdateListener(new Z(this));
        this.i.setPositionNotificationPeriod(this.l.j / 60);
        this.q = C1600pd.a(context);
        this.j = uVar.a(context);
        this.k = (int) (context.getResources().getDisplayMetrics().density * 30.0f);
        this.n = (int) uVar.c((long) (this.l.n / this.k));
        this.m = C3673z.a(this.n);
        int i2 = 1024;
        if (d2 < 1024) {
            i2 = d2;
        }
        this.p = i2;
        this.o = C3673z.a(this.p);
        this.u = new P(this.l, context.getResources());
        n();
        androidx.media.AudioAttributesCompat.a aVar = new androidx.media.AudioAttributesCompat.a();
        aVar.a(2);
        aVar.b(1);
        this.r = new defpackage.Cla.a(1).a((OnAudioFocusChangeListener) this).a(aVar.a()).a();
        this.s = new Ala(context);
    }

    /* access modifiers changed from: private */
    public boolean v() {
        boolean b2 = this.s.b(this.r);
        if (!b2) {
            Log.e(b, "could not obtain audio focus");
            a("com.soundcloud.android.playbackerror");
        }
        return b2;
    }

    /* access modifiers changed from: private */
    public void w() {
        String str = "duration";
        this.q.a(new Intent("com.soundcloud.android.playbackprogress").putExtra("position", a()).putExtra(str, c()));
    }

    private void x() {
        this.y = new a();
        this.y.start();
    }

    private void y() {
        if (this.t == c.PLAYING || this.t == c.SEEKING) {
            this.t = c.STOPPING;
        }
    }

    public void onAudioFocusChange(int i2) {
        boolean z2 = i2 == -1 || i2 == -2;
        if (i() && z2) {
            h();
        }
    }

    /* access modifiers changed from: 0000 */
    public long c() {
        PlaybackStream playbackStream = this.x;
        if (playbackStream == null) {
            return -1;
        }
        return playbackStream.c();
    }

    /* access modifiers changed from: 0000 */
    public P d() {
        return this.u;
    }

    public Recording e() {
        return this.w;
    }

    /* access modifiers changed from: 0000 */
    public long f() {
        return this.u.c();
    }

    /* access modifiers changed from: 0000 */
    public float[] g() {
        PlaybackStream playbackStream = this.x;
        if (playbackStream == null) {
            return e;
        }
        return playbackStream.j();
    }

    public void h() {
        if (l()) {
            s();
        } else if (k()) {
            y();
        }
    }

    public boolean i() {
        return this.t.a();
    }

    /* access modifiers changed from: 0000 */
    public boolean j() {
        PlaybackStream playbackStream = this.x;
        return playbackStream != null && playbackStream.l();
    }

    public boolean k() {
        return this.t.b();
    }

    public boolean l() {
        return this.t.c();
    }

    public void m() {
        if (!k()) {
            Context context = this.f;
            context.startService(new Intent(context, SoundRecorderService.class).setAction("com.soundcloud.android.playbackstarted"));
            this.A = -1;
            x();
        }
    }

    public void n() {
        a(false);
    }

    /* access modifiers changed from: 0000 */
    public void o() {
        PlaybackStream playbackStream = this.x;
        if (playbackStream != null) {
            playbackStream.r();
        }
    }

    /* access modifiers changed from: 0000 */
    public c p() {
        if (this.t == c.IDLE) {
            a(c.READING);
        }
        return this.t;
    }

    /* access modifiers changed from: 0000 */
    public Recording q() throws IOException {
        if (!C6630iGa.a()) {
            throw new IOException(this.f.getString(n.record_insert_sd_card));
        } else if (this.j.a()) {
            this.j.b();
            if (this.t != c.RECORDING) {
                if (this.w == null) {
                    this.w = Recording.a(this.f);
                    this.u.a(this.w.w(), this.w.f());
                } else {
                    PlaybackStream playbackStream = this.x;
                    if (playbackStream != null) {
                        try {
                            if (playbackStream.i() > 0) {
                                this.u.a(this.x.d(), this.k);
                                this.x.a(this.x.g(), this.x.h());
                                this.x.q();
                            }
                        } catch (IOException unused) {
                            Log.w(b, "error setting position");
                        }
                    }
                }
                this.j.a(this.w.f());
                this.B = this.j.c();
                Context context = this.f;
                String str = "com.soundcloud.android.recordstarted";
                context.startService(new Intent(context, SoundRecorderService.class).setAction(str));
                a(c.RECORDING);
                a(str);
                return this.w;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("cannot record to file, in state ");
            sb.append(this.t);
            throw new IllegalStateException(sb.toString());
        } else {
            throw new IOException(this.f.getString(n.record_storage_is_full));
        }
    }

    /* access modifiers changed from: 0000 */
    public void r() {
        if (this.t == c.READING) {
            this.t = c.STOPPING;
        }
    }

    /* access modifiers changed from: 0000 */
    public void s() {
        if (this.t == c.RECORDING || this.t == c.READING) {
            this.t = c.STOPPING;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean t() {
        PlaybackStream playbackStream = this.x;
        if (playbackStream == null) {
            return false;
        }
        boolean z2 = !playbackStream.l();
        this.x.a(z2);
        return z2;
    }

    public void u() {
        if (k()) {
            y();
        } else {
            m();
        }
    }

    /* access modifiers changed from: private */
    public Recording c(Context context) {
        if (this.w == null) {
            return null;
        }
        long a2 = Recording.a(a(context), this.w);
        if (a2 > 0) {
            String str = b;
            StringBuilder sb = new StringBuilder();
            sb.append("Trimmed ");
            sb.append(a2);
            sb.append(" bytes of wav data");
            Log.i(str, sb.toString());
        }
        this.w.a(this.x);
        return this.w;
    }

    /* access modifiers changed from: 0000 */
    public void b(float f2, long j2) {
        PlaybackStream playbackStream = this.x;
        if (playbackStream != null) {
            a(playbackStream.b(f2, j2));
        }
    }

    public static File b(Context context) {
        return C6630iGa.a(context, "uploads");
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z2) {
        if (this.z != z2) {
            this.z = z2;
            a("com.soundcloud.android.notificationState");
        }
    }

    public static synchronized ba a(Context context, J j2) {
        ba baVar;
        synchronized (ba.class) {
            if (d == null) {
                d = new ba(context.getApplicationContext(), C3668u.c(), j2);
            }
            baVar = d;
        }
        return baVar;
    }

    static IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : c) {
            intentFilter.addAction(addAction);
        }
        return intentFilter;
    }

    public void a(boolean z2) {
        if (l()) {
            s();
        }
        if (k()) {
            y();
        }
        this.t = this.h.getState() != 1 ? c.ERROR : c.IDLE;
        this.u.f();
        PlaybackStream playbackStream = this.x;
        if (playbackStream != null) {
            playbackStream.a();
            this.x = null;
        }
        Recording recording = this.w;
        if (recording != null) {
            if (z2) {
                U.a(this.f, recording);
            }
            this.w = null;
        }
    }

    private void b(ha haVar) {
        this.y = new a(this, haVar);
        this.y.start();
    }

    public void a(Recording recording) {
        if (this.w == null) {
            if (i()) {
                n();
            }
            this.w = recording;
            P p2 = new P(this.l, this.f.getResources(), recording.w(), recording.f(), this.w.d());
            this.u = p2;
            this.x = recording.u();
        }
    }

    /* access modifiers changed from: 0000 */
    public long a() {
        long j2 = this.A;
        if (j2 != -1) {
            return j2;
        }
        PlaybackStream playbackStream = this.x;
        if (playbackStream != null) {
            return playbackStream.f();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        if (this.x != null) {
            long c2 = (long) (((float) c()) * f2);
            long g2 = this.x.g() + c2;
            if ((k() || this.t.d()) && c2 >= 0) {
                this.A = g2;
                this.t = c.SEEKING;
                return;
            }
            this.x.b(g2);
            w();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2, long j2) {
        PlaybackStream playbackStream = this.x;
        if (playbackStream != null) {
            a(playbackStream.a(f2, j2));
        }
    }

    public static File a(Context context) {
        return C6630iGa.a(context, "recordings");
    }

    private c a(c cVar) {
        String str = b;
        StringBuilder sb = new StringBuilder();
        sb.append("startReading(");
        sb.append(cVar);
        sb.append(")");
        Log.d(str, sb.toString());
        this.t = cVar;
        if (this.v == null) {
            this.v = new b();
            this.v.start();
        }
        return this.t;
    }

    private void a(ha haVar) {
        if (!k() && !this.t.d()) {
            this.t = c.TRIMMING;
            b(haVar);
            return;
        }
        this.y.a(haVar);
        if (k()) {
            a("com.soundcloud.android.playbackstopped");
        }
        this.t = c.TRIMMING;
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        String str2 = "position";
        String str3 = "duration";
        String str4 = "state";
        String str5 = "time_remaining";
        String str6 = "recording";
        Intent putExtra = new Intent(str).putExtra("shouldUseNotifications", this.z).putExtra(str2, a()).putExtra(str3, c()).putExtra(str4, this.t.name()).putExtra(str5, this.B).putExtra(str6, this.w);
        this.q.a(putExtra);
        this.g.a(this.f, putExtra);
    }
}
