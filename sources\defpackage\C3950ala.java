package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0325l.a;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.payments.Fa.h;
import com.soundcloud.android.payments.Fa.p;
import com.soundcloud.android.view.customfontviews.b;

/* renamed from: ala reason: default package and case insensitive filesystem */
/* compiled from: StaleCheckoutDialog */
public class C3950ala extends C3966cla {
    private final OnClickListener b = new Ska(this);

    private void Sb() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(getString(p.url_contact_support))));
        }
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Sb();
        }
        dismiss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).a(h.dialog_payment_error, p.payments_error_title_stale, p.payments_error_stale).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(p.contact_support, this.b);
        aVar.a(17039360, this.b);
        return aVar.a();
    }

    public /* bridge */ /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public static void a(C0370l lVar) {
        C5232QGa.a((C0361c) new C3950ala(), lVar, "payment_error");
    }
}
