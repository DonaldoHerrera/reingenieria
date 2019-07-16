package defpackage;

import android.os.Parcel;

/* renamed from: Cy reason: default package */
public class Cy {
    private static final ClassLoader a = Cy.class.getClassLoader();

    private Cy() {
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
