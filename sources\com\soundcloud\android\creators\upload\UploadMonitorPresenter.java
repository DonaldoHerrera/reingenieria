package com.soundcloud.android.creators.upload;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.creators.record.RecordActivity;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.qa;
import com.soundcloud.android.utilities.android.q;
import com.soundcloud.android.view.CircularProgressBar;
import com.soundcloud.android.view.customfontviews.b;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;

public class UploadMonitorPresenter extends SupportFragmentLightCycleDispatcher<Fragment> {
    private final Handler a = new Handler();
    private final qa b;
    private final C2350WH<Xaa> c;
    private final C2526g d;
    private final C3792iea e;
    private final q f;
    /* access modifiers changed from: private */
    public boolean g = false;
    /* access modifiers changed from: private */
    public boolean h = false;
    private Recording i;
    private VPa j = WPa.a();
    private VPa k = WPa.a();
    private UploadMonitorFragment l;
    private TextView m;
    private TextView n;
    private TextView o;
    private ImageView p;
    private TextView q;
    private CircularProgressBar r;
    private ImageButton s;
    private Button t;

    private final class a extends C5037Jua<Xaa> {
        private a() {
        }

        public void a(Xaa xaa) {
            if (!UploadMonitorPresenter.this.h) {
                int a = xaa.a();
                UploadMonitorPresenter.this.g = xaa.v();
                UploadMonitorPresenter.this.b(xaa.b());
                if (xaa.n()) {
                    UploadMonitorPresenter.this.B();
                } else if (xaa.h()) {
                    UploadMonitorPresenter.this.B();
                } else if (xaa.o()) {
                    UploadMonitorPresenter.this.c(a);
                } else if (xaa.g()) {
                    UploadMonitorPresenter.this.a(xaa);
                } else if (xaa.d()) {
                    UploadMonitorPresenter.this.h = true;
                    UploadMonitorPresenter.this.w();
                }
            }
        }
    }

    public UploadMonitorPresenter(C2350WH<Xaa> wh, qa qaVar, C2526g gVar, C3792iea iea, q qVar) {
        this.c = wh;
        this.b = qaVar;
        this.d = gVar;
        this.e = iea;
        this.f = qVar;
    }

    private void A() {
        this.t.setVisibility(8);
        this.s.setEnabled(false);
        this.r.setVisibility(0);
        this.r.setIndeterminate(true);
        this.q.setText(p.uploader_event_cancelling);
    }

    /* access modifiers changed from: private */
    public void B() {
        C();
        this.r.setIndeterminate(true);
        this.q.setText(p.uploader_event_processing_your_sound);
    }

    private void C() {
        this.t.setVisibility(0);
        this.s.setBackgroundResource(h.rec_white_button);
        this.s.setImageResource(h.ic_record_upload_white);
        this.s.setEnabled(false);
        this.r.setVisibility(0);
    }

    private void D() {
        androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(this.l.getActivity());
        aVar.b(new b(this.l.getActivity()).c(p.dialog_cancel_upload_message).a());
        aVar.c(p.btn_yes, (OnClickListener) new f(this));
        aVar.a(p.btn_no, (OnClickListener) null);
        C5232QGa.a((Dialog) aVar.a());
    }

