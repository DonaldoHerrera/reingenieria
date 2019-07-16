package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.cast.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Class(creator = "ApplicationMetadataCreator")
@Reserved({1})
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Creator<ApplicationMetadata> CREATOR = new L();
    @Field(getter = "getApplicationId", id = 2)
    private String a;
    @Field(getter = "getName", id = 3)
    private String b;
    @Field(getter = "getSupportedNamespaces", id = 5)
    private List<String> c;
    @Field(getter = "getSenderAppIdentifier", id = 6)
    private String d;
    @Field(getter = "getSenderAppLaunchUrl", id = 7)
    private Uri e;
    @Field(getter = "getIconUrl", id = 8)
    private String f;

    @Constructor
    ApplicationMetadata(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) List<WebImage> list, @Param(id = 5) List<String> list2, @Param(id = 6) String str3, @Param(id = 7) Uri uri, @Param(id = 8) String str4) {
        this.a = str;
        this.b = str2;
        this.c = list2;
        this.d = str3;
        this.e = uri;
        this.f = str4;
    }

    public List<WebImage> F() {
        return null;
    }

    public String G() {
        return this.d;
    }

    public List<String> H() {
        return Collections.unmodifiableList(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return X.a(this.a, applicationMetadata.a) && X.a(this.b, applicationMetadata.b) && X.a(this.c, applicationMetadata.c) && X.a(this.d, applicationMetadata.d) && X.a(this.e, applicationMetadata.e) && X.a(this.f, applicationMetadata.f);
    }

    public String getName() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public String i() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        List<String> list = this.c;
        int size = list == null ? 0 : list.size();
        String str3 = this.d;
        String valueOf = String.valueOf(this.e);
        String str4 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 110 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(valueOf).length() + String.valueOf(str4).length());
        sb.append("applicationId: ");
        sb.append(str);
        sb.append(", name: ");
        sb.append(str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        sb.append(", senderAppLaunchUrl: ");
        sb.append(valueOf);
        sb.append(", iconUrl: ");
        sb.append(str4);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, i(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, F(), false);
        SafeParcelWriter.writeStringList(parcel, 5, H(), false);
        SafeParcelWriter.writeString(parcel, 6, G(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.e, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private ApplicationMetadata() {
        this.c = new ArrayList();
    }
}
