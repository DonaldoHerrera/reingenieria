package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: UPa reason: default package */
/* compiled from: CompositeDisposable */
public final class UPa implements VPa, C7394tQa {
    HUa<VPa> a;
    volatile boolean b;

    public UPa() {
    }

    public boolean a() {
        return this.b;
    }

    public boolean b(VPa vPa) {
        AQa.a(vPa, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    HUa<VPa> hUa = this.a;
                    if (hUa == null) {
                        hUa = new HUa<>();
                        this.a = hUa;
                    }
                    hUa.a(vPa);
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
        AQa.a(vPa, "disposables is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            HUa<VPa> hUa = this.a;
            if (hUa != null) {
                if (hUa.b(vPa)) {
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
                    HUa<VPa> hUa = this.a;
                    this.a = null;
                    a(hUa);
                }
            }
        }
    }

    public UPa(VPa... vPaArr) {
        AQa.a(vPaArr, "disposables is null");
        this.a = new HUa<>(vPaArr.length + 1);
        for (VPa vPa : vPaArr) {
            AQa.a(vPa, "A Disposable in the disposables array is null");
            this.a.a(vPa);
        }
    }

    public boolean a(VPa... vPaArr) {
        AQa.a(vPaArr, "disposables is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    HUa<VPa> hUa = this.a;
                    if (hUa == null) {
                        hUa = new HUa<>(vPaArr.length + 1);
                        this.a = hUa;
                    }
                    for (VPa vPa : vPaArr) {
                        AQa.a(vPa, "A Disposable in the disposables array is null");
                        hUa.a(vPa);
                    }
                    return true;
                }
            }
        }
        for (VPa dispose : vPaArr) {
            dispose.dispose();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return r1;
     */
    public int c() {
        int i = 0;
        if (this.b) {
            return 0;
        }
        synchronized (this) {
            if (this.b) {
                return 0;
            }
            HUa<VPa> hUa = this.a;
            if (hUa != null) {
                i = hUa.c();
            }
        }
    }

    public void b() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    HUa<VPa> hUa = this.a;
                    this.a = null;
                    a(hUa);
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
    public void a(HUa<VPa> hUa) {
        Object[] a2;
        if (hUa != null) {
            List list = null;
            for (Object obj : hUa.a()) {
                if (obj instanceof VPa) {
                    try {
                        ((VPa) obj).dispose();
                    } catch (Throwable th) {
                        _Pa.b(th);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(th);
                    }
                }
            }
            if (list == null) {
                return;
            }
            if (list.size() == 1) {
                throw EUa.a((Throwable) list.get(0));
            }
            throw new ZPa((Iterable<? extends Throwable>) list);
        }
    }
}
