package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: Rh reason: default package */
/* compiled from: CrashPromptDialog */
class Rh implements OnClickListener {
    final /* synthetic */ b a;

    Rh(b bVar) {
        this.a = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(false);
        dialogInterface.dismiss();
    }
}
