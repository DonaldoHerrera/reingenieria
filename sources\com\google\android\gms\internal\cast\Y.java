package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.zzae;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class Y implements Creator<zzdb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ApplicationMetadata applicationMetadata = null;
        zzae zzae = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    d = SafeParcelReader.readDouble(parcel2, readHeader);
                    break;
                case 3:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 4:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) SafeParcelReader.createParcelable(parcel2, readHeader, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 7:
                    zzae = (zzae) SafeParcelReader.createParcelable(parcel2, readHeader, zzae.CREATOR);
                    break;
                case 8:
                    d2 = SafeParcelReader.readDouble(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        zzdb zzdb = new zzdb(d, z, i, applicationMetadata, i2, zzae, d2);
        return zzdb;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdb[i];
    }
}
