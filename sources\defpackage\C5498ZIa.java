package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.o;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.view.L;

/* renamed from: ZIa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistItemRenderer */
public class C5498ZIa extends C5541_ta<C3863rda> {
    private final Resources a;
    private final N b;
    private final C5408WFa c;
    private final C7287rra d;
    private final C3700b e;
    private final F f;
    private final C4655rja g;

    public C5498ZIa(Resources resources, N n, C5408WFa wFa, C7287rra rra, C3700b bVar, F f2, C4655rja rja) {
        this.a = resources;
        this.b = n;
        this.c = wFa;
        this.d = rra;
        this.e = bVar;
        this.f = f2;
        this.g = rja;
    }

    private boolean a(int i) {
        return i > 0;
    }

    private void c(View view) {
        TextView a2 = a(view, i.promoted_playlist);
        C6768kIa.f(a2);
        a2.setVisibility(8);
    }

    private void d(View view, C3863rda rda) {
        TextView a2 = a(view, i.list_item_counter);
        a2.setCompoundDrawablesWithIntrinsicBounds(h.ic_like_grey_vector, 0, 0, 0);
        int q = rda.q();
        if (a(q)) {
            a2.setVisibility(0);
            a2.setText(this.c.a((long) q));
            a2.setCompoundDrawablesWithIntrinsicBounds(a(rda.o()), 0, 0, 0);
        }
    }

    private void e(View view, C3863rda rda) {
        if (rda.j()) {
            a(a(view, this.a.getString(p.promoted_by_promotorname, new Object[]{rda.u()})), rda);
            return;
        }
        a(view, this.a.getString(p.promoted));
    }

    private void f(View view, C3863rda rda) {
        int L = rda.L();
        a(view, i.list_item_right_info).setText(this.a.getQuantityString(o.number_of_sounds, L, new Object[]{Integer.valueOf(L)}));
    }

    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.playlist_item, viewGroup, false);
    }

    private void b(View view, C3863rda rda) {
        a(view);
        if (rda.n()) {
            e(view, rda);
        } else if (a(rda).booleanValue()) {
            b(view);
        } else if (rda.F()) {
            c(view, rda);
        } else {
            d(view, rda);
        }
    }

    public void a(int i, View view, C3863rda rda) {
        a(rda, view, C4928GKa.a(), C4928GKa.a(), C5512Zta.a.a(), C4928GKa.a());
    }

    public void a(C3863rda rda, View view, C4928GKa<v> gKa, C5512Zta zta) {
        a(rda, view, gKa, C4928GKa.a(), zta, C4928GKa.a());
    }

    private void c(View view, C3863rda rda) {
        TextView a2 = a(view, i.album_title);
        a2.setVisibility(0);
        a2.setText(a(rda, view.getContext().getResources()));
    }

    public void a(C3863rda rda, View view, C4928GKa<C3508cda> gKa) {
        a(rda, view, C4928GKa.a(), C4928GKa.a(), C5512Zta.a.a(), gKa);
    }

    public void a(C3863rda rda, View view, C4928GKa<v> gKa, C4928GKa<String> gKa2, C5512Zta zta, C4928GKa<C3508cda> gKa3) {
        a(view, i.list_item_header).setText(rda.d());
        a(view, i.list_item_subheader).setText(rda.B());
        f(view, rda);
        b(view, rda);
        a(view, rda);
        a(view.findViewById(i.overflow_button), rda, gKa, gKa2, zta, gKa3);
    }

    private void b(View view) {
        a(view, i.private_indicator).setVisibility(0);
    }

    public /* synthetic */ void a(View view, C3863rda rda, C4928GKa gKa, C4928GKa gKa2, C4928GKa gKa3, C5512Zta zta, View view2) {
        this.d.a(view, rda, a((C3855qda) rda, gKa, gKa2, gKa3), zta);
    }

    private void a(View view, C3863rda rda, C4928GKa<v> gKa, C4928GKa<String> gKa2, C5512Zta zta, C4928GKa<C3508cda> gKa3) {
        C4957HIa hIa = new C4957HIa(this, view, rda, gKa, gKa2, gKa3, zta);
        view.setOnClickListener(hIa);
    }

    private void a(View view) {
        a(view, i.list_item_counter).setVisibility(8);
        a(view, i.private_indicator).setVisibility(8);
        a(view, i.album_title).setVisibility(8);
        c(view);
    }

    private TextView a(View view, String str) {
        TextView a2 = a(view, i.promoted_playlist);
        a2.setVisibility(0);
        a2.setText(str);
        return a2;
    }

    private void a(TextView textView, C3863rda rda) {
        C6768kIa.a((View) textView, (OnClickListener) new L(rda, this.e, this.f, this.g));
    }

    private Boolean a(C3863rda rda) {
        return Boolean.valueOf(rda.m());
    }

    private void a(View view, C3863rda rda) {
        this.b.a(rda.a(), rda.b(), C3721b.c(view.getResources()), (ImageView) view.findViewById(i.image), false);
    }

    private String a(C3863rda rda, Resources resources) {
        return C5035Jsa.a(resources, rda.h(), rda.F(), rda.D());
    }

    private int a(boolean z) {
        return z ? h.ic_like_orange_vector : h.ic_like_grey_vector;
    }

    private C3710l a(C3855qda qda, C4928GKa<v> gKa, C4928GKa<String> gKa2, C4928GKa<C3508cda> gKa3) {
        C3710l a2 = C5672bua.a(qda, this.f.a(), (v) gKa.d(), null, C3508cda.a);
        a2.b((String) gKa2.d());
        a2.a((C3508cda) gKa3.d());
        return a2;
    }

    /* access modifiers changed from: protected */
    public TextView a(View view, int i) {
        return (TextView) view.findViewById(i);
    }
}
