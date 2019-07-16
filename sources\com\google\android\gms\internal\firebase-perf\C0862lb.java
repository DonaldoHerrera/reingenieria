package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.d;
import java.io.IOException;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.firebase-perf.lb reason: case insensitive filesystem */
final class C0862lb extends C0850ib<Object> {
    C0862lb() {
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(C0835ec ecVar) {
        return ecVar instanceof d;
    }

    /* access modifiers changed from: 0000 */
    public final C0870nb<Object> b(Object obj) {
        d dVar = (d) obj;
        if (dVar.zzrg.b()) {
            dVar.zzrg = (C0870nb) dVar.zzrg.clone();
        }
        return dVar.zzrg;
    }

    /* access modifiers changed from: 0000 */
    public final void c(Object obj) {
        a(obj).e();
    }

    /* access modifiers changed from: 0000 */
    public final C0870nb<Object> a(Object obj) {
        return ((d) obj).zzrg;
    }

    /* access modifiers changed from: 0000 */
    public final int a(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void a(dd ddVar, Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }
}
