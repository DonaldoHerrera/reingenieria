package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0325l.a;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.accounts.LogoutActivity;
import com.soundcloud.android.payments.Fa.h;
import com.soundcloud.android.payments.Fa.p;
import com.soundcloud.android.view.customfontviews.b;

/* renamed from: ela reason: default package and case insensitive filesystem */
/* compiled from: WrongUserDialog */
public class C4551ela extends C3966cla {
    private final OnClickListener b = new Vka(this);

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            LogoutActivity.a(getActivity());
        }
        dismiss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).a(h.dialog_payment_error, p.payments_error_title_wrong_user, p.payments_error_wrong_user).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(p.payments_sign_out, this.b);
        aVar.a(17039360, this.b);
        return aVar.a();
    }

    public /* bridge */ /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public static void a(C0370l lVar) {
        C5232QGa.a((C0361c) new C4551ela(), lVar, "payment_error");
    }
}
