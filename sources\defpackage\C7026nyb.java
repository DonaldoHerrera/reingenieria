package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: nyb reason: default package and case insensitive filesystem */
/* compiled from: Headers */
public final class C7026nyb {
    private final String[] a;

    /* renamed from: nyb$a */
    /* compiled from: Headers */
    public static final class a {
        final List<String> a = new ArrayList(20);

        /* access modifiers changed from: 0000 */
        public a a(String str) {
            String str2 = ":";
            int indexOf = str.indexOf(str2, 1);
            if (indexOf != -1) {
                b(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            }
            String str3 = "";
            if (str.startsWith(str2)) {
                b(str3, str.substring(1));
                return this;
            }
            b(str3, str);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public a b(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public a c(String str, String str2) {
            C7026nyb.a(str);
            b(str, str2);
            return this;
        }

        public a d(String str, String str2) {
            C7026nyb.a(str);
            C7026nyb.a(str2, str);
            c(str);
            b(str, str2);
            return this;
        }

        public String b(String str) {
            for (int size = this.a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) this.a.get(size))) {
                    return (String) this.a.get(size + 1);
                }
            }
            return null;
        }

        public a c(String str) {
            int i = 0;
            while (i < this.a.size()) {
                if (str.equalsIgnoreCase((String) this.a.get(i))) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public a a(String str, String str2) {
            C7026nyb.a(str);
            C7026nyb.a(str2, str);
            b(str, str2);
            return this;
        }

        public C7026nyb a() {
            return new C7026nyb(this);
        }
    }

    C7026nyb(a aVar) {
        List<String> list = aVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    public String a(int i) {
        return this.a[i * 2];
    }

    public String b(String str) {
        return a(this.a, str);
    }

    public int c() {
        return this.a.length / 2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7026nyb) && Arrays.equals(((C7026nyb) obj).a, this.a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int c = c();
        for (int i = 0; i < c; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public Set<String> a() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int c = c();
        for (int i = 0; i < c; i++) {
            treeSet.add(a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public String b(int i) {
        return this.a[(i * 2) + 1];
    }

    public List<String> c(String str) {
        int c = c();
        ArrayList arrayList = null;
        for (int i = 0; i < c; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    private C7026nyb(String[] strArr) {
        this.a = strArr;
    }

    public a b() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static C7026nyb a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                if (strArr2[i] != null) {
                    strArr2[i] = strArr2[i].trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                a(str);
                a(str2, str);
            }
            return new C7026nyb(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(Kyb.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(Kyb.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("value for name ");
        sb.append(str2);
        sb.append(" == null");
        throw new NullPointerException(sb.toString());
    }
}
