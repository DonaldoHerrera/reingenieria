package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.soul.components.menu.MenuBottomSheet;

/* renamed from: dxa reason: default package and case insensitive filesystem */
/* compiled from: ShareBottomSheetFragment.kt */
final class C6342dxa implements OnClickListener {
    final /* synthetic */ C6274cxa a;
    final /* synthetic */ Dialog b;

    C6342dxa(C6274cxa cxa, Dialog dialog) {
        this.a = cxa;
        this.b = dialog;
    }

    public final void onClick(View view) {
        MenuBottomSheet menuBottomSheet = (MenuBottomSheet) this.b.findViewById(i.shareInstagram);
        C7471uYa.a((Object) menuBottomSheet, "dialog.shareInstagram");
        menuBottomSheet.setEnabled(false);
        C6274cxa cxa = this.a;
        Bundle arguments = cxa.getArguments();
        if (arguments != null) {
            cxa.f(cxa.b(arguments));
            this.a.dismiss();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
