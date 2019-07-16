package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: VAb reason: default package */
/* compiled from: Options */
public class VAb implements Serializable {
    private Map a = new HashMap();
    private Map b = new HashMap();
    private List c = new ArrayList();
    private Map d = new HashMap();

    public VAb a(SAb sAb) {
        String l = sAb.l();
        if (sAb.t()) {
            this.b.put(sAb.m(), sAb);
        }
        if (sAb.B()) {
            if (this.c.contains(l)) {
                List list = this.c;
                list.remove(list.indexOf(l));
            }
            this.c.add(l);
        }
        this.a.put(l, sAb);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public List b() {
        return new ArrayList(this.a.values());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ Options: [ short ");
        stringBuffer.append(this.a.toString());
        stringBuffer.append(" ] [ long ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    public boolean b(String str) {
        String b2 = ZAb.b(str);
        return this.a.containsKey(b2) || this.b.containsKey(b2);
    }

    public TAb b(SAb sAb) {
        return (TAb) this.d.get(sAb.l());
    }

    public List a() {
        return this.c;
    }

    public SAb a(String str) {
        String b2 = ZAb.b(str);
        if (this.a.containsKey(b2)) {
            return (SAb) this.a.get(b2);
        }
        return (SAb) this.b.get(b2);
    }
}
