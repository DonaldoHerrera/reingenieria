package com.soundcloud.android.playback;

import com.soundcloud.android.playback.core.Stream;

/* renamed from: com.soundcloud.android.playback.gd reason: case insensitive filesystem */
/* compiled from: StreamExtensions.kt */
public final class C4313gd {
    public static final String a(Stream stream) {
        C7471uYa.b(stream, "$this$description");
        return stream.a().getString("kDescription");
    }

    public static final String b(Stream stream) {
        C7471uYa.b(stream, "$this$preset");
        return stream.a().getString("kPreset");
    }

    public static final String c(Stream stream) {
        C7471uYa.b(stream, "$this$protocol");
        return stream.a().getString("kProtocol");
    }

    public static final String d(Stream stream) {
        C7471uYa.b(stream, "$this$quality");
        return stream.a().getString("kQuality");
    }

    public static final void a(Stream stream, String str) {
        C7471uYa.b(stream, "$this$description");
        stream.a().putString("kDescription", str);
    }

    public static final void b(Stream stream, String str) {
        C7471uYa.b(stream, "$this$preset");
        stream.a().putString("kPreset", str);
    }

    public static final void c(Stream stream, String str) {
        C7471uYa.b(stream, "$this$protocol");
        stream.a().putString("kProtocol", str);
    }

    public static final void d(Stream stream, String str) {
        C7471uYa.b(stream, "$this$quality");
        stream.a().putString("kQuality", str);
    }
}
