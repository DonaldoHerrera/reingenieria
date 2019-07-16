package defpackage;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

@TargetApi(17)
/* renamed from: Dq reason: default package */
/* compiled from: EGLSurfaceTexture */
public final class Dq implements OnFrameAvailableListener, Runnable {
    private static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final Handler b;
    private final int[] c;
    private final b d;
    private EGLDisplay e;
    private EGLContext f;
    private EGLSurface g;
    private SurfaceTexture h;

    /* renamed from: Dq$a */
    /* compiled from: EGLSurfaceTexture */
    public static final class a extends RuntimeException {
        private a(String str) {
            super(str);
        }
    }

    /* renamed from: Dq$b */
    /* compiled from: EGLSurfaceTexture */
    public interface b {
        void a();
    }

    public Dq(Handler handler) {
        this(handler, null);
    }

    private void c() {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a();
        }
    }

    private static EGLDisplay d() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new a("eglInitialize failed");
        }
        throw new a("eglGetDisplay failed");
    }

    public void a(int i) {
        this.e = d();
        EGLConfig a2 = a(this.e);
        this.f = a(this.e, a2, i);
        this.g = a(this.e, a2, this.f, i);
        a(this.c);
        this.h = new SurfaceTexture(this.c[0]);
        this.h.setOnFrameAvailableListener(this);
    }

    public void b() {
        this.b.removeCallbacks(this);
        try {
            if (this.h != null) {
                this.h.release();
                GLES20.glDeleteTextures(1, this.c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.e, this.g);
            }
            EGLContext eGLContext = this.f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.e, eGLContext);
            }
            if (C0471ar.a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.e);
            }
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.b.post(this);
    }

    public void run() {
        c();
        SurfaceTexture surfaceTexture = this.h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public Dq(Handler handler, b bVar) {
        this.b = handler;
        this.d = bVar;
        this.c = new int[1];
    }

    public SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.h;
        C1852xq.a(surfaceTexture);
        return surfaceTexture;
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, a, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new a(C0471ar.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new a("eglCreateContext failed");
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        int[] iArr;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurface == null) {
                throw new a("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new a("eglMakeCurrent failed");
    }

    private static void a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        Gq.a();
    }
}
