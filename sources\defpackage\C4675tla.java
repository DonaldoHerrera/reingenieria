package defpackage;

import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.foundation.events.C3707i;
import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.playback.C4420sa;
import com.soundcloud.android.playback.C4431ub;

/* renamed from: tla reason: default package and case insensitive filesystem */
/* compiled from: PeripheralsController */
public class C4675tla {
    private final Context a;
    private final C3760eea b;

    /* renamed from: tla$a */
    /* compiled from: PeripheralsController */
    private class a extends C5005Iua<C3509cea> {
        private a() {
        }

        /* renamed from: a */
        public void onSuccess(C3509cea cea) {
            super.onSuccess(cea);
            C4675tla.this.a(cea);
        }
    }

    C4675tla(Context context, C3760eea eea) {
        this.a = context;
        this.b = eea;
    }

    private void a(boolean z) {
        Intent intent = new Intent("com.android.music.playstatechanged");
        intent.putExtra("playing", z);
        this.a.sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    public void a(C3509cea cea) {
        Intent intent = new Intent("com.android.music.metachanged");
        intent.putExtra("id", cea.y().c());
        intent.putExtra("track", C7315sGa.a(cea.w(), 40));
        intent.putExtra("duration", C4420sa.a(cea));
        intent.putExtra("artist", a(cea.f(), 30));
        this.a.sendBroadcast(intent);
    }

    private String a(String str, int i) {
        if (C5206PKa.a((CharSequence) str)) {
            return "";
        }
        return C7315sGa.a(str, i);
    }

    private void a() {
        Intent intent = new Intent("com.android.music.metachanged");
        String str = "";
        intent.putExtra("id", str);
        intent.putExtra("track", str);
        intent.putExtra("duration", 0);
        intent.putExtra("artist", str);
        this.a.sendBroadcast(intent);
    }

    /* access modifiers changed from: 0000 */
    public void a(C3707i iVar) {
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a(C4431ub ubVar) {
        a(ubVar.p());
    }

    /* access modifiers changed from: 0000 */
    public void a(k kVar) {
        q b2 = kVar.b();
        if (b2.j()) {
            Nda.a(this.b.a(b2.c(), defpackage.C3760eea.a.SYNC_MISSING)).a((C7600wPa<? super T>) new a<Object>());
        } else {
            a();
        }
    }
}
