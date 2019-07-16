package com.soundcloud.android.playback.ui;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.C0325l;
import androidx.fragment.app.C0361c;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.ads.J;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import java.util.HashMap;

@EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/soundcloud/android/playback/ui/ForceAdTestingDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "forceAdTestingIdRepository", "Lcom/soundcloud/android/foundation/ads/ForceAdTestingIdRepository;", "getForceAdTestingIdRepository", "()Lcom/soundcloud/android/foundation/ads/ForceAdTestingIdRepository;", "setForceAdTestingIdRepository", "(Lcom/soundcloud/android/foundation/ads/ForceAdTestingIdRepository;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.playback.ui.ab reason: case insensitive filesystem */
/* compiled from: ForceAdTestingDialogFragment.kt */
public final class C4436ab extends C0361c {
    public static final a a = new a(null);
    public J b;
    private HashMap c;

    /* renamed from: com.soundcloud.android.playback.ui.ab$a */
    /* compiled from: ForceAdTestingDialogFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4436ab() {
        SoundCloudApplication.f().a(this);
    }

    public void Qb() {
        HashMap hashMap = this.c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final J Rb() {
        J j = this.b;
        if (j != null) {
            return j;
        }
        C7471uYa.b("forceAdTestingIdRepository");
        throw null;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View inflate = LayoutInflater.from(getContext()).inflate(l.dialog_force_ad_testing, null, false);
        EditText editText = (EditText) inflate.findViewById(i.forceAdTestingLineIdInput);
        EditText editText2 = (EditText) inflate.findViewById(i.forceAdTestingCreativeIdInput);
        CheckBox checkBox = (CheckBox) inflate.findViewById(i.forceAdTestingAdTimerEnabled);
        editText2.addTextChangedListener(new C4439bb(editText));
        J j = this.b;
        String str = "forceAdTestingIdRepository";
        if (j != null) {
            editText.setText(j.e());
            J j2 = this.b;
            if (j2 != null) {
                editText2.setText(j2.b());
                C7471uYa.a((Object) checkBox, "adTimerEnabled");
                J j3 = this.b;
                if (j3 != null) {
                    Boolean c2 = j3.c();
                    checkBox.setChecked(c2 != null ? c2.booleanValue() : true);
                    androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(requireContext());
                    aVar.b(inflate);
                    aVar.c(17039370, (OnClickListener) new C4442cb(this, editText, editText2, checkBox));
                    aVar.a(p.btn_cancel, (OnClickListener) C4445db.a);
                    C0325l a2 = aVar.a();
                    C7471uYa.a((Object) a2, "AlertDialog.Builder(requ…> }\n            .create()");
                    return a2;
                }
                C7471uYa.b(str);
                throw null;
            }
            C7471uYa.b(str);
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Qb();
    }
}
