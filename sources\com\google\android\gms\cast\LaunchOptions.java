package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.cast.X;
import java.util.Locale;

@Class(creator = "LaunchOptionsCreator")
@Reserved({1})
public class LaunchOptions extends AbstractSafeParcelable {
    public static final Creator<LaunchOptions> CREATOR = new C0687u();
    @Field(getter = "getRelaunchIfRunning", id = 2)
    private boolean a;
    @Field(getter = "getLanguage", id = 3)
    private String b;

    @VisibleForTesting
    public static final class a {
        private LaunchOptions a = new LaunchOptions();

        public final a a(Locale locale) {
            this.a.a(X.a(locale));
            return this;
        }

        public final LaunchOptions a() {
            return this.a;
        }
    }

    @Constructor
    LaunchOptions(@Param(id = 2) boolean z, @Param(id = 3) String str) {
        this.a = z;
        this.b = str;
    }

    public boolean F() {
        return this.a;
    }

    public void a(String str) {
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.a == launchOptions.a && X.a(this.b, launchOptions.b);
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.a), this.b);
    }

    public String i() {
        return this.b;
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, F());
        SafeParcelWriter.writeString(parcel, 3, i(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LaunchOptions() {
        this(false, X.a(Locale.getDefault()));
    }
}
