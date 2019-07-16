package com.soundcloud.android.collection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;

/* compiled from: OnboardingItemCellRenderer */
class Ha extends C5541_ta<a> {
    public C6781kVa<RVa> a = C6781kVa.s();

    Ha() {
    }

    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.collections_onboarding_item, viewGroup, false);
    }

    public void a(int i, View view, a aVar) {
        ((TextView) view.findViewById(i.title)).setText(view.getResources().getString(p.collections_onboarding_title));
        view.setEnabled(false);
        view.findViewById(i.close_button).setOnClickListener(new C2747g(this));
    }

    public /* synthetic */ void a(View view) {
        this.a.a(RVa.a);
    }
}
