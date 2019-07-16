package com.soundcloud.android.payments;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import com.soundcloud.android.payments.Fa.i;
import com.soundcloud.android.view.pageindicator.CirclePageIndicator;

@Deprecated
/* renamed from: com.soundcloud.android.payments.pa reason: case insensitive filesystem */
/* compiled from: ProductChoicePagerView */
class C4259pa extends C4278za implements e {
    private final C4255na a;
    private final Ba b;
    private a c;
    private View d;
    private Button e;
    private TextView f;
    private ViewPager g;
    private CirclePageIndicator h;

    C4259pa(C4255na naVar, Ba ba) {
        this.a = naVar;
        this.b = ba;
    }

    public void a(int i) {
    }

    public void a(int i, float f2, int i2) {
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, AvailableWebProducts availableWebProducts, a aVar, C2455aV aVVar) {
        a(view);
        this.c = aVar;
        a(availableWebProducts, aVVar);
    }

    public void b(int i) {
        a(this.a.e(i));
    }

    public /* synthetic */ void b(WebProduct webProduct, View view) {
        this.c.a(webProduct);
    }

    private void a(View view) {
        this.d = view.findViewById(i.progress_container);
        this.e = (Button) view.findViewById(i.buy);
        this.f = (TextView) view.findViewById(i.product_choice_restrictions);
        this.g = (ViewPager) view.findViewById(i.product_choice_pager);
        this.h = (CirclePageIndicator) view.findViewById(i.page_indicator);
    }

    private void a(AvailableWebProducts availableWebProducts, C2455aV aVVar) {
        this.a.a(availableWebProducts);
        this.g.setAdapter(this.a);
        this.g.a((e) this);
        this.h.setViewPager(this.g);
        this.g.setCurrentItem(C2455aV.MID_TIER == aVVar ? availableWebProducts.f() : availableWebProducts.d());
        a(this.a.e(this.g.getCurrentItem()));
        this.d.setVisibility(8);
    }

    private void a(WebProduct webProduct) {
        this.c.b(webProduct);
        this.e.setText(this.b.a(webProduct));
        this.e.setOnClickListener(new C4267u(this, webProduct));
        this.f.setText(this.b.c(webProduct));
        this.f.setOnClickListener(new C4269v(this, webProduct));
    }

    public /* synthetic */ void a(WebProduct webProduct, View view) {
        this.c.c(webProduct);
    }
}
