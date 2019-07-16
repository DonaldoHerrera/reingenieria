package com.google.android.exoplayer2.drm;

import android.util.Pair;
import java.util.Map;

/* compiled from: WidevineUtil */
public final class u {
    public static Pair<Long, Long> a(m<?> mVar) {
        Map c = mVar.c();
        if (c == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(c, "LicenseDurationRemaining")), Long.valueOf(a(c, "PlaybackDurationRemaining")));
    }

    private static long a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return -9223372036854775807L;
    }
}
