package com.soundcloud.android.playback.playqueue;

import android.content.Context;
import androidx.core.content.a;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.va;
import com.soundcloud.android.tracks.C6158da;
import com.soundcloud.android.tracks.C6185ma;

/* compiled from: TrackPlayQueueUIItem */
class hb extends Va {
    private final q d;
    private final C6185ma e;
    private final int f;
    private final int g;
    private final Vca h;
    private final int i;
    private final C4928GKa<String> j;

    hb(q qVar, C6185ma maVar, int i2, int i3, int i4, Vca vca, C4928GKa<String> gKa, b bVar) {
        super(bb.COMING_UP, bVar, true);
        this.d = qVar;
        this.e = maVar;
        this.f = i2;
        this.g = i3;
        this.h = vca;
        this.i = i4;
        this.j = gKa;
    }

    static hb a(q qVar, C6185ma maVar, Context context, C4928GKa<String> gKa, b bVar) {
        hb hbVar = new hb(qVar, maVar, System.identityHashCode(qVar), a(maVar), a(maVar.K(), context), b(maVar), gKa, bVar);
        return hbVar;
    }

    private static Vca b(C6185ma maVar) {
        return va.a(maVar.a(), maVar.b());
    }

    /* access modifiers changed from: 0000 */
    public long d() {
        return (long) this.f;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> j() {
        return this.j;
    }

    public String k() {
        return this.e.d();
    }

    public Vca l() {
        return this.h;
    }

    public q m() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public int n() {
        return this.g;
    }

    public String o() {
        return this.e.B();
    }

    public int p() {
        return this.i;
    }

    public C6185ma q() {
        return this.e;
    }

    public boolean r() {
        return this.e.K();
    }

    /* access modifiers changed from: 0000 */
    public boolean s() {
        return C6158da.b(this.e) || C6158da.a(this.e);
    }

    /* access modifiers changed from: 0000 */
    public a a() {
        return a.TRACK;
    }

    private static int a(C6185ma maVar) {
        if (maVar.K()) {
            return l.not_available;
        }
        if (maVar.m()) {
            return l.private_label;
        }
        return -1;
    }

    private static int a(boolean z, Context context) {
        if (z) {
            return a.a(context, f.ash);
        }
        return a.a(context, f.silver);
    }
}
