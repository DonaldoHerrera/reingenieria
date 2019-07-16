package com.soundcloud.android.upsell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.soundcloud.android.ia.l;

@EVa(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/soundcloud/android/upsell/TitleUpsellActionProvider;", "Landroidx/core/view/ActionProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreateActionView", "Landroid/view/View;", "base_release"}, mv = {1, 1, 15})
/* compiled from: TitleUpsellActionProvider.kt */
public final class TitleUpsellActionProvider extends C0278Xb {
    public TitleUpsellActionProvider(Context context) {
        C7471uYa.b(context, "context");
        super(context);
    }

    public View d() {
        View inflate = LayoutInflater.from(a()).inflate(l.upsell_action_bar_title_layout, null);
        C7471uYa.a((Object) inflate, "inflate(R.layout.upsell_…n_bar_title_layout, null)");
        C7471uYa.a((Object) inflate, "LayoutInflater.from(cont…e_layout, null)\n        }");
        return inflate;
    }
}
