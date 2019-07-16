package com.soundcloud.android.payments;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.B;
import androidx.appcompat.app.C0325l.a;
import com.soundcloud.android.payments.Fa.p;
import com.soundcloud.android.view.customfontviews.b;

/* compiled from: ConversionRestrictionsDialog */
public class G extends B {
    public static G Qb() {
        return new G();
    }

    private String Rb() {
        if (getArguments() == null) {
            return getString(p.conversion_restrictions_message_no_trial);
        }
        String str = "promo_duration";
        if (getArguments().containsKey(str)) {
            String string = getArguments().getString(str);
            return getString(p.conversion_restrictions_message_promo, string, getArguments().getString("promo_price"), getArguments().getString("promo_regular_price"));
        }
        String str2 = "trial_days";
        if (!getArguments().containsKey(str2)) {
            return getString(p.conversion_restrictions_message_no_trial);
        }
        int i = getArguments().getInt(str2);
        return getString(p.conversion_restrictions_message_trial, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i));
    }

    public static G a(String str, String str2, String str3) {
        G g = new G();
        Bundle bundle = new Bundle();
        bundle.putString("promo_duration", str);
        bundle.putString("promo_price", str2);
        bundle.putString("promo_regular_price", str3);
        g.setArguments(bundle);
        return g;
    }

    public static G c(int i) {
        G g = new G();
        Bundle bundle = new Bundle();
        bundle.putInt("trial_days", i);
        g.setArguments(bundle);
        return g;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).c(p.conversion_restrictions_dialog_title).a(Rb()).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(17039370, (OnClickListener) null);
        return aVar.a();
    }
}
