package com.soundcloud.android.cast;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.mediarouter.app.B;
import androidx.mediarouter.app.C0388a;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.cast.framework.C0634b;

/* renamed from: com.soundcloud.android.cast.b reason: case insensitive filesystem */
/* compiled from: CastButtonInstaller */
public class C2728b {
    private final x a;

    C2728b(x xVar) {
        this.a = xVar;
    }

    public C4928GKa<MenuItem> a(Context context, Menu menu, int i) {
        try {
            MenuItem a2 = C0634b.a(context, menu, i);
            a(a2);
            return C4928GKa.c(a2);
        } catch (Exception e) {
            C7316sHa.a((Throwable) e, "Unable to set up media route item");
            return C4928GKa.a();
        }
    }

    public void a(MediaRouteButton mediaRouteButton) {
        try {
            C0634b.a(mediaRouteButton.getContext(), mediaRouteButton);
            mediaRouteButton.setDialogFactory(this.a);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to set up media route item ");
            sb.append(mediaRouteButton);
            C7316sHa.a((Throwable) e, sb.toString());
        }
    }

    private void a(MenuItem menuItem) {
        ((C0388a) C0518cc.a(menuItem)).a((B) this.a);
    }
}
