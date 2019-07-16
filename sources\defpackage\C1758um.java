package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C0615o;
import java.lang.reflect.Method;

/* renamed from: um reason: default package and case insensitive filesystem */
/* compiled from: AudioTrackPositionTracker */
final class C1758um {
    private final a a;
    private final long[] b;
    private AudioTrack c;
    private int d;
    private int e;
    private C1728tm f;
    private int g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private Method l;
    private long m;
    private boolean n;
    private boolean o;
    private long p;
    private long q;
    private long r;
    private long s;
    private int t;
    private int u;
    private long v;
    private long w;
    private long x;
    private long y;

    /* renamed from: um$a */
    /* compiled from: AudioTrackPositionTracker */
    public interface a {
        void a(int i, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j, long j2, long j3, long j4);
    }

    public C1758um(a aVar) {
        C1852xq.a(aVar);
        this.a = aVar;
        if (C0471ar.a >= 18) {
            try {
                this.l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    private long f(long j2) {
        return (j2 * 1000000) / ((long) this.g);
    }

    private void g(long j2) {
        if (this.o) {
            Method method = this.l;
            if (method != null && j2 - this.p >= 500000) {
                try {
                    AudioTrack audioTrack = this.c;
                    C1852xq.a(audioTrack);
                    Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                    C0471ar.a(num);
                    this.m = (((long) num.intValue()) * 1000) - this.i;
                    this.m = Math.max(this.m, 0);
                    if (this.m > 5000000) {
                        this.a.a(this.m);
                        this.m = 0;
                    }
                } catch (Exception unused) {
                    this.l = null;
                }
                this.p = j2;
            }
        }
    }

    private void h() {
        long g2 = g();
        if (g2 != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.k >= 30000) {
                long[] jArr = this.b;
                int i2 = this.t;
                jArr[i2] = g2 - nanoTime;
                this.t = (i2 + 1) % 10;
                int i3 = this.u;
                if (i3 < 10) {
                    this.u = i3 + 1;
                }
                this.k = nanoTime;
                this.j = 0;
                int i4 = 0;
                while (true) {
                    int i5 = this.u;
                    if (i4 >= i5) {
                        break;
                    }
                    this.j += this.b[i4] / ((long) i5);
                    i4++;
                }
            }
            if (!this.h) {
                a(nanoTime, g2);
                g(nanoTime);
            }
        }
    }

    private void i() {
        this.j = 0;
        this.u = 0;
        this.t = 0;
        this.k = 0;
    }

    public void a(AudioTrack audioTrack, int i2, int i3, int i4) {
        this.c = audioTrack;
        this.d = i3;
        this.e = i4;
        this.f = new C1728tm(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = a(i2);
        this.o = C0471ar.f(i2);
        this.i = this.o ? f((long) (i4 / i3)) : -9223372036854775807L;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.n = false;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.m = 0;
    }

    public void b(long j2) {
        this.x = f();
        this.v = SystemClock.elapsedRealtime() * 1000;
        this.y = j2;
    }

    public boolean c(long j2) {
        return j2 > f() || e();
    }

    public void d() {
        C1728tm tmVar = this.f;
        C1852xq.a(tmVar);
        tmVar.g();
    }

    public boolean e(long j2) {
        AudioTrack audioTrack = this.c;
        C1852xq.a(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.n = false;
                return false;
            } else if (playState == 1 && f() == 0) {
                return false;
            }
        }
        boolean z = this.n;
        this.n = c(j2);
        if (z && !this.n && playState != 1) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(this.e, C0615o.b(this.i));
            }
        }
        return true;
    }

    private long f() {
        AudioTrack audioTrack = this.c;
        C1852xq.a(audioTrack);
        AudioTrack audioTrack2 = audioTrack;
        if (this.v != -9223372036854775807L) {
            return Math.min(this.y, this.x + ((((SystemClock.elapsedRealtime() * 1000) - this.v) * ((long) this.g)) / 1000000));
        }
        int playState = audioTrack2.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack2.getPlaybackHeadPosition());
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.s = this.q;
            }
            playbackHeadPosition += this.s;
        }
        if (C0471ar.a <= 29) {
            if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                if (this.w == -9223372036854775807L) {
                    this.w = SystemClock.elapsedRealtime();
                }
                return this.q;
            }
            this.w = -9223372036854775807L;
        }
        if (this.q > playbackHeadPosition) {
            this.r++;
        }
        this.q = playbackHeadPosition;
        return playbackHeadPosition + (this.r << 32);
    }

    public boolean d(long j2) {
        return this.w != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.w >= 200;
    }

    public void c() {
        i();
        this.c = null;
        this.f = null;
    }

    public boolean b() {
        i();
        if (this.v != -9223372036854775807L) {
            return false;
        }
        C1728tm tmVar = this.f;
        C1852xq.a(tmVar);
        tmVar.g();
        return true;
    }

    private boolean e() {
        if (this.h) {
            AudioTrack audioTrack = this.c;
            C1852xq.a(audioTrack);
            if (audioTrack.getPlayState() == 2 && f() == 0) {
                return true;
            }
        }
        return false;
    }

    private long g() {
        return f(f());
    }

    public long a(boolean z) {
        long j2;
        AudioTrack audioTrack = this.c;
        C1852xq.a(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            h();
        }
        long nanoTime = System.nanoTime() / 1000;
        C1728tm tmVar = this.f;
        C1852xq.a(tmVar);
        C1728tm tmVar2 = tmVar;
        if (tmVar2.d()) {
            long f2 = f(tmVar2.b());
            if (!tmVar2.e()) {
                return f2;
            }
            return f2 + (nanoTime - tmVar2.c());
        }
        if (this.u == 0) {
            j2 = g();
        } else {
            j2 = nanoTime + this.j;
        }
        if (!z) {
            j2 -= this.m;
        }
        return j2;
    }

    public boolean a() {
        AudioTrack audioTrack = this.c;
        C1852xq.a(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public int a(long j2) {
        return this.e - ((int) (j2 - (f() * ((long) this.d))));
    }

    private void a(long j2, long j3) {
        C1728tm tmVar = this.f;
        C1852xq.a(tmVar);
        C1728tm tmVar2 = tmVar;
        if (tmVar2.a(j2)) {
            long c2 = tmVar2.c();
            long b2 = tmVar2.b();
            if (Math.abs(c2 - j2) > 5000000) {
                this.a.b(b2, c2, j2, j3);
                tmVar2.f();
            } else if (Math.abs(f(b2) - j3) > 5000000) {
                this.a.a(b2, c2, j2, j3);
                tmVar2.f();
            } else {
                tmVar2.a();
            }
        }
    }

    private static boolean a(int i2) {
        return C0471ar.a < 23 && (i2 == 5 || i2 == 6);
    }
}
