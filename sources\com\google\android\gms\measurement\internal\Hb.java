package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C0941da;
import com.google.android.gms.internal.measurement.C0948ea;
import com.google.android.gms.internal.measurement.C0955fa;
import com.google.android.gms.internal.measurement.C1044td;
import com.google.android.gms.internal.measurement.C1062wd;
import com.google.android.gms.internal.measurement.D;
import com.google.android.gms.internal.measurement.D.a;
import com.google.android.gms.internal.measurement.E;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.N;
import java.io.IOException;
import java.util.Map;

public final class Hb extends Ld implements ee {
    @VisibleForTesting
    private static int d = 65535;
    @VisibleForTesting
    private static int e = 2;
    private final Map<String, Map<String, String>> f = new T();
    private final Map<String, Map<String, Boolean>> g = new T();
    private final Map<String, Map<String, Boolean>> h = new T();
    private final Map<String, C0948ea> i = new T();
    private final Map<String, Map<String, Integer>> j = new T();
    private final Map<String, String> k = new T();

    Hb(Kd kd) {
        super(kd);
    }

    private final void i(String str) {
        s();
        i();
        Preconditions.checkNotEmpty(str);
        if (this.i.get(str) == null) {
            byte[] d2 = o().d(str);
            if (d2 == null) {
                this.f.put(str, null);
                this.g.put(str, null);
                this.h.put(str, null);
                this.i.put(str, null);
                this.k.put(str, null);
                this.j.put(str, null);
                return;
            }
            C0948ea a = a(str, d2);
            this.f.put(str, a(a));
            a(str, a);
            this.i.put(str, a);
            this.k.put(str, null);
        }
    }

    /* access modifiers changed from: protected */
    public final C0948ea a(String str) {
        s();
        i();
        Preconditions.checkNotEmpty(str);
        i(str);
        return (C0948ea) this.i.get(str);
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        i();
        return (String) this.k.get(str);
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        i();
        this.k.put(str, null);
    }

    /* access modifiers changed from: 0000 */
    public final void d(String str) {
        i();
        this.i.remove(str);
    }

