package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.r.a;
import androidx.recyclerview.widget.RecyclerView.s;

/* compiled from: PagerSnapHelper */
class U extends M {
    final /* synthetic */ V o;

    U(V v, Context context) {
        this.o = v;
        super(context);
    }

    /* access modifiers changed from: protected */
    public void a(View view, s sVar, a aVar) {
        V v = this.o;
        int[] a = v.a(v.a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int d = d(Math.max(Math.abs(i), Math.abs(i2)));
        if (d > 0) {
            aVar.a(i, i2, d, this.j);
        }
    }

    /* access modifiers changed from: protected */
    public int e(int i) {
        return Math.min(100, super.e(i));
    }

    /* access modifiers changed from: protected */
    public float a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }
}
