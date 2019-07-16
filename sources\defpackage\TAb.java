package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: TAb reason: default package */
/* compiled from: OptionGroup */
public class TAb implements Serializable {
    private Map a = new HashMap();
    private String b;
    private boolean c;

    public Collection a() {
        return this.a.values();
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = a().iterator();
        stringBuffer.append("[");
        while (it.hasNext()) {
            SAb sAb = (SAb) it.next();
            if (sAb.n() != null) {
                stringBuffer.append("-");
                stringBuffer.append(sAb.n());
            } else {
                stringBuffer.append("--");
                stringBuffer.append(sAb.m());
            }
            stringBuffer.append(" ");
            stringBuffer.append(sAb.k());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public void a(SAb sAb) throws LAb {
        String str = this.b;
        if (str == null || str.equals(sAb.n())) {
            this.b = sAb.n();
            return;
        }
        throw new LAb(this, sAb);
    }
}
