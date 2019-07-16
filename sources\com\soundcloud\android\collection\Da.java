package com.soundcloud.android.collection;

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
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.view.customfontviews.b;

/* compiled from: ConfirmRemoveOfflineDialogFragment */
public class Da extends C2418ZW {
    C4197yd b;
    F c;
    C3700b d;

    public Da() {
        SoundCloudApplication.f().a(this);
    }

    private void Rb() {
        this.b.b();
        this.d.a((J) C3924zaa.a(this.c.a(), Sb() ? C4928GKa.c(Ub()) : C4928GKa.a()));
    }

    private boolean Sb() {
        return getArguments() != null && getArguments().containsKey("PlaylistUrn");
    }

    private boolean Tb() {
        return getArguments() != null && getArguments().getBoolean("IsFromLikedTracks", false);
    }

    private C3508cda Ub() {
        return C5526_Ha.b(getArguments(), "PlaylistUrn");
    }

    private void Vb() {
        if (Sb()) {
            f(Ub());
        } else {
            Xb();
        }
    }

    private PromotedSourceInfo Wb() {
        return (PromotedSourceInfo) getArguments().getParcelable("PromotedSourceInfo");
    }

    private void Xb() {
        this.b.d().a((C7117pPa) new C4943Gua());
        this.d.a((J) C3924zaa.h(this.c.a()));
    }

    public static void a(C0370l lVar, C3508cda cda, PromotedSourceInfo promotedSourceInfo) {
        Da da = new Da();
        Bundle bundle = new Bundle();
        C5526_Ha.b(bundle, "PlaylistUrn", cda);
        bundle.putParcelable("PromotedSourceInfo", promotedSourceInfo);
        da.setArguments(bundle);
        C5232QGa.a((C0361c) da, lVar, "RemoveOffline");
    }

    private void f(C3508cda cda) {
        this.b.c(cda).a((C7117pPa) new C4943Gua());
        this.d.a((J) C3924zaa.b(this.c.a(), cda, Wb()));
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).c(p.disable_offline_collection_from_context_title).b(f(Tb())).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(17039370, (OnClickListener) new C2745f(this));
        aVar.a(17039360, (OnClickListener) null);
        return aVar.a();
    }

    public static void a(C0370l lVar) {
        Da da = new Da();
        Bundle bundle = new Bundle();
        bundle.putBoolean("IsFromLikedTracks", true);
        da.setArguments(bundle);
        C5232QGa.a((C0361c) da, lVar, "RemoveOffline");
    }

    private int f(boolean z) {
        return z ? p.remove_offline_content_dialog_body_for_liked_tracks : p.disable_offline_collection_from_context_body;
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        if (this.b.j()) {
            Rb();
        }
        Vb();
    }
}
