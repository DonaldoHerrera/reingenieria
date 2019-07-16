package com.soundcloud.android.offline;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0325l.a;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;

@SuppressLint({"ValidFragment"})
/* compiled from: OfflineLikesDialog */
public class Od extends C2418ZW implements OnClickListener {
    C4197yd b;
    F c;
    C3700b d;

    public Od() {
        SoundCloudApplication.f().a(this);
    }

    public void a(C0370l lVar) {
        C5232QGa.a((C0361c) this, lVar, "OfflineLikes");
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.f().a((C7117pPa) new C4943Gua());
        this.d.a((J) C3924zaa.e(this.c.a()));
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).c(p.offline_likes_dialog_title).b(p.offline_likes_dialog_message).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(p.make_offline_available, (OnClickListener) this);
        aVar.a(p.btn_cancel, (OnClickListener) null);
        return aVar.a();
    }
}
