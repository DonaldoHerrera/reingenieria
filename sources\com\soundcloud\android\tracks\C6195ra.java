package com.soundcloud.android.tracks;

import android.view.View;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.v;

/* renamed from: com.soundcloud.android.tracks.ra reason: case insensitive filesystem */
/* compiled from: TrackItemRenderer.kt */
final class C6195ra implements b {
    final /* synthetic */ C6192pa a;
    final /* synthetic */ C6185ma b;
    final /* synthetic */ C3508cda c;
    final /* synthetic */ I d;
    final /* synthetic */ v e;
    final /* synthetic */ C3508cda f;
    final /* synthetic */ C5512Zta g;

    C6195ra(C6192pa paVar, C6185ma maVar, C3508cda cda, I i, v vVar, C3508cda cda2, C5512Zta zta) {
        this.a = paVar;
        this.b = maVar;
        this.c = cda;
        this.d = i;
        this.e = vVar;
        this.f = cda2;
        this.g = zta;
    }

    public final void a(View view) {
        C6192pa paVar = this.a;
        C7471uYa.a((Object) view, "overflowButton");
        paVar.a(view, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
