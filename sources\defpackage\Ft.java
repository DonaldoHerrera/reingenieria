package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Ft reason: default package */
final class Ft extends C1795vt {
    private final C0228Lv c;
    private final At d;
    private List<String> e = new ArrayList();
    private Bt f;
    private String g;

    Ft(At at, C0228Lv lv) {
        this.d = at;
        this.c = lv;
        lv.a(true);
    }

    private final void r() {
        Bt bt = this.f;
        if (!(bt == Bt.VALUE_NUMBER_INT || bt == Bt.VALUE_NUMBER_FLOAT)) {
            throw new IllegalArgumentException();
        }
    }

    public final void a() throws IOException {
        this.c.close();
    }

    public final int b() {
        r();
        return Integer.parseInt(this.g);
    }

    public final String c() {
        return this.g;
    }

    public final C1646qt d() {
        return this.d;
    }

    public final Bt e() throws IOException {
        C0236Nv nv;
        Bt bt = this.f;
        if (bt != null) {
            int i = Et.a[bt.ordinal()];
            if (i == 1) {
                this.c.a();
                this.e.add(null);
            } else if (i == 2) {
                this.c.b();
                this.e.add(null);
            }
        }
        try {
            nv = this.c.F();
        } catch (EOFException unused) {
            nv = C0236Nv.END_DOCUMENT;
        }
        switch (Et.b[nv.ordinal()]) {
            case 1:
                this.g = "[";
                this.f = Bt.START_ARRAY;
                break;
            case 2:
                this.g = "]";
                this.f = Bt.END_ARRAY;
                List<String> list = this.e;
                list.remove(list.size() - 1);
                this.c.c();
                break;
            case 3:
                this.g = "{";
                this.f = Bt.START_OBJECT;
                break;
            case 4:
                this.g = "}";
                this.f = Bt.END_OBJECT;
                List<String> list2 = this.e;
                list2.remove(list2.size() - 1);
                this.c.d();
                break;
            case 5:
                if (!this.c.e()) {
                    this.g = "false";
                    this.f = Bt.VALUE_FALSE;
                    break;
                } else {
                    this.g = "true";
                    this.f = Bt.VALUE_TRUE;
                    break;
                }
            case 6:
                this.g = "null";
                this.f = Bt.VALUE_NULL;
                this.c.g();
                break;
            case 7:
                this.g = this.c.h();
                this.f = Bt.VALUE_STRING;
                break;
            case 8:
                this.g = this.c.h();
                this.f = this.g.indexOf(46) == -1 ? Bt.VALUE_NUMBER_INT : Bt.VALUE_NUMBER_FLOAT;
                break;
            case 9:
                this.g = this.c.f();
                this.f = Bt.FIELD_NAME;
                List<String> list3 = this.e;
                list3.set(list3.size() - 1, this.g);
                break;
            default:
                this.g = null;
                this.f = null;
                break;
        }
        return this.f;
    }

    public final Bt f() {
        return this.f;
    }

    public final String g() {
        if (this.e.isEmpty()) {
            return null;
        }
        List<String> list = this.e;
        return (String) list.get(list.size() - 1);
    }

    public final C1795vt h() throws IOException {
        Bt bt = this.f;
        if (bt != null) {
            int i = Et.a[bt.ordinal()];
            if (i == 1) {
                this.c.i();
                this.g = "]";
                this.f = Bt.END_ARRAY;
            } else if (i == 2) {
                this.c.i();
                this.g = "}";
                this.f = Bt.END_OBJECT;
            }
        }
        return this;
    }

    public final byte i() {
        r();
        return Byte.parseByte(this.g);
    }

    public final short j() {
        r();
        return Short.parseShort(this.g);
    }

    public final float k() {
        r();
        return Float.parseFloat(this.g);
    }

    public final long l() {
        r();
        return Long.parseLong(this.g);
    }

    public final double m() {
        r();
        return Double.parseDouble(this.g);
    }

    public final BigInteger n() {
        r();
        return new BigInteger(this.g);
    }

    public final BigDecimal o() {
        r();
        return new BigDecimal(this.g);
    }
}
