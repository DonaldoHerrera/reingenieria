package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.FragmentActivity;
import com.facebook.B;
import com.facebook.C0594t;
import com.facebook.internal.oa.a;
import com.facebook.internal.oa.c;
import com.google.android.gms.common.internal.ImagesContract;

/* renamed from: com.facebook.internal.q reason: case insensitive filesystem */
/* compiled from: FacebookDialogFragment */
public class C0556q extends C0361c {
    private Dialog a;

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.a instanceof oa) && isResumed()) {
            ((oa) this.a).e();
        }
    }

    public void onCreate(Bundle bundle) {
        oa oaVar;
        super.onCreate(bundle);
        if (this.a == null) {
            FragmentActivity activity = getActivity();
            Bundle c = Z.c(activity.getIntent());
            String str = "FacebookDialogFragment";
            if (!c.getBoolean("is_fallback", false)) {
                String string = c.getString("action");
                Bundle bundle2 = c.getBundle("params");
                if (ia.b(string)) {
                    ia.b(str, "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                }
                a aVar = new a(activity, string, bundle2);
                aVar.a(new C0554o(this));
                oaVar = aVar.a();
            } else {
                String string2 = c.getString(ImagesContract.URL);
                if (ia.b(string2)) {
                    ia.b(str, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                oaVar = C0562x.a(activity, string2, String.format("fb%s://bridge/", new Object[]{B.f()}));
                oaVar.a((c) new C0555p(this));
            }
            this.a = oaVar;
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.a == null) {
            a((Bundle) null, (C0594t) null);
            setShowsDialog(false);
        }
        return this.a;
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        Dialog dialog = this.a;
        if (dialog instanceof oa) {
            ((oa) dialog).e();
        }
    }

    public void a(Dialog dialog) {
        this.a = dialog;
    }

    /* access modifiers changed from: private */
    public void a(Bundle bundle, C0594t tVar) {
        FragmentActivity activity = getActivity();
        activity.setResult(tVar == null ? -1 : 0, Z.a(activity.getIntent(), bundle, tVar));
        activity.finish();
    }

    /* access modifiers changed from: private */
    public void a(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
