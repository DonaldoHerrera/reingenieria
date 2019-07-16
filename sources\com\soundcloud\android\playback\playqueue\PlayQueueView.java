package com.soundcloud.android.playback.playqueue;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.va;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.r;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.SmoothScrollLinearLayoutManager;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;
import java.util.List;

public class PlayQueueView extends SupportFragmentLightCycleDispatcher<Fragment> implements a {
    /* access modifiers changed from: private */
    public final Pa a;
    private final C4390pa b;
    private final Ra c;
    private final C5052KJa d;
    /* access modifiers changed from: private */
    public final SmoothScrollLinearLayoutManager e;
    private final C2014EO f;
    private ImageView g;
    private ImageView h;
    private View i;
    private RecyclerView j;

    interface a {
        void a(ViewHolder viewHolder);
    }

    private class b extends m {
        private b() {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
            if (i2 > 0) {
                PlayQueueView.this.a.c(PlayQueueView.this.e.H());
            } else {
                PlayQueueView.this.a.d(PlayQueueView.this.e.G());
            }
        }
    }

    public PlayQueueView(Pa pa, Sa sa, C5052KJa kJa, SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager, C2014EO eo, fb fbVar, C4378ja jaVar, C4384ma maVar) {
        this.a = pa;
        this.b = new C4390pa(fbVar, jaVar, maVar);
        this.d = kJa;
        this.e = smoothScrollLinearLayoutManager;
        this.f = eo;
        this.c = sa.a(pa);
    }

    private r B() {
        r rVar = new r();
        rVar.a(150);
        return rVar;
    }

    private void C() {
        this.a.a();
    }

    private void D() {
        this.b.a(true);
        this.j.setLayoutManager(this.e);
        this.j.setAdapter(this.b);
        this.j.setHasFixedSize(false);
        this.j.setItemAnimator(B());
        this.j.a((m) new b());
        G g2 = new G(this.c);
        g2.a(this.j);
        this.b.a((a) new L(g2));
        C4390pa paVar = this.b;
        Pa pa = this.a;
        pa.getClass();
        paVar.a((a) new C4363c(pa));
        this.b.a((a) this);
    }

    private void E() {
        this.a.d();
    }

    private void F() {
        this.a.e();
    }

    private void G() {
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    private void f(View view) {
        this.g = (ImageView) view.findViewById(i.repeat_button);
        this.h = (ImageView) view.findViewById(i.shuffle_button);
        this.i = view.findViewById(i.loading_indicator);
        this.j = (RecyclerView) view.findViewById(i.recycler_view);
        view.findViewById(i.close_play_queue).setOnClickListener(new G(this));
        view.findViewById(i.up_next).setOnClickListener(new F(this));
        this.h.setOnClickListener(new H(this));
        this.g.setOnClickListener(new E(this));
    }

    /* access modifiers changed from: 0000 */
    public void A() {
        this.f.a(u.PLAY_QUEUE_SHUFFLE);
        this.a.f();
    }

    public /* synthetic */ void c(View view) {
        A();
    }

    public /* synthetic */ void d(View view) {
        F();
    }

    public /* synthetic */ void e(View view) {
        this.a.g();
    }

    public void q() {
        this.a.c();
    }

    public void v() {
        this.i.setVisibility(8);
    }

    public void w() {
        this.g.setImageResource(h.ic_repeat_all);
    }

    public void x() {
        this.g.setImageResource(h.ic_repeat_off);
    }

    public void y() {
        this.g.setImageResource(h.ic_repeat_one);
    }

    public void z() {
        this.i.setVisibility(0);
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        super.onViewCreated(fragment, view, bundle);
        f(view);
        D();
        a(view.getResources());
        this.a.a(this);
    }

    public /* synthetic */ void b(View view) {
        E();
    }

    public void c(int i2) {
        this.d.a(new Fca(i2, 1, p.undo, new D(this)));
    }

    public void e(boolean z) {
        this.a.a(z);
    }

    public void b(int i2) {
        this.b.h(i2);
        this.b.e(i2);
    }

    public /* synthetic */ void a(View view) {
        C();
    }

    private void a(Resources resources) {
        va.a(this.g, resources.getString(p.btn_repeat));
        va.a(this.h, resources.getString(p.btn_shuffle));
    }

    public void f(boolean z) {
        if (z) {
            this.h.setImageResource(h.ic_shuffle_active);
        } else {
            this.h.setImageResource(h.ic_shuffle_inactive);
        }
    }

    /* renamed from: a */
    public void onDestroyView(Fragment fragment) {
        this.b.f();
        this.j.setAdapter(null);
        this.j.setLayoutManager(null);
        G();
        this.a.b();
    }

    public void a(int i2, boolean z) {
        if (z) {
            this.j.j(i2);
        } else {
            this.j.i(i2);
        }
    }

    public void a(int i2, int i3) {
        this.b.d(i2, i3);
    }

    public void a(List<Va> list) {
        this.b.f();
        for (Va a2 : list) {
            this.b.a(a2);
        }
        this.b.e();
    }
}
