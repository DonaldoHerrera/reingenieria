package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: VideoFrameReleaseTimeHelper */
public final class p {
    private final WindowManager a;
    private final b b;
    private final a c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private long j;
    private long k;
    private long l;

    @TargetApi(17)
    /* compiled from: VideoFrameReleaseTimeHelper */
    private final class a implements DisplayListener {
        private final DisplayManager a;

        public a(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public void a() {
            this.a.registerDisplayListener(this, null);
        }

        public void b() {
            this.a.unregisterDisplayListener(this);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                p.this.c();
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* compiled from: VideoFrameReleaseTimeHelper */
    private static final class b implements FrameCallback, Callback {
        private static final b a = new b();
        public volatile long b = -9223372036854775807L;
        private final Handler c;
        private final HandlerThread d = new HandlerThread("ChoreographerOwner:Handler");
        private Choreographer e;
        private int f;

        private b() {
            this.d.start();
            this.c = C0471ar.a(this.d.getLooper(), (Callback) this);
            this.c.sendEmptyMessage(0);
        }

        public static b b() {
            return a;
        }

        private void d() {
            this.f++;
            if (this.f == 1) {
                this.e.postFrameCallback(this);
            }
        }

        private void e() {
            this.e = Choreographer.getInstance();
        }

        private void f() {
            this.f--;
            if (this.f == 0) {
                this.e.removeFrameCallback(this);
                this.b = -9223372036854775807L;
            }
        }

        public void a() {
            this.c.sendEmptyMessage(1);
        }

        public void c() {
            this.c.sendEmptyMessage(2);
        }

        public void doFrame(long j) {
            this.b = j;
            this.e.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                e();
                return true;
            } else if (i == 1) {
                d();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public p(Context context) {
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.a = (WindowManager) context.getSystemService("window");
        } else {
            this.a = null;
        }
        if (this.a != null) {
            if (C0471ar.a >= 17) {
                aVar = a(context);
            }
            this.c = aVar;
            this.b = b.b();
        } else {
            this.c = null;
            this.b = null;
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public void c() {
        Display defaultDisplay = this.a.getDefaultDisplay();
        if (defaultDisplay != null) {
            this.d = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.e = (this.d * 80) / 100;
        }
    }

    public void b() {
        this.i = false;
        if (this.a != null) {
            this.b.a();
            a aVar = this.c;
            if (aVar != null) {
                aVar.a();
            }
            c();
        }
    }

    public void a() {
        if (this.a != null) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.b();
            }
            this.b.c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    public long a(long j2, long j3) {
        long j4;
        long j5;
        b bVar;
        long j6 = 1000 * j2;
        if (this.i) {
            if (j2 != this.f) {
                this.l++;
                this.g = this.h;
            }
            long j7 = this.l;
            if (j7 >= 6) {
                j5 = this.g + ((j6 - this.k) / j7);
                if (b(j5, j3)) {
                    this.i = false;
                } else {
                    j4 = (this.j + j5) - this.k;
                    if (!this.i) {
                        this.k = j6;
                        this.j = j3;
                        this.l = 0;
                        this.i = true;
                    }
                    this.f = j2;
                    this.h = j5;
                    bVar = this.b;
                    if (bVar != null || this.d == -9223372036854775807L) {
                        return j4;
                    }
                    long j8 = bVar.b;
                    if (j8 == -9223372036854775807L) {
                        return j4;
                    }
                    return a(j4, j8, this.d) - this.e;
                }
            } else if (b(j6, j3)) {
                this.i = false;
            }
        }
        j4 = j3;
        j5 = j6;
        if (!this.i) {
        }
        this.f = j2;
        this.h = j5;
        bVar = this.b;
        if (bVar != null) {
        }
        return j4;
    }

    private boolean b(long j2, long j3) {
        return Math.abs((j3 - this.j) - (j2 - this.k)) > 20000000;
    }

    @TargetApi(17)
    private a a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    private static long a(long j2, long j3, long j4) {
        long j5;
        long j6 = j3 + (((j2 - j3) / j4) * j4);
        if (j2 <= j6) {
            j5 = j6 - j4;
        } else {
            long j7 = j6;
            j6 = j4 + j6;
            j5 = j7;
        }
        return j6 - j2 < j2 - j5 ? j6 : j5;
    }
}
