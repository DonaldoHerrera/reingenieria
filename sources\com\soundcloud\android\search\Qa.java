package com.soundcloud.android.search;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import com.soundcloud.android.ia.i;

/* compiled from: SearchUserItemRenderer.kt */
public class Qa extends C5541_ta<Ma> {
    private final C6781kVa<Na> a;
    private final C6781kVa<Sa> b;
    private final C6429fJa c;

    public Qa(C6429fJa fja) {
        C7471uYa.b(fja, "userItemRenderer");
        this.c = fja;
        C6781kVa<Na> s = C6781kVa.s();
        String str = "PublishSubject.create()";
        C7471uYa.a((Object) s, str);
        this.a = s;
        C6781kVa<Sa> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.b = s2;
    }

    public C6781kVa<Sa> b() {
        return this.b;
    }

    public C6781kVa<Na> a() {
        return this.a;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return this.c.b(viewGroup);
    }

    public void a(int i, View view, Ma ma) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(ma, "item");
        this.c.a(view, ma.e());
        a(view, ma);
        view.setOnClickListener(new Oa(this, ma));
    }

    private void a(View view, Ma ma) {
        ToggleButton toggleButton = (ToggleButton) view.findViewById(i.toggle_btn_follow);
        C7471uYa.a((Object) toggleButton, "toggleFollow");
        toggleButton.setVisibility(0);
        toggleButton.setChecked(ma.e().e);
        toggleButton.setOnClickListener(new Pa(this, ma));
    }
}
