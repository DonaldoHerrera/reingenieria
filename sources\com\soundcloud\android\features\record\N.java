package com.soundcloud.android.features.record;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.C0325l;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.features.record.B.a;
import com.soundcloud.android.features.record.G.g;
import com.soundcloud.android.features.record.G.h;
import com.soundcloud.android.features.record.G.i;
import com.soundcloud.android.features.record.G.n;
import com.soundcloud.android.utilities.android.q;
import com.soundcloud.android.view.customfontviews.b;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import java.io.IOException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: RecordPresenter */
public class N extends DefaultSupportFragmentLightCycle<Fragment> implements a {
    private Typeface a;
    private Typeface b;
    private ViewGroup c;
    private ChronometerView d;
    private ImageButton e;
    private TextView f;
    private View g;
    private View h;
    private ImageButton i;
    private ImageButton j;
    private View k;
    private View l;
    private SwitchCompat m;
    private ViewGroup n;
    private ImageButton o;
    private final S p;
    private final q q;
    private final ba r;
    private B s;
    /* access modifiers changed from: private */
    public RecordFragment.a t;
    private VPa u = WPa.a();
    private Map<View, C0247Qb<BitSet, Integer>> v;
    /* access modifiers changed from: private */
    public RecordFragment w;
    private J x;
    private final BroadcastReceiver y = new L(this);

    N(S s2, q qVar, ba baVar, J j2) {
        this.p = s2;
        this.q = qVar;
        this.r = baVar;
        this.x = j2;
    }

    private void h() {
        Context context = this.w.getContext();
        this.u = (VPa) this.p.a(context, ba.a(context)).a(RPa.a()).c(C7362sua.a((C6776kQa<T>) new C3655g<T>(this)));
        this.p.b(context, ba.b(context)).g();
    }

    private void q(View view) {
        this.c = (ViewGroup) view.findViewById(i.gauge_holder);
        this.d = (ChronometerView) view.findViewById(i.chronometer);
        this.e = (ImageButton) view.findViewById(i.btn_action);
        this.f = (TextView) view.findViewById(i.action_text);
        this.g = view.findViewById(i.btn_next);
        this.h = view.findViewById(i.btn_delete);
        this.i = (ImageButton) view.findViewById(i.btn_play);
        this.j = (ImageButton) view.findViewById(i.btn_edit);
        this.k = view.findViewById(i.btn_revert);
        this.l = view.findViewById(i.btn_apply);
        this.m = (SwitchCompat) view.findViewById(i.toggle_fade);
        this.n = (ViewGroup) view.findViewById(i.edit_controls);
        this.o = (ImageButton) view.findViewById(i.btn_play_edit);
        this.e.setOnClickListener(new C3651c(this));
        this.h.setOnClickListener(new C3660l(this));
        this.k.setOnClickListener(new C3657i(this));
        this.g.setOnClickListener(new C3662n(this));
        this.l.setOnClickListener(new C3658j(this));
        this.o.setOnClickListener(new C3656h(this));
        this.i.setOnClickListener(new C3659k(this));
        this.j.setOnClickListener(new C3661m(this));
        this.m.setOnCheckedChangeListener(new C3654f(this));
    }

    private void r() {
        v();
    }

    private void s() {
        a(this.t.c() ? RecordFragment.a.PLAYBACK : RecordFragment.a.IDLE_PLAYBACK);
    }

    private void t() {
        this.w.getActivity().setIntent(this.x.a(J.a.VIEW));
    }

    private void u() {
        a(n.dialog_confirm_delete_recording_message);
    }

    private void v() {
        C0325l.a aVar = new C0325l.a(this.w.getActivity());
        aVar.b(new b(this.w.getActivity()).c(n.dialog_revert_recording_message).a());
        aVar.a(n.btn_no, (OnClickListener) null);
        aVar.c(n.btn_yes, (OnClickListener) new C3652d(this));
        aVar.c();
    }

    private void w() {
        try {
            this.r.q();
            this.s.b();
        } catch (IOException unused) {
            a(RecordFragment.a.IDLE_RECORD);
        }
    }

    private void x() {
        this.m.setChecked(this.r.t());
    }

