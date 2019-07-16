package com.soundcloud.android.creators.upload;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.creators.record.RecordActivity;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.features.record.ba;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.qa;
import com.soundcloud.android.utilities.android.q;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;

public class MetadataPresenter extends SupportFragmentLightCycleDispatcher<Fragment> {
    private Recording a;
    private MetadataFragment b;
    private ba c;
    private final q d;
    private qa e;
    private RadioGroup f;
    private RadioButton g;
    private RadioButton h;
    private RecordingMetaDataLayout i;
    private ImageButton j;

    public MetadataPresenter(ba baVar, qa qaVar, q qVar) {
        this.c = baVar;
        this.e = qaVar;
        this.d = qVar;
    }

    private void v() {
        if (this.a != null) {
            RecordActivity recordActivity = (RecordActivity) this.b.getActivity();
            a(this.a);
            recordActivity.c(this.a);
            recordActivity.b(this.a);
        }
    }

    private void w() {
        Recording recording = this.a;
        if (recording != null) {
            recording.m = recording.b((Context) this.b.getActivity());
            this.i.setImage(this.a.m);
        }
    }

    private void x() {
        this.a = this.c.e();
        if (this.a != null) {
            if (!this.i.a()) {
                this.i.setPlaceholder(this.e.a(String.valueOf(this.a.hashCode())));
            }
            this.i.a(this.a, true);
            return;
        }
        ((RecordActivity) this.b.getActivity()).B();
    }

    /* renamed from: a */
    public void onCreate(Fragment fragment, Bundle bundle) {
        super.onCreate(fragment, bundle);
        this.b = (MetadataFragment) fragment;
        this.b.getActivity().setTitle(p.btn_post);
    }

    /* renamed from: b */
    public void onPause(Fragment fragment) {
        Recording recording = this.a;
        if (recording != null) {
            this.i.b(recording);
        }
        super.onPause(fragment);
    }

    /* renamed from: c */
    public void onResume(Fragment fragment) {
        super.onResume(fragment);
        x();
        ((RecordActivity) this.b.getActivity()).a(Yca.RECORD_UPLOAD);
    }

    /* renamed from: d */
    public void onStart(Fragment fragment) {
        super.onStart(fragment);
        this.b = (MetadataFragment) fragment;
    }

    /* renamed from: e */
    public void onStop(Fragment fragment) {
        super.onStop(fragment);
        Recording recording = this.a;
        if (recording != null && !recording.o) {
            a(recording);
        }
    }

    private void b(View view) {
        this.f = (RadioGroup) view.findViewById(i.rdo_privacy);
        this.g = (RadioButton) view.findViewById(i.rdo_private);
        this.h = (RadioButton) view.findViewById(i.rdo_public);
        this.i = (RecordingMetaDataLayout) view.findViewById(i.metadata_layout);
        this.j = (ImageButton) view.findViewById(i.btn_action);
        this.j.setOnClickListener(new b(this));
    }

    public void a(int i2, int[] iArr) {
        if (C4739AHa.a(i2, iArr)) {
            this.i.c();
        }
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        super.onViewCreated(fragment, view, bundle);
        b(view);
        this.d.a(this.j, view.getResources().getDimensionPixelSize(g.rec_upload_button_dimension));
        this.j.setImageResource(h.ic_record_upload_orange);
        if (bundle != null) {
            if (bundle.getInt("createPrivacyValue") == i.rdo_private) {
                this.g.setChecked(true);
            } else {
                this.h.setChecked(true);
            }
            this.i.a(bundle);
        }
        this.i.setFragment(this.b);
    }

    /* renamed from: b */
    public void onSaveInstanceState(Fragment fragment, Bundle bundle) {
        bundle.putInt("createPrivacyValue", this.f.getCheckedRadioButtonId());
        this.i.b(bundle);
        super.onSaveInstanceState(fragment, bundle);
    }

    public /* synthetic */ void a(View view) {
        v();
    }

    /* renamed from: a */
    public void onDestroyView(Fragment fragment) {
        super.onDestroyView(fragment);
        RecordingMetaDataLayout recordingMetaDataLayout = this.i;
        if (recordingMetaDataLayout != null) {
            recordingMetaDataLayout.b();
        }
    }

    private void a(Intent intent) {
        FragmentActivity activity = this.b.getActivity();
        Uri fromFile = Uri.fromFile(this.a.b((Context) activity));
        if (intent != null) {
            C4740AIa.a((Activity) activity, intent.getData(), fromFile);
        } else {
            C4740AIa.a((Activity) activity, fromFile);
        }
    }

    private void a(Recording recording) {
        this.i.b(recording);
        recording.g = this.f.getCheckedRadioButtonId() == i.rdo_private;
    }

    public void a(int i2, int i3, Intent intent) {
        if (i2 != 6709) {
            if (i2 != 9000 && i2 != 9001) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown requestCode: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 == -1) {
                a(intent);
            }
        } else if (i3 == -1) {
            w();
        } else if (i3 == 404) {
            Toast.makeText(this.b.getActivity(), p.crop_image_error, 0).show();
        }
    }
}
