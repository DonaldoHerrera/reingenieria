package com.google.firebase.perf.metrics;

import com.google.android.gms.internal.firebase-perf.C0892ta;
import com.google.android.gms.internal.firebase-perf.Da;
import com.google.android.gms.internal.firebase-perf.Da.b;
import com.google.firebase.perf.internal.zzq;
import java.util.Arrays;
import java.util.List;

final class c {
    private final Trace a;

    c(Trace trace) {
        this.a = trace;
    }

    /* access modifiers changed from: 0000 */
    public final Da a() {
        b w = Da.w();
        w.a(this.a.a());
        w.a(this.a.d().b());
        w.b(this.a.d().a(this.a.e()));
        for (zza zza : this.a.c().values()) {
            w.a(zza.b(), zza.a());
        }
        List<Trace> f = this.a.f();
        if (!f.isEmpty()) {
            for (Trace cVar : f) {
                w.a(new c(cVar).a());
            }
        }
        w.b(this.a.getAttributes());
        C0892ta[] a2 = zzq.a(this.a.b());
        if (a2 != null) {
            w.b((Iterable<? extends C0892ta>) Arrays.asList(a2));
        }
        return (Da) w.b();
    }
}
