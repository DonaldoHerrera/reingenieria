package com.soundcloud.android.settings;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0325l.a;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;

/* renamed from: com.soundcloud.android.settings.t reason: case insensitive filesystem */
/* compiled from: OfflineStorageErrorDialog */
public class C5987t extends C2418ZW {
    public static void a(C0370l lVar) {
        C5232QGa.a((C0361c) new C5987t(), lVar, "OfflineStorageErrorDialog");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a = new b(getActivity()).c(p.offline_storage_error_dialog_title).b(p.offline_storage_error_dialog_message).a();
        a aVar = new a(getActivity());
        aVar.b(a);
        aVar.c(p.ok_got_it, (OnClickListener) null);
        aVar.a(p.go_to_settings, (OnClickListener) new C5945b(this));
        return aVar.a();
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(getActivity(), ChangeStorageLocationActivity.class));
    }
}
