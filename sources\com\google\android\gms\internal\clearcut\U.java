package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0755ga.c;
import java.io.IOException;
import java.util.Map.Entry;

final class U extends T<d> {
    U() {
    }

    /* access modifiers changed from: 0000 */
    public final int a(Entry<?, ?> entry) {
        return ((d) entry.getKey()).a;
    }

    /* access modifiers changed from: 0000 */
    public final X<d> a(Object obj) {
        return ((c) obj).zzjv;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Ob ob, Entry<?, ?> entry) throws IOException {
        d dVar = (d) entry.getKey();
        switch (V.a[dVar.b.ordinal()]) {
            case 1:
                ob.a(dVar.a, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                ob.a(dVar.a, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                ob.e(dVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                ob.c(dVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                ob.a(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                ob.b(dVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                ob.b(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                ob.a(dVar.a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                ob.c(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                ob.f(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                ob.d(dVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                ob.d(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                ob.a(dVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                ob.a(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                ob.a(dVar.a, (A) entry.getValue());
                return;
            case 16:
                ob.a(dVar.a, (String) entry.getValue());
                return;
            case 17:
                ob.b(dVar.a, entry.getValue(), Xa.a().a(entry.getValue().getClass()));
                return;
            case 18:
                ob.a(dVar.a, entry.getValue(), Xa.a().a(entry.getValue().getClass()));
                break;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Object obj, X<d> x) {
        ((c) obj).zzjv = x;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(La la) {
        return la instanceof c;
    }

    /* access modifiers changed from: 0000 */
    public final X<d> b(Object obj) {
        X<d> a = a(obj);
        if (!a.c()) {
            return a;
        }
        X<d> x = (X) a.clone();
        a(obj, x);
        return x;
    }

    /* access modifiers changed from: 0000 */
    public final void c(Object obj) {
        a(obj).i();
    }
}
