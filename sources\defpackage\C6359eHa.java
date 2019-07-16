package defpackage;

import android.app.ActivityManager;
import com.crashlytics.android.a;

/* renamed from: eHa reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsMemoryReporter */
public class C6359eHa extends C5081LHa {
    public C6359eHa(ActivityManager activityManager) {
        super(activityManager);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        super.a(z);
        a.a("low system memory state", z);
    }

    /* access modifiers changed from: protected */
    public void b(long j) {
        super.b(j);
        a.a("large memory class (MB)", j);
    }

    /* access modifiers changed from: protected */
    public void c(long j) {
        super.c(j);
        a.a("low memory threshold (MB)", j);
    }

    /* access modifiers changed from: protected */
    public void a(long j) {
        super.a(j);
        a.a("available system memory (MB)", j);
    }

    /* access modifiers changed from: protected */
    public void a(long j, long j2) {
        super.a(j, j2);
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("/");
        sb.append(j2);
        a.a("native heap free / total in kb", sb.toString());
    }

    /* access modifiers changed from: protected */
    public void a(long j, long j2, long j3) {
        super.a(j, j2, j3);
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        String str = "/";
        sb.append(str);
        sb.append(j2);
        sb.append(str);
        sb.append(j3);
        a.a("dalvik heap free / current max / hard max in kb", sb.toString());
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        super.a(str);
        a.a(str);
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        super.a(i);
        a.a("memory class (MB)", (long) i);
    }
}
