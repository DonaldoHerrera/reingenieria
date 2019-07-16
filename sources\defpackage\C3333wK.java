package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: wK reason: default package and case insensitive filesystem */
/* compiled from: AlphaDialogHelper.kt */
final class C3333wK implements OnClickListener {
    final /* synthetic */ C3070jK a;

    C3333wK(C3070jK jKVar) {
        this.a = jKVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a().startActivity(C3313vK.a(this.a.a()));
    }
}
