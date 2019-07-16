package defpackage;

import android.os.Bundle;
import com.evernote.android.job.c;
import com.evernote.android.job.c.a;
import com.evernote.android.job.c.b;
import com.evernote.android.job.s;
import defpackage.C2453aS;

/* renamed from: ZR reason: default package and case insensitive filesystem */
/* compiled from: SyncJob.kt */
public final class C2415ZR<T extends C2453aS> extends c {
    private final C7054oVa<T> j;

    public C2415ZR(C7054oVa<T> ova) {
        C7471uYa.b(ova, "syncerProvider");
        this.j = ova;
    }

    /* access modifiers changed from: protected */
    public b a(a aVar) {
        C7471uYa.b(aVar, "params");
        return ((C2453aS) this.j.get()).a(new C2267RR(aVar));
    }

    public final s.b a(Bundle bundle) {
        return ((C2453aS) this.j.get()).a(bundle);
    }

    public static /* synthetic */ s.b a(C2415ZR zr, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        return zr.a(bundle);
    }
}
