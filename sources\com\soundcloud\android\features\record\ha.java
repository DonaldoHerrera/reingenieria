package com.soundcloud.android.features.record;

import com.soundcloud.android.features.record.filter.FadeFilter;

/* compiled from: TrimPreview */
class ha {
    private final PlaybackStream a;
    long b;
    final long c;
    public long d;
    public int e;

    public ha(PlaybackStream playbackStream, long j, long j2, long j3) {
        this(playbackStream, j, j2, j3, ba.a);
    }

    public final long a(C3668u uVar) {
        return uVar.b((long) ((int) Math.abs(this.c - this.b)));
    }

    public long b(C3668u uVar) {
        return uVar.c(Math.min(this.b, this.c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrimPreview{stream=");
        sb.append(this.a);
        sb.append(", startPos=");
        sb.append(this.b);
        sb.append(", endPos=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", playbackRate=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }

    public ha(PlaybackStream playbackStream, long j, long j2, long j3, int i) {
        this.a = playbackStream;
        this.b = j;
        this.c = j2;
        this.d = j3;
        C3668u b2 = playbackStream.b();
        float a2 = (float) a(b2);
        int i2 = (int) ((1000.0f / ((float) this.d)) * a2);
        int i3 = b2.m;
        this.e = i2 / i3;
        if (this.e > i) {
            this.e = i;
            this.d = (long) (1000.0f / (((float) (this.e * i3)) / a2));
        }
        if (this.d > 500) {
            this.d = 500;
            long a3 = b2.a((long) (((float) (this.e * b2.m)) / (1000.0f / ((float) this.d))));
            if (b()) {
                this.b = this.c + a3;
            } else {
                this.b = this.c - a3;
            }
        }
    }

    public FadeFilter a() {
        return new FadeFilter(2, C3668u.a(30, this.e, this.a.b().m), 10);
    }

    public final boolean b() {
        return this.b > this.c;
    }
}
