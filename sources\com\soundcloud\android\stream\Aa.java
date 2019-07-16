package com.soundcloud.android.stream;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.ia.l;

/* compiled from: StreamPlaylistItemRenderer */
class Aa extends C5541_ta<C6102s> {
    private final C7287rra a;
    private final A b;
    private final C5204PIa c;
    private final C6781kVa<C6102s> d = C6781kVa.s();

    /* compiled from: StreamPlaylistItemRenderer */
    static class a extends C6111wa {
        a(View view) {
            super(view);
        }
    }

    Aa(C7287rra rra, A a2, C5204PIa pIa) {
        this.c = pIa;
        this.a = rra;
        this.b = a2;
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.stream_playlist_card, viewGroup, false);
        inflate.setTag(new a(inflate));
        return inflate;
    }

    public void a(int i, View view, C6102s sVar) {
        C3863rda k = sVar.k();
        a aVar = (a) view.getTag();
        aVar.e();
        this.b.a((C6111wa) aVar, (C3855qda) k, a(k, i), sVar.b(), C4928GKa.b(sVar.j()));
        a(aVar, k, i);
        view.setOnClickListener(new C6079g(this, sVar));
    }

    public /* synthetic */ void a(C6102s sVar, View view) {
        this.d.a(sVar);
    }

    public APa<C6102s> a() {
        return this.d;
    }

    private void a(a aVar, C3863rda rda, int i) {
        this.c.a((C5264RIa) aVar, (C3855qda) rda, a(rda, i));
        aVar.a((com.soundcloud.android.stream.C6111wa.a) new C6077f(this, rda, i));
    }

    public /* synthetic */ void a(C3863rda rda, int i, View view) {
        this.a.a(view, rda, a(rda, i), C5512Zta.a.a());
    }

    /* access modifiers changed from: 0000 */
    public C3710l a(C3863rda rda, int i) {
        return C5672bua.a(rda, Yca.STREAM.a(), new v("stream", i), null, C3508cda.a);
    }
}
