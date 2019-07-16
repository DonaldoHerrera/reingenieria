package com.soundcloud.android.view;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;

/* compiled from: NewItemsIndicatorScrollListener */
public class G extends m {
    private a a;
    private int b;
    private int c;
    private boolean d = true;
    private boolean e = true;

    /* compiled from: NewItemsIndicatorScrollListener */
    public interface a {
        void a();

        void b();
    }

    G(Context context) {
        this.c = C6768kIa.a(context, 80);
    }

    private void c() {
        if (this.d && this.b > this.c) {
            this.a.a();
            if (this.e) {
                a(false);
            }
        } else if (!this.d && this.b < (-this.c)) {
            this.a.b();
            if (this.e) {
                a(true);
            }
        }
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public void b() {
        this.e = false;
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        super.a(recyclerView, i, i2);
        if (this.a != null) {
            a(i2);
            c();
        }
    }

    public void a(boolean z) {
        this.d = z;
        this.b = 0;
    }

    public void a() {
        this.a = null;
        a(false);
    }

    private void a(int i) {
        if ((!this.d || i <= 0) && (this.d || i >= 0)) {
            this.b = 0;
        } else {
            this.b += i;
        }
    }
}
