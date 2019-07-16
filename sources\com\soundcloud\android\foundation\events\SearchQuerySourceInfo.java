package com.soundcloud.android.foundation.events;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B?\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006+"}, d2 = {"Lcom/soundcloud/android/foundation/events/SearchQuerySourceInfo;", "Landroid/os/Parcelable;", "queryUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "queryString", "", "clickPosition", "", "clickUrn", "queryResults", "", "(Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;ILcom/soundcloud/android/foundation/domain/Urn;Ljava/util/List;)V", "getClickPosition", "()I", "setClickPosition", "(I)V", "getClickUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "setClickUrn", "(Lcom/soundcloud/android/foundation/domain/Urn;)V", "getQueryResults", "()Ljava/util/List;", "getQueryString", "()Ljava/lang/String;", "getQueryUrn", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "events_release"}, mv = {1, 1, 15})
@SuppressLint({"ParcelCreator"})
/* compiled from: SearchQuerySourceInfo.kt */
public final class SearchQuerySourceInfo implements Parcelable {
    public static final Creator CREATOR = new a();
    private final C3508cda a;
    private final String b;
    private int c;
    private C3508cda d;
    private final List<C3508cda> e;

    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            SearchQuerySourceInfo searchQuerySourceInfo = new SearchQuerySourceInfo((C3508cda) w.a.a(parcel), parcel.readString(), parcel.readInt(), (C3508cda) N.a.a(parcel), (List) M.a.a(parcel));
            return searchQuerySourceInfo;
        }

        public final Object[] newArray(int i) {
            return new SearchQuerySourceInfo[i];
        }
    }

    public SearchQuerySourceInfo(C3508cda cda, String str, int i, C3508cda cda2, List<C3508cda> list) {
        C7471uYa.b(str, "queryString");
        C7471uYa.b(cda2, "clickUrn");
        C7471uYa.b(list, "queryResults");
        this.a = cda;
        this.b = str;
        this.c = i;
        this.d = cda2;
        this.e = list;
    }

    public final int a() {
        return this.c;
    }

    public final C3508cda b() {
        return this.d;
    }

    public final List<C3508cda> c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public int describeContents() {
        return 0;
    }

    public final C3508cda e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SearchQuerySourceInfo) {
                SearchQuerySourceInfo searchQuerySourceInfo = (SearchQuerySourceInfo) obj;
                if (C7471uYa.a((Object) this.a, (Object) searchQuerySourceInfo.a) && C7471uYa.a((Object) this.b, (Object) searchQuerySourceInfo.b)) {
                    if (!(this.c == searchQuerySourceInfo.c) || !C7471uYa.a((Object) this.d, (Object) searchQuerySourceInfo.d) || !C7471uYa.a((Object) this.e, (Object) searchQuerySourceInfo.e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
        C3508cda cda2 = this.d;
        int hashCode3 = (hashCode2 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        List<C3508cda> list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchQuerySourceInfo(queryUrn=");
        sb.append(this.a);
        sb.append(", queryString=");
        sb.append(this.b);
        sb.append(", clickPosition=");
        sb.append(this.c);
        sb.append(", clickUrn=");
        sb.append(this.d);
        sb.append(", queryResults=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7471uYa.b(parcel, "parcel");
        w.a.a(this.a, parcel, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        N.a.a(this.d, parcel, i);
        M.a.a(this.e, parcel, i);
    }

    public /* synthetic */ SearchQuerySourceInfo(C3508cda cda, String str, int i, C3508cda cda2, List list, int i2, C7264rYa rya) {
        if ((i2 & 1) != 0) {
            cda = null;
        }
        C3508cda cda3 = cda;
        int i3 = (i2 & 4) != 0 ? -1 : i;
        if ((i2 & 8) != 0) {
            cda2 = C3508cda.a;
            C7471uYa.a((Object) cda2, "Urn.NOT_SET");
        }
        C3508cda cda4 = cda2;
        if ((i2 & 16) != 0) {
            list = C6918mWa.a();
        }
        this(cda3, str, i3, cda4, list);
    }
}
