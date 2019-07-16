package com.soundcloud.android.stations;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;

/* compiled from: StationRenderer.kt */
public final class Gb extends C5541_ta<Nb> {
    private final C6781kVa<C3508cda> a;
    private final N b;
    private final Resources c;

    public Gb(N n, Resources resources) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(resources, "resources");
        this.b = n;
        this.c = resources;
        C6781kVa<C3508cda> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Urn>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.station_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…tion_item, parent, false)");
        return inflate;
    }

    public final C6781kVa<C3508cda> a() {
        return this.a;
    }

    public void a(int i, View view, Nb nb) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(nb, "item");
        Sda a2 = nb.a();
        ImageView imageView = (ImageView) view.findViewById(i.artwork);
        TextView textView = (TextView) view.findViewById(i.title);
        TextView textView2 = (TextView) view.findViewById(i.type);
        TextView textView3 = (TextView) view.findViewById(i.now_playing);
        boolean b2 = nb.b();
        C7471uYa.a((Object) textView, "title");
        textView.setText(a2.getTitle());
        C7471uYa.a((Object) textView2, C1325gg.TYPE);
        int i2 = 0;
        textView2.setVisibility(b2 ^ true ? 0 : 8);
        C7471uYa.a((Object) textView3, "nowPlaying");
        if (!b2) {
            i2 = 8;
        }
        textView3.setVisibility(i2);
        if (!b2) {
            textView2.setText(Mb.a(this.c, a2.getType()));
        }
        N n = this.b;
        C3508cda a3 = a2.a();
        C4928GKa b3 = a2.b();
        C3721b b4 = C3721b.b(this.c);
        C7471uYa.a((Object) b4, "ApiImageSize.getFullImageSize(resources)");
        C7471uYa.a((Object) imageView, "artwork");
        n.a(a3, b3, b4, imageView, false);
        view.setOnClickListener(new Fb(this, a2));
    }
}
