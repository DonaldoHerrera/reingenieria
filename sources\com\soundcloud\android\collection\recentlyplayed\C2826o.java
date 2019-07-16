package com.soundcloud.android.collection.recentlyplayed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.soundcloud.android.collection.recentlyplayed.C2821l.a;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.o reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedBucketRenderer */
public class C2826o extends C5541_ta<C2825n> {
    private final C2821l a;
    private final C4581ija b;
    private final C2014EO c;
    private WeakReference<RecyclerView> d;

    C2826o(a aVar, C4581ija ija, C2014EO eo) {
        this.a = aVar.a(true);
        this.b = ija;
        this.c = eo;
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.recently_played_bucket, viewGroup, false);
        inflate.findViewById(i.recently_played_view_all).setOnClickListener(new C2803c(this));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(i.recently_played_carousel);
        a(recyclerView);
        this.d = new WeakReference<>(recyclerView);
        return inflate;
    }

    public APa<C3508cda> c() {
        return this.a.m();
    }

    public APa<C3508cda> a() {
        return this.a.k();
    }

    private void a(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.a);
    }

    public void a(int i, View view, C2825n nVar) {
        List<C2804ca> d2 = nVar.d();
        this.a.f();
        if (d2.isEmpty()) {
            this.a.a(new C2829s());
        } else {
            for (C2804ca a2 : d2) {
                this.a.a(a2);
            }
        }
        this.a.e();
    }

    public APa<C3508cda> b() {
        return this.a.l();
    }

    /* access modifiers changed from: 0000 */
    public void a(View view) {
        this.c.a(u.RECENTLY_PLAYED_LOAD);
        this.b.c(view.getContext());
    }
}
