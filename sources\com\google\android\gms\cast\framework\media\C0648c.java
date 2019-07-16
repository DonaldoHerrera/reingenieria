package com.google.android.gms.cast.framework.media;

import android.annotation.TargetApi;
import android.net.Uri;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Locale;

/* renamed from: com.google.android.gms.cast.framework.media.c reason: case insensitive filesystem */
public class C0648c {
    public static Uri a(MediaInfo mediaInfo, int i) {
        if (mediaInfo == null) {
            return null;
        }
        MediaMetadata metadata = mediaInfo.getMetadata();
        if (metadata == null || metadata.i() == null || metadata.i().size() <= i) {
            return null;
        }
        return ((WebImage) metadata.i().get(i)).getUrl();
    }

    @TargetApi(21)
    public static Locale a(MediaTrack mediaTrack) {
        if (mediaTrack.H() == null) {
            return null;
        }
        if (PlatformVersion.isAtLeastLollipop()) {
            return Locale.forLanguageTag(mediaTrack.H());
        }
        String[] split = mediaTrack.H().split("-");
        if (split.length == 1) {
            return new Locale(split[0]);
        }
        return new Locale(split[0], split[1]);
    }
}
