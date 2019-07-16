package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* renamed from: Qo reason: default package */
/* compiled from: MediaCodecUtil */
public final class Qo {
    private static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<a, List<Lo>> b = new HashMap<>();
    private static final SparseIntArray c = new SparseIntArray();
    private static final SparseIntArray d = new SparseIntArray();
    private static final Map<String, Integer> e = new HashMap();
    private static final Map<String, Integer> f = new HashMap();
    private static final Map<String, Integer> g = new HashMap();
    private static final SparseIntArray h = new SparseIntArray();
    private static int i = -1;

    /* renamed from: Qo$a */
    /* compiled from: MediaCodecUtil */
    private static final class a {
        public final String a;
        public final boolean b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (!(TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            String str = this.a;
            int i = 1231;
            int hashCode = ((((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.b ? 1231 : 1237)) * 31;
            if (!this.c) {
                i = 1237;
            }
            return hashCode + i;
        }
    }

    /* renamed from: Qo$b */
    /* compiled from: MediaCodecUtil */
    public static class b extends Exception {
        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: Qo$c */
    /* compiled from: MediaCodecUtil */
    private interface c {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, String str2, CodecCapabilities codecCapabilities);

        boolean b();

        boolean b(String str, String str2, CodecCapabilities codecCapabilities);
    }

    /* renamed from: Qo$d */
    /* compiled from: MediaCodecUtil */
    private static final class d implements c {
        private d() {
        }

        public int a() {
            return MediaCodecList.getCodecCount();
        }

        public boolean b() {
            return false;
        }

        public boolean b(String str, String str2, CodecCapabilities codecCapabilities) {
            return false;
        }

        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        public boolean a(String str, String str2, CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    @TargetApi(21)
    /* renamed from: Qo$e */
    /* compiled from: MediaCodecUtil */
    private static final class e implements c {
        private final int a;
        private MediaCodecInfo[] b;

        public e(boolean z, boolean z2) {
            this.a = (z || z2) ? 1 : 0;
        }

        private void c() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }

        public int a() {
            c();
            return this.b.length;
        }

        public boolean b() {
            return true;
        }

        public boolean b(String str, String str2, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        public MediaCodecInfo a(int i) {
            c();
            return this.b[i];
        }

        public boolean a(String str, String str2, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    /* renamed from: Qo$f */
    /* compiled from: MediaCodecUtil */
    private static final class f implements Comparator<Lo> {
        private f() {
        }

        /* renamed from: a */
        public int compare(Lo lo, Lo lo2) {
            return a(lo) - a(lo2);
        }

        private static int a(Lo lo) {
            return lo.a.startsWith("OMX.google") ? -1 : 0;
        }
    }

    /* renamed from: Qo$g */
    /* compiled from: MediaCodecUtil */
    private static final class g implements Comparator<Lo> {
        private g() {
        }

        /* renamed from: a */
        public int compare(Lo lo, Lo lo2) {
            return a(lo) - a(lo2);
        }

        private static int a(Lo lo) {
            String str = lo.a;
            if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                return -1;
            }
            return (C0471ar.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : 1;
        }
    }

    static {
        SparseIntArray sparseIntArray = c;
        Integer valueOf = Integer.valueOf(1);
        sparseIntArray.put(66, 1);
        SparseIntArray sparseIntArray2 = c;
        Integer valueOf2 = Integer.valueOf(2);
        sparseIntArray2.put(77, 2);
        SparseIntArray sparseIntArray3 = c;
        Integer valueOf3 = Integer.valueOf(4);
        sparseIntArray3.put(88, 4);
        SparseIntArray sparseIntArray4 = c;
        Integer valueOf4 = Integer.valueOf(8);
        sparseIntArray4.put(100, 8);
        SparseIntArray sparseIntArray5 = c;
        Integer valueOf5 = Integer.valueOf(16);
        sparseIntArray5.put(110, 16);
        c.put(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, 32);
        SparseIntArray sparseIntArray6 = c;
        Integer valueOf6 = Integer.valueOf(64);
        sparseIntArray6.put(244, 64);
        d.put(10, 1);
        d.put(11, 4);
        d.put(12, 8);
        d.put(13, 16);
        d.put(20, 32);
        d.put(21, 64);
        d.put(22, 128);
        SparseIntArray sparseIntArray7 = d;
        Integer valueOf7 = Integer.valueOf(256);
        sparseIntArray7.put(30, 256);
        d.put(31, 512);
        d.put(32, 1024);
        d.put(40, 2048);
        d.put(41, 4096);
        d.put(42, 8192);
        d.put(50, 16384);
        d.put(51, 32768);
        d.put(52, 65536);
        e.put("L30", valueOf);
        e.put("L60", valueOf3);
        e.put("L63", valueOf5);
        e.put("L90", valueOf6);
        e.put("L93", valueOf7);
        e.put("L120", Integer.valueOf(1024));
        e.put("L123", Integer.valueOf(4096));
        e.put("L150", Integer.valueOf(16384));
        e.put("L153", Integer.valueOf(65536));
        e.put("L156", Integer.valueOf(262144));
        e.put("L180", Integer.valueOf(1048576));
        e.put("L183", Integer.valueOf(4194304));
        e.put("L186", Integer.valueOf(16777216));
        e.put("H30", valueOf2);
        e.put("H60", valueOf4);
        e.put("H63", Integer.valueOf(32));
        e.put("H90", Integer.valueOf(128));
        e.put("H93", Integer.valueOf(512));
        e.put("H120", Integer.valueOf(2048));
        e.put("H123", Integer.valueOf(8192));
        e.put("H150", Integer.valueOf(32768));
        e.put("H153", Integer.valueOf(131072));
        e.put("H156", Integer.valueOf(524288));
        e.put("H180", Integer.valueOf(2097152));
        e.put("H183", Integer.valueOf(8388608));
        e.put("H186", Integer.valueOf(33554432));
        f.put("00", valueOf);
        f.put("01", valueOf2);
        f.put("02", valueOf3);
        f.put("03", valueOf4);
        f.put("04", valueOf5);
        f.put("05", Integer.valueOf(32));
        f.put("06", valueOf6);
        f.put("07", Integer.valueOf(128));
        f.put("08", valueOf7);
        f.put("09", Integer.valueOf(512));
        g.put("01", valueOf);
        g.put("02", valueOf2);
        g.put("03", valueOf3);
        g.put("04", valueOf4);
        g.put("05", valueOf5);
        g.put("06", Integer.valueOf(32));
        g.put("07", valueOf6);
        g.put("08", Integer.valueOf(128));
        g.put("09", valueOf7);
        h.put(1, 1);
        h.put(2, 2);
        h.put(3, 3);
        h.put(4, 4);
        h.put(5, 5);
        h.put(6, 6);
        h.put(17, 17);
        h.put(20, 20);
        h.put(23, 23);
        h.put(29, 29);
        h.put(39, 39);
        h.put(42, 42);
    }

    private static int a(int i2) {
        if (i2 == 1 || i2 == 2) {
            return 25344;
        }
        switch (i2) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    public static Lo a() throws b {
        Lo a2 = a("audio/raw", false, false);
        if (a2 == null) {
            return null;
        }
        return Lo.b(a2.a);
    }

    public static synchronized List<Lo> b(String str, boolean z, boolean z2) throws b {
        synchronized (Qo.class) {
            a aVar = new a(str, z, z2);
            List<Lo> list = (List) b.get(aVar);
            if (list != null) {
                return list;
            }
            c eVar = C0471ar.a >= 21 ? new e(z, z2) : new d();
            ArrayList a2 = a(aVar, eVar, str);
            if (z && a2.isEmpty() && 21 <= C0471ar.a && C0471ar.a <= 23) {
                eVar = new d();
                a2 = a(aVar, eVar, str);
                if (!a2.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(((Lo) a2.get(0)).a);
                    Iq.d("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                a2.addAll(a(new a("audio/eac3", aVar.b, aVar.c), eVar, str));
            }
            a(str, (List<Lo>) a2);
            List<Lo> unmodifiableList = Collections.unmodifiableList(a2);
            b.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    private static Pair<Integer, Integer> c(String str, String[] strArr) {
        String str2 = "Ignoring malformed Dolby Vision codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            Iq.d(str3, sb.toString());
            return null;
        }
        Matcher matcher = a.matcher(strArr[1]);
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            Iq.d(str3, sb2.toString());
            return null;
        }
        String group = matcher.group(1);
        Integer num = (Integer) f.get(group);
        if (num == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown Dolby Vision profile string: ");
            sb3.append(group);
            Iq.d(str3, sb3.toString());
            return null;
        }
        String str4 = strArr[2];
        Integer num2 = (Integer) g.get(str4);
        if (num2 != null) {
            return new Pair<>(num, num2);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown Dolby Vision level string: ");
        sb4.append(str4);
        Iq.d(str3, sb4.toString());
        return null;
    }

    private static Pair<Integer, Integer> d(String str, String[] strArr) {
        String str2 = "Ignoring malformed HEVC codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 4) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            Iq.d(str3, sb.toString());
            return null;
        }
        int i2 = 1;
        Matcher matcher = a.matcher(strArr[1]);
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            Iq.d(str3, sb2.toString());
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if ("2".equals(group)) {
                i2 = 2;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown HEVC profile string: ");
                sb3.append(group);
                Iq.d(str3, sb3.toString());
                return null;
            }
        }
        String str4 = strArr[3];
        Integer num = (Integer) e.get(str4);
        if (num != null) {
            return new Pair<>(Integer.valueOf(i2), num);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown HEVC level string: ");
        sb4.append(str4);
        Iq.d(str3, sb4.toString());
        return null;
    }

    public static Lo a(String str, boolean z, boolean z2) throws b {
        List b2 = b(str, z, z2);
        if (b2.isEmpty()) {
            return null;
        }
        return (Lo) b2.get(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r3.equals("avc1") != false) goto L_0x005c;
     */
    public static Pair<Integer, Integer> a(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        char c2 = 0;
        String str2 = split[0];
        switch (str2.hashCode()) {
            case 3006243:
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c2 = 1;
                    break;
                }
            case 3095771:
                if (str2.equals("dvh1")) {
                    c2 = 5;
                    break;
                }
            case 3095823:
                if (str2.equals("dvhe")) {
                    c2 = 4;
                    break;
                }
            case 3199032:
                if (str2.equals("hev1")) {
                    c2 = 2;
                    break;
                }
            case 3214780:
                if (str2.equals("hvc1")) {
                    c2 = 3;
                    break;
                }
            case 3356560:
                if (str2.equals("mp4a")) {
                    c2 = 6;
                    break;
                }
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return b(str, split);
            case 2:
            case 3:
                return d(str, split);
            case 4:
            case 5:
                return c(str, split);
            case 6:
                return a(str, split);
            default:
                return null;
        }
    }

    private static ArrayList<Lo> a(a aVar, c cVar, String str) throws b {
        ArrayList<Lo> arrayList;
        String name;
        String a2;
        a aVar2 = aVar;
        c cVar2 = cVar;
        String str2 = "secure-playback";
        String str3 = "tunneled-playback";
        try {
            arrayList = new ArrayList<>();
            String str4 = aVar2.a;
            int a3 = cVar.a();
            boolean b2 = cVar.b();
            for (int i2 = 0; i2 < a3; i2++) {
                MediaCodecInfo a4 = cVar2.a(i2);
                name = a4.getName();
                a2 = a(a4, name, b2, str);
                if (a2 != null) {
                    CodecCapabilities capabilitiesForType = a4.getCapabilitiesForType(a2);
                    boolean a5 = cVar2.a(str3, a2, capabilitiesForType);
                    boolean b3 = cVar2.b(str3, a2, capabilitiesForType);
                    if (aVar2.c || !b3) {
                        if (!aVar2.c || a5) {
                            boolean a6 = cVar2.a(str2, a2, capabilitiesForType);
                            boolean b4 = cVar2.b(str2, a2, capabilitiesForType);
                            if (aVar2.b || !b4) {
                                if (!aVar2.b || a6) {
                                    boolean b5 = b(name);
                                    if (b2) {
                                        if (aVar2.b != a6) {
                                        }
                                        arrayList.add(Lo.a(name, str4, capabilitiesForType, b5, false));
                                    }
                                    if (!b2 && !aVar2.b) {
                                        arrayList.add(Lo.a(name, str4, capabilitiesForType, b5, false));
                                    } else if (!b2 && a6) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(name);
                                        sb.append(".secure");
                                        arrayList.add(Lo.a(sb.toString(), str4, capabilitiesForType, b5, true));
                                        return arrayList;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e2) {
            String str5 = "MediaCodecUtil";
            if (C0471ar.a <= 23) {
                if (!arrayList.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Skipping codec ");
                    sb2.append(name);
                    sb2.append(" (failed to query capabilities)");
                    Iq.b(str5, sb2.toString());
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to query codec ");
            sb3.append(name);
            sb3.append(" (");
            sb3.append(a2);
            sb3.append(")");
            Iq.b(str5, sb3.toString());
            throw e2;
        } catch (Exception e3) {
            throw new b(e3);
        }
    }

    public static int b() throws b {
        if (i == -1) {
            int i2 = 0;
            Lo a2 = a("video/avc", false, false);
            if (a2 != null) {
                CodecProfileLevel[] a3 = a2.a();
                int length = a3.length;
                int i3 = 0;
                while (i2 < length) {
                    i3 = Math.max(a(a3[i2].level), i3);
                    i2++;
                }
                i2 = Math.max(i3, C0471ar.a >= 21 ? 345600 : 172800);
            }
            i = i2;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (defpackage.C0471ar.b.startsWith("HM") != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fb, code lost:
        if ("SO-02E".equals(defpackage.C0471ar.b) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0130, code lost:
        if ("C1605".equals(defpackage.C0471ar.b) != false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a1, code lost:
        if ("SCV31".equals(defpackage.C0471ar.b) != false) goto L_0x01a3;
     */
    private static boolean b(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (C0471ar.a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (C0471ar.a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            if (!"a70".equals(C0471ar.b)) {
                if ("Xiaomi".equals(C0471ar.c)) {
                }
            }
            return false;
        }
        if (C0471ar.a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            if (!"dlxu".equals(C0471ar.b)) {
                if (!"protou".equals(C0471ar.b)) {
                    if (!"ville".equals(C0471ar.b)) {
                        if (!"villeplus".equals(C0471ar.b)) {
                            if (!"villec2".equals(C0471ar.b) && !C0471ar.b.startsWith("gee")) {
                                if (!"C6602".equals(C0471ar.b)) {
                                    if (!"C6603".equals(C0471ar.b)) {
                                        if (!"C6606".equals(C0471ar.b)) {
                                            if (!"C6616".equals(C0471ar.b)) {
                                                if (!"L36h".equals(C0471ar.b)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (C0471ar.a == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            if (!"C1504".equals(C0471ar.b)) {
                if (!"C1505".equals(C0471ar.b)) {
                    if (!"C1604".equals(C0471ar.b)) {
                    }
                }
            }
            return false;
        }
        String str3 = "samsung";
        if (C0471ar.a < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && str3.equals(C0471ar.c))) {
            if (!C0471ar.b.startsWith("zeroflte") && !C0471ar.b.startsWith("zerolte") && !C0471ar.b.startsWith("zenlte")) {
                if (!"SC-05G".equals(C0471ar.b)) {
                    if (!"marinelteatt".equals(C0471ar.b)) {
                        if (!"404SC".equals(C0471ar.b)) {
                            if (!"SC-04G".equals(C0471ar.b)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        String str4 = "jflte";
        if (C0471ar.a <= 19 && "OMX.SEC.vp8.dec".equals(str) && str3.equals(C0471ar.c) && (C0471ar.b.startsWith("d2") || C0471ar.b.startsWith("serrano") || C0471ar.b.startsWith(str4) || C0471ar.b.startsWith("santos") || C0471ar.b.startsWith("t0"))) {
            return false;
        }
        if (C0471ar.a <= 19 && C0471ar.b.startsWith(str4) && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (!"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return true;
        }
        return false;
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        String[] supportedTypes;
        if (b(mediaCodecInfo, str, z, str2)) {
            if (str2.equals("video/dolby-vision")) {
                if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                    return "video/hevcdv";
                }
                if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                    return "video/dv_hevc";
                }
            }
            for (String str3 : mediaCodecInfo.getSupportedTypes()) {
                if (str3.equalsIgnoreCase(str2)) {
                    return str3;
                }
            }
        }
        return null;
    }

    private static void a(String str, List<Lo> list) {
        if ("audio/raw".equals(str)) {
            Collections.sort(list, new g());
        } else if (C0471ar.a < 21 && list.size() > 1) {
            String str2 = ((Lo) list.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(list, new f());
            }
        }
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        String str2 = "Ignoring malformed MP4A codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length != 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            Iq.d(str3, sb.toString());
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(Lq.a(Integer.parseInt(strArr[1], 16)))) {
                int i2 = h.get(Integer.parseInt(strArr[2]), -1);
                if (i2 != -1) {
                    return new Pair<>(Integer.valueOf(i2), Integer.valueOf(0));
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            Iq.d(str3, sb2.toString());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ("Nexus 10".equals(defpackage.C0471ar.d) != false) goto L_0x001a;
     */
    private static boolean b(String str) {
        if (C0471ar.a <= 22) {
            if (!"ODROID-XU3".equals(C0471ar.d)) {
            }
            if ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        int i2;
        int i3;
        String str2 = "Ignoring malformed AVC codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            Iq.d(str3, sb.toString());
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                int parseInt = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i2 = Integer.parseInt(strArr[1].substring(4), 16);
                i3 = parseInt;
            } else if (strArr.length >= 3) {
                i3 = Integer.parseInt(strArr[1]);
                i2 = Integer.parseInt(strArr[2]);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(str);
                Iq.d(str3, sb2.toString());
                return null;
            }
            int i4 = c.get(i3, -1);
            if (i4 == -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown AVC profile: ");
                sb3.append(i3);
                Iq.d(str3, sb3.toString());
                return null;
            }
            int i5 = d.get(i2, -1);
            if (i5 != -1) {
                return new Pair<>(Integer.valueOf(i4), Integer.valueOf(i5));
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown AVC level: ");
            sb4.append(i2);
            Iq.d(str3, sb4.toString());
            return null;
        } catch (NumberFormatException unused) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(str);
            Iq.d(str3, sb5.toString());
            return null;
        }
    }
}
