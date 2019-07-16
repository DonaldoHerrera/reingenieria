package com.soundcloud.android.upgrade;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: UnrecoverableErrorDialog */
class m implements OnClickListener {
    final /* synthetic */ n a;

    m(n nVar) {
        this.a = nVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        n nVar = this.a;
        nVar.b.b((Activity) nVar.getActivity());
    }
}
