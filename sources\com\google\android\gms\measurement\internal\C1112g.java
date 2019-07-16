package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.g reason: case insensitive filesystem */
public final class C1112g {
    final String a;
    final String b;
    private final String c;
    final long d;
    final long e;
    final zzah f;

    private C1112g(Mb mb, String str, String str2, String str3, long j, long j2, zzah zzah) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzah);
        this.a = str2;
        this.b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.c = str;
        this.d = j;
        this.e = j2;
        long j3 = this.e;
        if (j3 != 0 && j3 > this.d) {
            mb.e().v().a("Event created with reverse previous/current timestamps. appId, name", C1124ib.a(str2), C1124ib.a(str3));
        }
        this.f = zzah;
    }

    /* access modifiers changed from: 0000 */
    public final C1112g a(Mb mb, long j) {
        C1112g gVar = new C1112g(mb, this.c, this.a, this.b, this.d, j, this.f);
        return gVar;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    C1112g(Mb mb, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzah zzah;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.a = str2;
        this.b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.c = str;
        this.d = j;
        this.e = j2;
        long j3 = this.e;
        if (j3 != 0 && j3 > this.d) {
            mb.e().v().a("Event created with reverse previous/current timestamps. appId", C1124ib.a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzah = new zzah(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    mb.e().s().a("Param name can't be null");
                    it.remove();
                } else {
                    Object a2 = mb.F().a(str4, bundle2.get(str4));
                    if (a2 == null) {
                        mb.e().v().a("Param value can't be null", mb.E().b(str4));
                        it.remove();
                    } else {
                        mb.F().a(bundle2, str4, a2);
                    }
                }
            }
            zzah = new zzah(bundle2);
        }
        this.f = zzah;
    }
}
