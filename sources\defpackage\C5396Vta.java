package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: Vta reason: default package and case insensitive filesystem */
/* compiled from: DividerItemDecoration */
public class C5396Vta extends h {
    private Drawable a;
    private int b;

    public C5396Vta(Drawable drawable, int i) {
        this.a = drawable;
        this.b = i;
    }

    private int a(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) recyclerView.getLayoutManager()).I();
        }
        throw new IllegalStateException("DividerItemDecoration can only be used with a LinearLayoutManager.");
    }

    private boolean a(int i, boolean z) {
        return i > 0 || z;
    }

    private void c(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 1; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int left = childAt.getLeft() - layoutParams.leftMargin;
            this.a.setBounds(left, paddingTop, this.b + left, height);
            this.a.draw(canvas);
        }
    }

    private void d(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int translationY = (int) childAt.getTranslationY();
            if (a(i, translationY != 0)) {
                int top = (childAt.getTop() + translationY) - ((LayoutParams) childAt.getLayoutParams()).topMargin;
                this.a.setBounds(paddingLeft, top, width, this.b + top);
                this.a.draw(canvas);
            }
        }
    }

    public void b(Canvas canvas, RecyclerView recyclerView, s sVar) {
        if (this.a == null) {
            super.a(canvas, recyclerView, sVar);
            return;
        }
        if (a(recyclerView) == 1) {
            d(canvas, recyclerView);
        } else {
            c(canvas, recyclerView);
        }
    }
}
