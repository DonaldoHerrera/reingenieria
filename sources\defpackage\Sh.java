package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: Sh reason: default package */
/* compiled from: CrashPromptDialog */
class Sh implements OnClickListener {
    final /* synthetic */ a a;
    final /* synthetic */ b b;

    Sh(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(true);
        this.b.a(true);
        dialogInterface.dismiss();
    }
}
