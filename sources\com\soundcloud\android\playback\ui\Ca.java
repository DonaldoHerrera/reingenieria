package com.soundcloud.android.playback.ui;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Predicate;
import com.soundcloud.android.collections.data.J;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.playback.C4519wc;
import com.soundcloud.android.playback.ui.C4489sb;
import com.soundcloud.android.playback.ui.view.RoundedColorButton;
import com.soundcloud.android.settings.C5956m;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: AdPagePresenter */
public abstract class Ca<T extends C4489sb> implements Cb<T> {
    private final C5956m a;

    /* compiled from: AdPagePresenter */
    public static class a {
        final View a;
        final View b;
        final View c;
        final View d;
        final View e;
        final TextView f;
        final View g;
        final View h;
        final TextView i;
        final ImageView j;
        final RoundedColorButton k;
        final View l;
        final View m;
        final Iterable<View> n;
        boolean o;
        int p;
        final Predicate<View> q = C4449f.a;

        public a(View view) {
            this.a = view.findViewById(i.player_play);
            this.b = view.findViewById(i.player_next);
            this.c = view.findViewById(i.player_previous);
            this.d = view.findViewById(i.play_controls);
            this.e = view.findViewById(i.skip_ad);
            this.f = (TextView) view.findViewById(i.time_until_skip);
            this.g = view.findViewById(i.preview_artwork_overlay);
            this.h = view.findViewById(i.preview_container);
            this.i = (TextView) view.findViewById(i.preview_title);
            this.j = (ImageView) view.findViewById(i.preview_artwork);
            this.k = (RoundedColorButton) view.findViewById(i.cta_button);
            this.l = view.findViewById(i.why_ads);
            this.m = view.findViewById(i.advertisement);
            this.n = C1943BD.b(Arrays.asList(new View[]{this.c, this.b}), this.q);
        }

        static /* synthetic */ boolean a(View view) {
            return view != null;
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z, int i2) {
            this.o = z;
            this.p = i2;
        }
    }

    public Ca(C5956m mVar) {
        this.a = mVar;
    }

    static /* synthetic */ void b(boolean z, View view) {
        view.setVisibility(z ? 0 : 4);
    }

    public void a(View view) {
    }

    public void a(View view, float f) {
    }

    public void a(View view, J j) {
    }

    public void a(View view, com.soundcloud.android.foundation.events.C.a aVar) {
    }

    public void a(View view, q qVar, boolean z) {
    }

    public abstract void a(View view, T t);

    public void b(View view) {
    }

    public void b(View view, q qVar, boolean z) {
    }

    public void c(View view) {
    }

    public void d(View view) {
    }

    public void e(View view) {
    }

    public void f(View view) {
    }

    public void i(View view) {
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z, Iterable<View> iterable) {
        C6768kIa.a(iterable, (C7733yKa<View>) new C4458i<View>(z));
    }

    /* access modifiers changed from: 0000 */
    public void a(OnClickListener onClickListener, Iterable<View> iterable) {
        C6768kIa.a(iterable, (C7733yKa<View>) new C4446e<View>(onClickListener));
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z, Iterable<View> iterable) {
        C6768kIa.a(iterable, (C7733yKa<View>) new C4452g<View>(z));
    }

    /* access modifiers changed from: 0000 */
    public void a(Iterable<View> iterable, Animation animation) {
        C6768kIa.a(iterable, (C7733yKa<View>) new C4455h<View>(animation));
    }

    static /* synthetic */ void a(Animation animation, View view) {
        view.startAnimation(animation);
        view.setVisibility(4);
    }

    /* access modifiers changed from: 0000 */
    public void a(Iterable<View> iterable) {
        C6768kIa.a(iterable, (C7733yKa<View>) C4500wa.a);
    }

    private ColorStateList a(int i, int i2, int i3) {
        return new ColorStateList(new int[][]{new int[]{16842908}, new int[]{16842919}, new int[0]}, new int[]{i, i2, i3});
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar, C4489sb sbVar, Resources resources) {
        aVar.k.setText(sbVar.a(resources));
        if (sbVar.p()) {
            aVar.k.setTextColor(a(sbVar.l(), sbVar.o(), sbVar.j()));
            aVar.k.setBackground(a(sbVar.k(), sbVar.n(), sbVar.i()));
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C4489sb sbVar, a aVar, N n, Resources resources) {
        C3721b c = C3721b.c(resources);
        aVar.i.setText(sbVar.b(resources));
        n.c(sbVar.m(), C4928GKa.a(), c, aVar.j);
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar, T t) {
        aVar.a(t.g().z(), t.g().v());
        aVar.f.setText("");
        aVar.e.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar, C4519wc wcVar, Resources resources) {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(wcVar.c());
        int min = (aVar.o ? Math.min(aVar.p, seconds) : seconds) - ((int) TimeUnit.MILLISECONDS.toSeconds(wcVar.d()));
        boolean z = true;
        boolean z2 = min <= 0;
        boolean z3 = z2 || a();
        if ((!aVar.o || !z2) && !a()) {
            z = false;
        }
        a(aVar, z, z3);
        if (min > 0) {
            a(aVar, min, seconds, resources);
        }
    }

    private void a(a aVar, boolean z, boolean z2) {
        int i = 0;
        aVar.e.setVisibility(z ? 0 : 8);
        aVar.f.setVisibility(z2 ? 8 : 0);
        View view = aVar.g;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
        a(z, aVar.n);
    }

    private void a(a aVar, int i, int i2, Resources resources) {
        String a2 = C7315sGa.a(resources, (long) i, TimeUnit.SECONDS);
        if (aVar.o && i2 > aVar.p) {
            a2 = resources.getString(p.ads_skip_in_time, new Object[]{a2});
        }
        aVar.f.setText(a2);
    }

    private boolean a() {
        return this.a.a();
    }
}
