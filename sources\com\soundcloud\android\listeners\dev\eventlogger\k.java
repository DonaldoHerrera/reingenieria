package com.soundcloud.android.listeners.dev.eventlogger;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C0361c;
import androidx.recyclerview.widget.RecyclerView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.view.SmoothScrollLinearLayoutManager;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* compiled from: DevEventLoggerMonitorPresenter */
class k extends DefaultActivityLightCycle<AppCompatActivity> implements a {
    private RecyclerView a;
    Button b;
    private final SmoothScrollLinearLayoutManager c;
    /* access modifiers changed from: private */
    public final C1953BN d;
    /* access modifiers changed from: private */
    public final m e;
    private final HPa f;
    private AppCompatActivity g;
    private VPa h = C4881Eua.a();

    /* compiled from: DevEventLoggerMonitorPresenter */
    private final class a extends C5037Jua<defpackage.C1953BN.a> {
        private a() {
        }

        public void a(defpackage.C1953BN.a aVar) {
            super.a(aVar);
            k.this.e.a(k.this.d.c());
        }
    }

    k(SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager, C1953BN bn, m mVar, HPa hPa) {
        this.c = smoothScrollLinearLayoutManager;
        this.d = bn;
        this.e = mVar;
        this.f = hPa;
    }

    private void x() {
        this.b.setOnClickListener(new a(this));
    }

    private void y() {
        this.e.a((a) this);
        this.a.setLayoutManager(this.c);
        this.a.setAdapter(this.e);
    }

    private void z() {
        this.h = (VPa) this.d.a().a(this.f).c(new a());
    }

    public void a(C2110JM jm) {
        C5232QGa.a((C0361c) e.a(jm), this.g.getSupportFragmentManager(), "DevEventLoggerMonitorDetailsDialog");
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        this.g = appCompatActivity;
        b(appCompatActivity);
        y();
        x();
        z();
    }

    public /* synthetic */ void a(View view) {
        this.d.b();
    }

    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        this.h.dispose();
        this.a = null;
        this.b = null;
        this.g = null;
    }

    private void b(AppCompatActivity appCompatActivity) {
        this.a = (RecyclerView) appCompatActivity.findViewById(i.recycler_view);
        this.b = (Button) appCompatActivity.findViewById(i.delete_all);
    }
}
