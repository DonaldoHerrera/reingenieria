package com.soundcloud.android.playback;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import java.util.Arrays;

/* compiled from: MediaCodecInfoProvider */
class Da {
    private int a(int i) {
        if (!(i == -1 || i == 4 || i == 8 || i == 16 || i == 32 || i == 64 || i == 128)) {
            if (i == 256) {
                return 480;
            }
            if (i == 512 || i == 1024) {
                return 720;
            }
            if (!(i == 1 || i == 2)) {
                return 1080;
            }
        }
        return 360;
    }

    public int a() {
        CodecCapabilities a = a("video/avc");
        int i = -1;
        if (a != null) {
            for (CodecProfileLevel codecProfileLevel : a.profileLevels) {
                int i2 = codecProfileLevel.level;
                if (i2 > i) {
                    i = i2;
                }
            }
        }
        return a(i);
    }

    private CodecCapabilities a(String str) {
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder() && Arrays.asList(codecInfoAt.getSupportedTypes()).contains(str)) {
                return codecInfoAt.getCapabilitiesForType(str);
            }
        }
        return null;
    }
}
