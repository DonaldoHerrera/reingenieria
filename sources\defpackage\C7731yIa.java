package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.io.File;

/* renamed from: yIa reason: default package and case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C7731yIa implements OnClickListener {
    private final /* synthetic */ Activity a;
    private final /* synthetic */ File b;

    public /* synthetic */ C7731yIa(Activity activity, File file) {
        this.a = activity;
        this.b = file;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4740AIa.a(this.a, this.b, 9001);
    }
}
