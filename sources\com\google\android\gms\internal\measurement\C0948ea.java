package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ea reason: case insensitive filesystem */
public final class C0948ea extends C1074yd<C0948ea> {
    public Long c = null;
    public String d = null;
    private Integer e = null;
    public N[] f = new N[0];
    public C0955fa[] g = C0955fa.d();
    public C0941da[] h = C0941da.d();
    private String i = null;
    public Boolean j = null;

    public final void a(C1062wd wdVar) throws IOException {
        Long l = this.c;
        int i2 = 0;
        if (l != null) {
            long longValue = l.longValue();
            wdVar.a(1, 0);
            wdVar.a(longValue);
        }
        String str = this.d;
        if (str != null) {
            wdVar.a(2, str);
        }
        Integer num = this.e;
        if (num != null) {
            wdVar.b(3, num.intValue());
        }
        N[] nArr = this.f;
        if (nArr != null && nArr.length > 0) {
            int i3 = 0;
            while (true) {
                N[] nArr2 = this.f;
                if (i3 >= nArr2.length) {
                    break;
                }
                N n = nArr2[i3];
                if (n != null) {
                    wdVar.a(4, (C1026qc) n);
                }
                i3++;
            }
        }
        C0955fa[] faVarArr = this.g;
        if (faVarArr != null && faVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0955fa[] faVarArr2 = this.g;
                if (i4 >= faVarArr2.length) {
                    break;
                }
                C0955fa faVar = faVarArr2[i4];
                if (faVar != null) {
                    wdVar.a(5, (Ed) faVar);
                }
                i4++;
            }
        }
        C0941da[] daVarArr = this.h;
        if (daVarArr != null && daVarArr.length > 0) {
            while (true) {
                C0941da[] daVarArr2 = this.h;
                if (i2 >= daVarArr2.length) {
                    break;
                }
                C0941da daVar = daVarArr2[i2];
                if (daVar != null) {
                    wdVar.a(6, (Ed) daVar);
                }
                i2++;
            }
        }
        String str2 = this.i;
        if (str2 != null) {
            wdVar.a(7, str2);
        }
        Boolean bool = this.j;
        if (bool != null) {
            wdVar.a(8, bool.booleanValue());
        }
        super.a(wdVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0948ea)) {
            return false;
        }
        C0948ea eaVar = (C0948ea) obj;
        Long l = this.c;
        if (l == null) {
            if (eaVar.c != null) {
                return false;
            }
        } else if (!l.equals(eaVar.c)) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            if (eaVar.d != null) {
                return false;
            }
        } else if (!str.equals(eaVar.d)) {
            return false;
        }
        Integer num = this.e;
        if (num == null) {
            if (eaVar.e != null) {
                return false;
            }
        } else if (!num.equals(eaVar.e)) {
            return false;
        }
        if (!Cd.a((Object[]) this.f, (Object[]) eaVar.f) || !Cd.a((Object[]) this.g, (Object[]) eaVar.g) || !Cd.a((Object[]) this.h, (Object[]) eaVar.h)) {
            return false;
        }
        String str2 = this.i;
        if (str2 == null) {
            if (eaVar.i != null) {
                return false;
            }
        } else if (!str2.equals(eaVar.i)) {
            return false;
        }
        Boolean bool = this.j;
        if (bool == null) {
            if (eaVar.j != null) {
                return false;
            }
        } else if (!bool.equals(eaVar.j)) {
            return false;
        }
        Ad ad = this.b;
        if (ad != null && !ad.i()) {
            return this.b.equals(eaVar.b);
        }
        Ad ad2 = eaVar.b;
        return ad2 == null || ad2.i();
    }

    public final int hashCode() {
        int hashCode = (C0948ea.class.getName().hashCode() + 527) * 31;
        Long l = this.c;
        int i2 = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + Cd.a(this.f)) * 31) + Cd.a(this.g)) * 31) + Cd.a(this.h)) * 31;
        String str2 = this.i;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.j;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Ad ad = this.b;
        if (ad != null && !ad.i()) {
            i2 = this.b.hashCode();
        }
        return hashCode6 + i2;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a = super.a();
        Long l = this.c;
        if (l != null) {
            long longValue = l.longValue();
            int a2 = C1062wd.a(1);
            int i2 = (-128 & longValue) == 0 ? 1 : (-16384 & longValue) == 0 ? 2 : (-2097152 & longValue) == 0 ? 3 : (-268435456 & longValue) == 0 ? 4 : (-34359738368L & longValue) == 0 ? 5 : (-4398046511104L & longValue) == 0 ? 6 : (-562949953421312L & longValue) == 0 ? 7 : (-72057594037927936L & longValue) == 0 ? 8 : (longValue & Long.MIN_VALUE) == 0 ? 9 : 10;
            a += a2 + i2;
        }
        String str = this.d;
        if (str != null) {
            a += C1062wd.b(2, str);
        }
        Integer num = this.e;
        if (num != null) {
            a += C1062wd.c(3, num.intValue());
        }
        N[] nArr = this.f;
        int i3 = 0;
        if (nArr != null && nArr.length > 0) {
            int i4 = a;
            int i5 = 0;
            while (true) {
                N[] nArr2 = this.f;
                if (i5 >= nArr2.length) {
                    break;
                }
                N n = nArr2[i5];
                if (n != null) {
                    i4 += C1007nb.c(4, (C1026qc) n);
                }
                i5++;
            }
            a = i4;
        }
        C0955fa[] faVarArr = this.g;
        if (faVarArr != null && faVarArr.length > 0) {
            int i6 = a;
            int i7 = 0;
            while (true) {
                C0955fa[] faVarArr2 = this.g;
                if (i7 >= faVarArr2.length) {
                    break;
                }
                C0955fa faVar = faVarArr2[i7];
                if (faVar != null) {
                    i6 += C1062wd.b(5, (Ed) faVar);
                }
                i7++;
            }
            a = i6;
        }
        C0941da[] daVarArr = this.h;
        if (daVarArr != null && daVarArr.length > 0) {
            while (true) {
                C0941da[] daVarArr2 = this.h;
                if (i3 >= daVarArr2.length) {
                    break;
                }
                C0941da daVar = daVarArr2[i3];
                if (daVar != null) {
                    a += C1062wd.b(6, (Ed) daVar);
                }
                i3++;
            }
        }
        String str2 = this.i;
        if (str2 != null) {
            a += C1062wd.b(7, str2);
        }
        Boolean bool = this.j;
        if (bool == null) {
            return a;
        }
        bool.booleanValue();
        return a + C1062wd.a(8) + 1;
    }

    public final /* synthetic */ Ed a(C1044td tdVar) throws IOException {
        while (true) {
            int c2 = tdVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 8) {
                this.c = Long.valueOf(tdVar.f());
            } else if (c2 == 18) {
                this.d = tdVar.b();
            } else if (c2 == 24) {
                this.e = Integer.valueOf(tdVar.e());
            } else if (c2 == 34) {
                int a = Fd.a(tdVar, 34);
                N[] nArr = this.f;
                int length = nArr == null ? 0 : nArr.length;
                N[] nArr2 = new N[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f, 0, nArr2, 0, length);
                }
                while (length < nArr2.length - 1) {
                    nArr2[length] = (N) tdVar.a(N.r());
                    tdVar.c();
                    length++;
                }
                nArr2[length] = (N) tdVar.a(N.r());
                this.f = nArr2;
            } else if (c2 == 42) {
                int a2 = Fd.a(tdVar, 42);
                C0955fa[] faVarArr = this.g;
                int length2 = faVarArr == null ? 0 : faVarArr.length;
                C0955fa[] faVarArr2 = new C0955fa[(a2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.g, 0, faVarArr2, 0, length2);
                }
                while (length2 < faVarArr2.length - 1) {
                    faVarArr2[length2] = new C0955fa();
                    tdVar.a((Ed) faVarArr2[length2]);
                    tdVar.c();
                    length2++;
                }
                faVarArr2[length2] = new C0955fa();
                tdVar.a((Ed) faVarArr2[length2]);
                this.g = faVarArr2;
            } else if (c2 == 50) {
                int a3 = Fd.a(tdVar, 50);
                C0941da[] daVarArr = this.h;
                int length3 = daVarArr == null ? 0 : daVarArr.length;
                C0941da[] daVarArr2 = new C0941da[(a3 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.h, 0, daVarArr2, 0, length3);
                }
                while (length3 < daVarArr2.length - 1) {
                    daVarArr2[length3] = new C0941da();
                    tdVar.a((Ed) daVarArr2[length3]);
                    tdVar.c();
                    length3++;
                }
                daVarArr2[length3] = new C0941da();
                tdVar.a((Ed) daVarArr2[length3]);
                this.h = daVarArr2;
            } else if (c2 == 58) {
                this.i = tdVar.b();
            } else if (c2 == 64) {
                this.j = Boolean.valueOf(tdVar.d());
            } else if (!super.a(tdVar, c2)) {
                return this;
            }
        }
    }
}
