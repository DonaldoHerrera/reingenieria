package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

/* renamed from: XAb reason: default package */
/* compiled from: Parser */
public abstract class XAb implements NAb {
    protected MAb a;
    private VAb b;
    private List c;

    /* access modifiers changed from: protected */
    public void a(VAb vAb) {
        this.b = vAb;
        this.c = new ArrayList(vAb.a());
    }

    /* access modifiers changed from: protected */
    public VAb b() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract String[] b(VAb vAb, String[] strArr, boolean z);

    /* access modifiers changed from: protected */
    public List c() {
        return this.c;
    }

    public MAb a(VAb vAb, String[] strArr, boolean z) throws WAb {
        return a(vAb, strArr, null, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r9 != false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085 A[LOOP:2: B:27:0x0085->B:39:0x0085, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0037 A[SYNTHETIC] */
    public MAb a(VAb vAb, String[] strArr, Properties properties, boolean z) throws WAb {
        for (SAb i : vAb.b()) {
            i.i();
        }
        a(vAb);
        this.a = new MAb();
        boolean z2 = false;
        if (strArr == null) {
            strArr = new String[0];
        }
        ListIterator listIterator = Arrays.asList(b(b(), strArr, z)).listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            String str2 = "--";
            if (!str2.equals(str)) {
                String str3 = "-";
                if (str3.equals(str)) {
                    if (!z) {
                        this.a.a(str);
                        if (z2) {
                            while (listIterator.hasNext()) {
                                String str4 = (String) listIterator.next();
                                if (!str2.equals(str4)) {
                                    this.a.a(str4);
                                }
                            }
                        }
                    }
                } else if (!str.startsWith(str3)) {
                    this.a.a(str);
                } else if (!z || b().b(str)) {
                    a(str, listIterator);
                    if (z2) {
                    }
                } else {
                    this.a.a(str);
                }
            }
            z2 = true;
            if (z2) {
            }
        }
        a(properties);
        a();
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void a(Properties properties) {
        if (properties != null) {
            Enumeration propertyNames = properties.propertyNames();
            while (propertyNames.hasMoreElements()) {
                String obj = propertyNames.nextElement().toString();
                if (!this.a.b(obj)) {
                    SAb a2 = b().a(obj);
                    String property = properties.getProperty(obj);
                    if (!a2.q()) {
                        if (!"yes".equalsIgnoreCase(property) && !"true".equalsIgnoreCase(property) && !"1".equalsIgnoreCase(property)) {
                            break;
                        }
                    } else if (a2.p() == null || a2.p().length == 0) {
                        try {
                            a2.a(property);
                        } catch (RuntimeException unused) {
                        }
                    }
                    this.a.a(a2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a() throws RAb {
        if (!c().isEmpty()) {
            throw new RAb(c());
        }
    }

    public void a(SAb sAb, ListIterator listIterator) throws WAb {
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String str = (String) listIterator.next();
            if (b().b(str) && str.startsWith("-")) {
                listIterator.previous();
                break;
            } else {
                try {
                    sAb.a(ZAb.a(str));
                } catch (RuntimeException unused) {
                    listIterator.previous();
                }
            }
        }
        if (sAb.p() == null && !sAb.z()) {
            throw new QAb(sAb);
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str, ListIterator listIterator) throws WAb {
        if (b().b(str)) {
            SAb sAb = (SAb) b().a(str).clone();
            if (sAb.B()) {
                c().remove(sAb.l());
            }
            if (b().b(sAb) != null) {
                TAb b2 = b().b(sAb);
                if (b2.c()) {
                    c().remove(b2);
                }
                b2.a(sAb);
            }
            if (sAb.q()) {
                a(sAb, listIterator);
            }
            this.a.a(sAb);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unrecognized option: ");
        stringBuffer.append(str);
        throw new YAb(stringBuffer.toString(), str);
    }
}
