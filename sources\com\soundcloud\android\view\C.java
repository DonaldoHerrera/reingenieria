package com.soundcloud.android.view;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.ca;
import com.soundcloud.android.image.ca.b;
import com.soundcloud.android.image.ca.c;
import com.soundcloud.android.image.ca.d;
import com.soundcloud.android.image.va;

/* compiled from: FullImageDialog */
public class C extends C2418ZW {
    Context b;
    N c;
    private ViewGroup d;
    private ImageView e;
    private ProgressBar f;
    private final UPa g = new UPa();

    public C() {
        SoundCloudApplication.f().a(this);
    }

    private void Rb() {
        dismiss();
    }

    private void Sb() {
        dismiss();
    }

    private void Tb() {
        this.e = null;
        this.f = null;
        this.d = null;
    }

    public static void a(C0370l lVar, Vca vca) {
        Bundle bundle = new Bundle();
        C5526_Ha.b(bundle, "urn", vca.a());
        bundle.putString("imageUrlTemplate", (String) vca.b().d());
        C c2 = new C();
        c2.setArguments(bundle);
        C5232QGa.a((C0361c) c2, lVar, "FullImage");
    }

    private void b(View view) {
        this.e = (ImageView) view.findViewById(i.image);
        this.f = (ProgressBar) view.findViewById(i.progress);
        this.d = (ViewGroup) view.findViewById(i.full_image);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        b(onCreateDialog);
        a(onCreateDialog);
        a(a(getArguments()));
        return onCreateDialog;
    }

    public void onDestroyView() {
        this.g.b();
        Tb();
        super.onDestroyView();
    }

    private void b(Dialog dialog) {
        Window window = dialog.getWindow();
        window.setLayout(-1, -1);
        window.setFlags(1024, 1024);
        window.requestFeature(1);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    private Vca a(Bundle bundle) {
        return va.a(C5526_Ha.b(getArguments(), "urn"), C4928GKa.b(bundle.getString("imageUrlTemplate")));
    }

    @SuppressLint({"InflateParams"})
    private void a(Dialog dialog) {
        View inflate = LayoutInflater.from(getActivity()).inflate(l.full_image_dialog, null);
        b(inflate);
        dialog.setContentView(inflate);
    }

    private void a(Vca vca) {
        this.g.b((VPa) this.c.b(vca.a(), vca.b(), C3721b.T500, this.e).a(RPa.a()).c(C5220Pua.a((C6776kQa<T>) new C6217f<T>(this))));
    }

    public /* synthetic */ void a(ca caVar) throws Exception {
        if (caVar instanceof d) {
            this.f.setVisibility(0);
        } else if (caVar instanceof c) {
            if (isAdded()) {
                Rb();
            }
        } else if ((caVar instanceof b) && isAdded()) {
            if (((b) caVar).a() == null) {
                Rb();
                return;
            }
            this.e.setVisibility(0);
            this.f.setVisibility(4);
            this.d.setOnClickListener(new C6216e(this));
        }
    }

    public /* synthetic */ void a(View view) {
        Sb();
    }
}
