package com.soundcloud.android.stations;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.m;
import com.soundcloud.android.ia.p;

/* compiled from: StationMenuRenderer */
class Ab implements b {
    private final a a;
    private final Resources b;
    private Pb c;
    private C4772BJa d;

    /* compiled from: StationMenuRenderer */
    interface a {
        void a(Pb pb);

        void onDismiss();
    }

    Ab(a aVar, View view, defpackage.C4772BJa.a aVar2) {
        this.a = aVar;
        this.d = aVar2.a(view.getContext(), view);
        this.d.b(m.station_item_actions);
        this.d.b((b) this);
        this.d.a((b) this);
        this.b = view.getResources();
    }

    /* access modifiers changed from: 0000 */
    public void a(Pb pb) {
        this.c = pb;
        a();
    }

    public void onDismiss() {
        this.d = null;
        this.a.onDismiss();
    }

    private void a() {
        a(this.c.h());
        this.d.b();
    }

    private void a(boolean z) {
        this.d.a(i.add_to_likes, (CharSequence) this.b.getString(z ? p.btn_unlike : p.btn_like));
        this.d.b(i.add_to_likes, true);
    }

    public boolean a(MenuItem menuItem, Context context) {
        if (menuItem.getItemId() != i.add_to_likes) {
            return false;
        }
        this.a.a(this.c);
        return true;
    }
}
