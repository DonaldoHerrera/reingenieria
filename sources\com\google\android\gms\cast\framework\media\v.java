package com.google.android.gms.cast.framework.media;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.cast.C0693a;
import com.google.android.gms.internal.cast.V;

public interface v extends IInterface {

    public static abstract class a extends C0693a implements v {
        public a() {
            super("com.google.android.gms.cast.framework.media.IImagePicker");
        }

        /* access modifiers changed from: protected */
        public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                WebImage a = a((MediaMetadata) V.a(parcel, MediaMetadata.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                V.b(parcel2, a);
            } else if (i == 2) {
                Dr l = l();
                parcel2.writeNoException();
                V.a(parcel2, (IInterface) l);
            } else if (i == 3) {
                int a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2);
            } else if (i != 4) {
                return false;
            } else {
                WebImage a3 = a((MediaMetadata) V.a(parcel, MediaMetadata.CREATOR), (ImageHints) V.a(parcel, ImageHints.CREATOR));
                parcel2.writeNoException();
                V.b(parcel2, a3);
            }
            return true;
        }
    }

    int a() throws RemoteException;

    WebImage a(MediaMetadata mediaMetadata, int i) throws RemoteException;

    WebImage a(MediaMetadata mediaMetadata, ImageHints imageHints) throws RemoteException;

    Dr l() throws RemoteException;
}
