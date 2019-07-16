package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: wQa reason: default package and case insensitive filesystem */
/* compiled from: ListCompositeDisposable */
public final class C7601wQa implements VPa, C7394tQa {
    List<VPa> a;
    volatile boolean b;

    public boolean a() {
        return this.b;
    }

    public boolean b(VPa vPa) {
        AQa.a(vPa, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List list = this.a;
                    if (list == null) {
                        list = new LinkedList();
                        this.a = list;
                    }
                    list.add(vPa);
                    return true;
                }
            }
        }
        vPa.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        return false;
     */
    public boolean c(VPa vPa) {
        AQa.a(vPa, "Disposable item is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            List<VPa> list = this.a;
            if (list != null) {
                if (list.remove(vPa)) {
                    return true;
                }
            }
        }
    }

    public void dispose() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.b = true;
                    List<VPa> list = this.a;
                    this.a = null;
                    a(list);
                }
            }
        }
    }

    public boolean a(VPa vPa) {
        if (!c(vPa)) {
            return false;
        }
        vPa.dispose();
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(List<VPa> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (VPa dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    _Pa.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw EUa.a((Throwable) arrayList.get(0));
            }
            throw new ZPa((Iterable<? extends Throwable>) arrayList);
        }
    }
}
