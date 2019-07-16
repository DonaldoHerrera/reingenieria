package com.soundcloud.android.settings.notifications;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: NotificationPreferences.kt */
public final class j {
    private final Map<String, h> a = new LinkedHashMap();

    @JsonAnySetter
    public final void a(String str, h hVar) {
        C7471uYa.b(str, "key");
        C7471uYa.b(hVar, "preference");
        Map<String, h> map = this.a;
        HVa a2 = NVa.a(str, hVar);
        map.put(a2.c(), a2.d());
    }

    @JsonAnyGetter
    public final Map<String, h> a() {
        return this.a;
    }
}
