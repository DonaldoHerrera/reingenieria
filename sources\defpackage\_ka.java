package defpackage;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.B;
import androidx.appcompat.app.C0325l.a;
import com.soundcloud.android.payments.Fa.p;
import com.soundcloud.android.view.customfontviews.b;

/* renamed from: _ka reason: default package */
/* compiled from: PlanConversionErrorDialog */
public class _ka extends B {
    private String Qb() {
        String string = getString(p.plan_conversion_error_message_generic);
        return getArguments() == null ? string : getArguments().getString("plan_conversion_error_message", string);
    }

    public static _ka c(String str) {
        _ka _ka = new _ka();
        Bundle bundle = new Bundle();
        bundle.putString("plan_conversion_error_message", str);
        _ka.setArguments(bundle);
        return _ka;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).c(p.plan_conversion_error_dialog_title).a(Qb()).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(17039370, (OnClickListener) null);
        return aVar.a();
    }
}
