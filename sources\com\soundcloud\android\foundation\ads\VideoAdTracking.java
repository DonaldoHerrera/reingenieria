package com.soundcloud.android.foundation.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 +2\u00020\u0001:\u0001+B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\rHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\t\u0010 \u001a\u00020\rHÖ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\rHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\rHÖ\u0001R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006,"}, d2 = {"Lcom/soundcloud/android/foundation/ads/VideoAdTracking;", "Landroid/os/Parcelable;", "duration", "", "uuid", "", "monetizationType", "adVerificationResources", "", "Lcom/soundcloud/android/foundation/ads/AdVerificationResource;", "isSkippable", "", "skipOffset", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZI)V", "getAdVerificationResources", "()Ljava/util/List;", "getDuration", "()J", "()Z", "getMonetizationType", "()Ljava/lang/String;", "getSkipOffset", "()I", "getUuid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "ads_release"}, mv = {1, 1, 15})
/* compiled from: VideoAdTracking.kt */
public class VideoAdTracking implements Parcelable {
    public static final Creator CREATOR = new b();
    public static final a a = new a(null);
    private final long b;
    private final String c;
    private final String d;
    private final List<AdVerificationResource> e;
    private final boolean f;
    private final int g;

    /* compiled from: VideoAdTracking.kt */
    public static final class a {
        private a() {
        }

        public final VideoAdTracking a(aa aaVar) {
            C7471uYa.b(aaVar, "videoAd");
            VideoAdTracking videoAdTracking = new VideoAdTracking(aaVar.B(), aaVar.I(), aaVar.k().a(), aaVar.J(), aaVar.z(), aaVar.v());
            return videoAdTracking;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C7471uYa.b(parcel, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((AdVerificationResource) AdVerificationResource.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            VideoAdTracking videoAdTracking = new VideoAdTracking(readLong, readString, readString2, arrayList, parcel.readInt() != 0, parcel.readInt());
            return videoAdTracking;
        }

        public final Object[] newArray(int i) {
            return new VideoAdTracking[i];
        }
    }

    public VideoAdTracking(long j, String str, String str2, List<AdVerificationResource> list, boolean z, int i) {
        C7471uYa.b(str, "uuid");
        C7471uYa.b(str2, "monetizationType");
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = z;
        this.g = i;
    }

    public List<AdVerificationResource> a() {
        return this.e;
    }

    public long b() {
        return this.b;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.g;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoAdTracking) {
                VideoAdTracking videoAdTracking = (VideoAdTracking) obj;
                if ((b() == videoAdTracking.b()) && C7471uYa.a((Object) e(), (Object) videoAdTracking.e()) && C7471uYa.a((Object) c(), (Object) videoAdTracking.c()) && C7471uYa.a((Object) a(), (Object) videoAdTracking.a())) {
                    if (f() == videoAdTracking.f()) {
                        if (d() == videoAdTracking.d()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f;
    }

    public int hashCode() {
        long b2 = b();
        int i = ((int) (b2 ^ (b2 >>> 32))) * 31;
        String e2 = e();
        int i2 = 0;
        int hashCode = (i + (e2 != null ? e2.hashCode() : 0)) * 31;
        String c2 = c();
        int hashCode2 = (hashCode + (c2 != null ? c2.hashCode() : 0)) * 31;
        List a2 = a();
        if (a2 != null) {
            i2 = a2.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean f2 = f();
        if (f2) {
            f2 = true;
        }
        return ((i3 + (f2 ? 1 : 0)) * 31) + d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoAdTracking(duration=");
        sb.append(b());
        sb.append(", uuid=");
        sb.append(e());
        sb.append(", monetizationType=");
        sb.append(c());
        sb.append(", adVerificationResources=");
        sb.append(a());
        sb.append(", isSkippable=");
        sb.append(f());
        sb.append(", skipOffset=");
        sb.append(d());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        List<AdVerificationResource> list = this.e;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (AdVerificationResource writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g);
    }
}
