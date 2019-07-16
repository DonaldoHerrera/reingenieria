package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.N;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.C6188na;
import com.soundcloud.android.tracks.Va;

/* renamed from: bJa reason: default package and case insensitive filesystem */
/* compiled from: TrackCardRenderer */
public class C5629bJa extends C5541_ta<C6185ma> {
    private final C5408WFa a;
    private final C6188na b;
    private final C5204PIa c;
    private final N d;
    private final C4655rja e;
    private final Resources f;
    private final F g;
    private final Va h;
    private int i = l.default_track_card;

    C5629bJa(C5408WFa wFa, C6188na naVar, C5204PIa pIa, N n, C4655rja rja, Resources resources, F f2, Va va) {
        this.a = wFa;
        this.b = naVar;
        this.c = pIa;
        this.d = n;
        this.e = rja;
        this.f = resources;
        this.g = f2;
        this.h = va;
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.i, viewGroup, false);
        inflate.setTag(new C6293dJa(inflate, this.d, this.e, this.f));
        return inflate;
    }

    public void a(int i2, View view, C6185ma maVar) {
        a(maVar, view, C4928GKa.a(), C5512Zta.a.a());
    }

    private void b(C6293dJa dja, C6185ma maVar) {
        if (maVar.M()) {
            dja.d();
        } else {
            a(dja, maVar);
        }
    }

    public void a(C6185ma maVar, View view, C4928GKa<v> gKa, C5512Zta zta) {
        C6293dJa dja = (C6293dJa) view.getTag();
        dja.c();
        this.c.a((C5264RIa) dja, (C3855qda) maVar, a(gKa));
        dja.a((C3855qda) maVar);
        b(dja, maVar);
        View view2 = dja.h;
        C5082LIa lIa = new C5082LIa(this, view, dja, maVar, gKa, zta);
        view2.setOnClickListener(lIa);
    }

    public /* synthetic */ void a(View view, C6293dJa dja, C6185ma maVar, C4928GKa gKa, C5512Zta zta, View view2) {
        this.b.a(C6768kIa.c(view), dja.h, maVar, a(gKa), zta);
    }

    public void a(int i2) {
        this.i = i2;
    }

    private C3710l a(C4928GKa<v> gKa) {
        C3710l a2 = C3710l.a(this.g.b());
        if (gKa.c()) {
            a2.a((v) gKa.b());
        }
        return a2;
    }

    private void a(C6293dJa dja, C6185ma maVar) {
        if (this.h.b(maVar)) {
            dja.e(this.a.a((long) maVar.S()));
        }
    }
}
