package defpackage;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.C0325l;
import androidx.appcompat.app.C0325l.a;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;

/* renamed from: gU reason: default package and case insensitive filesystem */
/* compiled from: ForceUpdateDialog */
public class C3022gU extends C2418ZW {
    private void Rb() {
        String str = "android.intent.action.VIEW";
        try {
            getActivity().startActivity(new Intent(str, Uri.parse("market://details?id=com.soundcloud.android")));
        } catch (ActivityNotFoundException unused) {
            getActivity().startActivity(new Intent(str, Uri.parse("https://play.google.com/store/apps/details?id=com.soundcloud.android")));
        }
        getActivity().finish();
    }

    private boolean Sb() {
        getActivity().finish();
        return true;
    }

    public static void a(C0370l lVar) {
        String str = "force_update_dlg";
        if (lVar.a(str) == null) {
            C3022gU gUVar = new C3022gU();
            gUVar.setCancelable(false);
            C5232QGa.a((C0361c) gUVar, lVar, str);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        a aVar = new a(getActivity());
        aVar.b(new b(getActivity()).c(p.kill_switch_message).a());
        aVar.c(p.kill_switch_confirm, (OnClickListener) new C2098IT(this));
        C0325l a = aVar.a();
        a.setOnKeyListener(new C2079HT(this));
        return a;
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        Rb();
    }

    public /* synthetic */ boolean a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 4) {
            return Sb();
        }
        return false;
    }
}
