package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.framework.C0643k;
import com.google.android.gms.cast.framework.C0644l;
import com.google.android.gms.cast.framework.C0663o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Class(creator = "NotificationOptionsCreator")
@Reserved({1})
public class NotificationOptions extends AbstractSafeParcelable {
    public static final Creator<NotificationOptions> CREATOR = new L();
    /* access modifiers changed from: private */
    public static final List<String> a = Arrays.asList(new String[]{"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"});
    /* access modifiers changed from: private */
    public static final int[] b = {0, 1};
    @Field(getter = "getForwardTitleResId", id = 26)
    private final int A;
    @Field(getter = "getForward10TitleResId", id = 27)
    private final int B;
    @Field(getter = "getForward30TitleResId", id = 28)
    private final int C;
    @Field(getter = "getRewindTitleResId", id = 29)
    private final int D;
    @Field(getter = "getRewind10TitleResId", id = 30)
    private final int E;
    @Field(getter = "getRewind30TitleResId", id = 31)
    private final int F;
    @Field(getter = "getDisconnectTitleResId", id = 32)
    private final int G;
    @Field(getter = "getNotificationActionsProviderAsBinder", id = 33, type = "android.os.IBinder")
    private final A H;
    @Field(getter = "getActions", id = 2)
    private final List<String> c;
    @Field(getter = "getCompatActionIndices", id = 3)
    private final int[] d;
    @Field(getter = "getSkipStepMs", id = 4)
    private final long e;
    @Field(getter = "getTargetActivityClassName", id = 5)
    private final String f;
    @Field(getter = "getSmallIconDrawableResId", id = 6)
    private final int g;
    @Field(getter = "getStopLiveStreamDrawableResId", id = 7)
    private final int h;
    @Field(getter = "getPauseDrawableResId", id = 8)
    private final int i;
    @Field(getter = "getPlayDrawableResId", id = 9)
    private final int j;
    @Field(getter = "getSkipNextDrawableResId", id = 10)
    private final int k;
    @Field(getter = "getSkipPrevDrawableResId", id = 11)
    private final int l;
    @Field(getter = "getForwardDrawableResId", id = 12)
    private final int m;
    @Field(getter = "getForward10DrawableResId", id = 13)
    private final int n;
    @Field(getter = "getForward30DrawableResId", id = 14)
    private final int o;
    @Field(getter = "getRewindDrawableResId", id = 15)
    private final int p;
    @Field(getter = "getRewind10DrawableResId", id = 16)
    private final int q;
    @Field(getter = "getRewind30DrawableResId", id = 17)
    private final int r;
    @Field(getter = "getDisconnectDrawableResId", id = 18)
    private final int s;
    @Field(getter = "getImageSizeDimenResId", id = 19)
    private final int t;
    @Field(getter = "getCastingToDeviceStringResId", id = 20)
    private final int u;
    @Field(getter = "getStopLiveStreamTitleResId", id = 21)
    private final int v;
    @Field(getter = "getPauseTitleResId", id = 22)
    private final int w;
    @Field(getter = "getPlayTitleResId", id = 23)
    private final int x;
    @Field(getter = "getSkipNextTitleResId", id = 24)
    private final int y;
    @Field(getter = "getSkipPrevTitleResId", id = 25)
    private final int z;

    public static final class a {
        private String a;
        private List<String> b = NotificationOptions.a;
        private C0649d c;
        private int[] d = NotificationOptions.b;
        private int e = C0644l.cast_ic_notification_small_icon;
        private int f = C0644l.cast_ic_notification_stop_live_stream;
        private int g = C0644l.cast_ic_notification_pause;
        private int h = C0644l.cast_ic_notification_play;
        private int i = C0644l.cast_ic_notification_skip_next;
        private int j = C0644l.cast_ic_notification_skip_prev;
        private int k = C0644l.cast_ic_notification_forward;
        private int l = C0644l.cast_ic_notification_forward10;
        private int m = C0644l.cast_ic_notification_forward30;
        private int n = C0644l.cast_ic_notification_rewind;
        private int o = C0644l.cast_ic_notification_rewind10;
        private int p = C0644l.cast_ic_notification_rewind30;
        private int q = C0644l.cast_ic_notification_disconnect;
        private long r = 10000;

