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

/* renamed from: dla reason: default package and case insensitive filesystem */
/* compiled from: VerifyIssueDialog */
public class C4543dla extends C3966cla {
    private final OnClickListener b = new Uka(this);

    public static void b(C0370l lVar) {
        a(lVar, p.payments_error_title_verification_timeout);
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).a(h.dialog_payment_error, getArguments().getInt("title_id"), p.payments_error_verification_issue).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(17039370, this.b);
        return aVar.a();
    }

    public /* bridge */ /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public static void a(C0370l lVar) {
        a(lVar, p.payments_error_title_verification_fail);
    }

    private static void a(C0370l lVar, int i) {
        C4543dla dla = new C4543dla();
        Bundle bundle = new Bundle();
        bundle.putInt("title_id", i);
        dla.setArguments(bundle);
        C5232QGa.a((C0361c) dla, lVar, "payment_error");
    }
}
