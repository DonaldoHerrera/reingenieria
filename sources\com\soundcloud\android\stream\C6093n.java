package com.soundcloud.android.stream;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import com.soundcloud.android.image.N;

/* renamed from: com.soundcloud.android.stream.n reason: case insensitive filesystem */
/* compiled from: ImagePauseOnScrollListener */
public class C6093n extends m {
    private final N a;

    public C6093n(N n) {
        this.a = n;
    }

    public void a(RecyclerView recyclerView, int i) {
        a(i);
    }

    public void a(int i) {
        if (i == 0) {
            this.a.b();
        } else if (i == 2) {
            this.a.a();
        }
    }

    public void a() {
        this.a.b();
    }
}
