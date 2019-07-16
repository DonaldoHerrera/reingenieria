package com.soundcloud.android.stations;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.C6188na;

/* compiled from: StationTrackRenderer */
public class Jb extends C5541_ta<C6040qb> {
    private final N a;
    /* access modifiers changed from: private */
    public final C6188na b;
    private final C4655rja c;
    public final C6781kVa<Integer> d = C6781kVa.s();
    private final OnClickListener e = new Ib(this);

    Jb(N n, C6188na naVar, C4655rja rja) {
        this.a = n;
        this.b = naVar;
        this.c = rja;
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.station_track_item, viewGroup, false);
        inflate.setOnClickListener(new C6005f(this));
        inflate.findViewById(i.overflow_button).setOnClickListener(this.e);
        return inflate;
    }

    public /* synthetic */ void a(View view) {
        this.d.a(Integer.valueOf(((Integer) view.getTag()).intValue()));
    }

    public void a(int i, View view, C6040qb qbVar) {
        C6185ma c2 = qbVar.c();
        a(view, c2);
        a(view, c2.B());
        a(view, c2.d(), c2.e(), c2.M());
        view.findViewById(i.overflow_button).setTag(C7664xKa.a(c2, Integer.valueOf(i)));
        view.setTag(Integer.valueOf(i));
    }

    private void a(View view, String str) {
        ((TextView) view.findViewById(i.recommendation_title)).setText(str);
    }

    private void a(View view, String str, C3508cda cda, boolean z) {
        TextView textView = (TextView) view.findViewById(i.recommendation_artist);
        int i = 8;
        if (z) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
            textView.setOnClickListener(new C6008g(this, cda));
        }
        View findViewById = view.findViewById(i.recommendation_now_playing);
        if (z) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }

    public /* synthetic */ void a(C3508cda cda, View view) {
        this.c.a(C4621nja.c(cda));
    }

    private void a(View view, C6185ma maVar) {
        this.a.a(maVar.a(), maVar.b(), C3721b.b(view.getResources()), (ImageView) view.findViewById(i.recommendation_artwork), false);
    }
}
