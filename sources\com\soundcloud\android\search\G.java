package com.soundcloud.android.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

/* compiled from: SearchResultHeaderRenderer.kt */
public class G extends C5541_ta<F> {
    private final C5408WFa a;

    public G(C5408WFa wFa) {
        C7471uYa.b(wFa, "condensedNumberFormatter");
        this.a = wFa;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.list_header_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…ader_item, parent, false)");
        return inflate;
    }

    public void a(int i, View view, F f) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(f, "item");
        a(view, i == 0);
        View findViewById = view.findViewById(i.header);
        C7471uYa.a((Object) findViewById, "itemView.findViewById<TextView>(R.id.header)");
        ((TextView) findViewById).setText(view.getResources().getString(f.d(), new Object[]{this.a.a((long) f.c())}));
    }

    private void a(View view, boolean z) {
        View findViewById = view.findViewById(i.top_margin);
        C7471uYa.a((Object) findViewById, "itemView.findViewById<View>(R.id.top_margin)");
        int i = 0;
        findViewById.setVisibility(z ? 0 : 8);
        View findViewById2 = view.findViewById(i.top_line);
        C7471uYa.a((Object) findViewById2, "itemView.findViewById<View>(R.id.top_line)");
        if (!z) {
            i = 8;
        }
        findViewById2.setVisibility(i);
    }
}
