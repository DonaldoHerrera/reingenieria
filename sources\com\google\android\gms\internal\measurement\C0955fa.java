package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.fa reason: case insensitive filesystem */
public final class C0955fa extends C1074yd<C0955fa> {
    private static volatile C0955fa[] c;
    public String d = null;
    public Boolean e = null;
    public Boolean f = null;
    public Integer g = null;

    public static C0955fa[] d() {
        if (c == null) {
            synchronized (Cd.c) {
                if (c == null) {
                    c = new C0955fa[0];
                }
            }
        }
        return c;
    }

    public final void a(C1062wd wdVar) throws IOException {
        String str = this.d;
        if (str != null) {
            wdVar.a(1, str);
        }
        Boolean bool = this.e;
        if (bool != null) {
            wdVar.a(2, bool.booleanValue());
        }
        Boolean bool2 = this.f;
        if (bool2 != null) {
            wdVar.a(3, bool2.booleanValue());
        }
        Integer num = this.g;
        if (num != null) {
            wdVar.b(4, num.intValue());
        }
        super.a(wdVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0955fa)) {
            return false;
        }
        C0955fa faVar = (C0955fa) obj;
        String str = this.d;
        if (str == null) {
            if (faVar.d != null) {
                return false;
            }
        } else if (!str.equals(faVar.d)) {
            return false;
        }
        Boolean bool = this.e;
        if (bool == null) {
            if (faVar.e != null) {
                return false;
            }
        } else if (!bool.equals(faVar.e)) {
            return false;
        }
        Boolean bool2 = this.f;
        if (bool2 == null) {
            if (faVar.f != null) {
                return false;
            }
        } else if (!bool2.equals(faVar.f)) {
            return false;
        }
        Integer num = this.g;
        if (num == null) {
            if (faVar.g != null) {
                return false;
            }
        } else if (!num.equals(faVar.g)) {
            return false;
        }
        Ad ad = this.b;
        if (ad != null && !ad.i()) {
            return this.b.equals(faVar.b);
        }
        Ad ad2 = faVar.b;
        return ad2 == null || ad2.i();
    }

    public final int hashCode() {
        int hashCode = (C0955fa.class.getName().hashCode() + 527) * 31;
        String str = this.d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.g;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Ad ad = this.b;
        if (ad != null && !ad.i()) {
            i = this.b.hashCode();
        }
        return hashCode5 + i;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a = super.a();
        String str = this.d;
        if (str != null) {
            a += C1062wd.b(1, str);
        }
        Boolean bool = this.e;
        if (bool != null) {
            bool.booleanValue();
            a += C1062wd.a(2) + 1;
        }
        Boolean bool2 = this.f;
        if (bool2 != null) {
            bool2.booleanValue();
            a += C1062wd.a(3) + 1;
        }
        Integer num = this.g;
        return num != null ? a + C1062wd.c(4, num.intValue()) : a;
    }

    public final /* synthetic */ Ed a(C1044td tdVar) throws IOException {
        while (true) {
            int c2 = tdVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 10) {
                this.d = tdVar.b();
            } else if (c2 == 16) {
                this.e = Boolean.valueOf(tdVar.d());
            } else if (c2 == 24) {
                this.f = Boolean.valueOf(tdVar.d());
            } else if (c2 == 32) {
                this.g = Integer.valueOf(tdVar.e());
            } else if (!super.a(tdVar, c2)) {
                return this;
            }
        }
    }
}
