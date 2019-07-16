package com.soundcloud.android.payments;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.payments.Fa.i;
import com.soundcloud.android.payments.Fa.l;

/* renamed from: com.soundcloud.android.payments.xa reason: case insensitive filesystem */
/* compiled from: ProductChoiceScrollView.kt */
public class C4274xa extends C4278za {
    private final Ba a;

    public C4274xa(Ba ba) {
        C7471uYa.b(ba, "formatter");
        this.a = ba;
    }

    /* renamed from: b */
    public void a(View view, AvailableWebProducts availableWebProducts, a aVar, C2455aV aVVar) {
        C7471uYa.b(view, "view");
        C7471uYa.b(availableWebProducts, "products");
        C7471uYa.b(aVar, CastExtraArgs.LISTENER);
        C7471uYa.b(aVVar, "initialPlan");
        View inflate = View.inflate(view.getContext(), l.product_choice_ht, null);
        View inflate2 = View.inflate(view.getContext(), l.product_choice_mt, null);
        int i = C4268ua.a[aVVar.ordinal()];
        String str = "highTierView";
        String str2 = "midTierView";
        if (i == 1) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i.product_choice_list);
            C7471uYa.a((Object) inflate2, str2);
            linearLayout.addView(inflate2);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i.product_choice_list);
            C7471uYa.a((Object) inflate, str);
            linearLayout2.addView(inflate);
        } else if (i == 2) {
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i.product_choice_list);
            C7471uYa.a((Object) inflate, str);
            linearLayout3.addView(inflate);
            LinearLayout linearLayout4 = (LinearLayout) view.findViewById(i.product_choice_list);
            C7471uYa.a((Object) inflate2, str2);
            linearLayout4.addView(inflate2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected plan: ");
            sb.append(aVVar);
            throw new IllegalArgumentException(sb.toString());
        }
        Object b = availableWebProducts.e().b();
        C7471uYa.a(b, "products.midTier().get()");
        a(inflate2, (WebProduct) b, aVar);
        Object b2 = availableWebProducts.c().b();
        C7471uYa.a(b2, "products.highTier().get()");
        a(inflate, (WebProduct) b2, aVar);
        View findViewById = view.findViewById(i.progress_container);
        C7471uYa.a((Object) findViewById, "view.findViewById<View>(R.id.progress_container)");
        findViewById.setVisibility(8);
    }

    private void a(View view, WebProduct webProduct, a aVar) {
        View findViewById = view.findViewById(i.product_choice_price);
        C7471uYa.a((Object) findViewById, "view.findViewById<TextVi….id.product_choice_price)");
        ((TextView) findViewById).setText(this.a.b(webProduct));
        View findViewById2 = view.findViewById(i.buy);
        C7471uYa.a((Object) findViewById2, "view.findViewById(R.id.buy)");
        a(webProduct, (Button) findViewById2, aVar);
        View findViewById3 = view.findViewById(i.product_choice_restrictions);
        C7471uYa.a((Object) findViewById3, "view.findViewById(R.id.p…duct_choice_restrictions)");
        a(webProduct, (TextView) findViewById3, aVar);
    }

    private void a(WebProduct webProduct, Button button, a aVar) {
        aVar.b(webProduct);
        button.setText(this.a.a(webProduct));
        button.setOnClickListener(new C4270va(aVar, webProduct));
    }

    private void a(WebProduct webProduct, TextView textView, a aVar) {
        textView.setText(this.a.c(webProduct));
        textView.setOnClickListener(new C4272wa(aVar, webProduct));
    }
}
