package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.os.Debug;
import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: LHa reason: default package and case insensitive filesystem */
/* compiled from: MemoryReporter */
public class C5081LHa {
    private static final MemoryInfo a = new MemoryInfo();
    private final ActivityManager b;

    public C5081LHa(ActivityManager activityManager) {
        this.b = activityManager;
    }

    private void c() {
        b((long) d());
    }

    private int d() {
        return this.b.getLargeMemoryClass();
    }

    private long e(long j) {
        return (j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public void a() {
        Runtime runtime = Runtime.getRuntime();
        a(d(runtime.freeMemory()), d(runtime.totalMemory()), d(runtime.maxMemory()));
        a(d(Debug.getNativeHeapFreeSize()), d(Debug.getNativeHeapSize()));
        this.b.getMemoryInfo(a);
        a((a.availMem / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
        a(a.lowMemory);
    }

    public void b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Trim memory received with level ");
        sb.append(i);
        a(sb.toString());
    }

    private long d(long j) {
        return j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public void b() {
        a(this.b.getMemoryClass());
        c();
        this.b.getMemoryInfo(a);
        c(e(a.threshold));
    }

    /* access modifiers changed from: protected */
    public void c(long j) {
        b a2 = SDb.a("MEM");
        StringBuilder sb = new StringBuilder();
        sb.append("low memory threshold: ");
        sb.append(j);
        sb.append("MB");
        a2.d(sb.toString(), new Object[0]);
    }

    /* access modifiers changed from: protected */
    public void b(long j) {
        b a2 = SDb.a("MEM");
        StringBuilder sb = new StringBuilder();
        sb.append("large memory class: ");
        sb.append(j);
        sb.append("MB");
        a2.d(sb.toString(), new Object[0]);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        SDb.a("MEM").d("system is in low memory state: %s", Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    public void a(long j) {
        SDb.a("MEM").d("available system memory (MB): %s", Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    public void a(long j, long j2) {
        b a2 = SDb.a("MEM");
        StringBuilder sb = new StringBuilder();
        sb.append("native heap free / total in kb: ");
        sb.append(j);
        sb.append("/");
        sb.append(j2);
        a2.d(sb.toString(), new Object[0]);
    }

    /* access modifiers changed from: protected */
    public void a(long j, long j2, long j3) {
        b a2 = SDb.a("MEM");
        StringBuilder sb = new StringBuilder();
        sb.append("dalvik heap free / current max / hard max in kb: ");
        sb.append(j);
        String str = "/";
        sb.append(str);
        sb.append(j2);
        sb.append(str);
        sb.append(j3);
        a2.d(sb.toString(), new Object[0]);
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        SDb.a("MEM").d(str, new Object[0]);
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        b a2 = SDb.a("MEM");
        StringBuilder sb = new StringBuilder();
        sb.append("memory class (our limit): ");
        sb.append(i);
        sb.append("MB");
        a2.d(sb.toString(), new Object[0]);
    }
}
