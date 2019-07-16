package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: Yta reason: default package and case insensitive filesystem */
/* compiled from: InsetDividerDecoration */
public class C5483Yta extends h {
    private int a;
    private int b;

    public C5483Yta(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        int i = this.a;
        int i2 = this.b;
        rect.set(i, i2, i, i2);
    }
}
