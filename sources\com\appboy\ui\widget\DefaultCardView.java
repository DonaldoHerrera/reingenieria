package com.appboy.ui.widget;

import android.content.Context;
import com.appboy.ui.R$layout;

public class DefaultCardView extends BaseCardView<C1662rg> {
    private static final String TAG = Hg.a(DefaultCardView.class);

    public DefaultCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_default_card;
    }

    public void onSetCard(C1662rg rgVar) {
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("onSetCard called for blank view with: ");
        sb.append(rgVar.toString());
        Hg.e(str, sb.toString());
    }

    public DefaultCardView(Context context, C1662rg rgVar) {
        super(context);
        if (rgVar != null) {
            setCard(rgVar);
        }
    }
}
