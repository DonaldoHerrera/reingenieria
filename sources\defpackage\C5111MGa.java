package defpackage;

import android.os.Build;
import java.util.Arrays;

/* renamed from: MGa reason: default package and case insensitive filesystem */
/* compiled from: AbiUtils.kt */
public final class C5111MGa {
    public static final String a() {
        String[] b = b();
        if (!(!(b.length == 0))) {
            return "Could not fetch the list of supported ABIs";
        }
        String arrays = Arrays.toString(b);
        C7471uYa.a((Object) arrays, "Arrays.toString(it)");
        return arrays;
    }

    private static final String[] b() {
        try {
            String[] strArr = Build.SUPPORTED_ABIS;
            C7471uYa.a((Object) strArr, "Build.SUPPORTED_ABIS");
            return strArr;
        } catch (NoSuchFieldException unused) {
            return new String[0];
        }
    }
}
