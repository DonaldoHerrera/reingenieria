package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Class(creator = "CastOptionsCreator")
@Reserved({1})
public class CastOptions extends AbstractSafeParcelable {
    public static final Creator<CastOptions> CREATOR = new C();
    @Field(getter = "getReceiverApplicationId", id = 2)
    private String a;
    @Field(getter = "getSupportedNamespaces", id = 3)
    private final List<String> b;
    @Field(getter = "getStopReceiverApplicationWhenEndingSession", id = 4)
    private boolean c;
    @Field(getter = "getLaunchOptions", id = 5)
    private final LaunchOptions d;
    @Field(getter = "getResumeSavedSession", id = 6)
    private final boolean e;
    @Field(getter = "getCastMediaOptions", id = 7)
    private final CastMediaOptions f;
    @Field(getter = "getEnableReconnectionService", id = 8)
    private final boolean g;
    @Field(getter = "getVolumeDeltaBeforeIceCreamSandwich", id = 9)
    private final double h;
    @Field(getter = "getEnableIpv6Support", id = 10)
    private final boolean i;

    @VisibleForTesting
    public static final class a {
        private String a;
        private List<String> b = new ArrayList();
        private boolean c;
        private LaunchOptions d = new LaunchOptions();
        private boolean e = true;
        private CastMediaOptions f = new com.google.android.gms.cast.framework.media.CastMediaOptions.a().a();
        private boolean g = true;
        private double h = 0.05000000074505806d;
        private boolean i = false;

        public final a a(String str) {
            this.a = str;
            return this;
        }

        public final a b(boolean z) {
            this.e = z;
            return this;
        }

        public final a a(LaunchOptions launchOptions) {
            this.d = launchOptions;
            return this;
        }

        public final a a(CastMediaOptions castMediaOptions) {
            this.f = castMediaOptions;
            return this;
        }

        public final a a(boolean z) {
            this.g = z;
            return this;
        }

        public final CastOptions a() {
            CastOptions castOptions = new CastOptions(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, false);
            return castOptions;
        }
    }

    @Constructor
    CastOptions(@Param(id = 2) String str, @Param(id = 3) List<String> list, @Param(id = 4) boolean z, @Param(id = 5) LaunchOptions launchOptions, @Param(id = 6) boolean z2, @Param(id = 7) CastMediaOptions castMediaOptions, @Param(id = 8) boolean z3, @Param(id = 9) double d2, @Param(id = 10) boolean z4) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.a = str;
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        this.b = new ArrayList(i2);
        if (i2 > 0) {
            this.b.addAll(list);
        }
        this.c = z;
        if (launchOptions == null) {
            launchOptions = new LaunchOptions();
        }
        this.d = launchOptions;
        this.e = z2;
        this.f = castMediaOptions;
        this.g = z3;
        this.h = d2;
        this.i = z4;
    }

    public boolean F() {
        return this.g;
    }

    public LaunchOptions G() {
        return this.d;
    }

    public String H() {
        return this.a;
    }

    public boolean I() {
        return this.e;
    }

    public boolean X() {
        return this.c;
    }

    public List<String> Y() {
        return Collections.unmodifiableList(this.b);
    }

    public double Z() {
        return this.h;
    }

    public CastMediaOptions i() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, H(), false);
        SafeParcelWriter.writeStringList(parcel, 3, Y(), false);
        SafeParcelWriter.writeBoolean(parcel, 4, X());
        SafeParcelWriter.writeParcelable(parcel, 5, G(), i2, false);
        SafeParcelWriter.writeBoolean(parcel, 6, I());
        SafeParcelWriter.writeParcelable(parcel, 7, i(), i2, false);
        SafeParcelWriter.writeBoolean(parcel, 8, F());
        SafeParcelWriter.writeDouble(parcel, 9, Z());
        SafeParcelWriter.writeBoolean(parcel, 10, this.i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
