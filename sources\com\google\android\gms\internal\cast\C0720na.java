package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.cast.na reason: case insensitive filesystem */
public final class C0720na {
    private static final C0710ia a = new C0710ia("RequestTracker");
    private static final Object b = new Object();
    private long c;
    private final Handler d = new Ca(Looper.getMainLooper());
    @VisibleForTesting
    private long e = -1;
    @VisibleForTesting
    private C0722oa f;
    @VisibleForTesting
    private Runnable g;

    public C0720na(long j) {
        this.c = j;
    }

    public final void a(long j, C0722oa oaVar) {
        C0722oa oaVar2;
        long j2;
        synchronized (b) {
            oaVar2 = this.f;
            j2 = this.e;
            this.e = j;
            this.f = oaVar;
        }
        if (oaVar2 != null) {
            oaVar2.a(j2);
        }
        synchronized (b) {
            if (this.g != null) {
                this.d.removeCallbacks(this.g);
            }
            this.g = new C0726qa(this);
            this.d.postDelayed(this.g, this.c);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b() {
        synchronized (b) {
            if (this.e != -1) {
                a(15, (Object) null);
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (b) {
            z = this.e != -1;
        }
        return z;
    }

    public final boolean a(long j) {
        boolean z;
        synchronized (b) {
            z = this.e != -1 && this.e == j;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        return false;
     */
    public final boolean a(long j, int i, Object obj) {
        synchronized (b) {
            if (this.e != -1 && this.e == j) {
                a(i, obj, String.format(Locale.ROOT, "request %d completed", new Object[]{Long.valueOf(j)}));
                return true;
            }
        }
    }

    public final boolean a(int i) {
        return a(2002, (Object) null);
    }

    private final boolean a(int i, Object obj) {
        synchronized (b) {
            if (this.e == -1) {
                return false;
            }
            a(i, (Object) null, String.format(Locale.ROOT, "clearing request %d", new Object[]{Long.valueOf(this.e)}));
            return true;
        }
    }

    private final void a(int i, Object obj, String str) {
        a.a(str, new Object[0]);
        synchronized (b) {
            if (this.f != null) {
                this.f.a(this.e, i, obj);
            }
            this.e = -1;
            this.f = null;
            synchronized (b) {
                if (this.g != null) {
                    this.d.removeCallbacks(this.g);
                    this.g = null;
                }
            }
        }
    }
}
