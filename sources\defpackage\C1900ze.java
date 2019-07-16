package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.i;
import androidx.work.j;

/* renamed from: ze reason: default package and case insensitive filesystem */
/* compiled from: NetworkMeteredController */
public class C1900ze extends C1840xe<C1690se> {
    private static final String e = i.a("NetworkMeteredCtrlr");

    public C1900ze(Context context, C1811wf wfVar) {
        super(Le.a(context, wfVar).c());
    }

    /* access modifiers changed from: 0000 */
    public boolean a(_e _eVar) {
        return _eVar.l.b() == j.METERED;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean b(C1690se seVar) {
        boolean z = true;
        if (VERSION.SDK_INT < 26) {
            i.a().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !seVar.a();
        }
        if (seVar.a() && seVar.b()) {
            z = false;
        }
        return z;
    }
}
