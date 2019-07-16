package com.soundcloud.android.stream;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.soundcloud.android.stream.da reason: case insensitive filesystem */
/* compiled from: StreamDepthPublisher */
public class C6074da extends m {
    private final C3700b a;
    private final int[] b;
    private final StaggeredGridLayoutManager c;
    private boolean d = false;
    private final VPa e;
    private boolean f;
    private boolean g;

    /* renamed from: com.soundcloud.android.stream.da$a */
    /* compiled from: StreamDepthPublisher */
    public static class a {
        private final C5327TLa a;
        private final C3700b b;

        a(C5327TLa tLa, C3700b bVar) {
            this.a = tLa;
            this.b = bVar;
        }

        /* access modifiers changed from: 0000 */
        public C6074da a(StaggeredGridLayoutManager staggeredGridLayoutManager, boolean z) {
            return new C6074da(staggeredGridLayoutManager, z, this.a, this.b);
        }
    }

    C6074da(StaggeredGridLayoutManager staggeredGridLayoutManager, boolean z, C5327TLa tLa, C3700b bVar) {
        this.c = staggeredGridLayoutManager;
        this.f = z;
        this.a = bVar;
        this.b = new int[staggeredGridLayoutManager.K()];
        this.e = (VPa) tLa.a(C3876taa.d).c(C5220Pua.a((C6776kQa<T>) new C6069b<T>(this)));
        b();
    }

    private void b() {
        if (d() && !this.d) {
            a(defpackage.Saa.a.START);
        }
    }

    private void c() {
        if (d()) {
            b();
        } else {
            a();
        }
    }

    private boolean d() {
        return this.f && !this.g;
    }

    public /* synthetic */ void a(Iaa iaa) throws Exception {
        this.g = iaa.c() == 0;
        c();
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.f = z;
        c();
    }

    private void a() {
        if (this.d) {
            a(defpackage.Saa.a.END);
            this.d = false;
        }
    }

    public void a(RecyclerView recyclerView, int i) {
        a(i);
    }

    public void a(int i) {
        if (d() && this.d) {
            if (i == 0) {
                a(defpackage.Saa.a.SCROLL_STOP);
            } else if (i == 1) {
                a(defpackage.Saa.a.SCROLL_START);
            }
        }
    }

    private void a(defpackage.Saa.a aVar) {
        int K = this.c.K();
        if (aVar == defpackage.Saa.a.START) {
            a(Saa.a(Yca.STREAM, aVar, K, Collections.emptyList(), Collections.emptyList()));
            return;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.c;
        List a2 = a((i) staggeredGridLayoutManager, staggeredGridLayoutManager.a(this.b));
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.c;
        List a3 = a((i) staggeredGridLayoutManager2, staggeredGridLayoutManager2.b(this.b));
        if (!a2.isEmpty() && !a3.isEmpty()) {
            a(Saa.a(Yca.STREAM, aVar, K, a2, a3));
        }
    }

    private void a(Saa saa) {
        this.d = true;
        this.a.a((J) saa);
    }

    private List<c> a(i iVar, int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 != -1) {
                arrayList.add(a(iVar, i, i2));
            }
        }
        return arrayList;
    }

    private c a(i iVar, int i, int i2) {
        return c.a(i, i2, C6768kIa.a(iVar.c(i2)));
    }
}
