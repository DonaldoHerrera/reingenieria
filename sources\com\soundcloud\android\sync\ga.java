package com.soundcloud.android.sync;

import android.content.Intent;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SyncRequestFactory */
public class ga {
    private final oa a;
    private final A b;
    private final C6138v c;
    private final C5490ZAa d;
    private final C5287SBa e;
    private final C5327TLa f;

    /* compiled from: SyncRequestFactory */
    private static class a extends Exception {
        a(na naVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot find syncer for ");
            sb.append(naVar);
            super(sb.toString());
        }
    }

    ga(oa oaVar, A a2, C6138v vVar, C5490ZAa zAa, C5287SBa sBa, C5327TLa tLa) {
        this.a = oaVar;
        this.b = a2;
        this.c = vVar;
        this.d = zAa;
        this.e = sBa;
        this.f = tLa;
    }

    private ea b(Intent intent, na naVar) {
        return this.d.a(naVar, V.a(intent), f(intent));
    }

    private ea c(Intent intent) {
        List a2 = V.a(intent);
        if (a2.size() == 1) {
            C3508cda cda = (C3508cda) a2.get(0);
            C5137NBa nBa = new C5137NBa(new C5167OBa(this.e.a(cda), cda), na.PLAYLIST.name(), true, f(intent), this.f, cda);
            return nBa;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected 1 playlist urn to sync, received ");
        sb.append(a2.size());
        throw new IllegalArgumentException(sb.toString());
    }

    private ea d(Intent intent) {
        na b2 = V.b(intent);
        int i = fa.a[b2.ordinal()];
        if (i == 1) {
            return c(intent);
        }
        if (i == 2 || i == 3 || i == 4) {
            return b(intent, b2);
        }
        return a(intent, b2);
    }

    private boolean e(Intent intent) {
        return intent.getBooleanExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true);
    }

    private ResultReceiver f(Intent intent) {
        return (ResultReceiver) intent.getParcelableExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER");
    }

    /* access modifiers changed from: 0000 */
    public ea a(Intent intent) {
        if (intent.hasExtra("com.soundcloud.android.sync.extra.SYNCABLE")) {
            return d(intent);
        }
        if (intent.hasExtra("com.soundcloud.android.sync.extra.SYNCABLES")) {
            return b(intent);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Syncable missing from intent: ");
        sb.append(intent);
        throw new IllegalArgumentException(sb.toString());
    }

    private ea b(Intent intent) {
        List c2 = V.c(intent);
        boolean e2 = e(intent);
        return this.c.a(a(c2, e2), f(intent), e2);
    }

    private ea a(Intent intent, na naVar) {
        boolean e2 = e(intent);
        return this.b.a(new r(this.a.a(naVar).a(intent.getAction(), e2), naVar), naVar.name(), e2, f(intent));
    }

    private List<W> a(List<na> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        for (na naVar : list) {
            com.soundcloud.android.sync.oa.a a2 = this.a.a(naVar);
            if (a2 != null) {
                arrayList.add(new r(a2.a(null, z), naVar));
            } else {
                C7316sHa.d(new a(naVar));
            }
        }
        return arrayList;
    }
}
