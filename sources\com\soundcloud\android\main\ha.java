package com.soundcloud.android.main;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: ScreenHelper */
public class ha {
    public static void a(Yca yca, Bundle bundle) {
        bundle.putInt("ScreenOrdinal", yca.b());
    }

    public static boolean b(Intent intent) {
        return intent.hasExtra("ScreenOrdinal");
    }

    public static void a(Yca yca, Intent intent) {
        intent.putExtra("ScreenOrdinal", yca.b());
    }

    public static Yca a(Intent intent) {
        return Yca.a(intent.getIntExtra("ScreenOrdinal", 0));
    }

    public static Yca a(Bundle bundle) {
        return Yca.a(bundle.getInt("ScreenOrdinal", 0));
    }
}
