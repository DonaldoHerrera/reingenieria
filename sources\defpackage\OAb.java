package defpackage;

import java.util.ArrayList;

/* renamed from: OAb reason: default package */
/* compiled from: GnuParser */
public class OAb extends XAb {
    /* access modifiers changed from: protected */
    public String[] b(VAb vAb, String[] strArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        while (i < strArr.length) {
            String str = strArr[i];
            String str2 = "--";
            if (str2.equals(str)) {
                arrayList.add(str2);
                z2 = true;
            } else {
                String str3 = "-";
                if (str3.equals(str)) {
                    arrayList.add(str3);
                } else if (str.startsWith(str3)) {
                    String b = ZAb.b(str);
                    if (vAb.b(b)) {
                        arrayList.add(str);
                    } else if (b.indexOf(61) != -1 && vAb.b(b.substring(0, b.indexOf(61)))) {
                        arrayList.add(str.substring(0, str.indexOf(61)));
                        arrayList.add(str.substring(str.indexOf(61) + 1));
                    } else if (vAb.b(str.substring(0, 2))) {
                        arrayList.add(str.substring(0, 2));
                        arrayList.add(str.substring(2));
                    } else {
                        arrayList.add(str);
                        z2 = z;
                    }
                } else {
                    arrayList.add(str);
                }
            }
            if (z2) {
                while (true) {
                    i++;
                    if (i >= strArr.length) {
                        break;
                    }
                    arrayList.add(strArr[i]);
                }
            }
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
