package com.facebook;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.facebook.o reason: case insensitive filesystem */
/* compiled from: FacebookButtonBase */
class C0585o implements OnClickListener {
    final /* synthetic */ C0586p a;

    C0585o(C0586p pVar) {
        this.a = pVar;
    }

    public void onClick(View view) {
        C0586p pVar = this.a;
        pVar.b(pVar.getContext());
        if (this.a.d != null) {
            this.a.d.onClick(view);
        } else if (this.a.c != null) {
            this.a.c.onClick(view);
        }
    }
}
