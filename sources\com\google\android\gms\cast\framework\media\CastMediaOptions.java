package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.cast.C0710ia;

@Class(creator = "CastMediaOptionsCreator")
@Reserved({1})
public class CastMediaOptions extends AbstractSafeParcelable {
    public static final Creator<CastMediaOptions> CREATOR = new C0652g();
    private static final C0710ia a = new C0710ia("CastMediaOptions");
    @Field(getter = "getMediaIntentReceiverClassName", id = 2)
    private final String b;
    @Field(getter = "getExpandedControllerActivityClassName", id = 3)
    private final String c;
    @Field(getter = "getImagePickerAsBinder", id = 4, type = "android.os.IBinder")
    private final v d;
    @Field(getter = "getNotificationOptions", id = 5)
    private final NotificationOptions e;
    @Field(getter = "getDisableRemoteControlNotification", id = 6)
    private final boolean f;

    public static final class a {
        private String a = MediaIntentReceiver.class.getName();
        private String b;
        private C0646a c;
        private NotificationOptions d = new com.google.android.gms.cast.framework.media.NotificationOptions.a().a();

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final a b(String str) {
            this.a = str;
            return this;
        }

        public final a a(C0646a aVar) {
            this.c = aVar;
            return this;
        }

        public final a a(NotificationOptions notificationOptions) {
            this.d = notificationOptions;
            return this;
        }

        public final CastMediaOptions a() {
            C0646a aVar = this.c;
            CastMediaOptions castMediaOptions = new CastMediaOptions(this.a, this.b, aVar == null ? null : aVar.a().asBinder(), this.d, false);
            return castMediaOptions;
        }
    }

    @Constructor
    CastMediaOptions(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) IBinder iBinder, @Param(id = 5) NotificationOptions notificationOptions, @Param(id = 6) boolean z) {
        v vVar;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof v) {
                vVar = (v) queryLocalInterface;
            } else {
                vVar = new B(iBinder);
            }
        }
        this.d = vVar;
        this.e = notificationOptions;
        this.f = z;
    }

    public C0646a F() {
        v vVar = this.d;
        if (vVar != null) {
            try {
                return (C0646a) Er.c(vVar.l());
            } catch (RemoteException e2) {
                a.a(e2, "Unable to call %s on %s.", "getWrappedClientObject", v.class.getSimpleName());
            }
        }
        return null;
    }

    public String G() {
        return this.b;
    }

    public NotificationOptions H() {
        return this.e;
    }

    @ShowFirstParty
    public final boolean I() {
        return this.f;
    }

    public String i() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, G(), false);
        SafeParcelWriter.writeString(parcel, 3, i(), false);
        v vVar = this.d;
        SafeParcelWriter.writeIBinder(parcel, 4, vVar == null ? null : vVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, H(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
