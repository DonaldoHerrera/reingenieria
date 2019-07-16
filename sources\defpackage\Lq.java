package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: Lq reason: default package */
/* compiled from: MimeTypes */
public final class Lq {
    private static final ArrayList<a> a = new ArrayList<>();

    /* renamed from: Lq$a */
    /* compiled from: MimeTypes */
    private static final class a {
        public final String a;
        public final String b;
        public final int c;
    }

    public static int a(String str) {
        char c;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 2;
                    break;
                }
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 4;
                    break;
                }
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 0;
                    break;
                }
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 3;
                    break;
                }
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 1;
                    break;
                }
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 5;
                    break;
                }
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 6;
                    break;
                }
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 5;
            case 1:
            case 2:
                return 6;
            case 3:
                return 17;
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 14;
            default:
                return 0;
        }
    }

    public static String a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i != 64) {
            if (i == 163) {
                return "video/wvc1";
            }
            if (i == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i == 165) {
                return "audio/ac3";
            }
            if (i == 166) {
                return "audio/eac3";
            }
            switch (i) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                    return "video/mpeg2";
                case 102:
                case 103:
                case 104:
                    break;
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case 171:
                            return "audio/vnd.dts.hd";
                        case 173:
                            return "audio/opus";
                        case 174:
                            return "audio/ac4";
                        default:
                            return null;
                    }
            }
        }
        return "audio/mp4a-latm";
    }

    public static String b(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String g = C0471ar.g(str.trim());
        if (g.startsWith("avc1") || g.startsWith("avc3")) {
            return "video/avc";
        }
        if (g.startsWith("hev1") || g.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (g.startsWith("dvav") || g.startsWith("dva1") || g.startsWith("dvhe") || g.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (g.startsWith("av01")) {
            return "video/av01";
        }
        if (g.startsWith("vp9") || g.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (g.startsWith("vp8") || g.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (g.startsWith("mp4a")) {
            if (g.startsWith("mp4a.")) {
                String substring = g.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = a(Integer.parseInt(C0471ar.h(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            if (str2 == null) {
                str2 = "audio/mp4a-latm";
            }
            return str2;
        } else if (g.startsWith("ac-3") || g.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (g.startsWith("ec-3") || g.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (g.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (g.startsWith("ac-4") || g.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (g.startsWith("dtsc") || g.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (g.startsWith("dtsh") || g.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (g.startsWith("opus")) {
                return "audio/opus";
            }
            if (g.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (g.startsWith("flac")) {
                return "audio/flac";
            }
            return g(g);
        }
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (d(str)) {
            return 1;
        }
        if (f(str)) {
            return 2;
        }
        if (e(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        return i(str);
    }

    public static boolean d(String str) {
        return "audio".equals(h(str));
    }

    public static boolean e(String str) {
        return "text".equals(h(str));
    }

    public static boolean f(String str) {
        return "video".equals(h(str));
    }

    private static String g(String str) {
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) a.get(i);
            if (str.startsWith(aVar.b)) {
                return aVar.a;
            }
        }
        return null;
    }

    private static String h(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    private static int i(String str) {
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) a.get(i);
            if (str.equals(aVar.a)) {
                return aVar.c;
            }
        }
        return -1;
    }
}
