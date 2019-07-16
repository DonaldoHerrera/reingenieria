package defpackage;

import android.os.Parcel;

/* renamed from: Lr reason: default package */
public class Lr {
    private static final ClassLoader a = Lr.class.getClassLoader();

    private Lr() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
