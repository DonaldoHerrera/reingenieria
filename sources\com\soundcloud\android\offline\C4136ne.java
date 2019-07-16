package com.soundcloud.android.offline;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;

/* renamed from: com.soundcloud.android.offline.ne reason: case insensitive filesystem */
/* compiled from: OfflineStorageOperations.kt */
public final class C4136ne {
    private final Context a;
    private final C3284tV b;
    private final C4088fe c;
    private final HPa d;

    public C4136ne(Context context, C3284tV tVVar, C4088fe feVar, HPa hPa) {
        C7471uYa.b(context, "context");
        C7471uYa.b(tVVar, "cryptoOperations");
        C7471uYa.b(feVar, "offlineSettingsStorage");
        C7471uYa.b(hPa, "scheduler");
        this.a = context;
        this.b = tVVar;
        this.c = feVar;
        this.d = hPa;
    }

    /* access modifiers changed from: private */
    public final void c() {
        if (C6698jGa.f(this.a) && d()) {
            File c2 = C6698jGa.c(this.a);
            if (c2 != null) {
                C6630iGa.a(c2);
            }
        }
    }

    private final boolean d() {
        return !this.b.c() || Oc.DEVICE_STORAGE == this.c.c();
    }

    public final void b() {
        if (Oc.SD_CARD == this.c.c()) {
            OfflineContentService.b(this.a);
        }
    }

    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    public final void a() {
        this.d.a(new C4130me(this));
    }
}
