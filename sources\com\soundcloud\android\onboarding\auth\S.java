package com.soundcloud.android.onboarding.auth;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import androidx.appcompat.app.C0325l;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.onboarding.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/onboarding/auth/GenderPickerDialogFragment;", "Lcom/soundcloud/android/dialog/LoggingDialogFragment;", "()V", "currentGenderIndex", "", "genderOptions", "", "", "()[Ljava/lang/String;", "genderPickerHandler", "Lcom/soundcloud/android/onboarding/auth/GenderPickerDialogFragment$CallbackProvider;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Callback", "CallbackProvider", "Companion", "OnGenderSelected", "base_release"}, mv = {1, 1, 15})
/* compiled from: GenderPickerDialogFragment.kt */
public final class S extends C2418ZW {
    public static final c b = new c(null);
    private HashMap c;

    /* compiled from: GenderPickerDialogFragment.kt */
    public interface a {
        void a(l lVar);
    }

    /* compiled from: GenderPickerDialogFragment.kt */
    public interface b {
        a n();
    }

    /* compiled from: GenderPickerDialogFragment.kt */
    public static final class c {
        private c() {
        }

        public final S a(l lVar) {
            S s = new S();
            if (lVar != null) {
                s.setArguments(C1687sb.a(NVa.a("GENDER_KEY", lVar)));
            }
            return s;
        }

        public /* synthetic */ c(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: GenderPickerDialogFragment.kt */
    private final class d implements OnClickListener {
        public d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C7471uYa.b(dialogInterface, "dialogInterface");
            S.this.Tb().n().a(l.values()[i]);
            dialogInterface.dismiss();
        }
    }

    public S() {
        SoundCloudApplication.f().a(this);
    }

    private final int Rb() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("GENDER_KEY") : null;
        if (!(serializable instanceof l)) {
            serializable = null;
        }
        l lVar = (l) serializable;
        if (lVar != null) {
            return lVar.ordinal();
        }
        return -1;
    }

    private final String[] Sb() {
        l[] values = l.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (l a2 : values) {
            arrayList.add(getString(a2.a()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* access modifiers changed from: private */
    public final b Tb() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof b)) {
            activity = null;
        }
        b bVar = (b) activity;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Activity does not implement GenderPickerFragment callback");
    }

    public void Qb() {
        HashMap hashMap = this.c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(activity);
            aVar.c(p.onboarding_indicate_gender);
            aVar.a((CharSequence[]) Sb(), Rb(), (OnClickListener) new d());
            C0325l a2 = aVar.a();
            C7471uYa.a((Object) a2, "AlertDialog.Builder(acti…())\n            .create()");
            return a2;
        }
        C7471uYa.a();
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Qb();
    }
}