    /* renamed from: c */
    public void onResume(Fragment fragment) {
        if (this.t == null) {
            this.t = RecordFragment.a.IDLE_RECORD;
        }
        this.r.b(false);
        if (m()) {
            j();
        } else {
            h();
        }
        a(this.t.b() ? Yca.RECORD_EDIT : Yca.RECORD_MAIN);
    }

    /* renamed from: d */
    public void onStart(Fragment fragment) {
        this.w = (RecordFragment) fragment;
        IntentFilter b2 = ba.b();
        b2.addAction("android.intent.action.MEDIA_MOUNTED");
        b2.addAction("android.intent.action.MEDIA_REMOVED");
        C1600pd.a((Context) this.w.getActivity()).a(this.y, b2);
    }

    /* renamed from: e */
    public void onStop(Fragment fragment) {
        C1600pd.a((Context) this.w.getActivity()).a(this.y);
        this.w = null;
    }

    public void g() {
        this.r.a(false);
        this.s.c();
        a(RecordFragment.a.IDLE_RECORD);
    }

    public /* synthetic */ void i(View view) {
        o();
    }

    public /* synthetic */ void j(View view) {
        u();
    }

    public /* synthetic */ void k(View view) {
        r();
    }

    public /* synthetic */ void l(View view) {
        n();
    }

    public /* synthetic */ void m(View view) {
        s();
    }

    public /* synthetic */ void n(View view) {
        q();
    }

    public /* synthetic */ void o(View view) {
        q();
    }

    public /* synthetic */ void p(View view) {
        p();
    }

    private void i() {
        long a2 = this.r.a();
        long c2 = this.r.c();
        if ((a2 > 0 || this.r.k()) && a2 < c2) {
            this.d.a(a2, c2);
            this.s.setProgress(((float) a2) / ((float) c2));
            return;
        }
        this.d.setDurationOnly(c2);
        this.s.setProgress(-1.0f);
    }

    private void j() {
        RecordFragment.a aVar = this.t;
        if (this.r.l()) {
            aVar = RecordFragment.a.RECORD;
        } else if (this.r.k()) {
            if (this.t != RecordFragment.a.EDIT_PLAYBACK) {
                aVar = RecordFragment.a.PLAYBACK;
            }
            i();
            this.s.a(false);
        } else if (m()) {
            if (this.t != RecordFragment.a.EDIT) {
                aVar = RecordFragment.a.IDLE_PLAYBACK;
            }
            i();
            this.s.a(false);
        } else {
            aVar = RecordFragment.a.IDLE_RECORD;
        }
        a(aVar);
    }

    private void k() {
        this.w.getActivity().setTitle(this.t.a());
    }

    private void l() {
        for (Entry entry : this.v.entrySet()) {
            if (((BitSet) ((C0247Qb) entry.getValue()).a).get(this.t.ordinal())) {
                C5466YFa.b((View) entry.getKey(), true);
            } else {
                C5466YFa.a((View) entry.getKey(), ((Integer) ((C0247Qb) entry.getValue()).b).intValue(), false);
            }
        }
    }

    private boolean m() {
        Recording e2 = this.r.e();
        return e2 != null && !e2.d(this.w.getContext());
    }

    private void n() {
        ((K) this.w.getActivity()).a(true);
    }

    private void o() {
        if (this.t == RecordFragment.a.RECORD) {
            this.r.s();
        } else {
            w();
        }
    }

    private void p() {
        a(this.t.c() ? RecordFragment.a.EDIT_PLAYBACK : RecordFragment.a.EDIT);
        ((_ca) this.w.getActivity()).a(new Zca(Yca.RECORD_EDIT));
    }

    /* renamed from: b */
    public void onCreate(Fragment fragment, Bundle bundle) {
        this.w = (RecordFragment) fragment;
        this.b = com.soundcloud.android.view.customfontviews.a.a(fragment.getContext(), "fonts/InterstateSound_Pnum-Light_fbsTfohiYZ.ttf");
        this.a = com.soundcloud.android.view.customfontviews.a.a(fragment.getContext(), "fonts/InterstateSound_Tnum-Light_fbdOS9y3d6.ttf");
        if (bundle == null) {
            this.t = RecordFragment.a.IDLE_RECORD;
        }
    }

