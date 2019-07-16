package com.soundcloud.android.search;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@EVa(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JN\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\b\u0010#\u001a\u0004\u0018\u00010$J\t\u0010%\u001a\u00020\tHÖ\u0001J\u0006\u0010&\u001a\u00020'J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006."}, d2 = {"Lcom/soundcloud/android/search/SearchFragmentArgs;", "Landroid/os/Parcelable;", "searchType", "Lcom/soundcloud/android/search/SearchType;", "apiQuery", "", "userQuery", "stringQueryUrn", "queryPosition", "", "publishSearchSubmissionEvent", "", "(Lcom/soundcloud/android/search/SearchType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getApiQuery", "()Ljava/lang/String;", "getPublishSearchSubmissionEvent", "()Z", "getQueryPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSearchType", "()Lcom/soundcloud/android/search/SearchType;", "getUserQuery", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/soundcloud/android/search/SearchType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/soundcloud/android/search/SearchFragmentArgs;", "describeContents", "equals", "other", "", "getQueryUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "base_release"}, mv = {1, 1, 15})
/* compiled from: SearchFragmentArgs.kt */
public final class SearchFragmentArgs implements Parcelable {
    public static final Creator CREATOR = new a();
    private final La a;
    private final String b;
    private final String c;
    private final String d;
    private final Integer e;
    private final boolean f;

    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            SearchFragmentArgs searchFragmentArgs = new SearchFragmentArgs((La) Enum.valueOf(La.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
            return searchFragmentArgs;
        }

        public final Object[] newArray(int i) {
            return new SearchFragmentArgs[i];
        }
    }

    public SearchFragmentArgs(La la, String str, String str2, String str3, Integer num, boolean z) {
        C7471uYa.b(la, "searchType");
        C7471uYa.b(str, "apiQuery");
        C7471uYa.b(str2, "userQuery");
        this.a = la;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = z;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.f;
    }

    public final Integer c() {
        return this.e;
    }

    public final C3508cda d() {
        String str = this.d;
        if (str != null) {
            return new C3508cda(str);
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public final La e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SearchFragmentArgs) {
                SearchFragmentArgs searchFragmentArgs = (SearchFragmentArgs) obj;
                if (C7471uYa.a((Object) this.a, (Object) searchFragmentArgs.a) && C7471uYa.a((Object) this.b, (Object) searchFragmentArgs.b) && C7471uYa.a((Object) this.c, (Object) searchFragmentArgs.c) && C7471uYa.a((Object) this.d, (Object) searchFragmentArgs.d) && C7471uYa.a((Object) this.e, (Object) searchFragmentArgs.e)) {
                    if (this.f == searchFragmentArgs.f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.c;
    }

    public final Bundle g() {
        return C1687sb.a(NVa.a("args", this));
    }

    public int hashCode() {
        La la = this.a;
        int i = 0;
        int hashCode = (la != null ? la.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchFragmentArgs(searchType=");
        sb.append(this.a);
        sb.append(", apiQuery=");
        sb.append(this.b);
        sb.append(", userQuery=");
        sb.append(this.c);
        sb.append(", stringQueryUrn=");
        sb.append(this.d);
        sb.append(", queryPosition=");
        sb.append(this.e);
        sb.append(", publishSearchSubmissionEvent=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C7471uYa.b(parcel, "parcel");
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Integer num = this.e;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
