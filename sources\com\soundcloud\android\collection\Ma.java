package com.soundcloud.android.collection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.m;

/* compiled from: SimpleHeaderRenderer */
public abstract class Ma<BaseT, ItemT extends BaseT> extends C5541_ta<ItemT> implements b {
    public final C6781kVa<RVa> a = C6781kVa.s();
    private a b;
    private final defpackage.C4772BJa.a c;

    /* compiled from: SimpleHeaderRenderer */
    public interface a {
        void a();
    }

    public Ma(defpackage.C4772BJa.a aVar) {
        this.c = aVar;
    }

    public abstract String a();

    public abstract String a(ItemT itemt);

    public void a(int i, View view, ItemT itemt) {
        view.setEnabled(false);
        a(view, itemt);
        a(view);
    }

    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.header_with_menu, viewGroup, false);
    }

    public void onDismiss() {
    }

    public boolean a(MenuItem menuItem, Context context) {
        if (menuItem.getItemId() == i.clear_history) {
            a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
            this.a.a(RVa.a);
            return true;
        }
        throw new IllegalArgumentException("Unknown menu item id");
    }

    private void a(View view) {
        View findViewById = view.findViewById(i.overflow_button);
        C4772BJa a2 = this.c.a(view.getContext(), findViewById);
        a2.b(m.simple_header_menu_actions);
        a2.b((b) this);
        a2.a(i.clear_history, (CharSequence) a());
        findViewById.setOnClickListener(new C2749h(a2));
    }

    private void a(View view, ItemT itemt) {
        ((TextView) view.findViewById(i.header_text)).setText(a(itemt));
    }
}
