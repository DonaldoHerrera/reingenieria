package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.internal.C1165qc;

/* renamed from: com.google.android.gms.internal.measurement.p reason: case insensitive filesystem */
final class C1017p extends a {
    private final /* synthetic */ C1165qc e;
    private final /* synthetic */ If f;

    C1017p(If ifR, C1165qc qcVar) {
        this.f = ifR;
        this.e = qcVar;
        super(ifR);
    }

    /* access modifiers changed from: 0000 */
    public final void a() throws RemoteException {
        for (int i = 0; i < this.f.l.size(); i++) {
            if (this.e.equals(((Pair) this.f.l.get(i)).first)) {
                Log.w(this.f.h, "OnEventListener already registered.");
                return;
            }
        }
        c cVar = new c(this.e);
        this.f.l.add(new Pair(this.e, cVar));
        this.f.p.registerOnMeasurementEventListener(cVar);
    }
}
