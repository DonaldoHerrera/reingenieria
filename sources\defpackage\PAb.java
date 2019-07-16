package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: PAb reason: default package */
/* compiled from: HelpFormatter */
public class PAb {
    public int a = 74;
    public int b = 1;
    public int c = 3;
    public String d = "usage: ";
    public String e = System.getProperty("line.separator");
    public String f = "-";
    public String g = "--";
    public String h = "arg";
    protected Comparator i = new b();

    /* renamed from: PAb$b */
    /* compiled from: HelpFormatter */
    private static class b implements Comparator {
        private b() {
        }

        public int compare(Object obj, Object obj2) {
            return ((SAb) obj).l().compareToIgnoreCase(((SAb) obj2).l());
        }
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public Comparator c() {
        return this.i;
    }

    public int d() {
        return this.a;
    }

    public void a(PrintWriter printWriter, int i2, VAb vAb, int i3, int i4) {
        StringBuffer stringBuffer = new StringBuffer();
        a(stringBuffer, i2, vAb, i3, i4);
        printWriter.println(stringBuffer.toString());
    }

    /* access modifiers changed from: protected */
    public StringBuffer a(StringBuffer stringBuffer, int i2, VAb vAb, int i3, int i4) {
        String a2 = a(i3);
        String a3 = a(i4);
        ArrayList arrayList = new ArrayList();
        List<SAb> b2 = vAb.b();
        Collections.sort(b2, c());
        int i5 = 0;
        int i6 = 0;
        for (SAb sAb : b2) {
            StringBuffer stringBuffer2 = new StringBuffer(8);
            if (sAb.n() == null) {
                stringBuffer2.append(a2);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("   ");
                stringBuffer3.append(this.g);
                stringBuffer2.append(stringBuffer3.toString());
                stringBuffer2.append(sAb.m());
            } else {
                stringBuffer2.append(a2);
                stringBuffer2.append(this.f);
                stringBuffer2.append(sAb.n());
                if (sAb.t()) {
                    stringBuffer2.append(',');
                    stringBuffer2.append(this.g);
                    stringBuffer2.append(sAb.m());
                }
            }
            if (sAb.q()) {
                if (sAb.r()) {
                    stringBuffer2.append(" <");
                    stringBuffer2.append(sAb.j());
                    stringBuffer2.append(">");
                } else {
                    stringBuffer2.append(' ');
                }
            }
            arrayList.add(stringBuffer2);
            if (stringBuffer2.length() > i6) {
                i6 = stringBuffer2.length();
            }
        }
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            SAb sAb2 = (SAb) it.next();
            int i7 = i5 + 1;
            StringBuffer stringBuffer4 = new StringBuffer(arrayList.get(i5).toString());
            if (stringBuffer4.length() < i6) {
                stringBuffer4.append(a(i6 - stringBuffer4.length()));
            }
            stringBuffer4.append(a3);
            int i8 = i6 + i4;
            if (sAb2.k() != null) {
                stringBuffer4.append(sAb2.k());
            }
            a(stringBuffer, i2, i8, stringBuffer4.toString());
            if (it.hasNext()) {
                stringBuffer.append(this.e);
            }
            i5 = i7;
        }
        return stringBuffer;
    }

    /* access modifiers changed from: protected */
    public StringBuffer a(StringBuffer stringBuffer, int i2, int i3, String str) {
        int a2 = a(str, i2, 0);
        if (a2 == -1) {
            stringBuffer.append(a(str));
            return stringBuffer;
        }
        stringBuffer.append(a(str.substring(0, a2)));
        stringBuffer.append(this.e);
        if (i3 >= i2) {
            i3 = 1;
        }
        String a3 = a(i3);
        while (true) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(a3);
            stringBuffer2.append(str.substring(a2).trim());
            str = stringBuffer2.toString();
            a2 = a(str, i2, 0);
            if (a2 == -1) {
                stringBuffer.append(str);
                return stringBuffer;
            }
            if (str.length() > i2 && a2 == i3 - 1) {
                a2 = i2;
            }
            stringBuffer.append(a(str.substring(0, a2)));
            stringBuffer.append(this.e);
        }
    }

    /* access modifiers changed from: protected */
    public int a(String str, int i2, int i3) {
        int indexOf = str.indexOf(10, i3);
        if (indexOf == -1 || indexOf > i2) {
            indexOf = str.indexOf(9, i3);
            if (indexOf == -1 || indexOf > i2) {
                int i4 = i2 + i3;
                if (i4 >= str.length()) {
                    return -1;
                }
                int i5 = i4;
                while (i5 >= i3) {
                    char charAt = str.charAt(i5);
                    if (charAt == ' ' || charAt == 10 || charAt == 13) {
                        break;
                    }
                    i5--;
                }
                if (i5 > i3) {
                    return i5;
                }
                while (i4 <= str.length()) {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 == ' ' || charAt2 == 10 || charAt2 == 13) {
                        break;
                    }
                    i4++;
                }
                if (i4 == str.length()) {
                    i4 = -1;
                }
                return i4;
            }
        }
        return indexOf + 1;
    }

    /* access modifiers changed from: protected */
    public String a(int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return str.substring(0, length);
    }
}
