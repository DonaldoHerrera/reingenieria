package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.nio.ByteBuffer;

/* compiled from: MetadataUtil */
final class j {
    private static final int A = C0471ar.b("sosn");
    private static final int B = C0471ar.b("tvsh");
    private static final int C = C0471ar.b("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    private static final int a = C0471ar.b("nam");
    private static final int b = C0471ar.b("trk");
    private static final int c = C0471ar.b("cmt");
    private static final int d = C0471ar.b("day");
    private static final int e = C0471ar.b("ART");
    private static final int f = C0471ar.b("too");
    private static final int g = C0471ar.b("alb");
    private static final int h = C0471ar.b("com");
    private static final int i = C0471ar.b("wrt");
    private static final int j = C0471ar.b("lyr");
    private static final int k = C0471ar.b("gen");
    private static final int l = C0471ar.b("covr");
    private static final int m = C0471ar.b("gnre");
    private static final int n = C0471ar.b("grp");
    private static final int o = C0471ar.b("disk");
    private static final int p = C0471ar.b("trkn");
    private static final int q = C0471ar.b("tmpo");
    private static final int r = C0471ar.b("cpil");
    private static final int s = C0471ar.b("aART");
    private static final int t = C0471ar.b("sonm");
    private static final int u = C0471ar.b("soal");
    private static final int v = C0471ar.b("soar");
    private static final int w = C0471ar.b("soaa");
    private static final int x = C0471ar.b("soco");
    private static final int y = C0471ar.b("rtng");
    private static final int z = C0471ar.b("pgap");

    public static Format a(int i2, Format format, Metadata metadata, Metadata metadata2, C1240dn dnVar) {
        if (i2 == 1) {
            if (dnVar.a()) {
                format = format.a(dnVar.b, dnVar.c);
            }
            if (metadata != null) {
                return format.a(metadata);
            }
            return format;
        } else if (i2 != 2 || metadata2 == null) {
            return format;
        } else {
            Format format2 = format;
            for (int i3 = 0; i3 < metadata2.a(); i3++) {
                Entry a2 = metadata2.a(i3);
                if (a2 instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) a2;
                    if ("com.android.capture.fps".equals(mdtaMetadataEntry.a) && mdtaMetadataEntry.d == 23) {
                        try {
                            format2 = format2.a(ByteBuffer.wrap(mdtaMetadataEntry.b).asFloatBuffer().get()).a(new Metadata(mdtaMetadataEntry));
                        } catch (NumberFormatException unused) {
                            Iq.d("MetadataUtil", "Ignoring invalid framerate");
                        }
                    }
                }
            }
            return format2;
        }
    }

