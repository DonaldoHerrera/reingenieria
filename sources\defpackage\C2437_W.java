package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0325l.a;
import com.soundcloud.android.accounts.LogoutActivity;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;

/* renamed from: _W reason: default package and case insensitive filesystem */
/* compiled from: TokenExpiredDialogFragment */
public class C2437_W extends C2418ZW {
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        LogoutActivity.a(getActivity());
        dismiss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).c(p.error_unauthorized_title).b(p.error_unauthorized_message).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(p.pref_revoke_access, (OnClickListener) new C2399YW(this));
        return aVar.a();
    }
}
