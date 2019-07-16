package defpackage;

import com.google.android.exoplayer2.Format;

/* renamed from: _o reason: default package */
/* compiled from: SubtitleDecoderFactory */
class _o implements C0469ap {
    _o() {
    }

    public boolean a(Format format) {
        String str = format.i;
        return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
    }

    public Yo b(Format format) {
        char c;
        String str = format.i;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals("application/dvbsubs")) {
                    c = 9;
                    break;
                }
            case -1248334819:
                if (str.equals("application/pgs")) {
                    c = 10;
                    break;
                }
            case -1026075066:
                if (str.equals("application/x-mp4-vtt")) {
                    c = 2;
                    break;
                }
            case -1004728940:
                if (str.equals("text/vtt")) {
                    c = 0;
                    break;
                }
            case 691401887:
                if (str.equals("application/x-quicktime-tx3g")) {
                    c = 5;
                    break;
                }
            case 822864842:
                if (str.equals("text/x-ssa")) {
                    c = 1;
                    break;
                }
            case 930165504:
                if (str.equals("application/x-mp4-cea-608")) {
                    c = 7;
                    break;
                }
            case 1566015601:
                if (str.equals("application/cea-608")) {
                    c = 6;
                    break;
                }
            case 1566016562:
                if (str.equals("application/cea-708")) {
                    c = 8;
                    break;
                }
            case 1668750253:
                if (str.equals("application/x-subrip")) {
                    c = 4;
                    break;
                }
            case 1693976202:
                if (str.equals("application/ttml+xml")) {
                    c = 3;
                    break;
                }
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new Lp();
            case 1:
                return new C1701sp(format.k);
            case 2:
                return new Fp();
            case 3:
                return new C1821wp();
            case 4:
                return new C1761up();
            case 5:
                return new Cp(format.k);
            case 6:
            case 7:
                return new C1303fp(format.i, format.B);
            case 8:
                return new C1365hp(format.B, format.k);
            case 9:
                return new C1550np(format.k);
            case 10:
                return new C1642qp();
            default:
                throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
        }
    }
}
