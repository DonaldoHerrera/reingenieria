package defpackage;

import android.content.res.TypedArray;

/* renamed from: Ya reason: default package and case insensitive filesystem */
/* compiled from: TypedArray.kt */
public final class C0282Ya {
    public static final int a(TypedArray typedArray, int i) {
        C7471uYa.b(typedArray, "$receiver");
        c(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    public static final String b(TypedArray typedArray, int i) {
        C7471uYa.b(typedArray, "$receiver");
        c(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.");
    }

    private static final void c(TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }
}
