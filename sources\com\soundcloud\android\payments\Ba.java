package com.soundcloud.android.payments;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import com.soundcloud.android.payments.Fa.o;
import com.soundcloud.android.payments.Fa.p;

/* compiled from: ProductInfoFormatter */
public class Ba {
    private final Resources a;

    Ba(Resources resources) {
        this.a = resources;
    }

    private SpannableString d(WebProduct webProduct) {
        String c = webProduct.e().c();
        String a2 = a(webProduct.a().c());
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(" ");
        sb.append(a2);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new StrikethroughSpan(), 0, c.length(), 0);
        return spannableString;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str) {
        return this.a.getString(p.conversion_price, new Object[]{str});
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    public String b(int i) {
        if (i <= 0) {
            return this.a.getString(p.conversion_buy_no_trial);
        }
        return this.a.getString(p.conversion_buy_trial, new Object[]{Integer.valueOf(i)});
    }

    /* access modifiers changed from: 0000 */
    public String c(int i) {
        if (i >= 30) {
            int i2 = i / 30;
            return this.a.getQuantityString(o.elapsed_months, i2, new Object[]{Integer.valueOf(i2)});
        }
        return this.a.getQuantityString(o.elapsed_days, i, new Object[]{Integer.valueOf(i)});
    }

    /* access modifiers changed from: 0000 */
    public String a(int i, String str) {
        return this.a.getString(p.conversion_price_promo, new Object[]{c(i), str});
    }

    /* access modifiers changed from: 0000 */
    public String a(int i) {
        if (i <= 0) {
            return this.a.getString(p.subs_relaunch_no_trial);
        }
        return this.a.getString(p.subs_relaunch_buy_trial, new Object[]{Integer.valueOf(i)});
    }

    /* access modifiers changed from: 0000 */
    public CharSequence b(WebProduct webProduct) {
        if (webProduct.j()) {
            return a(webProduct.f(), webProduct.g().c());
        }
        if (webProduct.a() != null) {
            return d(webProduct);
        }
        return a(webProduct.e().c());
    }

    /* access modifiers changed from: 0000 */
    public String c(WebProduct webProduct) {
        if (webProduct.k()) {
            return this.a.getString(p.conversion_restrictions_students);
        }
        if (!webProduct.j()) {
            return this.a.getString(p.conversion_restrictions);
        }
        return this.a.getString(p.conversion_restrictions_promo, new Object[]{webProduct.e().c()});
    }

    /* access modifiers changed from: 0000 */
    public String a(WebProduct webProduct) {
        if (webProduct.j()) {
            return this.a.getString(p.conversion_buy_promo);
        }
        return b(webProduct.i());
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, int i) {
        if (i <= 0) {
            return a(str);
        }
        return this.a.getString(p.subs_relaunch_restrictions_message_trial, new Object[]{Integer.valueOf(i), str});
    }
}
