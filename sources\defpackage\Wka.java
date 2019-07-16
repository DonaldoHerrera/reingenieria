package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0325l.a;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.payments.Fa.h;
import com.soundcloud.android.payments.Fa.p;
import com.soundcloud.android.view.customfontviews.b;

/* renamed from: Wka reason: default package */
/* compiled from: AlreadySubscribedDialog */
public class Wka extends C3966cla {
    private final OnClickListener b = new Pka(this);

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).a(h.dialog_payment_error, p.payments_error_title_already_subscribed, p.payments_error_already_subscribed).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(17039370, this.b);
        return aVar.a();
    }

    public /* bridge */ /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public static void a(C0370l lVar) {
        C5232QGa.a((C0361c) new Wka(), lVar, "payment_error");
    }
}
