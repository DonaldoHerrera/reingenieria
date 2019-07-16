package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

@TargetApi(17)
public final class DummySurface extends Surface {
    private static int a;
    private static boolean b;
    public final boolean c;
    private final a d;
    private boolean e;

    private static class a extends HandlerThread implements Callback {
        private Dq a;
        private Handler b;
        private Error c;
        private RuntimeException d;
        private DummySurface e;

        public a() {
            super("dummySurface");
        }

        private void b(int i) {
            C1852xq.a(this.a);
            this.a.a(i);
            this.e = new DummySurface(this, this.a.a(), i != 0);
        }

        public DummySurface a(int i) {
            boolean z;
            start();
            this.b = new Handler(getLooper(), this);
            this.a = new Dq(this.b);
            synchronized (this) {
                z = false;
                this.b.obtainMessage(1, i, 0).sendToTarget();
                while (this.e == null && this.d == null && this.c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.d;
            if (runtimeException == null) {
                Error error = this.c;
                if (error == null) {
                    DummySurface dummySurface = this.e;
                    C1852xq.a(dummySurface);
                    return dummySurface;
                }
                throw error;
            }
            throw runtimeException;
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    Iq.a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e3) {
                    try {
                        Iq.a("DummySurface", "Failed to initialize dummy surface", e3);
                        this.c = e3;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    b();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }

        private void b() {
            C1852xq.a(this.a);
            this.a.b();
        }

        public void a() {
            C1852xq.a(this.b);
            this.b.sendEmptyMessage(2);
        }
    }

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!b) {
                a = C0471ar.a < 24 ? 0 : b(context);
                b = true;
            }
            if (a == 0) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if ("XT1650".equals(defpackage.C0471ar.d) != false) goto L_0x001b;
     */
    @TargetApi(24)
    private static int b(Context context) {
        if (C0471ar.a < 26) {
            if (!"samsung".equals(C0471ar.c)) {
            }
            return 0;
        }
        if (C0471ar.a < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return 0;
        }
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString == null || !eglQueryString.contains("EGL_EXT_protected_content")) {
            return 0;
        }
        return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
    }

    public void release() {
        super.release();
        synchronized (this.d) {
            if (!this.e) {
                this.d.a();
                this.e = true;
            }
        }
    }

    private DummySurface(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = aVar;
        this.c = z;
    }

    public static DummySurface a(Context context, boolean z) {
        a();
        int i = 0;
        C1852xq.b(!z || a(context));
        a aVar = new a();
        if (z) {
            i = a;
        }
        return aVar.a(i);
    }

    private static void a() {
        if (C0471ar.a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }
}
