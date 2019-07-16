package com.soundcloud.android.stations;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import java.util.List;

/* renamed from: com.soundcloud.android.stations.sb reason: case insensitive filesystem */
/* compiled from: StationInfoTracksBucketRenderer */
public class C6045sb extends C5541_ta<C6042rb> {
    private final Lb a;
    private LinearLayoutManager b;

    C6045sb(Jb jb) {
        this.a = new Lb(jb);
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.station_tracks_bucket, viewGroup, false);
        a((RecyclerView) inflate.findViewById(i.station_tracks_carousel));
        return inflate;
    }

    public APa<Integer> a() {
        return this.a.j();
    }

    private void a(RecyclerView recyclerView) {
        this.b = new LinearLayoutManager(recyclerView.getContext(), 0, false);
        recyclerView.setLayoutManager(this.b);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.a);
    }

    public void a(int i, View view, C6042rb rbVar) {
        a(rbVar.h());
        this.b.f(a(rbVar), view.getWidth());
    }

    /* access modifiers changed from: 0000 */
    public int a(C6042rb rbVar) {
        int g = rbVar.g();
        List h = rbVar.h();
        if (g >= 0 && g < h.size() && ((C6040qb) h.get(g)).c().M()) {
            return g;
        }
        int i = g + 1;
        boolean z = true;
        boolean z2 = i >= h.size();
        if (g != -1) {
            z = false;
        }
        if (z || z2) {
            i = 0;
        }
        return i;
    }

    private void a(List<C6040qb> list) {
        this.a.f();
        for (C6040qb a2 : list) {
            this.a.a(a2);
        }
        this.a.e();
    }
}
