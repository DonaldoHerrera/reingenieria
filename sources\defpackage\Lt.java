package defpackage;

import java.util.Comparator;

/* renamed from: Lt reason: default package */
final class Lt implements Comparator<String> {
    Lt(Mt mt) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == str2 || (str != null && str.equals(str2))) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
