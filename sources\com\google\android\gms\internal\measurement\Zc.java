package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class Zc extends Xc<_c, _c> {
    Zc() {
    }

    private static void a(Object obj, _c _cVar) {
        ((Gb) obj).zzahz = _cVar;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Fc fc) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, C1050ud udVar) throws IOException {
        ((_c) obj).a(udVar);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int c(Object obj) {
        return ((_c) obj).b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object d(Object obj) {
        return ((Gb) obj).zzahz;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object e(Object obj) {
        _c _cVar = ((Gb) obj).zzahz;
        if (_cVar != _c.c()) {
            return _cVar;
        }
        _c d = _c.d();
        a(obj, d);
        return d;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int f(Object obj) {
        return ((_c) obj).e();
    }

    /* access modifiers changed from: 0000 */
    public final void a(Object obj) {
        ((Gb) obj).zzahz.a();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, Object obj2) {
        a(obj, (_c) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        _c _cVar = (_c) obj;
        _c _cVar2 = (_c) obj2;
        if (_cVar2.equals(_c.c())) {
            return _cVar;
        }
        return _c.a(_cVar, _cVar2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, C1050ud udVar) throws IOException {
        ((_c) obj).b(udVar);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object b(Object obj) {
        _c _cVar = (_c) obj;
        _cVar.a();
        return _cVar;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, Object obj2) {
        a(obj, (_c) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a() {
        return _c.d();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, int i, long j) {
        ((_c) obj).a((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, Object obj2) {
        ((_c) obj).a((i << 3) | 3, (Object) (_c) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, Ya ya) {
        ((_c) obj).a((i << 3) | 2, (Object) ya);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, int i2) {
        ((_c) obj).a((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, long j) {
        ((_c) obj).a(i << 3, (Object) Long.valueOf(j));
    }
}