    /* access modifiers changed from: private */
    public void a(List<Recording> list) {
        if (!list.isEmpty()) {
            this.r.a((Recording) list.get(0));
        }
        j();
    }

    /* renamed from: b */
    public void onPause(Fragment fragment) {
        this.u.dispose();
        this.r.r();
        if (this.w.getActivity().isFinishing() || !this.w.getActivity().isChangingConfigurations()) {
            this.r.b(true);
        }
    }

    /* renamed from: c */
    public void onSaveInstanceState(Fragment fragment, Bundle bundle) {
        bundle.putString("createCurrentCreateState", this.t.name());
        B b2 = this.s;
        if (b2 != null) {
            b2.b(bundle);
        }
    }

    private void a(Yca yca) {
        ((_ca) this.w.getActivity()).a(new Zca(yca));
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        q(view);
        this.v = new HashMap();
        b(this.e, 8, RecordFragment.a.IDLE_RECORD, RecordFragment.a.IDLE_PLAYBACK, RecordFragment.a.RECORD, RecordFragment.a.PLAYBACK);
        this.e.setEnabled(false);
        a((View) this.d, 4, RecordFragment.a.IDLE_RECORD, RecordFragment.a.IDLE_PLAYBACK, RecordFragment.a.RECORD, RecordFragment.a.PLAYBACK, RecordFragment.a.EDIT, RecordFragment.a.EDIT_PLAYBACK);
        a(this.g, 8, RecordFragment.a.PLAYBACK, RecordFragment.a.IDLE_PLAYBACK);
        a(this.h, 8, RecordFragment.a.PLAYBACK, RecordFragment.a.IDLE_PLAYBACK);
        a(this.k, 8, RecordFragment.a.EDIT, RecordFragment.a.EDIT_PLAYBACK);
        a(this.l, 8, RecordFragment.a.EDIT, RecordFragment.a.EDIT_PLAYBACK);
        a((View) this.m, 8, RecordFragment.a.EDIT, RecordFragment.a.EDIT_PLAYBACK);
        a((View) this.o, 8, RecordFragment.a.EDIT, RecordFragment.a.EDIT_PLAYBACK);
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            a((View) viewGroup, 8, RecordFragment.a.EDIT, RecordFragment.a.EDIT_PLAYBACK);
            a((View) this.i, 8, RecordFragment.a.IDLE_PLAYBACK, RecordFragment.a.PLAYBACK);
            a((View) this.j, 8, RecordFragment.a.IDLE_PLAYBACK, RecordFragment.a.PLAYBACK);
            b(this.f, 8, RecordFragment.a.IDLE_RECORD, RecordFragment.a.IDLE_PLAYBACK, RecordFragment.a.RECORD, RecordFragment.a.PLAYBACK);
        } else {
            a((View) this.i, 8, RecordFragment.a.IDLE_PLAYBACK, RecordFragment.a.PLAYBACK);
            a((View) this.j, 8, RecordFragment.a.IDLE_PLAYBACK, RecordFragment.a.PLAYBACK);
            a((View) this.f, 8, new RecordFragment.a[0]);
        }
        this.q.a(this.e, view.getResources().getDimensionPixelSize(g.rec_record_button_dimension));
        this.s = new B(view.getContext(), this.x);
        this.s.setTrimListener(this);
        if (bundle != null) {
            this.s.a(bundle);
        }
        this.c.addView(this.s);
        a(fragment.getActivity().getIntent());
    }

    public void b(float f2, long j2) {
        this.r.a(f2, j2);
        i();
    }

    private void b(View view, int i2, RecordFragment.a... aVarArr) {
        this.v.put(view, new C0247Qb(a(aVarArr), Integer.valueOf(i2)));
    }

    private void b(boolean z) {
        if (z) {
            this.i.setImageResource(h.ic_record_pause);
            this.o.setImageResource(h.ic_record_pause);
            return;
        }
        this.i.setImageResource(h.ic_record_play);
        this.o.setImageResource(h.ic_record_play);
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        this.r.o();
        a(this.t.c() ? RecordFragment.a.PLAYBACK : RecordFragment.a.IDLE_PLAYBACK);
    }

    private void q() {
        this.r.u();
    }

    public /* synthetic */ void a(CompoundButton compoundButton, boolean z) {
        x();
    }

    /* renamed from: a */
    public void onDestroyView(Fragment fragment) {
        this.s.a();
    }

    /* renamed from: a */
    public void onActivityCreated(Fragment fragment, Bundle bundle) {
        if (bundle != null) {
            String str = "createCurrentCreateState";
            if (!bundle.containsKey(str)) {
                this.t = RecordFragment.a.valueOf(bundle.getString(str));
                return;
            }
        }
        this.t = RecordFragment.a.IDLE_RECORD;
    }

    public void a(float f2) {
        this.r.a(f2);
    }

    public void a(float f2, long j2) {
        this.r.b(f2, j2);
        i();
    }

    /* access modifiers changed from: private */
    public void a(float f2, boolean z) {
        this.s.a(f2, z);
    }

    /* access modifiers changed from: private */
    public void a(long j2) {
        this.d.setDurationOnly(j2);
    }

    public void a(long j2, long j3) {
        if (j3 != 0) {
            this.d.a(j2, j3);
            this.s.setProgress(((float) Math.max(0, Math.min(j2, j3))) / ((float) j3));
        }
    }

    private void a(View view, int i2, RecordFragment.a... aVarArr) {
        b(view, i2, aVarArr);
        C5466YFa.a(view, i2, false);
    }

    /* access modifiers changed from: private */
    public void a(RecordFragment.a aVar) {
        this.t = aVar;
        int i2 = M.a[this.t.ordinal()];
        if (i2 == 1) {
            a(false);
            if (this.w.isResumed() && !m()) {
                this.r.a(true);
                this.r.p();
            }
            this.d.setTypeface(this.b);
            this.d.setText(n.record_instructions);
        } else if (i2 == 2) {
            a(true);
            this.d.setTypeface(this.a);
            this.d.setDurationOnly(this.r.f());
        } else if (i2 == 3) {
            a(false);
            this.s.a(true);
            i();
        } else if (i2 == 4) {
            this.e.setImageResource(h.ic_record_record_white);
        } else if (i2 == 5) {
            i();
        }
        this.m.setChecked(this.r.j());
        k();
        l();
        this.s.setIsEditing(this.t.b());
        b(this.t.c());
    }

    private BitSet a(RecordFragment.a... aVarArr) {
        BitSet bitSet = new BitSet(RecordFragment.a.values().length);
        for (RecordFragment.a ordinal : aVarArr) {
            bitSet.set(ordinal.ordinal());
        }
        return bitSet;
    }

    private void a(boolean z) {
        if (z) {
            this.e.setBackgroundResource(h.rec_white_button);
            this.e.setImageResource(h.ic_record_record_orange);
            this.f.setText(this.w.getString(n.record_tap_to_pause));
        } else {
            this.e.setBackgroundResource(h.rec_button_ripple_selector);
            this.e.setImageResource(h.ic_record_record_white);
            RecordFragment.a aVar = this.t;
            if (aVar == RecordFragment.a.IDLE_PLAYBACK || aVar == RecordFragment.a.PLAYBACK) {
                this.f.setText(this.w.getString(n.record_tap_to_resume));
            } else {
                this.f.setText(this.w.getString(n.record_tap_to_record));
            }
        }
        this.e.setEnabled(C6630iGa.a());
    }

    private void a(int i2) {
        C0325l.a aVar = new C0325l.a(this.w.getActivity());
        aVar.b(new b(this.w.getActivity()).c(i2).a());
        aVar.a(n.btn_no, (OnClickListener) null);
        aVar.c(n.btn_yes, (OnClickListener) new C3653e(this));
        aVar.c();
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        this.r.a(true);
        this.s.c();
        h();
    }

    private void a(Intent intent) {
        int i2 = M.b[this.x.a(intent).ordinal()];
        if (i2 == 1) {
            if (!this.r.l()) {
                g();
                w();
            }
            t();
        } else if (i2 == 2) {
            if (this.r.l()) {
                this.r.s();
            }
            t();
        }
    }
}
