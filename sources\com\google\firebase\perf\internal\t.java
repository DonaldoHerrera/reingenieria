package com.google.firebase.perf.internal;

import android.util.Log;
import com.google.android.gms.internal.firebase-perf.C0877pa;
import com.google.android.gms.internal.firebase-perf.C0911y;
import com.google.android.gms.internal.firebase-perf.zzbg;
import java.util.concurrent.TimeUnit;

final class t {
    private static final long a = TimeUnit.MINUTES.toMicros(1);
    private long b;
    private long c;
    private zzbg d = new zzbg();
    private long e;
    private final C0911y f;
    private long g;
    private long h;
    private long i;
    private long j;
    private final boolean k;

    t(long j2, long j3, C0911y yVar, RemoteConfigManager remoteConfigManager, u uVar, boolean z) {
        this.f = yVar;
        this.b = j3;
        this.c = j2;
        this.e = j3;
        long zzc = remoteConfigManager.zzc(uVar.e(), 0);
        if (zzc == 0) {
            zzc = (long) uVar.a();
        }
        long zzc2 = remoteConfigManager.zzc(uVar.f(), (long) uVar.b());
        this.g = zzc2 / zzc;
        this.h = zzc2;
        String str = "FirebasePerformance";
        if (!(this.h == ((long) uVar.b()) && this.g == ((long) (uVar.b() / uVar.a())))) {
            Log.d(str, String.format("Foreground %s logging rate:%d, burst capacity:%d", new Object[]{uVar.toString(), Long.valueOf(this.g), Long.valueOf(this.h)}));
        }
        long zzc3 = remoteConfigManager.zzc(uVar.g(), 0);
        if (zzc3 == 0) {
            zzc3 = (long) uVar.c();
        }
        long zzc4 = remoteConfigManager.zzc(uVar.u(), (long) uVar.d());
        this.i = zzc4 / zzc3;
        this.j = zzc4;
        if (!(this.j == ((long) uVar.d()) && this.i == ((long) (uVar.d() / uVar.c())))) {
            Log.d(str, String.format("Background %s logging rate:%d, capacity:%d", new Object[]{uVar.toString(), Long.valueOf(this.i), Long.valueOf(this.j)}));
        }
        this.k = z;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized boolean a(C0877pa paVar) {
        zzbg zzbg = new zzbg();
        this.e = Math.min(this.e + Math.max(0, (this.d.a(zzbg) * this.c) / a), this.b);
        if (this.e > 0) {
            this.e--;
            this.d = zzbg;
            return true;
        }
        if (this.k) {
            Log.w("FirebasePerformance", "Exceeded log rate limit, dropping the log.");
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(boolean z) {
        this.c = z ? this.g : this.i;
        this.b = z ? this.h : this.j;
    }
}
