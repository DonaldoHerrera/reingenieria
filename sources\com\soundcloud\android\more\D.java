package com.soundcloud.android.more;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.W.b;
import com.soundcloud.android.properties.m.A;

/* compiled from: MoreView */
class D implements b {
    private C7181qKa a;
    private final com.soundcloud.android.properties.a b;
    private a c;
    private ImageView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private View h;
    private View i;
    private TextView j;
    private View k;
    private View l;
    private View m;
    private TextView n;
    private View o;
    private TextView p;
    private NestedScrollView q;
    private ImageView r;
    private View s;
    private View t;

    /* compiled from: MoreView */
    interface a {
        void a();

        void a(View view);

        void b();

        void b(View view);

        void c();

        void c(View view);

        void d();

        void d(View view);

        void e();

        void e(View view);

        void f();

        void f(View view);

        void g(View view);

        void h(View view);
    }

    D(View view, a aVar, C7181qKa qka, com.soundcloud.android.properties.a aVar2) {
        this.c = aVar;
        this.a = qka;
        this.b = aVar2;
        a(view);
        a(view.getResources());
    }

    private void a(View view) {
        this.d = (ImageView) view.findViewById(i.image);
        this.e = (TextView) view.findViewById(i.username);
        this.f = (TextView) view.findViewById(i.more_creators_link);
        this.g = (TextView) view.findViewById(i.more_version_text);
        this.h = view.findViewById(i.more_report_bug);
        this.i = view.findViewById(i.more_upsell_block);
        this.j = (TextView) view.findViewById(i.more_upsell);
        this.k = view.findViewById(i.more_upsell_student_layout);
        this.l = view.findViewById(i.more_subscription_block);
        this.m = view.findViewById(i.subscription_status);
        this.n = (TextView) view.findViewById(i.more_subscription_tier);
        this.o = view.findViewById(i.more_restore_subscription_block);
        this.p = (TextView) view.findViewById(i.more_restore_subscription);
        this.q = (NestedScrollView) view.findViewById(i.scroll_view);
        this.r = (ImageView) view.findViewById(i.pro_badge);
        this.s = view.findViewById(i.more_force_ad_testing_id);
        this.t = view.findViewById(i.more_force_ad_testing_top_divider);
        view.findViewById(i.header_layout).setOnClickListener(new h(this));
        view.findViewById(i.more_creators_link_block).setOnClickListener(new j(this));
        view.findViewById(i.more_activity_link).setOnClickListener(new o(this));
        if (this.b.a((defpackage.C3821mba.a) A.a)) {
            view.findViewById(i.more_record_link).setVisibility(8);
            view.findViewById(i.more_upload_link).setOnClickListener(new t(this));
        } else {
            view.findViewById(i.more_record_link).setOnClickListener(new m(this));
            view.findViewById(i.more_upload_link).setVisibility(8);
        }
        view.findViewById(i.more_settings_link).setOnClickListener(new p(this));
        this.j.setOnClickListener(new l(this));
        this.k.setOnClickListener(new s(this));
        this.p.setOnClickListener(new g(this));
        this.h.setOnClickListener(new i(this));
        view.findViewById(i.more_help_center_link).setOnClickListener(new r(this));
        view.findViewById(i.more_legal_link).setOnClickListener(new k(this));
        view.findViewById(i.more_sign_out_link).setOnClickListener(new q(this));
        this.s.setOnClickListener(new n(this));
    }

    /* access modifiers changed from: private */
    public void d(View view) {
        this.c.b(view);
    }

    private void j() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
    }

    /* access modifiers changed from: private */
    public void k(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.d();
        }
    }

    /* access modifiers changed from: private */
    public void l(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.d(view);
        }
    }

    /* access modifiers changed from: private */
    public void m(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.g(view);
        }
    }

    /* access modifiers changed from: private */
    public void n(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.e(view);
        }
    }

    /* access modifiers changed from: private */
    public void o(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.c(view);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z) {
        this.r.setVisibility(z ? 0 : 8);
    }

    public void c() {
        this.q.c(this.q.getScrollY() * -10);
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.f.setText(p.more_download_creators);
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        this.h.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        this.o.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        this.m.setVisibility(0);
    }

    public void i() {
        j();
        this.c = null;
    }

    /* access modifiers changed from: private */
    public void e(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.e();
        }
    }

    /* access modifiers changed from: private */
    public void f(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: private */
    public void g(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* access modifiers changed from: private */
    public void h(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.f();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        this.e.setText(str);
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.f.setText(p.more_go_to_creators);
    }

    /* access modifiers changed from: private */
    public void i(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.f(view);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.i.getVisibility() == 0;
    }

    /* access modifiers changed from: 0000 */
    public void c(boolean z) {
        int i2 = z ? 0 : 8;
        this.s.setVisibility(i2);
        this.t.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    public void b(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* access modifiers changed from: private */
    public void c(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.h(view);
        }
    }

    /* access modifiers changed from: private */
    public void j(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(view);
        }
    }

    private void a(Resources resources) {
        String string = resources.getString(p.more_app_version, new Object[]{this.a.g()});
        String string2 = resources.getString(p.more_flipper_version, new Object[]{this.a.d()});
        TextView textView = this.g;
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("\n");
        sb.append(string2);
        textView.setText(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.n.setText(str);
        this.l.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, boolean z) {
        this.j.setText(i2);
        this.i.setVisibility(0);
        if (z) {
            this.k.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.p.setEnabled(z);
        this.p.setClickable(z);
    }

    /* access modifiers changed from: 0000 */
    public ImageView a() {
        return this.d;
    }
}
