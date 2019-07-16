package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.vb reason: case insensitive filesystem */
final class C0800vb extends C0794tb<C0797ub, C0797ub> {
    C0800vb() {
    }

    private static void a(Object obj, C0797ub ubVar) {
        ((C0755ga) obj).zzjp = ubVar;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a() {
        return C0797ub.c();
    }

    /* access modifiers changed from: 0000 */
    public final void a(Object obj) {
        ((C0755ga) obj).zzjp.e();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, long j) {
        ((C0797ub) obj).a(i << 3, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, Ob ob) throws IOException {
        ((C0797ub) obj).b(ob);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, Object obj2) {
        a(obj, (C0797ub) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int b(Object obj) {
        return ((C0797ub) obj).a();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, Ob ob) throws IOException {
        ((C0797ub) obj).a(ob);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, Object obj2) {
        a(obj, (C0797ub) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj) {
        return ((C0755ga) obj).zzjp;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        C0797ub ubVar = (C0797ub) obj;
        C0797ub ubVar2 = (C0797ub) obj2;
        return ubVar2.equals(C0797ub.b()) ? ubVar : C0797ub.a(ubVar, ubVar2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int d(Object obj) {
        return ((C0797ub) obj).d();
    }
}
