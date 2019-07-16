package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.soundcloud.android.ia.p;
import java.io.File;

/* renamed from: VGa reason: default package and case insensitive filesystem */
/* compiled from: BugReporter.kt */
final class C5380VGa implements OnClickListener {
    final /* synthetic */ C5322TGa a;
    final /* synthetic */ String[] b;
    final /* synthetic */ Context c;
    final /* synthetic */ File d;

    C5380VGa(C5322TGa tGa, String[] strArr, Context context, File file) {
        this.a = tGa;
        this.b = strArr;
        this.c = context;
        this.d = file;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        this.a.g.a(new C5560aIa(), new HVa("udid", this.a.c.i()));
        String str2 = this.b[i];
        String string = this.a.e.getString(p.feedback_email_subject, new Object[]{str2});
        String string2 = this.a.e.getString(p.feedback_action_chooser);
        if (C7471uYa.a((Object) str2, (Object) this.a.e.getString(p.feedback_playback_issue))) {
            str = this.a.b.d();
        } else {
            str = this.a.b.c();
        }
        String str3 = str;
        C5322TGa tGa = this.a;
        Context context = this.c;
        C7471uYa.a((Object) str3, "feedbackEmail");
        C7471uYa.a((Object) string, "subject");
        String c2 = this.a.a();
        C7471uYa.a((Object) string2, "actionChooser");
        tGa.a(context, str3, string, c2, string2, this.d);
    }
}
