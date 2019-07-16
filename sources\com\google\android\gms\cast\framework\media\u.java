package com.google.android.gms.cast.framework.media;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class u implements OnClickListener {
    private final /* synthetic */ y a;
    private final /* synthetic */ y b;
    private final /* synthetic */ C0651f c;

    u(C0651f fVar, y yVar, y yVar2) {
        this.c = fVar;
        this.a = yVar;
        this.b = yVar2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.c.a(this.a, this.b);
    }
}
