package com.google.android.exoplayer2.extractor.mp4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Atom */
abstract class c {
    public static final int A = C0471ar.b("ac-3");
    public static final int Aa = C0471ar.b("stss");
    public static final int B = C0471ar.b("dac3");
    public static final int Ba = C0471ar.b("ctts");
    public static final int C = C0471ar.b("ec-3");
    public static final int Ca = C0471ar.b("stsc");
    public static final int D = C0471ar.b("dec3");
    public static final int Da = C0471ar.b("stsz");
    public static final int E = C0471ar.b("ac-4");
    public static final int Ea = C0471ar.b("stz2");
    public static final int F = C0471ar.b("dac4");
    public static final int Fa = C0471ar.b("stco");
    public static final int G = C0471ar.b("dtsc");
    public static final int Ga = C0471ar.b("co64");
    public static final int H = C0471ar.b("dtsh");
    public static final int Ha = C0471ar.b("tx3g");
    public static final int I = C0471ar.b("dtsl");
    public static final int Ia = C0471ar.b("wvtt");
    public static final int J = C0471ar.b("dtse");
    public static final int Ja = C0471ar.b("stpp");
    public static final int K = C0471ar.b("ddts");
    public static final int Ka = C0471ar.b("c608");
    public static final int L = C0471ar.b("tfdt");
    public static final int La = C0471ar.b("samr");
    public static final int M = C0471ar.b("tfhd");
    public static final int Ma = C0471ar.b("sawb");
    public static final int N = C0471ar.b("trex");
    public static final int Na = C0471ar.b("udta");
    public static final int O = C0471ar.b("trun");
    public static final int Oa = C0471ar.b("meta");
    public static final int P = C0471ar.b("sidx");
    public static final int Pa = C0471ar.b("keys");
    public static final int Q = C0471ar.b("moov");
    public static final int Qa = C0471ar.b("ilst");
    public static final int R = C0471ar.b("mvhd");
    public static final int Ra = C0471ar.b("mean");
    public static final int S = C0471ar.b("trak");
    public static final int Sa = C0471ar.b("name");
    public static final int T = C0471ar.b("mdia");
    public static final int Ta = C0471ar.b("data");
    public static final int U = C0471ar.b("minf");
    public static final int Ua = C0471ar.b("emsg");
    public static final int V = C0471ar.b("stbl");
    public static final int Va = C0471ar.b("st3d");
    public static final int W = C0471ar.b("esds");
    public static final int Wa = C0471ar.b("sv3d");
    public static final int X = C0471ar.b("moof");
    public static final int Xa = C0471ar.b("proj");
    public static final int Y = C0471ar.b("traf");
    public static final int Ya = C0471ar.b("camm");
    public static final int Z = C0471ar.b("mvex");
    public static final int Za = C0471ar.b("alac");
    public static final int _a = C0471ar.b("alaw");
    public static final int a = C0471ar.b("ftyp");
    public static final int aa = C0471ar.b("mehd");
    public static final int ab = C0471ar.b("ulaw");
    public static final int b = C0471ar.b("avc1");
    public static final int ba = C0471ar.b("tkhd");
    public static final int bb = C0471ar.b("Opus");
    public static final int c = C0471ar.b("avc3");
    public static final int ca = C0471ar.b("edts");
    public static final int cb = C0471ar.b("dOps");
    public static final int d = C0471ar.b("avcC");
    public static final int da = C0471ar.b("elst");
    public static final int db = C0471ar.b("fLaC");
    public static final int e = C0471ar.b("hvc1");
    public static final int ea = C0471ar.b("mdhd");
    public static final int eb = C0471ar.b("dfLa");
    public static final int f = C0471ar.b("hev1");
    public static final int fa = C0471ar.b("hdlr");
    public static final int g = C0471ar.b("hvcC");
    public static final int ga = C0471ar.b("stsd");
    public static final int h = C0471ar.b("vp08");
    public static final int ha = C0471ar.b("pssh");
    public static final int i = C0471ar.b("vp09");
    public static final int ia = C0471ar.b("sinf");
    public static final int j = C0471ar.b("vpcC");
    public static final int ja = C0471ar.b("schm");
    public static final int k = C0471ar.b("av01");
    public static final int ka = C0471ar.b("schi");
    public static final int l = C0471ar.b("av1C");
    public static final int la = C0471ar.b("tenc");
    public static final int m = C0471ar.b("dvav");
    public static final int ma = C0471ar.b("encv");
    public static final int n = C0471ar.b("dva1");
    public static final int na = C0471ar.b("enca");
    public static final int o = C0471ar.b("dvhe");
    public static final int oa = C0471ar.b("frma");
    public static final int p = C0471ar.b("dvh1");
    public static final int pa = C0471ar.b("saiz");
    public static final int q = C0471ar.b("dvcC");
    public static final int qa = C0471ar.b("saio");
    public static final int r = C0471ar.b("dvvC");
    public static final int ra = C0471ar.b("sbgp");
    public static final int s = C0471ar.b("s263");
    public static final int sa = C0471ar.b("sgpd");
    public static final int t = C0471ar.b("d263");
    public static final int ta = C0471ar.b("uuid");
    public static final int u = C0471ar.b("mdat");
    public static final int ua = C0471ar.b("senc");
    public static final int v = C0471ar.b("mp4a");
    public static final int va = C0471ar.b("pasp");
    public static final int w = C0471ar.b(".mp3");
    public static final int wa = C0471ar.b("TTML");
    public static final int x = C0471ar.b("wave");
    public static final int xa = C0471ar.b("vmhd");
    public static final int y = C0471ar.b("lpcm");
    public static final int ya = C0471ar.b("mp4v");
    public static final int z = C0471ar.b("sowt");
    public static final int za = C0471ar.b("stts");
    public final int fb;

    /* compiled from: Atom */
    static final class a extends c {
        public final long gb;
        public final List<b> hb = new ArrayList();
        public final List<a> ib = new ArrayList();

        public a(int i, long j) {
            super(i);
            this.gb = j;
        }

        public void a(b bVar) {
            this.hb.add(bVar);
        }

        public a d(int i) {
            int size = this.ib.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.ib.get(i2);
                if (aVar.fb == i) {
                    return aVar;
                }
            }
            return null;
        }

        public b e(int i) {
            int size = this.hb.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.hb.get(i2);
                if (bVar.fb == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(c.a(this.fb));
            sb.append(" leaves: ");
            sb.append(Arrays.toString(this.hb.toArray()));
            sb.append(" containers: ");
            sb.append(Arrays.toString(this.ib.toArray()));
            return sb.toString();
        }

        public void a(a aVar) {
            this.ib.add(aVar);
        }
    }

    /* compiled from: Atom */
    static final class b extends c {
        public final Pq gb;

        public b(int i, Pq pq) {
            super(i);
            this.gb = pq;
        }
    }

    public c(int i2) {
        this.fb = i2;
    }

    public static String a(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) ((i2 >> 24) & 255));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static int c(int i2) {
        return (i2 >> 24) & 255;
    }

    public String toString() {
        return a(this.fb);
    }
}
