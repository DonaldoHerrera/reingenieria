package com.soundcloud.android.upgrade;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0325l.a;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;

/* compiled from: UnrecoverableErrorDialog */
public class n extends C2418ZW {
    C4581ija b;
    private final OnClickListener c = new m(this);

    public n() {
        SoundCloudApplication.f().a(this);
    }

    public static void a(C0370l lVar) {
        C5232QGa.a((C0361c) new n(), lVar, "go_onboarding_error_dlg");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).c(p.go_onboarding_error_dialog_title).b(p.go_onboarding_error_dialog_msg).a();
        a aVar = new a(getActivity());
        aVar.a(false);
        aVar.b(a);
        aVar.c(p.go_onboarding_error_dialog_button, this.c);
        return aVar.a();
    }
}
