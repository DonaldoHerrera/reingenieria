package defpackage;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: Lo reason: default package */
/* compiled from: MediaCodecInfo */
public final class Lo {
    public final String a;
    public final String b;
    public final CodecCapabilities c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final boolean h;

    private Lo(String str, String str2, CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        C1852xq.a(str);
        this.a = str;
        this.b = str2;
        this.c = codecCapabilities;
        this.g = z;
        boolean z4 = true;
        this.d = !z2 && codecCapabilities != null && a(codecCapabilities);
        this.e = codecCapabilities != null && e(codecCapabilities);
        if (!z3 && (codecCapabilities == null || !c(codecCapabilities))) {
            z4 = false;
        }
        this.f = z4;
        this.h = Lq.f(str2);
    }

    public static Lo a(String str, String str2, CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Lo lo = new Lo(str, str2, codecCapabilities, false, z, z2);
        return lo;
    }

    public static Lo b(String str) {
        Lo lo = new Lo(str, null, null, true, false, false);
        return lo;
    }

    private void c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedSupport [");
        sb.append(str);
        String str2 = "] [";
        sb.append(str2);
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(str2);
        sb.append(C0471ar.e);
        sb.append("]");
        Iq.a("MediaCodecInfo", sb.toString());
    }

    private void d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("NoSupport [");
        sb.append(str);
        String str2 = "] [";
        sb.append(str2);
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(str2);
        sb.append(C0471ar.e);
        sb.append("]");
        Iq.a("MediaCodecInfo", sb.toString());
    }

    private static boolean e(CodecCapabilities codecCapabilities) {
        return C0471ar.a >= 21 && f(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean f(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public String toString() {
        return this.a;
    }

    private static boolean c(CodecCapabilities codecCapabilities) {
        return C0471ar.a >= 21 && d(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean d(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public CodecProfileLevel[] a() {
        CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities != null) {
            CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
            if (codecProfileLevelArr != null) {
                return codecProfileLevelArr;
            }
        }
        return new CodecProfileLevel[0];
    }

    public boolean b(Format format) {
        if (this.h) {
            return this.d;
        }
        Pair a2 = Qo.a(format.f);
        return a2 != null && ((Integer) a2.first).intValue() == 42;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (a(r7) == false) goto L_0x006d;
     */
    public boolean a(Format format) throws b {
        boolean z = false;
        if (!a(format.f)) {
            return false;
        }
        if (this.h) {
            int i = format.n;
            if (i > 0) {
                int i2 = format.o;
                if (i2 > 0) {
                    if (C0471ar.a >= 21) {
                        return a(i, i2, (double) format.p);
                    }
                    if (i * i2 <= Qo.b()) {
                        z = true;
                    }
                    if (!z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("legacyFrameSize, ");
                        sb.append(format.n);
                        sb.append("x");
                        sb.append(format.o);
                        d(sb.toString());
                    }
                    return z;
                }
            }
            return true;
        }
        if (C0471ar.a >= 21) {
            int i3 = format.w;
            if (i3 == -1 || b(i3)) {
                int i4 = format.v;
                if (i4 != -1) {
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    @TargetApi(21)
    public boolean b(int i) {
        CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            d("sampleRate.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            d("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("sampleRate.support, ");
            sb.append(i);
            d(sb.toString());
            return false;
        }
    }

    @TargetApi(19)
    private static boolean b(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public boolean a(String str) {
        CodecProfileLevel[] a2;
        if (str == null || this.b == null) {
            return true;
        }
        String b2 = Lq.b(str);
        if (b2 == null) {
            return true;
        }
        String str2 = ", ";
        if (!this.b.equals(b2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("codec.mime ");
            sb.append(str);
            sb.append(str2);
            sb.append(b2);
            d(sb.toString());
            return false;
        }
        Pair a3 = Qo.a(str);
        if (a3 == null) {
            return true;
        }
        int intValue = ((Integer) a3.first).intValue();
        int intValue2 = ((Integer) a3.second).intValue();
        if (!this.h && intValue != 42) {
            return true;
        }
        for (CodecProfileLevel codecProfileLevel : a()) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(str2);
        sb2.append(b2);
        d(sb2.toString());
        return false;
    }

    public boolean a(Format format, Format format2, boolean z) {
        boolean z2 = true;
        if (this.h) {
            if (!format.i.equals(format2.i) || format.q != format2.q || ((!this.d && !(format.n == format2.n && format.o == format2.o)) || ((z || format2.u != null) && !C0471ar.a((Object) format.u, (Object) format2.u)))) {
                z2 = false;
            }
            return z2;
        }
        if ("audio/mp4a-latm".equals(this.b) && format.i.equals(format2.i) && format.v == format2.v && format.w == format2.w) {
            Pair a2 = Qo.a(format.f);
            Pair a3 = Qo.a(format2.f);
            if (!(a2 == null || a3 == null)) {
                int intValue = ((Integer) a2.first).intValue();
                int intValue2 = ((Integer) a3.first).intValue();
                if (!(intValue == 42 && intValue2 == 42)) {
                    z2 = false;
                }
                return z2;
            }
        }
        return false;
    }

    @TargetApi(21)
    public boolean a(int i, int i2, double d2) {
        CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            d("sizeAndRate.caps");
            return false;
        }
        VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            d("sizeAndRate.vCaps");
            return false;
        }
        if (!a(videoCapabilities, i, i2, d2)) {
            String str = "x";
            if (i >= i2 || !a(videoCapabilities, i2, i, d2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append(str);
                sb.append(i2);
                sb.append(str);
                sb.append(d2);
                d(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append(str);
            sb2.append(i2);
            sb2.append(str);
            sb2.append(d2);
            c(sb2.toString());
        }
        return true;
    }

    @TargetApi(21)
    public Point a(int i, int i2) {
        CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            d("align.caps");
            return null;
        }
        VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            d("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C0471ar.a(i, widthAlignment) * widthAlignment, C0471ar.a(i2, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    public boolean a(int i) {
        CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            d("channelCount.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            d("channelCount.aCaps");
            return false;
        } else if (a(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("channelCount.support, ");
            sb.append(i);
            d(sb.toString());
            return false;
        }
    }

    private static int a(String str, String str2, int i) {
        if (i > 1 || ((C0471ar.a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedMaxChannelAdjustment: ");
        sb.append(str);
        sb.append(", [");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append("]");
        Iq.d("MediaCodecInfo", sb.toString());
        return i2;
    }

    private static boolean a(CodecCapabilities codecCapabilities) {
        return C0471ar.a >= 19 && b(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean a(VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        if (d2 == -1.0d || d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d2);
    }
}
