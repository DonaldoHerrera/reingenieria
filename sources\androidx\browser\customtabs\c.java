package androidx.browser.customtabs;

import android.os.IBinder.DeathRecipient;

/* compiled from: CustomTabsService */
class c implements DeathRecipient {
    final /* synthetic */ g a;
    final /* synthetic */ d b;

    c(d dVar, g gVar) {
        this.b = dVar;
        this.a = gVar;
    }

    public void binderDied() {
        this.b.a.a(this.a);
    }
}
