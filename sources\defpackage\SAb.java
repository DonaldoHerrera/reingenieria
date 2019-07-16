package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: SAb reason: default package */
/* compiled from: Option */
public class SAb implements Cloneable, Serializable {
    private String a;
    private String b;
    private String c = "arg";
    private String d;
    private boolean e;
    private boolean f;
    private int g = -1;
    private Object h;
    private List i = new ArrayList();
    private char j;

    public SAb(String str, String str2, boolean z, String str3) throws IllegalArgumentException {
        UAb.a(str);
        this.a = str;
        this.b = str2;
        if (z) {
            this.g = 1;
        }
        this.d = str3;
    }

    private boolean C() {
        return this.i.isEmpty();
    }

    private void b(String str) {
        if (this.g <= 0 || this.i.size() <= this.g - 1) {
            this.i.add(str);
            return;
        }
        throw new RuntimeException("Cannot add value, list full.");
    }

    private void c(String str) {
        if (A()) {
            char o = o();
            int indexOf = str.indexOf(o);
            while (indexOf != -1 && this.i.size() != this.g - 1) {
                b(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
                indexOf = str.indexOf(o);
            }
        }
        b(str);
    }

    public boolean A() {
        return this.j > 0;
    }

    public boolean B() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        if (this.g != -1) {
            c(str);
            return;
        }
        throw new RuntimeException("NO_ARGS_ALLOWED");
    }

    public Object clone() {
        try {
            SAb sAb = (SAb) super.clone();
            sAb.i = new ArrayList(this.i);
            return sAb;
        } catch (CloneNotSupportedException e2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("A CloneNotSupportedException was thrown: ");
            stringBuffer.append(e2.getMessage());
            throw new RuntimeException(stringBuffer.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SAb.class != obj.getClass()) {
            return false;
        }
        SAb sAb = (SAb) obj;
        String str = this.a;
        if (str == null ? sAb.a != null : !str.equals(sAb.a)) {
            return false;
        }
        String str2 = this.b;
        return str2 == null ? sAb.b == null : str2.equals(sAb.b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        this.i.clear();
    }

    public String j() {
        return this.c;
    }

    public String k() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public String l() {
        String str = this.a;
        return str == null ? this.b : str;
    }

    public String m() {
        return this.b;
    }

    public String n() {
        return this.a;
    }

    public char o() {
        return this.j;
    }

    public String[] p() {
        if (C()) {
            return null;
        }
        List list = this.i;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public boolean q() {
        int i2 = this.g;
        return i2 > 0 || i2 == -2;
    }

    public boolean r() {
        String str = this.c;
        return str != null && str.length() > 0;
    }

    public boolean s() {
        int i2 = this.g;
        return i2 > 1 || i2 == -2;
    }

    public boolean t() {
        return this.b != null;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ option: ");
        stringBuffer.append(this.a);
        String str = " ";
        if (this.b != null) {
            stringBuffer.append(str);
            stringBuffer.append(this.b);
        }
        stringBuffer.append(str);
        if (s()) {
            stringBuffer.append("[ARG...]");
        } else if (q()) {
            stringBuffer.append(" [ARG]");
        }
        String str2 = " :: ";
        stringBuffer.append(str2);
        stringBuffer.append(this.d);
        if (this.h != null) {
            stringBuffer.append(str2);
            stringBuffer.append(this.h);
        }
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    public boolean z() {
        return this.f;
    }
}
