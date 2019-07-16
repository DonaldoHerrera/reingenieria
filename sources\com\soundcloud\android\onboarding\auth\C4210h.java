package com.soundcloud.android.onboarding.auth;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.C0325l;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import java.util.HashMap;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0003\t\n\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, d2 = {"Lcom/soundcloud/android/onboarding/auth/AcceptTermsFragment;", "Lcom/soundcloud/android/dialog/LoggingDialogFragment;", "()V", "acceptTermsHandler", "Lcom/soundcloud/android/onboarding/auth/AcceptTermsFragment$AcceptTermsHandler;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "AcceptTermsHandler", "Companion", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.onboarding.auth.h reason: case insensitive filesystem */
/* compiled from: AcceptTermsFragment.kt */
public class C4210h extends C2418ZW {
    public static final b b = new b(null);
    private HashMap c;

    /* renamed from: com.soundcloud.android.onboarding.auth.h$a */
    /* compiled from: AcceptTermsFragment.kt */
    public interface a {
        void a(pa paVar, Bundle bundle);

        void c();

        void k();

        void o();

        void p();
    }

    /* renamed from: com.soundcloud.android.onboarding.auth.h$b */
    /* compiled from: AcceptTermsFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: com.soundcloud.android.onboarding.auth.h$c */
    /* compiled from: AcceptTermsFragment.kt */
    public static final class c {
        public final C4210h a(pa paVar, Bundle bundle) {
            C4210h hVar = new C4210h();
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("BUNDLE_TERMS_SIGNUP_PARAMS", bundle);
            if (paVar != null) {
                bundle2.putString("BUNDLE_TERMS_SIGNUP_VIA", paVar.a());
            }
            hVar.setArguments(bundle2);
            return hVar;
        }
    }

    public void Qb() {
        HashMap hashMap = this.c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public a Rb() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof a)) {
            activity = null;
        }
        a aVar = (a) activity;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Activity does not implement AcceptTermsFragment");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View inflate = View.inflate(getContext(), l.accept_terms, null);
        View findViewById = inflate.findViewById(i.message);
        String str = "findViewById(R.id.message)";
        C7471uYa.a((Object) findViewById, str);
        C7315sGa.a((TextView) findViewById, inflate.getResources().getString(p.terms_of_use), new C4211i(this), false, true, 8, null);
        View findViewById2 = inflate.findViewById(i.message);
        C7471uYa.a((Object) findViewById2, str);
        C7315sGa.a((TextView) findViewById2, inflate.getResources().getString(p.privacy_policy), new C4212j(this), false, true, 8, null);
        View findViewById3 = inflate.findViewById(i.message);
        C7471uYa.a((Object) findViewById3, str);
        C7315sGa.a((TextView) findViewById3, inflate.getResources().getString(p.cookie_policy), new C4213k(this), false, true, 8, null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(activity);
                aVar.b(inflate);
                aVar.c(p.auth_disclaimer_button_accept, (OnClickListener) new C4214l(this, arguments));
                aVar.a(p.auth_disclaimer_button_decline, (OnClickListener) new C4215m(this));
                C0325l a2 = aVar.a();
                C7471uYa.a((Object) a2, "AlertDialog.Builder(cont…()\n            }.create()");
                return a2;
            }
            throw new IllegalArgumentException("Missing arguments for AcceptTermsFragment");
        }
        throw new IllegalArgumentException("Null activity when trying to create AcceptTermsFragment");
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Qb();
    }
}
