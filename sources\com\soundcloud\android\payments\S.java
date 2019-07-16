package com.soundcloud.android.payments;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.payments.Fa.i;
import com.soundcloud.android.payments.Fa.p;
import com.soundcloud.android.view.LoadingButton;

/* compiled from: LegacyConversionView */
class S {
    private final Resources a;
    private final Ba b;
    private C0370l c;
    private TextView d;
    private TextView e;
    private TextView f;
    private LoadingButton g;
    private TextView h;
    private TextView i;
    private Button j;

    /* compiled from: LegacyConversionView */
    interface a {
        void h();

        void i();
    }

    S(Resources resources, Ba ba) {
        this.a = resources;
        this.b = ba;
    }

    private void c(String str) {
        this.h.setText(this.b.a(str));
        this.h.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void a(AppCompatActivity appCompatActivity, a aVar) {
        this.c = appCompatActivity.getSupportFragmentManager();
        a(appCompatActivity.findViewById(16908290));
        a(aVar);
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        c(str);
        a();
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.g.setEnabled(true);
        this.g.a();
    }

    private void b(int i2) {
        this.g.setActionText(this.b.b(i2));
        a(i2);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.g.setEnabled(false);
        this.g.setLoading(true);
    }

    private void a(View view) {
        this.d = (TextView) view.findViewById(i.conversion_plan);
        this.e = (TextView) view.findViewById(i.conversion_title);
        this.f = (TextView) view.findViewById(i.conversion_description);
        this.g = (LoadingButton) view.findViewById(i.conversion_buy);
        this.h = (TextView) view.findViewById(i.conversion_price);
        this.i = (TextView) view.findViewById(i.conversion_restrictions);
        this.j = (Button) view.findViewById(i.conversion_more_products);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.j.setText(p.conversion_ht_plan);
        this.j.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3, int i4) {
        this.d.setText(i2);
        this.e.setText(i3);
        this.f.setText(i4);
    }

    private void a(a aVar) {
        C4238f fVar = new C4238f(aVar);
        this.g.setOnClickListener(fVar);
        this.j.setOnClickListener(fVar);
    }

    static /* synthetic */ void a(a aVar, View view) {
        int id = view.getId();
        if (id == i.conversion_buy) {
            aVar.h();
        } else if (id == i.conversion_more_products) {
            aVar.i();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, int i2) {
        c(str);
        b(i2);
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, int i2, String str2) {
        this.h.setText(this.b.a(i2, str));
        this.h.setVisibility(0);
        this.g.setActionText(this.a.getString(p.conversion_buy_promo));
        a(this.b.c(i2), str, str2);
        a();
    }

    private void a(int i2) {
        this.i.setOnClickListener(new C4236e(this, i2));
        this.i.setVisibility(0);
    }

    public /* synthetic */ void a(int i2, View view) {
        G g2;
        if (i2 > 0) {
            g2 = G.c(i2);
        } else {
            g2 = G.Qb();
        }
        C5232QGa.a((C0361c) g2, this.c, "restrictions_dialog");
    }

    private void a(String str, String str2, String str3) {
        this.i.setText(this.a.getString(p.conversion_restrictions_promo, new Object[]{str3}));
        this.i.setOnClickListener(new C4234d(this, str, str2, str3));
        this.i.setVisibility(0);
    }

    public /* synthetic */ void a(String str, String str2, String str3, View view) {
        C5232QGa.a((C0361c) G.a(str, str2, str3), this.c, "restrictions_dialog");
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.g.setEnabled(true);
        this.g.setLoading(false);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.j.setText(this.a.getString(p.conversion_mt_plan, new Object[]{str}));
        this.j.setVisibility(0);
    }
}
