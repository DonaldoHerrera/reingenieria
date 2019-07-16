package com.soundcloud.android.playback;

import android.content.res.Resources;
import com.soundcloud.android.ia.p;

/* compiled from: PlayPublisher */
public class Pa {
    private final Resources a;
    private final C3856qea b;
    private final C5694cGa c;
    private final HPa d;
    private final efa e;

    /* compiled from: PlayPublisher */
    private static class a extends C5068Kua<jfa> {
        private a() {
        }

        /* renamed from: a */
        public void onSuccess(jfa jfa) {
            super.onSuccess(jfa);
            SDb.a("PlayPublisher").a("Posted play with response code %s", Integer.valueOf(jfa.d()));
        }
    }

    Pa(Resources resources, C3856qea qea, C5694cGa cga, HPa hPa, efa efa) {
        this.a = resources;
        this.b = qea;
        this.c = cga;
        this.d = hPa;
        this.e = efa;
    }

    private Qa b() {
        return Qa.a(this.a.getString(p.gcm_gateway_id), this.b.a(), this.c.a());
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.e.b(hfa.c(C2226PO.PLAY_PUBLISH.a()).c().a((Object) b()).b()).b(this.d).a((KPa<? super T>) new a<Object>());
    }
}
