package com.soundcloud.android.view;

import android.content.Context;

/* compiled from: EmptyViewBuilder */
public class B {
    private String a;
    private int b;
    private int c;
    private int d;
    private int e;

    public EmptyView a(Context context) {
        return a(new EmptyView(context), context);
    }

    public EmptyView a(EmptyView emptyView, Context context) {
        String str = this.a;
        if (str != null) {
            emptyView.b(str);
        }
        emptyView.setPadding(a(context, this.b), a(context, this.c), a(context, this.d), a(context, this.e));
        return emptyView;
    }

    public B a(String str) {
        this.a = str;
        return this;
    }

    public B a(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        return this;
    }

    private int a(Context context, int i) {
        if (i == 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(i);
    }
}
