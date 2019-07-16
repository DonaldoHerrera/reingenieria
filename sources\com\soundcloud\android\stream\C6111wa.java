package com.soundcloud.android.stream;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.soundcloud.android.ia.i;

/* renamed from: com.soundcloud.android.stream.wa reason: case insensitive filesystem */
/* compiled from: StreamItemViewHolder */
public class C6111wa implements C5264RIa {
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private View f;
    private View g;
    private TextView h;
    private TextView i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private ToggleButton p;
    private View q;
    private View r;
    private ToggleButton s;
    private View t;
    private a u;
    private defpackage.C5204PIa.a v;

    /* renamed from: com.soundcloud.android.stream.wa$a */
    /* compiled from: StreamItemViewHolder */
    public interface a {
        void a(View view);
    }

    public C6111wa(View view) {
        this.a = (ImageView) view.findViewById(i.user_image);
        this.b = (TextView) view.findViewById(i.header_text);
        this.c = (TextView) view.findViewById(i.post_text);
        this.d = (TextView) view.findViewById(i.reposter);
        this.e = (TextView) view.findViewById(i.creation_date);
        this.f = view.findViewById(i.private_indicator);
        this.g = view.findViewById(i.private_separator);
        this.h = (TextView) view.findViewById(i.promoted_item);
        this.i = (TextView) view.findViewById(i.promoter);
        this.j = (ImageView) view.findViewById(i.image);
        this.k = (TextView) view.findViewById(i.title);
        this.l = (TextView) view.findViewById(i.creator);
        this.m = (TextView) view.findViewById(i.play_count);
        this.n = (TextView) view.findViewById(i.duration);
        this.o = (TextView) view.findViewById(i.genre);
        this.p = (ToggleButton) view.findViewById(i.toggle_like);
        this.q = view.findViewById(i.now_playing);
        this.r = view.findViewById(i.overflow_button);
        this.s = (ToggleButton) view.findViewById(i.toggle_repost);
        this.t = view.findViewById(i.go_indicator);
        this.p.setOnClickListener(new C6071c(this));
        ToggleButton toggleButton = this.s;
        if (toggleButton != null) {
            toggleButton.setOnClickListener(new C6075e(this));
        }
        this.r.setOnClickListener(new C6073d(this));
    }

    private void j() {
        defpackage.C5204PIa.a aVar = this.v;
        if (aVar != null) {
            aVar.b(this.p);
        }
    }

    private void k() {
        defpackage.C5204PIa.a aVar = this.v;
        if (aVar != null) {
            aVar.a(this.s);
        }
    }

    private void l() {
        a aVar = this.u;
        if (aVar != null) {
            aVar.a(this.r);
        }
    }

    public /* synthetic */ void a(View view) {
        j();
    }

    public /* synthetic */ void b(View view) {
        k();
    }

    public /* synthetic */ void c(View view) {
        l();
    }

    public void d(String str) {
        this.e.setText(str);
        this.e.setVisibility(0);
    }

    public void e(String str) {
        this.h.setText(str);
        this.h.setVisibility(0);
    }

    public void f(String str) {
        this.k.setText(str);
    }

    public void g(String str) {
        this.m.setText(str);
        this.m.setVisibility(0);
    }

    public void h() {
        a(this.t, 0);
    }

    public void i() {
        this.q.setVisibility(0);
    }

    public void a(a aVar) {
        this.u = aVar;
    }

    public void b(String str, String str2) {
        this.i.setText(str);
        this.i.setVisibility(0);
        this.h.setText(str2);
        this.h.setVisibility(0);
    }

    public void c(String str, String str2) {
        this.b.setText(str);
        this.b.setVisibility(0);
        this.d.setText(str2);
        this.d.setVisibility(0);
    }

    public void f() {
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        a(false);
        this.i.setOnClickListener(null);
        this.a.setOnClickListener(null);
        this.b.setOnClickListener(null);
        this.l.setOnClickListener(null);
    }

    public void a(defpackage.C5204PIa.a aVar) {
        this.v = aVar;
    }

    public void d() {
        this.a.setVisibility(8);
    }

    public void e() {
        this.m.setVisibility(8);
        this.q.setVisibility(8);
        this.n.setVisibility(8);
        ToggleButton toggleButton = this.s;
        if (toggleButton != null) {
            toggleButton.setVisibility(8);
        }
    }

    public void g() {
        a(this.t, 8);
    }

    public void a() {
        ToggleButton toggleButton = this.s;
        if (toggleButton != null) {
            toggleButton.setVisibility(8);
        }
    }

    public void a(String str, String str2) {
        this.b.setText(str);
        this.b.setVisibility(0);
        this.c.setText(str2);
        this.c.setVisibility(0);
    }

    public ImageView b() {
        return this.j;
    }

    public void c(String str) {
        this.l.setText(str);
    }

    public void b(String str, boolean z) {
        this.p.setTextOn(str);
        this.p.setTextOff(str);
        this.p.setChecked(z);
    }

    public ImageView c() {
        this.a.setVisibility(0);
        return this.a;
    }

    public void c(OnClickListener onClickListener) {
        this.i.setOnClickListener(onClickListener);
        this.a.setOnClickListener(onClickListener);
    }

    public void a(String str, boolean z) {
        ToggleButton toggleButton = this.s;
        if (toggleButton != null) {
            toggleButton.setTextOn(str);
            this.s.setTextOff(str);
            this.s.setChecked(z);
            this.s.setVisibility(0);
        }
    }

    public void b(String str) {
        this.o.setText(String.format("#%s", new Object[]{str}));
        this.o.setVisibility(0);
    }

    public void b(OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
        this.a.setOnClickListener(onClickListener);
    }

    public void a(boolean z) {
        int i2 = 0;
        this.f.setVisibility(z ? 0 : 8);
        View view = this.g;
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public void a(String str) {
        this.n.setText(str);
        this.n.setVisibility(0);
    }

    public void a(OnClickListener onClickListener) {
        this.l.setOnClickListener(onClickListener);
    }

    private void a(View view, int i2) {
        if (view != null) {
            view.setVisibility(i2);
        }
    }
}
