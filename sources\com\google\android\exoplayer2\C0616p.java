package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.m;
import com.soundcloud.flippernative.BuildConfig;

/* renamed from: com.google.android.exoplayer2.p reason: case insensitive filesystem */
/* compiled from: DefaultLoadControl */
public class C0616p implements D {
    private final C0501bq a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final int g;
    private final boolean h;
    private final long i;
    private final boolean j;
    private int k;
    private boolean l;
    private boolean m;

    public C0616p() {
        this(new C0501bq(true, 65536));
    }

    public void a(O[] oArr, TrackGroupArray trackGroupArray, m mVar) {
        this.m = b(oArr, mVar);
        int i2 = this.g;
        if (i2 == -1) {
            i2 = a(oArr, mVar);
        }
        this.k = i2;
        this.a.a(this.k);
    }

    public long b() {
        return this.i;
    }

    public void c() {
        a(false);
    }

    public Sp d() {
        return this.a;
    }

    public void e() {
        a(true);
    }

    public void f() {
        a(true);
    }

    @Deprecated
    public C0616p(C0501bq bqVar) {
        this(bqVar, 15000, 50000, 50000, 2500, 5000, -1, true, 0, false);
    }

    private static boolean b(O[] oArr, m mVar) {
        for (int i2 = 0; i2 < oArr.length; i2++) {
            if (oArr[i2].e() == 2 && mVar.a(i2) != null) {
                return true;
            }
        }
        return false;
    }

    protected C0616p(C0501bq bqVar, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, boolean z2) {
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        int i14 = i8;
        String str = BuildConfig.VERSION_NAME;
        String str2 = "bufferForPlaybackMs";
        a(i12, 0, str2, str);
        String str3 = "bufferForPlaybackAfterRebufferMs";
        a(i13, 0, str3, str);
        String str4 = "minBufferAudioMs";
        a(i2, i12, str4, str2);
        String str5 = "minBufferVideoMs";
        a(i10, i12, str5, str2);
        a(i2, i13, str4, str3);
        a(i10, i13, str5, str3);
        String str6 = "maxBufferMs";
        a(i11, i2, str6, str4);
        a(i11, i10, str6, str5);
        a(i14, 0, "backBufferDurationMs", str);
        this.a = bqVar;
        this.b = C0615o.a((long) i9);
        this.c = C0615o.a((long) i10);
        this.d = C0615o.a((long) i11);
        this.e = C0615o.a((long) i12);
        this.f = C0615o.a((long) i13);
        this.g = i7;
        this.h = z;
        this.i = C0615o.a((long) i14);
        this.j = z2;
    }

    public boolean a() {
        return this.j;
    }

    public boolean a(long j2, float f2) {
        boolean z = true;
        boolean z2 = this.a.d() >= this.k;
        long j3 = this.m ? this.c : this.b;
        if (f2 > 1.0f) {
            j3 = Math.min(C0471ar.a(j3, f2), this.d);
        }
        if (j2 < j3) {
            if (!this.h && z2) {
                z = false;
            }
            this.l = z;
        } else if (j2 >= this.d || z2) {
            this.l = false;
        }
        return this.l;
    }

    public boolean a(long j2, float f2, boolean z) {
        long b2 = C0471ar.b(j2, f2);
        long j3 = z ? this.f : this.e;
        return j3 <= 0 || b2 >= j3 || (!this.h && this.a.d() >= this.k);
    }

    /* access modifiers changed from: protected */
    public int a(O[] oArr, m mVar) {
        int i2 = 0;
        for (int i3 = 0; i3 < oArr.length; i3++) {
            if (mVar.a(i3) != null) {
                i2 += C0471ar.b(oArr[i3].e());
            }
        }
        return i2;
    }

    private void a(boolean z) {
        this.k = 0;
        this.l = false;
        if (z) {
            this.a.e();
        }
    }

    private static void a(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        C1852xq.a(z, sb.toString());
    }
}
