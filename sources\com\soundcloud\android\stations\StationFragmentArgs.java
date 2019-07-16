package com.soundcloud.android.stations;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.soundcloud.android.foundation.playqueue.m;

@EVa(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÂ\u0003J+\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\t\u0010\u0016\u001a\u00020\fHÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fHÖ\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/stations/StationFragmentArgs;", "Landroid/os/Parcelable;", "stationUrn", "", "seedUrn", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "getDiscoverySource", "Lcom/soundcloud/android/foundation/playqueue/DiscoverySource;", "getSeedTrackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "getStationUrn", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "base_release"}, mv = {1, 1, 15})
@SuppressLint({"ParcelCreator"})
/* compiled from: StationFragmentArgs.kt */
public final class StationFragmentArgs implements Parcelable {
    public static final Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;

    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            return new StationFragmentArgs(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new StationFragmentArgs[i];
        }
    }

    public StationFragmentArgs(String str, String str2, String str3) {
        C7471uYa.b(str, "stationUrn");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final m a() {
        String str = this.c;
        if (str == null) {
            return m.STATIONS;
        }
        m a2 = m.a(str);
        C7471uYa.a((Object) a2, "DiscoverySource.from(source)");
        return a2;
    }

    public final C3508cda b() {
        String str = this.b;
        if (str != null) {
            return new C3508cda(str);
        }
        return null;
    }

    public final C3508cda c() {
        return new C3508cda(this.a);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args", this);
        return bundle;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StationFragmentArgs) {
                StationFragmentArgs stationFragmentArgs = (StationFragmentArgs) obj;
                if (C7471uYa.a((Object) this.a, (Object) stationFragmentArgs.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) stationFragmentArgs.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationFragmentArgs(stationUrn=");
        sb.append(this.a);
        sb.append(", seedUrn=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
