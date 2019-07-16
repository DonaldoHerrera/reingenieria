package defpackage;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"sc.SilentExceptionUsage"})
/* renamed from: yM reason: default package and case insensitive filesystem */
/* compiled from: SimpleTrackingApi.kt */
public final class C3375yM implements C1932AM {
    private final C4806CMa<C7440tyb> a;
    private final C3469VY b;
    private final C3395zM c;

    public C3375yM(C4806CMa<C7440tyb> cMa, C3469VY vy, C3395zM zMVar) {
        C7471uYa.b(cMa, "httpClient");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(zMVar, "simpleTrackingApiRequestBuilder");
        this.a = cMa;
        this.b = vy;
        this.c = zMVar;
    }

    private final void b(C2110JM jm, Ayb ayb) {
        if (ayb.d() >= 400) {
            a.a(this.b, a(jm, ayb), null, 2, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0038 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0038 A[SYNTHETIC] */
    public List<C2110JM> a(List<C2110JM> list) {
        Ayb ayb;
        Cyb a2;
        C7471uYa.b(list, "events");
        b a3 = SDb.a(C2428_L.a);
        StringBuilder sb = new StringBuilder();
        sb.append("Pushing ");
        sb.append(list.size());
        sb.append(" new tracking events");
        a3.a(sb.toString(), new Object[0]);
        ArrayList arrayList = new ArrayList(list.size());
        for (C2110JM jm : list) {
            Ayb ayb2 = null;
            try {
                ayb = ((C7440tyb) this.a.get()).a(this.c.a(jm)).execute();
                try {
                    arrayList.add(jm);
                    C7471uYa.a((Object) ayb, "response");
                    b(jm, ayb);
                    a2 = ayb.a();
                    if (a2 == null) {
                    }
                } catch (MalformedURLException e) {
                    e = e;
                    try {
                        a.a(this.b, new Exception(jm.toString(), e), null, 2, null);
                        arrayList.add(jm);
                        if (ayb == null) {
                            a2 = ayb.a();
                            if (a2 == null) {
                            }
                            a2.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        ayb2 = ayb;
                        if (ayb2 != null) {
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    Ayb ayb3 = ayb;
                    e = e2;
                    ayb2 = ayb3;
                    try {
                        b a4 = SDb.a(C2428_L.a);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed with IOException pushing event: ");
                        sb2.append(jm);
                        a4.b(e, sb2.toString(), new Object[0]);
                        if (ayb2 == null) {
                            a2 = ayb2.a();
                            if (a2 == null) {
                            }
                            a2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (ayb2 != null) {
                            Cyb a5 = ayb2.a();
                            if (a5 != null) {
                                a5.close();
                            }
                        }
                        throw th;
                    }
                }
            } catch (MalformedURLException e3) {
                e = e3;
                ayb = null;
                a.a(this.b, new Exception(jm.toString(), e), null, 2, null);
                arrayList.add(jm);
                if (ayb == null) {
                }
            } catch (IOException e4) {
                e = e4;
                b a42 = SDb.a(C2428_L.a);
                StringBuilder sb22 = new StringBuilder();
                sb22.append("Failed with IOException pushing event: ");
                sb22.append(jm);
                a42.b(e, sb22.toString(), new Object[0]);
                if (ayb2 == null) {
                }
            }
            a2.close();
        }
        return arrayList;
    }

    private final Exception a(C2110JM jm, Ayb ayb) {
        StringBuilder sb = new StringBuilder();
        sb.append("Tracking request failed with unexpected status code: ");
        sb.append(ayb);
        sb.append("; record = ");
        sb.append(jm);
        return new Exception(sb.toString());
    }
}
