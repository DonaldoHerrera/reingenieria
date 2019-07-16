package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.C0325l.a;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.properties.j;

/* renamed from: Xoa reason: default package and case insensitive filesystem */
/* compiled from: CreatePlaylistDialogFragment */
public class C5449Xoa extends C2418ZW {
    C4909Fra b;
    C4197yd c;
    C5327TLa d;
    C3700b e;
    j f;
    C2436_U g;
    C4088fe h;
    private EditText i;
    private CheckBox j;
    private CheckBox k;

    public C5449Xoa() {
        SoundCloudApplication.f().a(this);
    }

    private C3710l Rb() {
        return C3710l.a();
    }

    private void Sb() {
        if (this.g.l() && this.h.k() && !this.c.j()) {
            this.k.setVisibility(0);
        }
    }

    private static C5449Xoa a(Bundle bundle) {
        C5449Xoa xoa = new C5449Xoa();
        xoa.setArguments(bundle);
        return xoa;
    }

    public static C5449Xoa b(long j2) {
        return a(c(j2));
    }

    private static Bundle c(long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("TRACK_ID", j2);
        return bundle;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View inflate = View.inflate(getActivity(), l.dialog_create_new_playlist, null);
        a(inflate);
        Sb();
        a aVar = new a(getActivity());
        aVar.b(inflate);
        aVar.c(p.btn_done, (OnClickListener) new C7212qoa(this));
        aVar.a(p.btn_cancel, (OnClickListener) null);
        return aVar.a();
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        String trim = this.i.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            Toast.makeText(getActivity(), p.error_new_playlist_blank_title, 0).show();
            return;
        }
        a(trim, this.j.isChecked(), this.k.isChecked());
        Toast.makeText(getActivity(), p.added_to_playlist, 0).show();
        dismiss();
    }

    private void a(View view) {
        this.i = (EditText) view.findViewById(16908291);
        this.j = (CheckBox) view.findViewById(i.chk_private);
        this.k = (CheckBox) view.findViewById(i.chk_offline);
    }

    public void a(C0370l lVar) {
        C5232QGa.a((C0361c) this, lVar, "create_new_set_dialog");
    }

    private void a(String str, boolean z, boolean z2) {
        this.b.a(str, z, z2, C3508cda.d(getArguments().getLong("TRACK_ID"))).a((KPa<? super T>) new C5068Kua<Object>());
        this.e.a((J) K.a(Rb()));
    }
}
