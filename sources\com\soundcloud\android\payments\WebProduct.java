package com.soundcloud.android.payments;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bq\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Js\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\u0006\u0010-\u001a\u00020*J\t\u0010.\u001a\u00020\tHÖ\u0001J\u0006\u0010/\u001a\u00020*J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u00066"}, d2 = {"Lcom/soundcloud/android/payments/WebProduct;", "Landroid/os/Parcelable;", "planId", "", "packageUrn", "priceData", "Lcom/soundcloud/android/payments/WebPrice;", "discountPriceData", "trialDays", "", "promoDays", "promoPriceData", "proratedPriceData", "startDate", "expiryDate", "(Ljava/lang/String;Ljava/lang/String;Lcom/soundcloud/android/payments/WebPrice;Lcom/soundcloud/android/payments/WebPrice;IILcom/soundcloud/android/payments/WebPrice;Lcom/soundcloud/android/payments/WebPrice;Ljava/lang/String;Ljava/lang/String;)V", "getDiscountPriceData", "()Lcom/soundcloud/android/payments/WebPrice;", "getExpiryDate", "()Ljava/lang/String;", "getPackageUrn", "getPlanId", "getPriceData", "getPromoDays", "()I", "getPromoPriceData", "getProratedPriceData", "getStartDate", "getTrialDays", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hasPromo", "hashCode", "isStudentTier", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments_release"}, mv = {1, 1, 15})
@SuppressLint({"ParcelCreator"})
/* compiled from: WebProduct.kt */
public final class WebProduct implements Parcelable {
    public static final Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final WebPrice c;
    private final WebPrice d;
    private final int e;
    private final int f;
    private final WebPrice g;
    private final WebPrice h;
    private final String i;
    private final String j;

    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            WebProduct webProduct = new WebProduct(parcel.readString(), parcel.readString(), (WebPrice) WebPrice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? (WebPrice) WebPrice.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (WebPrice) WebPrice.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (WebPrice) WebPrice.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
            return webProduct;
        }

        public final Object[] newArray(int i) {
            return new WebProduct[i];
        }
    }

    @JsonCreator
    public WebProduct(@JsonProperty("plan_id") String str, @JsonProperty("package_urn") String str2, @JsonProperty("price_data") WebPrice webPrice, @JsonProperty("discount_price_data") WebPrice webPrice2, @JsonProperty("trial_days") int i2, @JsonProperty("promo_days") int i3, @JsonProperty("promo_price_data") WebPrice webPrice3, @JsonProperty("prorated_price_data") WebPrice webPrice4, @JsonProperty("start_date") String str3, @JsonProperty("expiry_date") String str4) {
        C7471uYa.b(str, "planId");
        C7471uYa.b(str2, "packageUrn");
        C7471uYa.b(webPrice, "priceData");
        C7471uYa.b(str3, "startDate");
        C7471uYa.b(str4, "expiryDate");
        this.a = str;
        this.b = str2;
        this.c = webPrice;
        this.d = webPrice2;
        this.e = i2;
        this.f = i3;
        this.g = webPrice3;
        this.h = webPrice4;
        this.i = str3;
        this.j = str4;
    }

    public final WebPrice a() {
        return this.d;
    }

    public final String b() {
        return this.j;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public final WebPrice e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WebProduct) {
                WebProduct webProduct = (WebProduct) obj;
                if (C7471uYa.a((Object) this.a, (Object) webProduct.a) && C7471uYa.a((Object) this.b, (Object) webProduct.b) && C7471uYa.a((Object) this.c, (Object) webProduct.c) && C7471uYa.a((Object) this.d, (Object) webProduct.d)) {
                    if (this.e == webProduct.e) {
                        if (!(this.f == webProduct.f) || !C7471uYa.a((Object) this.g, (Object) webProduct.g) || !C7471uYa.a((Object) this.h, (Object) webProduct.h) || !C7471uYa.a((Object) this.i, (Object) webProduct.i) || !C7471uYa.a((Object) this.j, (Object) webProduct.j)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int f() {
        return this.f;
    }

    public final WebPrice g() {
        return this.g;
    }

    public final WebPrice h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        WebPrice webPrice = this.c;
        int hashCode3 = (hashCode2 + (webPrice != null ? webPrice.hashCode() : 0)) * 31;
        WebPrice webPrice2 = this.d;
        int hashCode4 = (((((hashCode3 + (webPrice2 != null ? webPrice2.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31;
        WebPrice webPrice3 = this.g;
        int hashCode5 = (hashCode4 + (webPrice3 != null ? webPrice3.hashCode() : 0)) * 31;
        WebPrice webPrice4 = this.h;
        int hashCode6 = (hashCode5 + (webPrice4 != null ? webPrice4.hashCode() : 0)) * 31;
        String str3 = this.i;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.j;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode7 + i2;
    }

    public final int i() {
        return this.e;
    }

    public final boolean j() {
        return this.f > 0;
    }

    public final boolean k() {
        return C2455aV.g.a(this.a) == C2455aV.STUDENT_TIER;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WebProduct(planId=");
        sb.append(this.a);
        sb.append(", packageUrn=");
        sb.append(this.b);
        sb.append(", priceData=");
        sb.append(this.c);
        sb.append(", discountPriceData=");
        sb.append(this.d);
        sb.append(", trialDays=");
        sb.append(this.e);
        sb.append(", promoDays=");
        sb.append(this.f);
        sb.append(", promoPriceData=");
        sb.append(this.g);
        sb.append(", proratedPriceData=");
        sb.append(this.h);
        sb.append(", startDate=");
        sb.append(this.i);
        sb.append(", expiryDate=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, 0);
        WebPrice webPrice = this.d;
        if (webPrice != null) {
            parcel.writeInt(1);
            webPrice.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        WebPrice webPrice2 = this.g;
        if (webPrice2 != null) {
            parcel.writeInt(1);
            webPrice2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        WebPrice webPrice3 = this.h;
        if (webPrice3 != null) {
            parcel.writeInt(1);
            webPrice3.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }
}
