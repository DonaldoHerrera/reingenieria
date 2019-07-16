package com.soundcloud.android.payments;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

@EVa(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\b\u0010\u0015\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\b\u0010\u001f\u001a\u00020\u0005H\u0002J\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0005J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\u0019\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006("}, d2 = {"Lcom/soundcloud/android/payments/WebPrice;", "Landroid/os/Parcelable;", "amount", "", "currency", "", "(ILjava/lang/String;)V", "getAmount", "()I", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "configureCurrencyFormatter", "Ljava/text/NumberFormat;", "symbol", "configureSymbol", "", "decimalFormat", "Ljava/text/DecimalFormat;", "copy", "currencySymbol", "decimalAmount", "", "describeContents", "equals", "", "other", "", "hasDecimalPlaces", "hashCode", "resolveDefaultSymbol", "toDecimalString", "toDisplayFormat", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments_release"}, mv = {1, 1, 15})
@SuppressLint({"ParcelCreator"})
/* compiled from: WebPrice.kt */
public final class WebPrice implements Parcelable {
    public static final Creator CREATOR = new b();
    public static final a a = new a(null);
    private final int b;
    private final String c;

    /* compiled from: WebPrice.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            return new WebPrice(parcel.readInt(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new WebPrice[i];
        }
    }

    @JsonCreator
    public WebPrice(@JsonProperty("amount") int i, @JsonProperty("currency") String str) {
        C7471uYa.b(str, "currency");
        this.b = i;
        this.c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r0.equals("CAD") != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r0.equals("AUD") != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return "$";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r0.equals("USD") != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0.equals("NZD") != false) goto L_0x0043;
     */
    private final String d() {
        String str = this.c;
        switch (str.hashCode()) {
            case 65168:
                break;
            case 66470:
                break;
            case 69026:
                if (str.equals("EUR")) {
                    return "€";
                }
                break;
            case 70357:
                if (str.equals("GBP")) {
                    return "£";
                }
                break;
            case 77816:
                break;
            case 84326:
                break;
        }
    }

    private final float e() {
        return ((float) this.b) / 100.0f;
    }

    private final boolean f() {
        return this.b % 100 > 0;
    }

    private final String g() {
        try {
            Currency instance = Currency.getInstance(this.c);
            C7471uYa.a((Object) instance, "Currency.getInstance(currency)");
            String symbol = instance.getSymbol();
            C7471uYa.a((Object) symbol, "Currency.getInstance(currency).symbol");
            return symbol;
        } catch (IllegalArgumentException unused) {
            return this.c;
        }
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        KYa kYa = KYa.a;
        Locale locale = Locale.US;
        C7471uYa.a((Object) locale, "Locale.US");
        Object[] objArr = {Float.valueOf(e())};
        String format = String.format(locale, "%.2f", Arrays.copyOf(objArr, objArr.length));
        C7471uYa.a((Object) format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public final String c() {
        String format = a(d()).format((double) e());
        C7471uYa.a((Object) format, "currencyFormat.format(decimalAmount().toDouble())");
        return format;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WebPrice) {
                WebPrice webPrice = (WebPrice) obj;
                if (!(this.b == webPrice.b) || !C7471uYa.a((Object) this.c, (Object) webPrice.c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.b * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WebPrice(amount=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7471uYa.b(parcel, "parcel");
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    private final NumberFormat a(String str) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        if (currencyInstance instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
            a(decimalFormat, str);
            if (!f()) {
                decimalFormat.setMinimumFractionDigits(0);
            }
        }
        C7471uYa.a((Object) currencyInstance, "numberFormat");
        return currencyInstance;
    }

    private final void a(DecimalFormat decimalFormat, String str) {
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        C7471uYa.a((Object) decimalFormatSymbols, "symbols");
        decimalFormatSymbols.setCurrencySymbol(str);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
    }
}
