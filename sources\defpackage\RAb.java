package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: RAb reason: default package */
/* compiled from: MissingOptionException */
public class RAb extends WAb {
    private List a;

    public RAb(String str) {
        super(str);
    }

    private static String a(List list) {
        StringBuffer stringBuffer = new StringBuffer("Missing required option");
        stringBuffer.append(list.size() == 1 ? "" : "s");
        stringBuffer.append(": ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    public RAb(List list) {
        this(a(list));
        this.a = list;
    }
}
