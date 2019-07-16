package com.soundcloud.android.features.record;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;

public abstract class TouchLayout extends RelativeLayout implements OnTouchListener {
    private ArrayBlockingQueue<D> a;
    private a b;

    private static class a extends Thread {
        private final ArrayBlockingQueue<D> a;
        private final WeakReference<TouchLayout> b;
        /* access modifiers changed from: private */
        public boolean c;

        /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0000 A[SYNTHETIC] */
        public void run() {
            D d;
            Throwable th;
            while (!this.c) {
                try {
                    d = (D) this.a.take();
                    try {
                        if (d.b == 2) {
                            TouchLayout touchLayout = (TouchLayout) this.b.get();
                            if (touchLayout != null) {
                                touchLayout.f(d);
                            }
                        }
                        if (d == null) {
                        }
                    } catch (InterruptedException unused) {
                        if (d == null) {
                        }
                        d.a();
                    } catch (Throwable th2) {
                        th = th2;
                        if (d != null) {
                        }
                        throw th;
                    }
                } catch (InterruptedException unused2) {
                    d = null;
                    if (d == null) {
                    }
                    d.a();
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    d = null;
                    th = th4;
                    if (d != null) {
                        d.a();
                    }
                    throw th;
                }
                d.a();
            }
        }

        private a(TouchLayout touchLayout) {
            this.a = new ArrayBlockingQueue<>(20);
            this.c = false;
            this.b = new WeakReference<>(touchLayout);
        }

        public synchronized void a(D d) {
            try {
                this.a.put(d);
            } catch (InterruptedException e) {
                Log.e(getClass().getSimpleName(), e.getMessage(), e);
            }
            return;
        }
    }

    public TouchLayout(Context context) {
        super(context);
        b();
    }

    private void b() {
        this.a = new ArrayBlockingQueue<>(20);
        for (int i = 0; i < 20; i++) {
            ArrayBlockingQueue<D> arrayBlockingQueue = this.a;
            arrayBlockingQueue.add(new D(arrayBlockingQueue));
        }
        this.b = new a();
        this.b.start();
        setOnTouchListener(this);
    }

    /* access modifiers changed from: private */
    public void f(D d) {
        int i = d.d;
        if (i == 3) {
            a(d);
        } else if (i == 4) {
            b(d);
        } else if (i == 5) {
            e(d);
        } else if (i == 6) {
            c(d);
        } else if (i == 7) {
            d(d);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(D d);

    /* access modifiers changed from: protected */
    public abstract void b(D d);

    /* access modifiers changed from: protected */
    public abstract void c(D d);

    /* access modifiers changed from: protected */
    public abstract void d(D d);

    /* access modifiers changed from: protected */
    public abstract void e(D d);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b == null) {
            return false;
        }
        try {
            if ((motionEvent.getAction() == 2 || motionEvent.getAction() == 0) && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 1 && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            int historySize = motionEvent.getHistorySize();
            if (historySize > 0) {
                for (int i = 0; i < historySize; i++) {
                    D d = (D) this.a.take();
                    d.a(view, motionEvent, i);
                    this.b.a(d);
                }
            }
            D d2 = (D) this.a.take();
            d2.a(view, motionEvent);
            this.b.a(d2);
        } catch (InterruptedException unused) {
        }
        return true;
    }

    public void a() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.c = true;
            this.b.interrupt();
            this.b = null;
        }
    }

    public TouchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public TouchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
