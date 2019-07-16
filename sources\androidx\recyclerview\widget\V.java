package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.r.b;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

/* compiled from: PagerSnapHelper */
public class V extends ja {
    private T d;
    private T e;

    private T d(i iVar) {
        T t = this.e;
        if (t == null || t.a != iVar) {
            this.e = T.a(iVar);
        }
        return this.e;
    }

    private T e(i iVar) {
        T t = this.d;
        if (t == null || t.a != iVar) {
            this.d = T.b(iVar);
        }
        return this.d;
    }

    public int[] a(i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.a()) {
            iArr[0] = a(iVar, view, d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.b()) {
            iArr[1] = a(iVar, view, e(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public M b(i iVar) {
        if (!(iVar instanceof b)) {
            return null;
        }
        return new U(this, this.a.getContext());
    }

    public View c(i iVar) {
        if (iVar.b()) {
            return a(iVar, e(iVar));
        }
        if (iVar.a()) {
            return a(iVar, d(iVar));
        }
        return null;
    }

    private View b(i iVar, T t) {
        int e2 = iVar.e();
        View view = null;
        if (e2 == 0) {
            return null;
        }
        int i = BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < e2; i2++) {
            View d2 = iVar.d(i2);
            int d3 = t.d(d2);
            if (d3 < i) {
                view = d2;
                i = d3;
            }
        }
        return view;
    }

    public int a(i iVar, int i, int i2) {
        int j = iVar.j();
        if (j == 0) {
            return -1;
        }
        View view = null;
        if (iVar.b()) {
            view = b(iVar, e(iVar));
        } else if (iVar.a()) {
            view = b(iVar, d(iVar));
        }
        if (view == null) {
            return -1;
        }
        int l = iVar.l(view);
        if (l == -1) {
            return -1;
        }
        boolean z = false;
        boolean z2 = !iVar.a() ? i2 > 0 : i > 0;
        if (iVar instanceof b) {
            PointF a = ((b) iVar).a(j - 1);
            if (a != null && (a.x < 0.0f || a.y < 0.0f)) {
                z = true;
            }
        }
        if (z) {
            if (z2) {
                l--;
            }
        } else if (z2) {
            l++;
        }
        return l;
    }

    private int a(i iVar, View view, T t) {
        int i;
        int d2 = t.d(view) + (t.b(view) / 2);
        if (iVar.f()) {
            i = t.f() + (t.g() / 2);
        } else {
            i = t.a() / 2;
        }
        return d2 - i;
    }

    private View a(i iVar, T t) {
        int i;
        int e2 = iVar.e();
        View view = null;
        if (e2 == 0) {
            return null;
        }
        if (iVar.f()) {
            i = t.f() + (t.g() / 2);
        } else {
            i = t.a() / 2;
        }
        int i2 = BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i3 = 0; i3 < e2; i3++) {
            View d2 = iVar.d(i3);
            int abs = Math.abs((t.d(d2) + (t.b(d2) / 2)) - i);
            if (abs < i2) {
                view = d2;
                i2 = abs;
            }
        }
        return view;
    }
}
