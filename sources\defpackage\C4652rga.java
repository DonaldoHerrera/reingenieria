package defpackage;

import android.widget.TextView;

/* renamed from: rga reason: default package and case insensitive filesystem */
/* compiled from: FcmDebugDialogFragment.kt */
final class C4652rga implements Runnable {
    final /* synthetic */ TextView a;
    final /* synthetic */ C4661sga b;
    final /* synthetic */ b c;

    C4652rga(TextView textView, C4661sga sga, b bVar) {
        this.a = textView;
        this.b = sga;
        this.c = bVar;
    }

    public final void run() {
        TextView textView = this.a;
        StringBuilder sb = new StringBuilder();
        C4661sga sga = this.b;
        b bVar = this.c;
        sb.append(sga.a(bVar, bVar.b()));
        sb.append("\n\n");
        textView.append(sb.toString());
    }
}
