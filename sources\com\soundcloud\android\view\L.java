package com.soundcloud.android.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.J;

/* compiled from: PromoterClickViewListener */
public class L implements OnClickListener {
    private final C3855qda a;
    private final C3700b b;
    private final F c;
    private final C4655rja d;

    public L(C3855qda qda, C3700b bVar, F f, C4655rja rja) {
        this.a = qda;
        this.b = bVar;
        this.c = f;
        this.d = rja;
    }

    public void onClick(View view) {
        this.d.a(C4621nja.c(this.a.v()));
        this.b.a((J) Qaa.c(this.a.c(), this.a.t(), this.c.a()));
    }
}
