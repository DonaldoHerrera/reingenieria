package com.google.android.gms.internal.firebase-perf;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.concurrent.TimeUnit;

public class zzbg implements Parcelable {
    public static final Creator<zzbg> CREATOR = new K();
    private long a;
    private long b;

    public zzbg() {
        this.a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.b = System.nanoTime();
    }

    public final void a() {
        this.a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.b = System.nanoTime();
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.b);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public final long a(zzbg zzbg) {
        return TimeUnit.NANOSECONDS.toMicros(zzbg.b - this.b);
    }

    private zzbg(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }

    /* synthetic */ zzbg(Parcel parcel, K k) {
        this(parcel);
    }
}
