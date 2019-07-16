package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.clearcut.C0739b;
import com.google.android.gms.internal.clearcut.Wa;
import com.google.android.gms.internal.clearcut.bc;
import com.google.android.gms.internal.clearcut.lc;
import com.google.android.gms.internal.clearcut.oc;
import com.google.android.gms.internal.clearcut.uc;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.TimeZone;

@KeepForSdk
public final class a {
    private static final ClientKey<oc> a = new ClientKey<>();
    private static final AbstractClientBuilder<oc, NoOptions> b = new b();
    @Deprecated
    public static final Api<NoOptions> c = new Api<>("ClearcutLogger.API", b, a);
    private static final ExperimentTokens[] d = new ExperimentTokens[0];
    private static final String[] e = new String[0];
    private static final byte[][] f = new byte[0][];
    /* access modifiers changed from: private */
    public final Context g;
    /* access modifiers changed from: private */
    public final String h;
    /* access modifiers changed from: private */
    public final int i;
    /* access modifiers changed from: private */
    public String j;
    /* access modifiers changed from: private */
    public int k = -1;
    /* access modifiers changed from: private */
    public String l;
    private String m;
    /* access modifiers changed from: private */
    public final boolean n;
    /* access modifiers changed from: private */
    public bc o = bc.DEFAULT;
    /* access modifiers changed from: private */
    public final c p;
    /* access modifiers changed from: private */
    public final Clock q;
    /* access modifiers changed from: private */
    public d r;
    /* access modifiers changed from: private */
    public final b s;

    /* renamed from: com.google.android.gms.clearcut.a$a reason: collision with other inner class name */
    public class C0043a {
        private int a;
        private String b;
        private String c;
        private String d;
        private bc e;
        private final c f;
        private ArrayList<Integer> g;
        private ArrayList<String> h;
        private ArrayList<Integer> i;
        private ArrayList<ExperimentTokens> j;
        private ArrayList<byte[]> k;
        private boolean l;
        private final lc m;
        private boolean n;

        private C0043a(a aVar, byte[] bArr) {
            this(bArr, (c) null);
        }

        private C0043a(byte[] bArr, c cVar) {
            this.a = a.this.k;
            this.b = a.this.j;
            this.c = a.this.l;
            a aVar = a.this;
            this.d = null;
            this.e = aVar.o;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = true;
            this.m = new lc();
            this.n = false;
            this.c = a.this.l;
            this.d = null;
            this.m.A = C0739b.a(a.this.g);
            this.m.c = a.this.q.currentTimeMillis();
            this.m.d = a.this.q.elapsedRealtime();
            lc lcVar = this.m;
            a.this.r;
            lcVar.s = (long) (TimeZone.getDefault().getOffset(this.m.c) / 1000);
            if (bArr != null) {
                this.m.n = bArr;
            }
            this.f = null;
        }

        /* synthetic */ C0043a(a aVar, byte[] bArr, b bVar) {
            this(aVar, bArr);
        }

        @KeepForSdk
        public void a() {
            if (!this.n) {
                this.n = true;
                zzr zzr = new zzr(a.this.h, a.this.i, this.a, this.b, this.c, this.d, a.this.n, this.e);
                zze zze = new zze(zzr, this.m, null, null, a.b(null), null, a.b(null), null, null, this.l);
                if (a.this.s.a(zze)) {
                    a.this.p.a(zze);
                } else {
                    PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, (GoogleApiClient) null);
                }
            } else {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
        }
    }

    public interface b {
        boolean a(zze zze);
    }

    public interface c {
        byte[] a();
    }

    public static class d {
    }

    @VisibleForTesting
    private a(Context context, int i2, String str, String str2, String str3, boolean z, c cVar, Clock clock, d dVar, b bVar) {
        this.g = context;
        this.h = context.getPackageName();
        this.i = a(context);
        this.k = -1;
        this.j = str;
        this.l = str2;
        this.m = null;
        this.n = z;
        this.p = cVar;
        this.q = clock;
        this.r = new d();
        this.o = bc.DEFAULT;
        this.s = bVar;
        if (z) {
            Preconditions.checkArgument(str2 == null, "can't be anonymous with an upload account");
        }
    }

    private static int a(Context context) {
        int i2 = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i2).versionCode;
        } catch (NameNotFoundException e2) {
            Log.wtf("ClearcutLogger", "This can't happen.", e2);
            return i2;
        }
    }

    @KeepForSdk
    public static a a(Context context, String str) {
        a aVar = new a(context, -1, str, null, null, true, Wa.a(context), DefaultClock.getInstance(), null, new uc(context));
        return aVar;
    }

    /* access modifiers changed from: private */
    public static int[] b(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i4 = i3 + 1;
            iArr[i3] = ((Integer) obj).intValue();
            i3 = i4;
        }
        return iArr;
    }

    @KeepForSdk
    public final C0043a a(byte[] bArr) {
        return new C0043a(this, bArr, (b) null);
    }
}
