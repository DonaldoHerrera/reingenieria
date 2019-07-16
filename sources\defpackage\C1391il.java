package defpackage;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: il reason: default package and case insensitive filesystem */
/* compiled from: AndroidSpringLooperFactory */
abstract class C1391il {

    @TargetApi(16)
    /* renamed from: il$a */
    /* compiled from: AndroidSpringLooperFactory */
    private static class a extends C1697sl {
        /* access modifiers changed from: private */
        public final Choreographer b;
        /* access modifiers changed from: private */
        public final FrameCallback c = new C1361hl(this);
        /* access modifiers changed from: private */
        public boolean d;
        /* access modifiers changed from: private */
        public long e;

        public a(Choreographer choreographer) {
            this.b = choreographer;
        }

        public static a c() {
            return new a(Choreographer.getInstance());
        }

        public void b() {
            this.d = false;
            this.b.removeFrameCallback(this.c);
        }

        public void a() {
            if (!this.d) {
                this.d = true;
                this.e = SystemClock.uptimeMillis();
                this.b.removeFrameCallback(this.c);
                this.b.postFrameCallback(this.c);
            }
        }
    }

    /* renamed from: il$b */
    /* compiled from: AndroidSpringLooperFactory */
    private static class b extends C1697sl {
        /* access modifiers changed from: private */
        public final Handler b;
        /* access modifiers changed from: private */
        public final Runnable c = new C1422jl(this);
        /* access modifiers changed from: private */
        public boolean d;
        /* access modifiers changed from: private */
        public long e;

        public b(Handler handler) {
            this.b = handler;
        }

        public static C1697sl c() {
            return new b(new Handler());
        }

        public void b() {
            this.d = false;
            this.b.removeCallbacks(this.c);
        }

        public void a() {
            if (!this.d) {
                this.d = true;
                this.e = SystemClock.uptimeMillis();
                this.b.removeCallbacks(this.c);
                this.b.post(this.c);
            }
        }
    }

    public static C1697sl a() {
        if (VERSION.SDK_INT >= 16) {
            return a.c();
        }
        return b.c();
    }
}
