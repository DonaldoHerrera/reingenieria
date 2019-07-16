package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.MediaMetadata;

/* renamed from: com.google.android.gms.internal.cast.o reason: case insensitive filesystem */
public final class C0721o {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1 != 4) goto L_0x003c;
     */
    public static String a(MediaMetadata mediaMetadata) {
        String str = "com.google.android.gms.cast.metadata.SUBTITLE";
        String str2 = "com.google.android.gms.cast.metadata.COMPOSER";
        String str3 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
        String str4 = "com.google.android.gms.cast.metadata.ARTIST";
        if (!mediaMetadata.a(str)) {
            int F = mediaMetadata.F();
            if (F == 1) {
                str = "com.google.android.gms.cast.metadata.STUDIO";
            } else if (F != 2) {
                if (F == 3) {
                    if (!mediaMetadata.a(str4)) {
                        if (mediaMetadata.a(str3)) {
                            str = str3;
                        } else if (mediaMetadata.a(str2)) {
                            str = str2;
                        }
                    }
                }
                str = str4;
            } else {
                str = "com.google.android.gms.cast.metadata.SERIES_TITLE";
            }
        }
        return mediaMetadata.b(str);
    }
}
