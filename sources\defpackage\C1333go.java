package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: go reason: default package and case insensitive filesystem */
/* compiled from: DefaultTsPayloadReaderFactory */
public final class C1333go implements c {
    private final int a;
    private final List<Format> b;

    public C1333go(int i) {
        this(i, Collections.singletonList(Format.a(null, "application/cea-608", 0, null)));
    }

    private Go b(b bVar) {
        return new Go(c(bVar));
    }

    private List<Format> c(b bVar) {
        int i;
        String str;
        List list;
        if (a(32)) {
            return this.b;
        }
        Pq pq = new Pq(bVar.d);
        List<Format> list2 = this.b;
        while (pq.a() > 0) {
            int c = pq.c() + pq.t();
            if (pq.t() == 134) {
                list2 = new ArrayList<>();
                int t = pq.t() & 31;
                for (int i2 = 0; i2 < t; i2++) {
                    String b2 = pq.b(3);
                    int t2 = pq.t();
                    boolean z = true;
                    boolean z2 = (t2 & 128) != 0;
                    if (z2) {
                        i = t2 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte t3 = (byte) pq.t();
                    pq.f(1);
                    if (z2) {
                        if ((t3 & 64) == 0) {
                            z = false;
                        }
                        list = C1395ip.a(z);
                    } else {
                        list = null;
                    }
                    list2.add(Format.a(null, str, null, -1, 0, b2, i, null, Long.MAX_VALUE, list));
                }
            }
            pq.e(c);
        }
        return list2;
    }

    public SparseArray<Eo> a() {
        return new SparseArray<>();
    }

    public Eo a(int i, b bVar) {
        if (i == 2) {
            return new C1700so(new C1456ko(b(bVar)));
        }
        if (i == 3 || i == 4) {
            return new C1700so(new C1641qo(bVar.b));
        }
        Eo eo = null;
        if (i == 15) {
            if (!a(2)) {
                eo = new C1700so(new C1302fo(false, bVar.b));
            }
            return eo;
        } else if (i == 17) {
            if (!a(2)) {
                eo = new C1700so(new C1611po(bVar.b));
            }
            return eo;
        } else if (i == 21) {
            return new C1700so(new C1580oo());
        } else {
            if (i == 27) {
                if (!a(4)) {
                    eo = new C1700so(new C1518mo(a(bVar), a(1), a(8)));
                }
                return eo;
            } else if (i == 36) {
                return new C1700so(new C1549no(a(bVar)));
            } else {
                if (i == 89) {
                    return new C1700so(new C1394io(bVar.c));
                }
                if (i != 138) {
                    if (i == 172) {
                        return new C1700so(new Cdo(bVar.b));
                    }
                    if (i != 129) {
                        if (i != 130) {
                            if (i == 134) {
                                if (!a(16)) {
                                    eo = new C1880yo(new Ao());
                                }
                                return eo;
                            } else if (i != 135) {
                                return null;
                            }
                        } else if (!a(64)) {
                            return null;
                        }
                    }
                    return new C1700so(new C0499bo(bVar.b));
                }
                return new C1700so(new C1364ho(bVar.b));
            }
        }
    }

    public C1333go(int i, List<Format> list) {
        this.a = i;
        this.b = list;
    }

    private C1910zo a(b bVar) {
        return new C1910zo(c(bVar));
    }

    private boolean a(int i) {
        return (i & this.a) != 0;
    }
}
