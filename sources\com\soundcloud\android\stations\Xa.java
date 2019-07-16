package com.soundcloud.android.stations;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.ta;
import com.soundcloud.android.stations._a.a;
import java.util.List;

/* compiled from: StationInfoHeaderRenderer */
public class Xa extends C5541_ta<Wa> {
    public final C6781kVa<RVa> a = C6781kVa.s();
    public final C6781kVa<a> b = C6781kVa.s();
    private final ta c;
    private final N d;
    private final Resources e;

    Xa(ta taVar, Resources resources, N n) {
        this.c = taVar;
        this.d = n;
        this.e = resources;
    }

    private void c(Wa wa, View view) {
        ((TextView) view.findViewById(i.station_type)).setText(Mb.a(this.e, wa.getType()));
        ((TextView) view.findViewById(i.station_title)).setText(wa.getTitle());
        List g = wa.g();
        TextView textView = (TextView) view.findViewById(i.station_desc);
        int i = 0;
        boolean z = g.size() > 0;
        if (z) {
            textView.setText(b(g));
        }
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.station_info_view, viewGroup, false);
    }

    private void b(Wa wa, View view) {
        View findViewById = view.findViewById(i.btn_station_play);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new C6002e(this));
        ToggleButton toggleButton = (ToggleButton) view.findViewById(i.toggle_like);
        toggleButton.setTextOn(this.e.getString(p.btn_unlike));
        toggleButton.setTextOff(this.e.getString(p.btn_like));
        toggleButton.setChecked(wa.h());
        toggleButton.setOnCheckedChangeListener(new C5999d(this, wa));
    }

    public void a(int i, View view, Wa wa) {
        a(wa, view);
        c(wa, view);
        b(wa, view);
    }

    public /* synthetic */ void a(View view) {
        this.a.a(RVa.a);
    }

    public /* synthetic */ void a(Wa wa, CompoundButton compoundButton, boolean z) {
        this.b.a(new a(wa.a(), z));
    }

    private void a(Wa wa, View view) {
        C3721b b2 = C3721b.b(view.getResources());
        ImageView imageView = (ImageView) view.findViewById(i.artwork);
        ImageView imageView2 = (ImageView) view.findViewById(i.blurred_background);
        this.d.c(wa.a(), wa.b(), b2, imageView);
        this.c.a(wa, imageView2);
    }

    private SpannableString b(List<String> list) {
        int i = 0;
        String string = this.e.getString(p.stations_home_description, new Object[]{a(list)});
        SpannableString spannableString = new SpannableString(string);
        for (String str : list) {
            int indexOf = string.indexOf(str, i);
            i = indexOf + str.length();
            spannableString.setSpan(new StyleSpan(1), indexOf, i, 33);
        }
        return spannableString;
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String append : list) {
            sb.append(append);
            sb.append(", ");
        }
        return sb.toString().substring(0, sb.length() - 2);
    }
}
