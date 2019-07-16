package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: lc reason: default package and case insensitive filesystem */
/* compiled from: NestedScrollingParentHelper */
public class C1475lc {
    private int a;
    private int b;

    public C1475lc(ViewGroup viewGroup) {
    }

    public void a(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    public void a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public int a() {
        return this.a | this.b;
    }

    public void a(View view) {
        a(view, 0);
    }

    public void a(View view, int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }
}
