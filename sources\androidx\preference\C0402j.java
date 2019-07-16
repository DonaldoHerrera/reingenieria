package androidx.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

/* renamed from: androidx.preference.j reason: case insensitive filesystem */
/* compiled from: MultiSelectListPreferenceDialogFragmentCompat */
class C0402j implements OnMultiChoiceClickListener {
    final /* synthetic */ C0403k a;

    C0402j(C0403k kVar) {
        this.a = kVar;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        if (z) {
            C0403k kVar = this.a;
            kVar.j = kVar.i.add(kVar.l[i].toString()) | kVar.j;
            return;
        }
        C0403k kVar2 = this.a;
        kVar2.j = kVar2.i.remove(kVar2.l[i].toString()) | kVar2.j;
    }
}
