package com.soundcloud.android.payments;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.payments.d reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4234d implements OnClickListener {
    private final /* synthetic */ S a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;

    public /* synthetic */ C4234d(S s, String str, String str2, String str3) {
        this.a = s;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final void onClick(View view) {
        this.a.a(this.b, this.c, this.d, view);
    }
}
