package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public abstract class ActionBar {

    public static class LayoutParams extends MarginLayoutParams {
        public int a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1406j.ActionBarLayout);
            this.a = obtainStyledAttributes.getInt(C1406j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.a = 0;
            this.a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
            this.a = layoutParams.a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }

    public interface a {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    public static abstract class b {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public C1712t a(defpackage.C1712t.a aVar) {
        return null;
    }

    public abstract void a(int i, int i2);

    public void a(Configuration configuration) {
    }

    public abstract void a(CharSequence charSequence);

    public abstract boolean a(int i, KeyEvent keyEvent);

    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    public abstract void b(int i);

    public abstract void b(CharSequence charSequence);

    public abstract void b(boolean z);

    public abstract void c(CharSequence charSequence);

    public abstract void c(boolean z);

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public boolean e() {
        return false;
    }

    public abstract void f(boolean z);

    public abstract boolean f();

    public abstract int g();

    public abstract Context h();

    public boolean i() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void j() {
    }

    public boolean k() {
        return false;
    }
}
