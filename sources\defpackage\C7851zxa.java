package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: zxa reason: default package and case insensitive filesystem */
/* compiled from: MistDividerItemDecoration.kt */
public final class C7851zxa extends h {
    private final Rect a = new Rect();
    private final Drawable b;

    public C7851zxa(Drawable drawable) {
        C7471uYa.b(drawable, "drawable");
        this.b = drawable;
    }

    private final void c(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i2 = 0;
            i = recyclerView.getWidth();
        }
        if (a(recyclerView)) {
            for (View view : Ac.a(recyclerView)) {
                recyclerView.a(view, this.a);
                int a2 = this.a.bottom + TYa.a(view.getTranslationY());
                this.b.setBounds(i2, a2 - this.b.getIntrinsicHeight(), i, a2);
                this.b.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void a(Canvas canvas, RecyclerView recyclerView, s sVar) {
        C7471uYa.b(canvas, "c");
        C7471uYa.b(recyclerView, "recyclerView");
        C7471uYa.b(sVar, "state");
        super.a(canvas, recyclerView, sVar);
        if (recyclerView.getLayoutManager() != null) {
            c(canvas, recyclerView);
        }
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        C7471uYa.b(rect, "outRect");
        C7471uYa.b(view, "view");
        C7471uYa.b(recyclerView, "recyclerView");
        C7471uYa.b(sVar, "state");
        rect.set(0, 0, 0, this.b.getIntrinsicHeight());
    }

    private final boolean a(RecyclerView recyclerView) {
        return recyclerView.getChildCount() > 1;
    }
}