        public final a a(List<String> list, int[] iArr) {
            if (list == null && iArr != null) {
                throw new IllegalArgumentException("When setting actions to null, you must also set compatActionIndices to null.");
            } else if (list == null || iArr != null) {
                if (list == null || iArr == null) {
                    this.b = NotificationOptions.a;
                    this.d = NotificationOptions.b;
                } else {
                    int size = list.size();
                    if (iArr.length <= size) {
                        for (int i2 : iArr) {
                            if (i2 < 0 || i2 >= size) {
                                throw new IllegalArgumentException(String.format(Locale.ROOT, "Index %d in compatActionIndices out of range: [0, %d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                            }
                        }
                        this.b = new ArrayList(list);
                        this.d = Arrays.copyOf(iArr, iArr.length);
                    } else {
                        throw new IllegalArgumentException(String.format(Locale.ROOT, "Invalid number of compat actions: %d > %d.", new Object[]{Integer.valueOf(iArr.length), Integer.valueOf(size)}));
                    }
                }
                return this;
            } else {
                throw new IllegalArgumentException("When setting compatActionIndices to null, you must also set actions to null.");
            }
        }

        public final a b(int i2) {
            this.m = i2;
            return this;
        }

        public final a c(int i2) {
            this.k = i2;
            return this;
        }

        public final a d(int i2) {
            this.o = i2;
            return this;
        }

        public final a e(int i2) {
            this.p = i2;
            return this;
        }

        public final a f(int i2) {
            this.n = i2;
            return this;
        }

        public final a g(int i2) {
            this.i = i2;
            return this;
        }

        public final a h(int i2) {
            this.j = i2;
            return this;
        }

        public final a i(int i2) {
            this.e = i2;
            return this;
        }

        public final a a(String str) {
            this.a = str;
            return this;
        }

        public final a a(int i2) {
            this.l = i2;
            return this;
        }

        public final NotificationOptions a() {
            IBinder iBinder;
            C0649d dVar = this.c;
            if (dVar == null) {
                iBinder = null;
            } else {
                iBinder = dVar.a().asBinder();
            }
            NotificationOptions notificationOptions = r2;
            NotificationOptions notificationOptions2 = new NotificationOptions(this.b, this.d, this.r, this.a, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, C0643k.cast_notification_image_size, C0663o.cast_casting_to_device, C0663o.cast_stop_live_stream, C0663o.cast_pause, C0663o.cast_play, C0663o.cast_skip_next, C0663o.cast_skip_prev, C0663o.cast_forward, C0663o.cast_forward_10, C0663o.cast_forward_30, C0663o.cast_rewind, C0663o.cast_rewind_10, C0663o.cast_rewind_30, C0663o.cast_disconnect, iBinder);
            return notificationOptions;
        }
    }

    @Constructor
    public NotificationOptions(@Param(id = 2) List<String> list, @Param(id = 3) int[] iArr, @Param(id = 4) long j2, @Param(id = 5) String str, @Param(id = 6) int i2, @Param(id = 7) int i3, @Param(id = 8) int i4, @Param(id = 9) int i5, @Param(id = 10) int i6, @Param(id = 11) int i7, @Param(id = 12) int i8, @Param(id = 13) int i9, @Param(id = 14) int i10, @Param(id = 15) int i11, @Param(id = 16) int i12, @Param(id = 17) int i13, @Param(id = 18) int i14, @Param(id = 19) int i15, @Param(id = 20) int i16, @Param(id = 21) int i17, @Param(id = 22) int i18, @Param(id = 23) int i19, @Param(id = 24) int i20, @Param(id = 25) int i21, @Param(id = 26) int i22, @Param(id = 27) int i23, @Param(id = 28) int i24, @Param(id = 29) int i25, @Param(id = 30) int i26, @Param(id = 31) int i27, @Param(id = 32) int i28, @Param(id = 33) IBinder iBinder) {
        int[] iArr2 = iArr;
        IBinder iBinder2 = iBinder;
        A a2 = null;
        if (list != null) {
            this.c = new ArrayList(list);
        } else {
            this.c = null;
        }
        if (iArr2 != null) {
            this.d = Arrays.copyOf(iArr, iArr2.length);
        } else {
            this.d = null;
        }
        this.e = j2;
        this.f = str;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = i9;
        this.o = i10;
        this.p = i11;
        this.q = i12;
        this.r = i13;
        this.s = i14;
        this.t = i15;
        this.u = i16;
        this.v = i17;
        this.w = i18;
        this.x = i19;
        this.y = i20;
        this.z = i21;
        this.A = i22;
        this.B = i23;
        this.C = i24;
        this.D = i25;
        this.E = i26;
        this.F = i27;
        this.G = i28;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof A) {
                a2 = (A) queryLocalInterface;
            } else {
                a2 = new C(iBinder2);
            }
        }
        this.H = a2;
    }