    /* access modifiers changed from: private */
    public void w() {
        this.a.postDelayed(new i(this), 2000);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void v() {
        RecordActivity recordActivity = (RecordActivity) this.l.getActivity();
        if (recordActivity != null) {
            recordActivity.C();
        }
    }

    private void y() {
        if (this.g) {
            D();
        } else {
            v();
        }
    }

    private void z() {
        if (!this.g) {
            RecordActivity recordActivity = (RecordActivity) this.l.getActivity();
            recordActivity.c(this.i);
            recordActivity.b(this.i);
        }
    }

    private void c(View view) {
        this.m = (TextView) view.findViewById(i.track);
        this.n = (TextView) view.findViewById(i.track_username);
        this.o = (TextView) view.findViewById(i.track_duration);
        this.p = (ImageView) view.findViewById(i.icon);
        this.q = (TextView) view.findViewById(i.upload_status_text);
        this.r = (CircularProgressBar) view.findViewById(i.upload_progress);
        this.s = (ImageButton) view.findViewById(i.btn_action);
        this.t = (Button) view.findViewById(i.btn_cancel);
        this.s.setOnClickListener(new g(this));
        this.t.setOnClickListener(new h(this));
    }

    public /* synthetic */ void b(View view) {
        y();
    }

    /* renamed from: b */
    public void onResume(Fragment fragment) {
        super.onResume(fragment);
        ((RecordActivity) this.l.getActivity()).a(Yca.RECORD_PROGRESS);
        this.h = false;
        this.j = (VPa) this.c.a(RPa.a()).c(new a());
    }

    /* renamed from: a */
    public void onCreate(Fragment fragment, Bundle bundle) {
        super.onCreate(fragment, bundle);
        this.l = (UploadMonitorFragment) fragment;
        this.l.getActivity().setTitle(p.btn_upload);
    }

    /* access modifiers changed from: private */
    public void b(Recording recording) {
        if (recording != null) {
            a(recording);
        }
    }

    private int b(int i2) {
        return this.l.getResources().getDimensionPixelSize(i2);
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        super.onViewCreated(fragment, view, bundle);
        c(view);
        a((View) this.s, g.rec_upload_button_dimension);
        a((View) this.r, g.rec_upload_progress_dimension);
        b((Recording) this.l.getArguments().getParcelable("recording"));
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        if (i2 < 0) {
            B();
            return;
        }
        int max = Math.max(0, Math.min(100, i2));
        C();
        this.r.setIndeterminate(false);
        this.r.setProgress(max);
        this.q.setText(this.l.getString(p.uploader_event_uploading_percent, Integer.valueOf(max)));
    }

    public /* synthetic */ void a(View view) {
        z();
    }

    /* renamed from: a */
    public void onPause(Fragment fragment) {
        this.j.dispose();
        this.k.dispose();
        super.onPause(fragment);
    }

    private void a(Recording recording) {
        if (!recording.equals(this.i)) {
            this.i = recording;
            this.m.setText(recording.e(this.l.getContext()));
            this.o.setText(recording.b());
            this.k.dispose();
            this.k = this.e.b(this.d.c()).a(RPa.a()).c((C6776kQa<? super T>) new j<Object>(this));
            if (recording.J()) {
                C4740AIa.a(recording.e(), this.p, b(g.record_progress_icon_width), b(g.share_progress_icon_height));
            } else {
                this.p.setImageDrawable(this.b.a(String.valueOf(recording.hashCode())));
            }
        }
    }

    public /* synthetic */ void a(C3784hea hea) throws Exception {
        this.n.setText(hea.c);
    }

    /* access modifiers changed from: private */
    public void a(Xaa xaa) {
        this.r.setVisibility(4);
        if (xaa.u()) {
            this.t.setVisibility(8);
            this.s.setBackgroundResource(h.rec_button_ripple_selector);
            this.s.setImageResource(h.ic_record_check_white);
            this.s.setEnabled(false);
            this.q.setText(p.recording_upload_finished);
            w();
            return;
        }
        this.t.setVisibility(0);
        this.s.setBackgroundResource(h.rec_button_ripple_selector);
        this.s.setImageResource(h.ic_record_refresh_white);
        this.s.setEnabled(true);
        if (xaa.f()) {
            this.q.setText(p.recording_upload_failed_quota);
        } else {
            this.q.setText(p.recording_upload_failed);
        }
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        if (this.g) {
            this.g = false;
            A();
            this.c.accept(Xaa.a(this.i));
        }
    }

    private void a(View view, int i2) {
        this.f.a(view, b(i2));
    }
}
