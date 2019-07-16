package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: nc reason: default package and case insensitive filesystem */
/* compiled from: OneShotPreDrawListener */
public final class C1537nc implements OnPreDrawListener, OnAttachStateChangeListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private C1537nc(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static C1537nc a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C1537nc ncVar = new C1537nc(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(ncVar);
            view.addOnAttachStateChangeListener(ncVar);
            return ncVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public boolean onPreDraw() {
        a();
        this.c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }

    public void a() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }
}
