package com.facebook.login.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.login.D;

/* compiled from: LoginButton */
class f implements OnClickListener {
    final /* synthetic */ D a;
    final /* synthetic */ b b;

    f(b bVar, D d) {
        this.b = bVar;
        this.a = d;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.b();
    }
}
