package defpackage;

import android.content.Intent;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.features.record.J;
import com.soundcloud.android.features.record.J.a;

/* renamed from: eV reason: default package and case insensitive filesystem */
/* compiled from: CreatorsModule */
class C2985eV implements J {
    C2985eV() {
    }

    public Intent a(a aVar) {
        int i = C3004fV.a[aVar.ordinal()];
        if (i == 1) {
            return new Intent(C2929h.b);
        }
        if (i == 2) {
            return new Intent(C2929h.c);
        }
        if (i == 3) {
            return new Intent(C2929h.a).addFlags(67108864).addFlags(536870912);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected intent type ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    public a a(Intent intent) {
        String action = intent.getAction();
        if (C2929h.b.equals(action)) {
            return a.START;
        }
        if (C2929h.c.equals(action)) {
            return a.STOP;
        }
        if (C2929h.a.equals(action)) {
            return a.VIEW;
        }
        return a.UNKNOWN;
    }
}
