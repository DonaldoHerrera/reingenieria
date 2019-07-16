package com.soundcloud.android.foundation.events;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

@EVa(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\u0006\u0010\"\u001a\u00020#J\u0006\u0010\u000f\u001a\u00020#J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lcom/soundcloud/android/foundation/events/PromotedSourceInfo;", "Landroid/os/Parcelable;", "adUrn", "", "promotedItemUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "promoterUrn", "trackingUrls", "", "isPlaybackStarted", "", "(Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/util/List;Z)V", "getAdUrn", "()Ljava/lang/String;", "()Z", "setPlaybackStarted", "(Z)V", "getPromotedItemUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getPromoterUrn", "getTrackingUrls", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "resetPlaybackStarted", "", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "events_release"}, mv = {1, 1, 15})
@SuppressLint({"ParcelCreator"})
/* compiled from: PromotedSourceInfo.kt */
public final class PromotedSourceInfo implements Parcelable {
    public static final Creator CREATOR = new b();
    public static final a a = new a(null);
    private final String b;
    private final C3508cda c;
    private final C3508cda d;
    private final List<String> e;
    private boolean f;

    /* compiled from: PromotedSourceInfo.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final PromotedSourceInfo a(C3508cda cda, C3879tda tda) {
            C7471uYa.b(cda, "promotedItemUrn");
            C7471uYa.b(tda, "promotedProperties");
            String b = tda.a().b();
            C7471uYa.a((Object) b, "promotedProperties.adUrn.content");
            C3895vda b2 = tda.b();
            PromotedSourceInfo promotedSourceInfo = new PromotedSourceInfo(b, cda, b2 != null ? b2.c() : null, tda.c().e(), false, 16, null);
            return promotedSourceInfo;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            PromotedSourceInfo promotedSourceInfo = new PromotedSourceInfo(parcel.readString(), (C3508cda) N.a.a(parcel), (C3508cda) w.a.a(parcel), parcel.createStringArrayList(), parcel.readInt() != 0);
            return promotedSourceInfo;
        }

        public final Object[] newArray(int i) {
            return new PromotedSourceInfo[i];
        }
    }

    public PromotedSourceInfo(String str, C3508cda cda, C3508cda cda2, List<String> list, boolean z) {
        C7471uYa.b(str, "adUrn");
        C7471uYa.b(cda, "promotedItemUrn");
        C7471uYa.b(list, "trackingUrls");
        this.b = str;
        this.c = cda;
        this.d = cda2;
        this.e = list;
        this.f = z;
    }

    @NXa
    public static final PromotedSourceInfo a(C3508cda cda, C3879tda tda) {
        return a.a(cda, tda);
    }

    public final String a() {
        return this.b;
    }

    public final C3508cda b() {
        return this.c;
    }

    public final C3508cda c() {
        return this.d;
    }

    public final List<String> d() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PromotedSourceInfo) {
                PromotedSourceInfo promotedSourceInfo = (PromotedSourceInfo) obj;
                if (C7471uYa.a((Object) this.b, (Object) promotedSourceInfo.b) && C7471uYa.a((Object) this.c, (Object) promotedSourceInfo.c) && C7471uYa.a((Object) this.d, (Object) promotedSourceInfo.d) && C7471uYa.a((Object) this.e, (Object) promotedSourceInfo.e)) {
                    if (this.f == promotedSourceInfo.f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void f() {
        this.f = false;
    }

    public final void g() {
        this.f = true;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C3508cda cda = this.c;
        int hashCode2 = (hashCode + (cda != null ? cda.hashCode() : 0)) * 31;
        C3508cda cda2 = this.d;
        int hashCode3 = (hashCode2 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        List<String> list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromotedSourceInfo(adUrn=");
        sb.append(this.b);
        sb.append(", promotedItemUrn=");
        sb.append(this.c);
        sb.append(", promoterUrn=");
        sb.append(this.d);
        sb.append(", trackingUrls=");
        sb.append(this.e);
        sb.append(", isPlaybackStarted=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeString(this.b);
        N.a.a(this.c, parcel, i);
        w.a.a(this.d, parcel, i);
        parcel.writeStringList(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ PromotedSourceInfo(String str, C3508cda cda, C3508cda cda2, List list, boolean z, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            cda2 = null;
        }
        C3508cda cda3 = cda2;
        if ((i & 8) != 0) {
            list = C6918mWa.a();
        }
        this(str, cda, cda3, list, (i & 16) != 0 ? false : z);
    }
}
