package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager */
class q {
    private static q a;
    private final Object b = new Object();
    private final Handler c = new Handler(Looper.getMainLooper(), new p(this));
    private b d;
    private b e;

    /* compiled from: SnackbarManager */
    interface a {
        void a(int i);

        void c();
    }

    /* compiled from: SnackbarManager */
    private static class b {
        final WeakReference<a> a;
        int b;
        boolean c;

        b(int i, a aVar) {
            this.a = new WeakReference<>(aVar);
            this.b = i;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(a aVar) {
            return aVar != null && this.a.get() == aVar;
        }
    }

    private q() {
    }

    static q a() {
        if (a == null) {
            a = new q();
        }
        return a;
    }

    private boolean g(a aVar) {
        b bVar = this.d;
        return bVar != null && bVar.a(aVar);
    }

    private boolean h(a aVar) {
        b bVar = this.e;
        return bVar != null && bVar.a(aVar);
    }

    public boolean b(a aVar) {
        boolean z;
        synchronized (this.b) {
            if (!g(aVar)) {
                if (!h(aVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void c(a aVar) {
        synchronized (this.b) {
            if (g(aVar)) {
                this.d = null;
                if (this.e != null) {
                    b();
                }
            }
        }
    }

    public void d(a aVar) {
        synchronized (this.b) {
            if (g(aVar)) {
                b(this.d);
            }
        }
    }

    public void e(a aVar) {
        synchronized (this.b) {
            if (g(aVar) && !this.d.c) {
                this.d.c = true;
                this.c.removeCallbacksAndMessages(this.d);
            }
        }
    }

    public void f(a aVar) {
        synchronized (this.b) {
            if (g(aVar) && this.d.c) {
                this.d.c = false;
                b(this.d);
            }
        }
    }

    private void b() {
        b bVar = this.e;
        if (bVar != null) {
            this.d = bVar;
            this.e = null;
            a aVar = (a) this.d.a.get();
            if (aVar != null) {
                aVar.c();
            } else {
                this.d = null;
            }
        }
    }

    public void a(int i, a aVar) {
        synchronized (this.b) {
            if (g(aVar)) {
                this.d.b = i;
                this.c.removeCallbacksAndMessages(this.d);
                b(this.d);
                return;
            }
            if (h(aVar)) {
                this.e.b = i;
            } else {
                this.e = new b(i, aVar);
            }
            if (this.d == null || !a(this.d, 4)) {
                this.d = null;
                b();
            }
        }
    }

    private void b(b bVar) {
        int i = bVar.b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
            }
            this.c.removeCallbacksAndMessages(bVar);
            Handler handler = this.c;
            handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), (long) i);
        }
    }

    public void a(a aVar, int i) {
        synchronized (this.b) {
            if (g(aVar)) {
                a(this.d, i);
            } else if (h(aVar)) {
                a(this.e, i);
            }
        }
    }

    public boolean a(a aVar) {
        boolean g;
        synchronized (this.b) {
            g = g(aVar);
        }
        return g;
    }

    private boolean a(b bVar, int i) {
        a aVar = (a) bVar.a.get();
        if (aVar == null) {
            return false;
        }
        this.c.removeCallbacksAndMessages(bVar);
        aVar.a(i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        synchronized (this.b) {
            if (this.d == bVar || this.e == bVar) {
                a(bVar, 2);
            }
        }
    }
}
