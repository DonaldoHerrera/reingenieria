package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.i;

/* compiled from: OrientationHelper */
public abstract class T {
    protected final i a;
    private int b;
    final Rect c;

    /* synthetic */ T(i iVar, Q q) {
        this(iVar);
    }

    public static T a(i iVar, int i) {
        if (i == 0) {
            return a(iVar);
        }
        if (i == 1) {
            return b(iVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static T b(i iVar) {
        return new S(iVar);
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public int h() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return g() - this.b;
    }

    public void i() {
        this.b = g();
    }

    private T(i iVar) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = iVar;
    }

    public static T a(i iVar) {
        return new Q(iVar);
    }
}
