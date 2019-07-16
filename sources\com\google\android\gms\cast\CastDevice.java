package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.cast.X;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Class(creator = "CastDeviceCreator")
@Reserved({1})
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CastDevice> CREATOR = new T();
    @Field(getter = "getDeviceIdRaw", id = 2)
    private String a;
    @Field(id = 3)
    private String b;
    private InetAddress c;
    @Field(getter = "getFriendlyName", id = 4)
    private String d;
    @Field(getter = "getModelName", id = 5)
    private String e;
    @Field(getter = "getDeviceVersion", id = 6)
    private String f;
    @Field(getter = "getServicePort", id = 7)
    private int g;
    @Field(getter = "getIcons", id = 8)
    private List<WebImage> h;
    @Field(getter = "getCapabilities", id = 9)
    private int i;
    @Field(defaultValue = "-1", getter = "getStatus", id = 10)
    private int j;
    @Field(getter = "getServiceInstanceName", id = 11)
    private String k;
    @Field(getter = "getReceiverMetricsId", id = 12)
    private String l;
    @Field(getter = "getRcnEnabledStatus", id = 13)
    private int m;
    @Field(getter = "getHotspotBssid", id = 14)
    private String n;
    @Field(getter = "getIpLowestTwoBytes", id = 15)
    private byte[] o;
    @Field(getter = "getCloudDeviceId", id = 16)
    private String p;

    @Constructor
    CastDevice(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) String str3, @Param(id = 5) String str4, @Param(id = 6) String str5, @Param(id = 7) int i2, @Param(id = 8) List<WebImage> list, @Param(id = 9) int i3, @Param(id = 10) int i4, @Param(id = 11) String str6, @Param(id = 12) String str7, @Param(id = 13) int i5, @Param(id = 14) String str8, @Param(id = 15) byte[] bArr, @Param(id = 16) String str9) {
        List<WebImage> list2;
        this.a = a(str);
        this.b = a(str2);
        if (!TextUtils.isEmpty(this.b)) {
            try {
                this.c = InetAddress.getByName(this.b);
            } catch (UnknownHostException e2) {
                String str10 = this.b;
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(str10).length() + 48 + String.valueOf(message).length());
                sb.append("Unable to convert host address (");
                sb.append(str10);
                sb.append(") to ipaddress: ");
                sb.append(message);
                Log.i("CastDevice", sb.toString());
            }
        }
        this.d = a(str3);
        this.e = a(str4);
        this.f = a(str5);
        this.g = i2;
        if (list != null) {
            list2 = list;
        } else {
            list2 = new ArrayList<>();
        }
        this.h = list2;
        this.i = i3;
        this.j = i4;
        this.k = a(str6);
        this.l = str7;
        this.m = i5;
        this.n = str8;
        this.o = bArr;
        this.p = str9;
    }

    public static CastDevice a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    public String F() {
        return this.f;
    }

    public String G() {
        return this.d;
    }

    public List<WebImage> H() {
        return Collections.unmodifiableList(this.h);
    }

    public String I() {
        return this.e;
    }

    public int X() {
        return this.g;
    }

    public void b(Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.a;
        return str == null ? castDevice.a == null : X.a(str, castDevice.a) && X.a(this.c, castDevice.c) && X.a(this.e, castDevice.e) && X.a(this.d, castDevice.d) && X.a(this.f, castDevice.f) && this.g == castDevice.g && X.a(this.h, castDevice.h) && this.i == castDevice.i && this.j == castDevice.j && X.a(this.k, castDevice.k) && X.a(Integer.valueOf(this.m), Integer.valueOf(castDevice.m)) && X.a(this.n, castDevice.n) && X.a(this.l, castDevice.l) && X.a(this.f, castDevice.F()) && this.g == castDevice.X() && ((this.o == null && castDevice.o == null) || Arrays.equals(this.o, castDevice.o)) && X.a(this.p, castDevice.p);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String i() {
        if (this.a.startsWith("__cast_nearby__")) {
            return this.a.substring(16);
        }
        return this.a;
    }

    public boolean m(int i2) {
        return (this.i & i2) == i2;
    }

    public String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.d, this.a});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, G(), false);
        SafeParcelWriter.writeString(parcel, 5, I(), false);
        SafeParcelWriter.writeString(parcel, 6, F(), false);
        SafeParcelWriter.writeInt(parcel, 7, X());
        SafeParcelWriter.writeTypedList(parcel, 8, H(), false);
        SafeParcelWriter.writeInt(parcel, 9, this.i);
        SafeParcelWriter.writeInt(parcel, 10, this.j);
        SafeParcelWriter.writeString(parcel, 11, this.k, false);
        SafeParcelWriter.writeString(parcel, 12, this.l, false);
        SafeParcelWriter.writeInt(parcel, 13, this.m);
        SafeParcelWriter.writeString(parcel, 14, this.n, false);
        SafeParcelWriter.writeByteArray(parcel, 15, this.o, false);
        SafeParcelWriter.writeString(parcel, 16, this.p, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
