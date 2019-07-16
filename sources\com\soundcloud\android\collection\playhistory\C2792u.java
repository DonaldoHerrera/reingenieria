package com.soundcloud.android.collection.playhistory;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.tracks.C6185ma;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.soundcloud.android.collection.playhistory.u reason: case insensitive filesystem */
/* compiled from: PlayHistoryBucketRenderer */
public class C2792u extends C5541_ta<C2791t> {
    private final r a;
    private final C4581ija b;
    private final C2014EO c;
    private WeakReference<RecyclerView> d;

    C2792u(r rVar, C4581ija ija, C2014EO eo) {
        this.a = rVar;
        this.b = ija;
        this.c = eo;
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.play_history_bucket, viewGroup, false);
        inflate.findViewById(i.play_history_view_all).setOnClickListener(new C2776f(this));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(i.play_history);
        b(recyclerView);
        this.d = new WeakReference<>(recyclerView);
        return inflate;
    }

    public APa<C3508cda> a() {
        return this.a.k();
    }

    private void a(RecyclerView recyclerView) {
        Resources resources = recyclerView.getResources();
        recyclerView.a((h) new C5396Vta(resources.getDrawable(ia.h.list_divider_item), resources.getDimensionPixelSize(g.list_divider_horizontal_height)));
    }

    private void b(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.a);
        a(recyclerView);
    }

    public void a(int i, View view, C2791t tVar) {
        List<C6185ma> d2 = tVar.d();
        this.a.f();
        if (d2.isEmpty()) {
            this.a.a(new S());
        } else {
            for (C6185ma u : d2) {
                this.a.a(new U(u));
            }
        }
        this.a.e();
    }

    /* access modifiers changed from: 0000 */
    public void a(View view) {
        this.c.a(u.LISTENING_HISTORY_LOAD);
        this.b.b(view.getContext());
    }
}
