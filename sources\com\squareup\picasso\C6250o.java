package com.squareup.picasso;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.o reason: case insensitive filesystem */
/* compiled from: DeferredRequestCreator */
class C6250o implements OnPreDrawListener, OnAttachStateChangeListener {
    private final L a;
    final WeakReference<ImageView> b;
    C6247l c;

    C6250o(L l, ImageView imageView, C6247l lVar) {
        this.a = l;
        this.b = new WeakReference<>(imageView);
        this.c = lVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.a();
        this.c = null;
        ImageView imageView = (ImageView) this.b.get();
        if (imageView != null) {
            this.b.clear();
            imageView.removeOnAttachStateChangeListener(this);
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.b.clear();
            L l = this.a;
            l.e();
            l.a(width, height);
            l.a(imageView, this.c);
        }
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
