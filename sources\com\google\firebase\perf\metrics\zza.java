package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.concurrent.atomic.AtomicLong;

public class zza implements Parcelable {
    public static final Creator<zza> CREATOR = new a();
    private final String a;
    private AtomicLong b;

    public zza(String str) {
        this.a = str;
        this.b = new AtomicLong(0);
    }

    public final void a(long j) {
        this.b.addAndGet(j);
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b.get());
    }

    /* access modifiers changed from: 0000 */
    public final long a() {
        return this.b.get();
    }

    /* access modifiers changed from: 0000 */
    public final void b(long j) {
        this.b.set(j);
    }

    private zza(Parcel parcel) {
        this.a = parcel.readString();
        this.b = new AtomicLong(parcel.readLong());
    }

    /* synthetic */ zza(Parcel parcel, a aVar) {
        this(parcel);
    }
}
