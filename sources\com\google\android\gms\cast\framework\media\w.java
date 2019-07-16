package com.google.android.gms.cast.framework.media;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class w implements OnClickListener {
    private final /* synthetic */ C0651f a;

    w(C0651f fVar) {
        this.a = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a.e != null) {
            this.a.e.cancel();
            this.a.e = null;
        }
    }
}
