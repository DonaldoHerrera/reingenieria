package com.soundcloud.android.ads.data;

import android.content.Context;
import androidx.room.s;
import androidx.room.t;
import androidx.room.t.a;

/* compiled from: VideoAdsDaoModule.kt */
public final class w {
    public static final w a = new w();

    private w() {
    }

    @NXa
    public static final VideoAdsDatabase a(Context context) {
        C7471uYa.b(context, "context");
        a a2 = s.a(context, VideoAdsDatabase.class, "video_ads.db");
        a2.c();
        t b = a2.b();
        C7471uYa.a((Object) b, "Room.databaseBuilder(con…on()\n            .build()");
        return (VideoAdsDatabase) b;
    }

    @NXa
    public static final v a(VideoAdsDatabase videoAdsDatabase) {
        C7471uYa.b(videoAdsDatabase, "db");
        return videoAdsDatabase.n();
    }
}
