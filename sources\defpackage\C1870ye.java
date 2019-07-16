package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.j;

/* renamed from: ye reason: default package and case insensitive filesystem */
/* compiled from: NetworkConnectedController */
public class C1870ye extends C1840xe<C1690se> {
    public C1870ye(Context context, C1811wf wfVar) {
        super(Le.a(context, wfVar).c());
    }

    /* access modifiers changed from: 0000 */
    public boolean a(_e _eVar) {
        return _eVar.l.b() == j.CONNECTED;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean b(C1690se seVar) {
        boolean z = true;
        if (VERSION.SDK_INT < 26) {
            return !seVar.a();
        }
        if (seVar.a() && seVar.d()) {
            z = false;
        }
        return z;
    }
}
