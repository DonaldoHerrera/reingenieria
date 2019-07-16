package defpackage;

import android.net.Uri;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaDescriptionCompat.Builder;

/* renamed from: Pba reason: default package */
/* compiled from: MediaItemHelper.kt */
public final class Pba {
    public static final MediaItem a(String str, String str2) {
        C7471uYa.b(str, "mediaId");
        C7471uYa.b(str2, "folderName");
        Builder builder = new Builder();
        builder.setMediaId(str);
        builder.setTitle(str2);
        Integer valueOf = Integer.valueOf(1);
        builder.setExtras(C1687sb.a(NVa.a("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", valueOf), NVa.a("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", valueOf)));
        return new MediaItem(builder.build(), 1);
    }

    public static final MediaItem a(String str, String str2, String str3, Uri uri, boolean z) {
        C7471uYa.b(str, "mediaId");
        Builder builder = new Builder();
        builder.setMediaId(str);
        builder.setTitle(str2);
        builder.setSubtitle(str3);
        if (uri != null) {
            builder.setIconUri(uri);
        }
        if (z) {
            builder.setExtras(C1687sb.a(NVa.a(MediaDescriptionCompat.EXTRA_DOWNLOAD_STATUS, Long.valueOf(2))));
        }
        return new MediaItem(builder.build(), 2);
    }
}
