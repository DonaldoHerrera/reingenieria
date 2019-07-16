package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0325l.a;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;

/* renamed from: Ipa reason: default package and case insensitive filesystem */
/* compiled from: DeletePlaylistDialogFragment */
public class C5000Ipa extends C2418ZW {
    C5600asa b;
    C4863EHa c;

    public C5000Ipa() {
        SoundCloudApplication.f().a(this);
    }

    private void Rb() {
        this.b.a(Sb()).a((KPa<? super T>) new C5068Kua<Object>());
    }

    private C3508cda Sb() {
        return C5526_Ha.b(getArguments(), "PlaylistUrn");
    }

    public static void a(C0370l lVar, C3508cda cda) {
        C5000Ipa ipa = new C5000Ipa();
        Bundle bundle = new Bundle();
        C5526_Ha.b(bundle, "PlaylistUrn", cda);
        ipa.setArguments(bundle);
        C5232QGa.a((C0361c) ipa, lVar, "DeletePlaylist");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).c(p.dialog_playlist_delete_title).b(p.dialog_playlist_delete_message).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(p.delete_playlist, (OnClickListener) new C7281roa(this));
        aVar.a(p.btn_cancel, (OnClickListener) null);
        return aVar.a();
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        Rb();
    }
}