    private static TextInformationFrame b(int i2, String str, Pq pq) {
        int h2 = pq.h();
        if (pq.h() == c.Ta) {
            pq.f(8);
            return new TextInformationFrame(str, null, pq.a(h2 - 16));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse text attribute: ");
        sb.append(c.a(i2));
        Iq.d("MetadataUtil", sb.toString());
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    private static TextInformationFrame c(Pq pq) {
        String str;
        int d2 = d(pq);
        if (d2 > 0) {
            String[] strArr = D;
            if (d2 <= strArr.length) {
                str = strArr[d2 - 1];
                if (str == null) {
                    return new TextInformationFrame("TCON", null, str);
                }
                Iq.d("MetadataUtil", "Failed to parse standard genre code");
                return null;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    private static int d(Pq pq) {
        pq.f(4);
        if (pq.h() == c.Ta) {
            pq.f(8);
            return pq.t();
        }
        Iq.d("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static ApicFrame b(Pq pq) {
        int h2 = pq.h();
        String str = "MetadataUtil";
        if (pq.h() == c.Ta) {
            int b2 = c.b(pq.h());
            String str2 = b2 == 13 ? "image/jpeg" : b2 == 14 ? "image/png" : null;
            if (str2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized cover art flags: ");
                sb.append(b2);
                Iq.d(str, sb.toString());
                return null;
            }
            pq.f(4);
            byte[] bArr = new byte[(h2 - 16)];
            pq.a(bArr, 0, bArr.length);
            return new ApicFrame(str2, null, 3, bArr);
        }
        Iq.d(str, "Failed to parse cover art attribute");
        return null;
    }

    public static Entry a(Pq pq) {
        int c2 = pq.c() + pq.h();
        int h2 = pq.h();
        int i2 = (h2 >> 24) & 255;
        if (i2 == 169 || i2 == 253) {
            int i3 = 16777215 & h2;
            if (i3 == c) {
                CommentFrame a2 = a(h2, pq);
                pq.e(c2);
                return a2;
            }
            if (i3 != a) {
                if (i3 != b) {
                    if (i3 != h) {
                        if (i3 != i) {
                            if (i3 == d) {
                                TextInformationFrame b2 = b(h2, "TDRC", pq);
                                pq.e(c2);
                                return b2;
                            } else if (i3 == e) {
                                TextInformationFrame b3 = b(h2, "TPE1", pq);
                                pq.e(c2);
                                return b3;
                            } else if (i3 == f) {
                                TextInformationFrame b4 = b(h2, "TSSE", pq);
                                pq.e(c2);
                                return b4;
                            } else if (i3 == g) {
                                TextInformationFrame b5 = b(h2, "TALB", pq);
                                pq.e(c2);
                                return b5;
                            } else if (i3 == j) {
                                TextInformationFrame b6 = b(h2, "USLT", pq);
                                pq.e(c2);
                                return b6;
                            } else if (i3 == k) {
                                TextInformationFrame b7 = b(h2, "TCON", pq);
                                pq.e(c2);
                                return b7;
                            } else if (i3 == n) {
                                TextInformationFrame b8 = b(h2, "TIT1", pq);
                                pq.e(c2);
                                return b8;
                            }
                        }
                    }
                    TextInformationFrame b9 = b(h2, "TCOM", pq);
                    pq.e(c2);
                    return b9;
                }
            }
            TextInformationFrame b10 = b(h2, "TIT2", pq);
            pq.e(c2);
            return b10;
        }
        try {
            if (h2 == m) {
                return c(pq);
            }
            if (h2 == o) {
                TextInformationFrame a3 = a(h2, "TPOS", pq);
                pq.e(c2);
                return a3;
            } else if (h2 == p) {
                TextInformationFrame a4 = a(h2, "TRCK", pq);
                pq.e(c2);
                return a4;
            } else if (h2 == q) {
                Id3Frame a5 = a(h2, "TBPM", pq, true, false);
                pq.e(c2);
                return a5;
            } else if (h2 == r) {
                Id3Frame a6 = a(h2, "TCMP", pq, true, true);
                pq.e(c2);
                return a6;
            } else if (h2 == l) {
                ApicFrame b11 = b(pq);
                pq.e(c2);
                return b11;
            } else if (h2 == s) {
                TextInformationFrame b12 = b(h2, "TPE2", pq);
                pq.e(c2);
                return b12;
            } else if (h2 == t) {
                TextInformationFrame b13 = b(h2, "TSOT", pq);
                pq.e(c2);
                return b13;
            } else if (h2 == u) {
                TextInformationFrame b14 = b(h2, "TSO2", pq);
                pq.e(c2);
                return b14;
            } else if (h2 == v) {
                TextInformationFrame b15 = b(h2, "TSOA", pq);
                pq.e(c2);
                return b15;
            } else if (h2 == w) {
                TextInformationFrame b16 = b(h2, "TSOP", pq);
                pq.e(c2);
                return b16;
            } else if (h2 == x) {
                TextInformationFrame b17 = b(h2, "TSOC", pq);
                pq.e(c2);
                return b17;
            } else if (h2 == y) {
                Id3Frame a7 = a(h2, "ITUNESADVISORY", pq, false, false);
                pq.e(c2);
                return a7;
            } else if (h2 == z) {
                Id3Frame a8 = a(h2, "ITUNESGAPLESS", pq, false, true);
                pq.e(c2);
                return a8;
            } else if (h2 == A) {
                TextInformationFrame b18 = b(h2, "TVSHOWSORT", pq);
                pq.e(c2);
                return b18;
            } else if (h2 == B) {
                TextInformationFrame b19 = b(h2, "TVSHOW", pq);
                pq.e(c2);
                return b19;
            } else if (h2 == C) {
                Id3Frame a9 = a(pq, c2);
                pq.e(c2);
                return a9;
            }
        } finally {
            pq.e(c2);
        }
        String str = "MetadataUtil";
        StringBuilder sb = new StringBuilder();
        sb.append("Skipped unknown metadata entry: ");
        sb.append(c.a(h2));
        Iq.a(str, sb.toString());
        pq.e(c2);
        return null;
    }

    public static MdtaMetadataEntry a(Pq pq, int i2, String str) {
        while (true) {
            int c2 = pq.c();
            if (c2 >= i2) {
                return null;
            }
            int h2 = pq.h();
            if (pq.h() == c.Ta) {
                int h3 = pq.h();
                int h4 = pq.h();
                int i3 = h2 - 16;
                byte[] bArr = new byte[i3];
                pq.a(bArr, 0, i3);
                return new MdtaMetadataEntry(str, bArr, h4, h3);
            }
            pq.e(c2 + h2);
        }
    }

    private static CommentFrame a(int i2, Pq pq) {
        int h2 = pq.h();
        if (pq.h() == c.Ta) {
            pq.f(8);
            String a2 = pq.a(h2 - 16);
            return new CommentFrame("und", a2, a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse comment attribute: ");
        sb.append(c.a(i2));
        Iq.d("MetadataUtil", sb.toString());
        return null;
    }

    private static Id3Frame a(int i2, String str, Pq pq, boolean z2, boolean z3) {
        Id3Frame id3Frame;
        int d2 = d(pq);
        if (z3) {
            d2 = Math.min(1, d2);
        }
        if (d2 >= 0) {
            if (z2) {
                id3Frame = new TextInformationFrame(str, null, Integer.toString(d2));
            } else {
                id3Frame = new CommentFrame("und", str, Integer.toString(d2));
            }
            return id3Frame;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse uint8 attribute: ");
        sb.append(c.a(i2));
        Iq.d("MetadataUtil", sb.toString());
        return null;
    }

    private static TextInformationFrame a(int i2, String str, Pq pq) {
        int h2 = pq.h();
        if (pq.h() == c.Ta && h2 >= 22) {
            pq.f(10);
            int z2 = pq.z();
            if (z2 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(z2);
                String sb2 = sb.toString();
                int z3 = pq.z();
                if (z3 > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(z3);
                    sb2 = sb3.toString();
                }
                return new TextInformationFrame(str, null, sb2);
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Failed to parse index/count attribute: ");
        sb4.append(c.a(i2));
        Iq.d("MetadataUtil", sb4.toString());
        return null;
    }

    private static Id3Frame a(Pq pq, int i2) {
        String str = null;
        String str2 = null;
        int i3 = -1;
        int i4 = -1;
        while (pq.c() < i2) {
            int c2 = pq.c();
            int h2 = pq.h();
            int h3 = pq.h();
            pq.f(4);
            if (h3 == c.Ra) {
                str = pq.a(h2 - 12);
            } else if (h3 == c.Sa) {
                str2 = pq.a(h2 - 12);
            } else {
                if (h3 == c.Ta) {
                    i3 = c2;
                    i4 = h2;
                }
                pq.f(h2 - 12);
            }
        }
        if (str == null || str2 == null || i3 == -1) {
            return null;
        }
        pq.e(i3);
        pq.f(16);
        return new InternalFrame(str, str2, pq.a(i4 - 16));
    }
}
