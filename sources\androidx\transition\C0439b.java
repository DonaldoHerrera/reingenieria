package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.b reason: case insensitive filesystem */
/* compiled from: ChangeBounds */
class C0439b extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ BitmapDrawable b;
    final /* synthetic */ View c;
    final /* synthetic */ float d;
    final /* synthetic */ ChangeBounds e;

    C0439b(ChangeBounds changeBounds, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
        this.e = changeBounds;
        this.a = viewGroup;
        this.b = bitmapDrawable;
        this.c = view;
        this.d = f;
    }

    public void onAnimationEnd(Animator animator) {
        wa.b(this.a).b(this.b);
        wa.a(this.c, this.d);
    }
}
