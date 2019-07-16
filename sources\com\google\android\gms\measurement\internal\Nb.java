package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class Nb extends Za {
    /* access modifiers changed from: private */
    public final Kd a;
    private Boolean b;
    private String c;

    public Nb(Kd kd) {
        this(kd, null);
    }

    public final void a(zzai zzai, zzn zzn) {
        Preconditions.checkNotNull(zzai);
        b(zzn, false);
        a((Runnable) new _b(this, zzai, zzn));
    }

    public final void b(zzn zzn) {
        b(zzn, false);
        a((Runnable) new Qb(this, zzn));
    }

    public final String c(zzn zzn) {
        b(zzn, false);
        return this.a.d(zzn);
    }

    public final void d(zzn zzn) {
        a(zzn.a, false);
        a((Runnable) new Xb(this, zzn));
    }

    private Nb(Kd kd, String str) {
        Preconditions.checkNotNull(kd);
        this.a = kd;
        this.c = null;
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final zzai b(zzai zzai, zzn zzn) {
        boolean z = false;
        if ("_cmp".equals(zzai.a)) {
            zzah zzah = zzai.b;
            if (!(zzah == null || zzah.size() == 0)) {
                String c2 = zzai.b.c("_cis");
                if (!TextUtils.isEmpty(c2) && (("referrer broadcast".equals(c2) || "referrer API".equals(c2)) && this.a.f().l(zzn.a))) {
                    z = true;
                }
            }
        }
        if (!z) {
            return zzai;
        }
        this.a.e().y().a("Event has been filtered ", zzai.toString());
        zzai zzai2 = new zzai("_cmpx", zzai.b, zzai.c, zzai.d);
        return zzai2;
    }

    public final void a(zzai zzai, String str, String str2) {
        Preconditions.checkNotNull(zzai);
        Preconditions.checkNotEmpty(str);
        a(str, true);
        a((Runnable) new Zb(this, zzai, str));
    }

    public final byte[] a(zzai zzai, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzai);
        a(str, true);
        this.a.e().z().a("Log and bundle. event", this.a.r().a(zzai.a));
        long nanoTime = this.a.c().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.d().b((Callable<V>) new C1090bc<V>(this, zzai, str)).get();
            if (bArr == null) {
                this.a.e().s().a("Log and bundle returned null. appId", C1124ib.a(str));
                bArr = new byte[0];
            }
            this.a.e().z().a("Log and bundle processed. event, size, time_ms", this.a.r().a(zzai.a), Integer.valueOf(bArr.length), Long.valueOf((this.a.c().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().s().a("Failed to log and bundle. appId, event, error", C1124ib.a(str), this.a.r().a(zzai.a), e);
            return null;
        }
    }

    private final void b(zzn zzn, boolean z) {
        Preconditions.checkNotNull(zzn);
        a(zzn.a, false);
        this.a.s().d(zzn.b, zzn.r);
    }

    public final void a(zzjn zzjn, zzn zzn) {
        Preconditions.checkNotNull(zzjn);
        b(zzn, false);
        if (zzjn.i() == null) {
            a((Runnable) new C1085ac(this, zzjn, zzn));
        } else {
            a((Runnable) new C1105ec(this, zzjn, zzn));
        }
    }

    public final List<zzjn> a(zzn zzn, boolean z) {
        b(zzn, false);
        try {
            List<Sd> list = (List) this.a.d().a((Callable<V>) new C1100dc<V>(this, zzn)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (Sd sd : list) {
                if (z || !Vd.e(sd.c)) {
                    arrayList.add(new zzjn(sd));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().s().a("Failed to get user attributes. appId", C1124ib.a(zzn.a), e);
            return null;
        }
    }

    public final void a(zzn zzn) {
        b(zzn, false);
        a((Runnable) new C1115gc(this, zzn));
    }

    private final void a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.c) && !UidVerifier.isGooglePlayServicesUid(this.a.getContext(), Binder.getCallingUid())) {
                            if (!GoogleSignatureVerifier.getInstance(this.a.getContext()).isUidGoogleSigned(Binder.getCallingUid())) {
                                z2 = false;
                                this.b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.a.e().s().a("Measurement Service called with invalid calling package. appId", C1124ib.a(str));
                    throw e;
                }
            }
            if (this.c == null && GooglePlayServicesUtilLight.uidHasPackageName(this.a.getContext(), Binder.getCallingUid(), str)) {
                this.c = str;
            }
            if (!str.equals(this.c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        String str2 = "Measurement Service called without app package";
        this.a.e().s().a(str2);
        throw new SecurityException(str2);
    }

    public final void a(long j, String str, String str2, String str3) {
        C1110fc fcVar = new C1110fc(this, str2, str3, str, j);
        a((Runnable) fcVar);
    }

    public final void a(zzq zzq, zzn zzn) {
        Preconditions.checkNotNull(zzq);
        Preconditions.checkNotNull(zzq.c);
        b(zzn, false);
        zzq zzq2 = new zzq(zzq);
        zzq2.a = zzn.a;
        if (zzq.c.i() == null) {
            a((Runnable) new Pb(this, zzq2, zzn));
        } else {
            a((Runnable) new Sb(this, zzq2, zzn));
        }
    }

    public final void a(zzq zzq) {
        Preconditions.checkNotNull(zzq);
        Preconditions.checkNotNull(zzq.c);
        a(zzq.a, true);
        zzq zzq2 = new zzq(zzq);
        if (zzq.c.i() == null) {
            a((Runnable) new Rb(this, zzq2));
        } else {
            a((Runnable) new Ub(this, zzq2));
        }
    }

    public final List<zzjn> a(String str, String str2, boolean z, zzn zzn) {
        b(zzn, false);
        try {
            List<Sd> list = (List) this.a.d().a((Callable<V>) new Tb<V>(this, zzn, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (Sd sd : list) {
                if (z || !Vd.e(sd.c)) {
                    arrayList.add(new zzjn(sd));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().s().a("Failed to get user attributes. appId", C1124ib.a(zzn.a), e);
            return Collections.emptyList();
        }
    }

    public final List<zzjn> a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<Sd> list = (List) this.a.d().a((Callable<V>) new Wb<V>(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (Sd sd : list) {
                if (z || !Vd.e(sd.c)) {
                    arrayList.add(new zzjn(sd));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().s().a("Failed to get user attributes. appId", C1124ib.a(str), e);
            return Collections.emptyList();
        }
    }

    public final List<zzq> a(String str, String str2, zzn zzn) {
        b(zzn, false);
        try {
            return (List) this.a.d().a((Callable<V>) new Vb<V>(this, zzn, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().s().a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List<zzq> a(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.a.d().a((Callable<V>) new Yb<V>(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().s().a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @VisibleForTesting
    private final void a(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.a.d().s()) {
            runnable.run();
        } else {
            this.a.d().a(runnable);
        }
    }
}
