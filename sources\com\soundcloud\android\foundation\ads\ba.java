package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Comparator;
import java.util.Locale;

/* compiled from: VideoAdSource */
public abstract class ba {
    public static final Comparator<ba> a = C3674a.a;

    /* compiled from: VideoAdSource */
    public static abstract class a {
        @JsonCreator
        public static a a(@JsonProperty("type") String str, @JsonProperty("url") String str2, @JsonProperty("bitrate_kbps") int i, @JsonProperty("width") int i2, @JsonProperty("height") int i3) {
            D d = new D(str, str2, i, i2, i3);
            return d;
        }

        @JsonProperty("bitrate_kbps")
        public abstract int a();

        @JsonProperty("height")
        public abstract int b();

        @JsonProperty("type")
        public abstract String c();

        @JsonProperty("url")
        public abstract String d();

        @JsonProperty("width")
        public abstract int e();
    }

    public abstract int a();

    public abstract int b();

    public boolean c() {
        return a("application/x-mpegurl");
    }

    public boolean d() {
        return a("video/mp4");
    }

    public abstract String e();

    public abstract String f();

    public abstract int g();

    public static ba a(a aVar) {
        C c = new C(aVar.c(), aVar.d(), aVar.a(), aVar.e(), aVar.b());
        return c;
    }

    private boolean a(String str) {
        return e().toLowerCase(Locale.US).equals(str);
    }
}