    public int F() {
        return this.u;
    }

    public int[] G() {
        int[] iArr = this.d;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int H() {
        return this.s;
    }

    public int I() {
        return this.n;
    }

    public final int T() {
        return this.B;
    }

    public final int V() {
        return this.C;
    }

    public int X() {
        return this.o;
    }

    public int Y() {
        return this.m;
    }

    public int Z() {
        return this.i;
    }

    public int aa() {
        return this.j;
    }

    public int ba() {
        return this.q;
    }

    public int ca() {
        return this.r;
    }

    public int da() {
        return this.p;
    }

    public int ea() {
        return this.k;
    }

    public int fa() {
        return this.l;
    }

    public long ga() {
        return this.e;
    }

    public int ha() {
        return this.g;
    }

    public List<String> i() {
        return this.c;
    }

    public int ia() {
        return this.h;
    }

    public int ja() {
        return this.v;
    }

    public String ka() {
        return this.f;
    }

    public final int la() {
        return this.t;
    }

    public final int ma() {
        return this.w;
    }

    public final int na() {
        return this.x;
    }

    public final int oa() {
        return this.y;
    }

    public final int pa() {
        return this.z;
    }

    public final int qa() {
        return this.A;
    }

    public final int ra() {
        return this.D;
    }

    public final int sa() {
        return this.E;
    }

    public final int ta() {
        return this.F;
    }

    public final int ua() {
        return this.G;
    }

    public final A va() {
        return this.H;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 2, i(), false);
        SafeParcelWriter.writeIntArray(parcel, 3, G(), false);
        SafeParcelWriter.writeLong(parcel, 4, ga());
        SafeParcelWriter.writeString(parcel, 5, ka(), false);
        SafeParcelWriter.writeInt(parcel, 6, ha());
        SafeParcelWriter.writeInt(parcel, 7, ia());
        SafeParcelWriter.writeInt(parcel, 8, Z());
        SafeParcelWriter.writeInt(parcel, 9, aa());
        SafeParcelWriter.writeInt(parcel, 10, ea());
        SafeParcelWriter.writeInt(parcel, 11, fa());
        SafeParcelWriter.writeInt(parcel, 12, Y());
        SafeParcelWriter.writeInt(parcel, 13, I());
        SafeParcelWriter.writeInt(parcel, 14, X());
        SafeParcelWriter.writeInt(parcel, 15, da());
        SafeParcelWriter.writeInt(parcel, 16, ba());
        SafeParcelWriter.writeInt(parcel, 17, ca());
        SafeParcelWriter.writeInt(parcel, 18, H());
        SafeParcelWriter.writeInt(parcel, 19, this.t);
        SafeParcelWriter.writeInt(parcel, 20, F());
        SafeParcelWriter.writeInt(parcel, 21, ja());
        SafeParcelWriter.writeInt(parcel, 22, this.w);
        SafeParcelWriter.writeInt(parcel, 23, this.x);
        SafeParcelWriter.writeInt(parcel, 24, this.y);
        SafeParcelWriter.writeInt(parcel, 25, this.z);
        SafeParcelWriter.writeInt(parcel, 26, this.A);
        SafeParcelWriter.writeInt(parcel, 27, this.B);
        SafeParcelWriter.writeInt(parcel, 28, this.C);
        SafeParcelWriter.writeInt(parcel, 29, this.D);
        SafeParcelWriter.writeInt(parcel, 30, this.E);
        SafeParcelWriter.writeInt(parcel, 31, this.F);
        SafeParcelWriter.writeInt(parcel, 32, this.G);
        A a2 = this.H;
        SafeParcelWriter.writeIBinder(parcel, 33, a2 == null ? null : a2.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
