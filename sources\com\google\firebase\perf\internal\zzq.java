package com.google.firebase.perf.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.internal.firebase-perf.C0892ta;
import com.google.android.gms.internal.firebase-perf.C0892ta.a;
import com.google.android.gms.internal.firebase-perf.C0908xa;
import com.google.android.gms.internal.firebase-perf.C0911y;
import com.google.android.gms.internal.firebase-perf.zzbg;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class zzq implements Parcelable {
    public static final Creator<zzq> CREATOR = new s();
    private String a;
    private boolean b;
    private zzbg c;

    private zzq(String str, C0911y yVar) {
        this.b = false;
        this.a = str;
        this.c = new zzbg();
    }

    public static zzq b() {
        String replaceAll = UUID.randomUUID().toString().replaceAll("\\-", "");
        zzq zzq = new zzq(replaceAll, new C0911y());
        zzq.b = a(FeatureControl.zzao().zzap(), FeatureControl.zzao().zzas());
        Object[] objArr = new Object[2];
        objArr[0] = zzq.b ? "Verbose" : "Non Verbose";
        objArr[1] = replaceAll;
        Log.d("FirebasePerformance", String.format("Creating a new %s Session: %s", objArr));
        return zzq;
    }

    public static boolean f() {
        return a(true, 1.0f);
    }

    public final boolean a() {
        return TimeUnit.MICROSECONDS.toMinutes(this.c.c()) > FeatureControl.zzao().zzax();
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public int describeContents() {
        return 0;
    }

    public final C0892ta e() {
        a p = C0892ta.p();
        p.a(this.a);
        if (this.b) {
            p.a(C0908xa.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (C0892ta) p.b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeParcelable(this.c, 0);
    }

    public static C0892ta[] a(List<zzq> list) {
        if (list.isEmpty()) {
            return null;
        }
        C0892ta[] taVarArr = new C0892ta[list.size()];
        C0892ta e = ((zzq) list.get(0)).e();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            C0892ta e2 = ((zzq) list.get(i)).e();
            if (z || !((zzq) list.get(i)).b) {
                taVarArr[i] = e2;
            } else {
                taVarArr[0] = e2;
                taVarArr[i] = e;
                z = true;
            }
        }
        if (!z) {
            taVarArr[0] = e;
        }
        return taVarArr;
    }

    private zzq(Parcel parcel) {
        boolean z = false;
        this.b = false;
        this.a = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        }
        this.b = z;
        this.c = (zzbg) parcel.readParcelable(zzbg.class.getClassLoader());
    }

    /* synthetic */ zzq(Parcel parcel, s sVar) {
        this(parcel);
    }

    private static boolean a(boolean z, float f) {
        return z && Math.random() * 100.0d < ((double) f);
    }
}
