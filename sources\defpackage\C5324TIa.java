package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: TIa reason: default package and case insensitive filesystem */
/* compiled from: CarouselPlaylistItemRenderer.kt */
final class C5324TIa implements OnClickListener {
    final /* synthetic */ C5294SIa a;
    final /* synthetic */ C3863rda b;
    final /* synthetic */ int c;

    C5324TIa(C5294SIa sIa, C3863rda rda, int i) {
        this.a = sIa;
        this.b = rda;
        this.c = i;
    }

    public final void onClick(View view) {
        a a2 = this.a.a;
        if (a2 != null) {
            C7471uYa.a((Object) view, "view");
            Context context = view.getContext();
            C7471uYa.a((Object) context, "view.context");
            a2.a(context, this.b, this.c);
        }
    }
}
