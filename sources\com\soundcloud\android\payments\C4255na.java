package com.soundcloud.android.payments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.a;
import com.soundcloud.android.payments.Fa.i;
import com.soundcloud.android.payments.Fa.l;

/* renamed from: com.soundcloud.android.payments.na reason: case insensitive filesystem */
/* compiled from: ProductChoiceAdapter.kt */
public final class C4255na extends a {
    private AvailableWebProducts c = AvailableWebProducts.a.a();
    private final Ba d;

    public C4255na(Ba ba) {
        C7471uYa.b(ba, "formatter");
        this.d = ba;
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        C7471uYa.b(viewGroup, "container");
        C7471uYa.b(obj, "object");
    }

    public boolean a(View view, Object obj) {
        C7471uYa.b(view, "view");
        C7471uYa.b(obj, "object");
        return view == obj;
    }

    public final WebProduct e(int i) {
        if (i == this.c.d()) {
            return (WebProduct) this.c.c().b();
        }
        if (i == this.c.f()) {
            return (WebProduct) this.c.e().b();
        }
        if (i == this.c.h()) {
            return (WebProduct) this.c.g().b();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected index ");
        sb.append(i);
        sb.append(" in ");
        sb.append(C4255na.class.getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    public final void a(AvailableWebProducts availableWebProducts) {
        C7471uYa.b(availableWebProducts, "<set-?>");
        this.c = availableWebProducts;
    }

    public ViewGroup a(ViewGroup viewGroup, int i) {
        C7471uYa.b(viewGroup, "container");
        String str = "getProduct(position)";
        if (i == this.c.f()) {
            int i2 = l.product_page_mid;
            WebProduct e = e(i);
            C7471uYa.a((Object) e, str);
            return a(viewGroup, i2, e);
        } else if (i == this.c.d()) {
            int i3 = l.product_page_high;
            WebProduct e2 = e(i);
            C7471uYa.a((Object) e2, str);
            return a(viewGroup, i3, e2);
        } else if (i == this.c.h()) {
            int i4 = l.product_page_student;
            WebProduct e3 = e(i);
            C7471uYa.a((Object) e3, str);
            return a(viewGroup, i4, e3);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected index in ");
            sb.append(C4255na.class.getSimpleName());
            throw new IllegalStateException(sb.toString());
        }
    }

    private final ViewGroup a(ViewGroup viewGroup, int i, WebProduct webProduct) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        if (inflate != null) {
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            TextView textView = (TextView) viewGroup2.findViewById(i.product_choice_price);
            C7471uYa.a((Object) textView, "price");
            textView.setText(this.d.b(webProduct));
            viewGroup.addView(viewGroup2);
            return viewGroup2;
        }
        throw new OVa("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public int a() {
        return this.c.b();
    }
}
