package com.soundcloud.android.image;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: com.soundcloud.android.image.o reason: case insensitive filesystem */
/* compiled from: ImageConfigurationStorage */
public class C3734o {
    private final SharedPreferences a;

    public C3734o(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public void a(Collection<String> collection) {
        this.a.edit().putStringSet("size_specs", new HashSet(collection)).apply();
    }
}
