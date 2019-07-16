package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: Qh reason: default package */
/* compiled from: CrashPromptDialog */
class Qh implements OnClickListener {
    final /* synthetic */ b a;

    Qh(b bVar) {
        this.a = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(true);
        dialogInterface.dismiss();
    }
}
