package com.soundcloud.android.offline;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: OfflinePerformanceTracker */
class Td {
    private final C3700b a;

    Td(C3700b bVar) {
        this.a = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(C4146pc pcVar) {
        this.a.a((J) Aaa.d(pcVar.a(), pcVar.h()));
    }

    /* access modifiers changed from: 0000 */
    public void b(C4152qc qcVar) {
        this.a.a((J) Aaa.b(qcVar.c(), qcVar.a.h()));
    }

    /* access modifiers changed from: 0000 */
    public void c(C4152qc qcVar) {
        if (qcVar.h()) {
            this.a.a((J) Aaa.e(qcVar.c(), qcVar.a.h()));
        } else if (qcVar.j() || qcVar.i()) {
            this.a.a((J) Aaa.f(qcVar.c(), qcVar.a.h()));
        } else {
            this.a.a((J) Aaa.c(qcVar.c(), qcVar.a.h()));
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C4152qc qcVar) {
        this.a.a((J) Aaa.a(qcVar.c(), qcVar.a.h()));
    }
}
