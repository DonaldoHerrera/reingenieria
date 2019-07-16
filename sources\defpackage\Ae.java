package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.i;
import androidx.work.j;

/* renamed from: Ae reason: default package */
/* compiled from: NetworkNotRoamingController */
public class Ae extends C1840xe<C1690se> {
    private static final String e = i.a("NetworkNotRoamingCtrlr");

    public Ae(Context context, C1811wf wfVar) {
        super(Le.a(context, wfVar).c());
    }

    /* access modifiers changed from: 0000 */
    public boolean a(_e _eVar) {
        return _eVar.l.b() == j.d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean b(C1690se seVar) {
        boolean z = true;
        if (VERSION.SDK_INT < 24) {
            i.a().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !seVar.a();
        }
        if (seVar.a() && seVar.c()) {
            z = false;
        }
        return z;
    }
}