    /* access modifiers changed from: 0000 */
    public final boolean e(String str) {
        i();
        C0948ea a = a(str);
        if (a == null) {
            return false;
        }
        Boolean bool = a.j;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final long f(String str) {
        String a = a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException e2) {
                e().v().a("Unable to parse timezone offset. appId", C1124ib.a(str), e2);
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean g(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* access modifiers changed from: 0000 */
    public final boolean h(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    public final /* bridge */ /* synthetic */ C1097d j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ C1114gb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Vd l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Rd m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ ae n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ he o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(String str, String str2) {
        i();
        i(str);
        if (g(str) && Vd.e(str2)) {
            return true;
        }
        if (h(str) && Vd.a(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final boolean c(String str, String str2) {
        i();
        i(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = (Map) this.h.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final int d(String str, String str2) {
        i();
        i(str);
        Map map = (Map) this.j.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final /* bridge */ /* synthetic */ C1124ib e() {
        return super.e();
    }

    public final String a(String str, String str2) {
        i();
        i(str);
        Map map = (Map) this.f.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ ce f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    private static Map<String, String> a(C0948ea eaVar) {
        T t = new T();
        if (eaVar != null) {
            N[] nArr = eaVar.f;
            if (nArr != null) {
                for (N n : nArr) {
                    if (n != null) {
                        t.put(n.p(), n.q());
                    }
                }
            }
        }
        return t;
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    private final void a(String str, C0948ea eaVar) {
        T t = new T();
        T t2 = new T();
        T t3 = new T();
        if (eaVar != null) {
            C0955fa[] faVarArr = eaVar.g;
            if (faVarArr != null) {
                for (C0955fa faVar : faVarArr) {
                    if (TextUtils.isEmpty(faVar.d)) {
                        e().v().a("EventConfig contained null event name");
                    } else {
                        String a = C1145mc.a(faVar.d);
                        if (!TextUtils.isEmpty(a)) {
                            faVar.d = a;
                        }
                        t.put(faVar.d, faVar.e);
                        t2.put(faVar.d, faVar.f);
                        Integer num = faVar.g;
                        if (num != null) {
                            if (num.intValue() < e || faVar.g.intValue() > d) {
                                e().v().a("Invalid sampling rate. Event name, sample rate", faVar.d, faVar.g);
                            } else {
                                t3.put(faVar.d, faVar.g);
                            }
                        }
                    }
                }
            }
        }
        this.g.put(str, t);
        this.h.put(str, t2);
        this.j.put(str, t3);
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        boolean z;
        String str3 = str;
        s();
        i();
        Preconditions.checkNotEmpty(str);
        C0948ea a = a(str, bArr);
        if (a == null) {
            return false;
        }
        a(str3, a);
        this.i.put(str3, a);
        this.k.put(str3, str2);
        this.f.put(str3, a(a));
        ae n = n();
        C0941da[] daVarArr = a.h;
        Preconditions.checkNotNull(daVarArr);
        for (C0941da daVar : daVarArr) {
            if (daVar.f != null) {
                int i2 = 0;
                while (true) {
                    D[] dArr = daVar.f;
                    if (i2 >= dArr.length) {
                        break;
                    }
                    a aVar = (a) dArr[i2].l();
                    a aVar2 = (a) aVar.clone();
                    String a2 = C1145mc.a(aVar.k());
                    if (a2 != null) {
                        aVar2.a(a2);
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = z;
                    for (int i3 = 0; i3 < aVar.l(); i3++) {
                        E a3 = aVar.a(i3);
                        String a4 = C1140lc.a(a3.x());
                        if (a4 != null) {
                            E.a aVar3 = (E.a) a3.l();
                            aVar3.a(a4);
                            aVar2.a(i3, (E) aVar3.w());
                            z2 = true;
                        }
                    }
                    if (z2) {
                        daVar.f[i2] = (D) aVar2.w();
                    }
                    i2++;
                }
            }
            if (daVar.e != null) {
                int i4 = 0;
                while (true) {
                    G[] gArr = daVar.e;
                    if (i4 >= gArr.length) {
                        break;
                    }
                    G g2 = gArr[i4];
                    String a5 = C1155oc.a(g2.q());
                    if (a5 != null) {
                        G[] gArr2 = daVar.e;
                        G.a aVar4 = (G.a) g2.l();
                        aVar4.a(a5);
                        gArr2[i4] = (G) aVar4.w();
                    }
                    i4++;
                }
            }
        }
        n.o().a(str3, daVarArr);
        try {
            a.h = null;
            bArr2 = new byte[a.b()];
            a.a(C1062wd.a(bArr2, 0, bArr2.length));
        } catch (IOException e2) {
            e().v().a("Unable to serialize reduced-size config. Storing full config instead. appId", C1124ib.a(str), e2);
            bArr2 = bArr;
        }
        he o = o();
        Preconditions.checkNotEmpty(str);
        o.i();
        o.s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) o.w().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                o.e().s().a("Failed to update remote config (got 0). appId", C1124ib.a(str));
            }
        } catch (SQLiteException e3) {
            o.e().s().a("Error storing remote config. appId", C1124ib.a(str), e3);
        }
        return true;
    }

    private final C0948ea a(String str, byte[] bArr) {
        if (bArr == null) {
            return new C0948ea();
        }
        C1044td a = C1044td.a(bArr, 0, bArr.length);
        C0948ea eaVar = new C0948ea();
        try {
            eaVar.a(a);
            e().A().a("Parsed config. version, gmp_app_id", eaVar.c, eaVar.d);
            return eaVar;
        } catch (IOException e2) {
            e().v().a("Unable to merge remote config. appId", C1124ib.a(str), e2);
            return new C0948ea();
        }
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
