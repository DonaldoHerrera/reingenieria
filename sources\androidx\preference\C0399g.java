package androidx.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: androidx.preference.g reason: case insensitive filesystem */
/* compiled from: ListPreferenceDialogFragmentCompat */
class C0399g implements OnClickListener {
    final /* synthetic */ C0400h a;

    C0399g(C0400h hVar) {
        this.a = hVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C0400h hVar = this.a;
        hVar.i = i;
        hVar.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
