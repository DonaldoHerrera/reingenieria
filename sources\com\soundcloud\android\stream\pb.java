package com.soundcloud.android.stream;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.stream.C6111wa.a;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.C6188na;
import com.soundcloud.android.tracks.Va;

/* compiled from: StreamTrackItemRenderer */
class pb extends C5541_ta<tb> {
    private final C5408WFa a;
    private final C6188na b;
    private final A c;
    private final C5204PIa d;
    private final Va e;
    private final C6781kVa<tb> f = C6781kVa.s();

    public pb(C5408WFa wFa, C6188na naVar, C5204PIa pIa, A a2, Va va) {
        this.a = wFa;
        this.b = naVar;
        this.c = a2;
        this.d = pIa;
        this.e = va;
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.stream_track_card, viewGroup, false);
        inflate.setTag(new C6111wa(inflate));
        return inflate;
    }

    public void a(int i, View view, tb tbVar) {
        C6185ma m = tbVar.m();
        C6111wa waVar = (C6111wa) view.getTag();
        waVar.e();
        this.c.a(waVar, (C3855qda) m, a(m, Integer.valueOf(i)), tbVar.b(), C4928GKa.b(tbVar.j()));
        this.d.a((C5264RIa) waVar, (C3855qda) m, a(m, Integer.valueOf(i)));
        b(waVar, m);
        waVar.a((a) new C6091m(this, m, i));
        view.setOnClickListener(new C6089l(this, tbVar));
    }

    private void b(C6111wa waVar, C6185ma maVar) {
        if (maVar.M()) {
            waVar.i();
        } else {
            a(waVar, maVar);
        }
    }

    public /* synthetic */ void a(C6185ma maVar, int i, View view) {
        this.b.a(C6768kIa.c(view), view, maVar, a(maVar, Integer.valueOf(i)));
    }

    public /* synthetic */ void a(tb tbVar, View view) {
        this.f.a(tbVar);
    }

    public APa<tb> a() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public C3710l a(C6185ma maVar, Integer num) {
        return C5672bua.a(maVar, Yca.STREAM.a(), new v("stream", num.intValue()), null, C3508cda.a);
    }

    private void a(C6111wa waVar, C6185ma maVar) {
        if (this.e.b(maVar)) {
            waVar.g(this.a.a((long) maVar.S()));
        }
    }
}
