package defpackage;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: tm reason: default package and case insensitive filesystem */
/* compiled from: AudioTimestampPoller */
final class C1728tm {
    private final a a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;

    @TargetApi(19)
    /* renamed from: tm$a */
    /* compiled from: AudioTimestampPoller */
    private static final class a {
        private final AudioTrack a;
        private final AudioTimestamp b = new AudioTimestamp();
        private long c;
        private long d;
        private long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public long a() {
            return this.e;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }
    }

    public C1728tm(AudioTrack audioTrack) {
        if (C0471ar.a >= 19) {
            this.a = new a(audioTrack);
            g();
            return;
        }
        this.a = null;
        a(3);
    }

    public boolean a(long j) {
        a aVar = this.a;
        if (aVar == null || j - this.e < this.d) {
            return false;
        }
        this.e = j;
        boolean c2 = aVar.c();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c2) {
                        g();
                    }
                } else if (!c2) {
                    g();
                }
            } else if (!c2) {
                g();
            } else if (this.a.a() > this.f) {
                a(2);
            }
        } else if (c2) {
            if (this.a.b() >= this.c) {
                this.f = this.a.a();
                a(1);
            } else {
                c2 = false;
            }
        } else if (j - this.c > 500000) {
            a(3);
        }
        return c2;
    }

    public long b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1;
    }

    public long c() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        int i = this.b;
        return i == 1 || i == 2;
    }

    public boolean e() {
        return this.b == 2;
    }

    public void f() {
        a(4);
    }

    public void g() {
        if (this.a != null) {
            a(0);
        }
    }

    public void a() {
        if (this.b == 4) {
            g();
        }
    }

    private void a(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0;
            this.f = -1;
            this.c = System.nanoTime() / 1000;
            this.d = 5000;
        } else if (i == 1) {
            this.d = 5000;
        } else if (i == 2 || i == 3) {
            this.d = 10000000;
        } else if (i == 4) {
            this.d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
