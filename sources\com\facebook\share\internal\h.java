package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.C0594t;
import com.facebook.internal.ia;
import com.facebook.share.internal.t.c;

/* compiled from: LikeActionController */
class h implements c {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Intent c;

    h(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public void a(t tVar, C0594t tVar2) {
        if (tVar2 == null) {
            tVar.b(this.a, this.b, this.c);
        } else {
            ia.a(t.a, (Exception) tVar2);
        }
    }
}
