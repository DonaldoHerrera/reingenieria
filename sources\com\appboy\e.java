package com.appboy;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import bo.app.hn;

class e extends hn {
    final /* synthetic */ f a;

    e(f fVar) {
        this.a = fVar;
    }

    public void a(String str, View view, Bitmap bitmap) {
        super.a(str, view, bitmap);
        float height = (float) bitmap.getHeight();
        if (height != 0.0f && !this.a.c) {
            float width = ((float) bitmap.getWidth()) / height;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new d(this, width));
            }
        }
    }
}
