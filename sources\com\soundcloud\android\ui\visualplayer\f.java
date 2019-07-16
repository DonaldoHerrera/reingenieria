package com.soundcloud.android.ui.visualplayer;

import android.view.View;
import android.widget.TextView;
import com.soundcloud.android.ui.visualplayer.c.C0175c;
import com.soundcloud.android.ui.visualplayer.e.i;

/* compiled from: TrackViewHolderFactory.kt */
public final class f extends C5378VEa<C0175c> {
    private final TextView a;
    private final TextView b;

    public f(View view) {
        C7471uYa.b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(i.track_page_user);
        C7471uYa.a((Object) findViewById, "itemView.findViewById(R.id.track_page_user)");
        this.a = (TextView) findViewById;
        View findViewById2 = view.findViewById(i.track_page_title);
        C7471uYa.a((Object) findViewById2, "itemView.findViewById(R.id.track_page_title)");
        this.b = (TextView) findViewById2;
    }

    public void a(C0175c cVar) {
        C7471uYa.b(cVar, "item");
        this.a.setText(cVar.b().d());
        this.b.setText(cVar.b().B());
    }
}
