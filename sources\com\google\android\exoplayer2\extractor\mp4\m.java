package com.google.android.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: Sniffer */
final class m {
    private static final int[] a = {C0471ar.b("isom"), C0471ar.b("iso2"), C0471ar.b("iso3"), C0471ar.b("iso4"), C0471ar.b("iso5"), C0471ar.b("iso6"), C0471ar.b("avc1"), C0471ar.b("hvc1"), C0471ar.b("hev1"), C0471ar.b("av01"), C0471ar.b("mp41"), C0471ar.b("mp42"), C0471ar.b("3g2a"), C0471ar.b("3g2b"), C0471ar.b("3gr6"), C0471ar.b("3gs6"), C0471ar.b("3ge6"), C0471ar.b("3gg6"), C0471ar.b("M4V "), C0471ar.b("M4A "), C0471ar.b("f4v "), C0471ar.b("kddi"), C0471ar.b("M4VP"), C0471ar.b("qt  "), C0471ar.b("MSNV"), C0471ar.b("dby1")};

    public static boolean a(C0313an anVar) throws IOException, InterruptedException {
        return a(anVar, true);
    }

    public static boolean b(C0313an anVar) throws IOException, InterruptedException {
        return a(anVar, false);
    }

    private static boolean a(C0313an anVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        boolean z3;
        boolean z4;
        C0313an anVar2 = anVar;
        long length = anVar.getLength();
        long j = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        long j2 = -1;
        int i = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        if (i != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j = length;
        }
        int i2 = (int) j;
        Pq pq = new Pq(64);
        boolean z5 = false;
        int i3 = i2;
        int i4 = 0;
        boolean z6 = false;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            pq.c(8);
            anVar2.a(pq.a, z5 ? 1 : 0, 8);
            long v = pq.v();
            int h = pq.h();
            int i5 = 16;
            if (v == 1) {
                anVar2.a(pq.a, 8, 8);
                pq.d(16);
                v = pq.p();
            } else {
                if (v == 0) {
                    long length2 = anVar.getLength();
                    if (length2 != j2) {
                        v = (length2 - anVar.b()) + ((long) 8);
                    }
                }
                i5 = 8;
            }
            if (i != 0 && ((long) i4) + v > length) {
                return z5;
            }
            long j3 = (long) i5;
            if (v < j3) {
                return z5;
            }
            i4 += i5;
            if (h == c.Q) {
                i3 += (int) v;
                if (i != 0 && ((long) i3) > length) {
                    i3 = (int) length;
                }
                j2 = -1;
            } else if (h == c.X || h == c.Z) {
                z2 = false;
                z3 = true;
            } else {
                long j4 = v;
                int i6 = i3;
                if ((((long) i4) + v) - j3 >= ((long) i6)) {
                    break;
                }
                int i7 = (int) (j4 - j3);
                i4 += i7;
                if (h == c.a) {
                    if (i7 < 8) {
                        return false;
                    }
                    pq.c(i7);
                    anVar2.a(pq.a, 0, i7);
                    int i8 = i7 / 4;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i8) {
                            z4 = z6;
                            break;
                        }
                        z4 = true;
                        if (i9 == 1) {
                            pq.f(4);
                        } else if (a(pq.h())) {
                            break;
                        }
                        i9++;
                    }
                    if (!z4) {
                        return false;
                    }
                    z6 = z4;
                } else if (i7 != 0) {
                    anVar2.a(i7);
                }
                i3 = i6;
                j2 = -1;
                z5 = false;
            }
        }
        z2 = false;
        z3 = false;
        if (z6 && z == z3) {
            z2 = true;
        }
        return z2;
    }

    private static boolean a(int i) {
        if ((i >>> 8) == C0471ar.b("3gp")) {
            return true;
        }
        for (int i2 : a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
