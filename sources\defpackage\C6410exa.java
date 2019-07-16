package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.soul.components.menu.MenuBottomSheet;

/* renamed from: exa reason: default package and case insensitive filesystem */
/* compiled from: ShareBottomSheetFragment.kt */
final class C6410exa implements OnClickListener {
    final /* synthetic */ C6274cxa a;
    final /* synthetic */ Dialog b;

    C6410exa(C6274cxa cxa, Dialog dialog) {
        this.a = cxa;
        this.b = dialog;
    }

    public final void onClick(View view) {
        MenuBottomSheet menuBottomSheet = (MenuBottomSheet) this.b.findViewById(i.shareOther);
        C7471uYa.a((Object) menuBottomSheet, "dialog.shareOther");
        menuBottomSheet.setEnabled(false);
        Context context = this.a.getContext();
        if (context != null) {
            C6274cxa cxa = this.a;
            Bundle arguments = cxa.getArguments();
            if (arguments != null) {
                context.startActivity(cxa.a(arguments));
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C6274cxa cxa2 = this.a;
        cxa2.b(cxa2.Sb().a());
        this.a.dismiss();
    }
}
