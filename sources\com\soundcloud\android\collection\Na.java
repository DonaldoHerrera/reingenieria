package com.soundcloud.android.collection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;

/* compiled from: UpsellItemCellRenderer */
public class Na extends C5541_ta<b> {
    private final C2436_U a;
    public C6781kVa<RVa> b = C6781kVa.s();
    public C6781kVa<RVa> c = C6781kVa.s();
    public C6781kVa<RVa> d = C6781kVa.s();

    Na(C2436_U _u) {
        this.a = _u;
    }

    public View b(ViewGroup viewGroup) {
        this.b.a(RVa.a);
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.collections_upsell_item, viewGroup, false);
    }

    public void a(int i, View view, b bVar) {
        ((TextView) view.findViewById(i.description)).setText(view.getResources().getString(p.collections_upsell_body));
        view.setEnabled(false);
        C2751i iVar = new C2751i(this);
        view.findViewById(i.close_button).setOnClickListener(iVar);
        a((Button) view.findViewById(i.upsell_button), iVar);
    }

    public /* synthetic */ void a(View view) {
        int id = view.getId();
        if (id == i.close_button) {
            this.c.a(RVa.a);
        } else if (id == i.upsell_button) {
            this.d.a(RVa.a);
        }
    }

    private void a(Button button, OnClickListener onClickListener) {
        button.setOnClickListener(onClickListener);
        if (this.a.k()) {
            button.setText(button.getResources().getString(p.upsell_stream_buy_trial, new Object[]{Integer.valueOf(this.a.g())}));
            return;
        }
        button.setText(p.upsell_upgrade_button);
    }
}
