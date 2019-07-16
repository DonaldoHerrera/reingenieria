package com.soundcloud.android.playback;

import android.support.v4.media.session.PlaybackStateCompat;
import com.soundcloud.android.playback.C4431ub.a;
import com.soundcloud.android.playback.core.Stream;
import com.soundcloud.android.playback.players.m;

/* renamed from: com.soundcloud.android.playback.vb reason: case insensitive filesystem */
/* compiled from: PlayStateCompatWrapper.kt */
public final class C4513vb implements C4431ub {
    private final C3508cda a = Ac.a(this.v);
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final long k;
    private final long l;
    private final boolean m;
    private final boolean n;
    private final long o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final PlaybackStateCompat v;

    public C4513vb(PlaybackStateCompat playbackStateCompat) {
        C7471uYa.b(playbackStateCompat, "playbackStateCompat");
        this.v = playbackStateCompat;
        boolean z = false;
        this.b = this.v.getState() == 6 || this.v.getState() == 8;
        this.c = this.v.getState() == 3;
        this.d = f() || j();
        this.e = h();
        this.f = this.v.getState() == 0 || this.v.getState() == 2;
        this.g = this.v.getState() == 7;
        this.h = m.c(this.v) == Jla.PLAYBACK_COMPLETE;
        this.i = m() || l();
        this.j = k() || m() || l();
        this.k = this.v.getPosition();
        this.l = m.a(this.v);
        this.m = m.c(this.v) == Jla.ERROR_RECOVERABLE;
        if (m.c(this.v) == Jla.ERROR_FATAL) {
            z = true;
        }
        this.n = z;
        this.o = System.currentTimeMillis();
        this.p = m.b(this.v);
        Stream d2 = m.d(this.v);
        String str = null;
        this.q = d2 != null ? C4313gd.c(d2) : null;
        Stream d3 = m.d(this.v);
        this.r = d3 != null ? d3.b() : null;
        Stream d4 = m.d(this.v);
        this.s = d4 != null ? C4313gd.b(d4) : null;
        Stream d5 = m.d(this.v);
        this.t = d5 != null ? C4313gd.d(d5) : null;
        Stream d6 = m.d(this.v);
        if (d6 != null) {
            str = C4313gd.a(d6);
        }
        this.u = str;
    }

    public Ina a(long j2, long j3, long j4) {
        return a.a(this, j2, j3, j4);
    }

    public long b() {
        return this.o;
    }

    public final PlaybackStateCompat c() {
        return this.v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.v, (java.lang.Object) ((com.soundcloud.android.playback.C4513vb) r2).v) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4513vb) {
            }
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.b;
    }

    public String g() {
        return this.u;
    }

    public long getDuration() {
        return this.l;
    }

    public long getPosition() {
        return this.k;
    }

    public boolean h() {
        return this.d;
    }

    public int hashCode() {
        PlaybackStateCompat playbackStateCompat = this.v;
        if (playbackStateCompat != null) {
            return playbackStateCompat.hashCode();
        }
        return 0;
    }

    public boolean i() {
        return this.j;
    }

    public boolean j() {
        return this.c;
    }

    public boolean k() {
        return this.f;
    }

    public boolean l() {
        return this.g;
    }

    public boolean m() {
        return this.h;
    }

    public String n() {
        return this.q;
    }

    public boolean o() {
        return this.n;
    }

    public boolean p() {
        return this.e;
    }

    public Ina q() {
        return a.a(this);
    }

    public boolean r() {
        return this.i;
    }

    public C3508cda s() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayStateCompatWrapper(playbackStateCompat=");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }

    public String a() {
        return this.p;
    }
}
