package defpackage;

import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: oyb reason: default package and case insensitive filesystem */
/* compiled from: HttpUrl */
public final class C7095oyb {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String b;
    private final String c;
    private final String d;
    final String e;
    final int f;
    private final List<String> g;
    private final List<String> h;
    private final String i;
    private final String j;

    /* renamed from: oyb$a */
    /* compiled from: HttpUrl */
    public static final class a {
        String a;
        String b;
        String c;
        String d;
        int e = -1;
        final List<String> f = new ArrayList();
        List<String> g;
        String h;

        public a() {
            String str = "";
            this.b = str;
            this.c = str;
            this.f.add(str);
        }

        private boolean h(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean i(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public a a(int i) {
            if (i <= 0 || i > 65535) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected port: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.e = i;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public int b() {
            int i = this.e;
            return i != -1 ? i : C7095oyb.a(this.a);
        }

        public a c(String str) {
            if (str != null) {
                String a2 = a(str, 0, str.length());
                if (a2 != null) {
                    this.d = a2;
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected host: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("host == null");
        }

        public a d(String str) {
            if (str != null) {
                this.c = C7095oyb.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public a e(String str) {
            List<String> list;
            if (str != null) {
                list = C7095oyb.e(C7095oyb.a(str, " \"'<>#", false, false, true, true));
            } else {
                list = null;
            }
            this.g = list;
            return this;
        }

        public a f(String str) {
            if (str != null) {
                String str2 = "http";
                if (str.equalsIgnoreCase(str2)) {
                    this.a = str2;
                } else {
                    String str3 = Constants.SCHEME;
                    if (str.equalsIgnoreCase(str3)) {
                        this.a = str3;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unexpected scheme: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public a g(String str) {
            if (str != null) {
                this.b = C7095oyb.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            if (!(this.e == -1 && this.a == null)) {
                int b2 = b();
                String str3 = this.a;
                if (str3 == null || b2 != C7095oyb.a(str3)) {
                    sb.append(':');
                    sb.append(b2);
                }
            }
            C7095oyb.b(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                C7095oyb.a(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        public a b(String str) {
            String str2;
            if (str != null) {
                str2 = C7095oyb.a(str, "", false, false, false, false);
            } else {
                str2 = null;
            }
            this.h = str2;
            return this;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private void d(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = defpackage.Kyb.a(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C7095oyb.a.d(java.lang.String, int, int):void");
        }

        private static int e(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        public a a(String str) {
            List<String> list;
            if (str != null) {
                list = C7095oyb.e(C7095oyb.a(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.g = list;
            return this;
        }

        private static int b(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C7095oyb.a(str, i, i2, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* access modifiers changed from: 0000 */
        public a c() {
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                this.f.set(i, C7095oyb.a((String) this.f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = (String) this.g.get(i2);
                    if (str != null) {
                        this.g.set(i2, C7095oyb.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.h;
            if (str2 != null) {
                this.h = C7095oyb.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public C7095oyb a() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.d != null) {
                return new C7095oyb(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        private static int f(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private void d() {
            List<String> list = this.f;
            String str = "";
            if (!((String) list.remove(list.size() - 1)).isEmpty() || this.f.isEmpty()) {
                this.f.add(str);
                return;
            }
            List<String> list2 = this.f;
            list2.set(list2.size() - 1, str);
        }

        /* access modifiers changed from: 0000 */
        public a a(C7095oyb oyb, String str) {
            int a2;
            int i;
            C7095oyb oyb2 = oyb;
            String str2 = str;
            int a3 = Kyb.a(str2, 0, str.length());
            int b2 = Kyb.b(str2, a3, str.length());
            int e2 = e(str2, a3, b2);
            if (e2 != -1) {
                if (str.regionMatches(true, a3, "https:", 0, 6)) {
                    this.a = Constants.SCHEME;
                    a3 += 6;
                } else {
                    if (str.regionMatches(true, a3, "http:", 0, 5)) {
                        this.a = "http";
                        a3 += 5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        sb.append(str2.substring(0, e2));
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else if (oyb2 != null) {
                this.a = oyb2.b;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int f2 = f(str2, a3, b2);
            char c2 = '?';
            char c3 = '#';
            if (f2 >= 2 || oyb2 == null || !oyb2.b.equals(this.a)) {
                int i2 = a3 + f2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a2 = Kyb.a(str2, i2, b2, "@/\\?#");
                    char charAt = a2 != b2 ? str2.charAt(a2) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i3 = a2;
                        int c4 = c(str2, i2, i3);
                        int i4 = c4 + 1;
                    } else {
                        if (charAt == '@') {
                            String str3 = "%40";
                            if (!z) {
                                int a4 = Kyb.a(str2, i2, a2, ':');
                                int i5 = a4;
                                String str4 = str3;
                                i = a2;
                                String a5 = C7095oyb.a(str, i2, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if (z2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.b);
                                    sb2.append(str4);
                                    sb2.append(a5);
                                    a5 = sb2.toString();
                                }
                                this.b = a5;
                                if (i5 != i) {
                                    this.c = C7095oyb.a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                String str5 = str3;
                                i = a2;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.c);
                                sb3.append(str5);
                                sb3.append(C7095oyb.a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                this.c = sb3.toString();
                            }
                            i2 = i + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = a2;
                int c42 = c(str2, i2, i32);
                int i42 = c42 + 1;
                if (i42 < i32) {
                    this.d = a(str2, i2, c42);
                    this.e = b(str2, i42, i32);
                    if (this.e == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        sb4.append(str2.substring(i42, i32));
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString());
                    }
                } else {
                    this.d = a(str2, i2, c42);
                    this.e = C7095oyb.a(this.a);
                }
                if (this.d != null) {
                    a3 = i32;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    sb5.append(str2.substring(i2, c42));
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                this.b = oyb.f();
                this.c = oyb.b();
                this.d = oyb2.e;
                this.e = oyb2.f;
                this.f.clear();
                this.f.addAll(oyb.d());
                if (a3 == b2 || str2.charAt(a3) == '#') {
                    a(oyb.e());
                }
            }
            int a6 = Kyb.a(str2, a3, b2, "?#");
            d(str2, a3, a6);
            if (a6 < b2 && str2.charAt(a6) == '?') {
                int a7 = Kyb.a(str2, a6, b2, '#');
                this.g = C7095oyb.e(C7095oyb.a(str, a6 + 1, a7, " \"'<>#", true, false, true, true, null));
                a6 = a7;
            }
            if (a6 < b2 && str2.charAt(a6) == '#') {
                this.h = C7095oyb.a(str, 1 + a6, b2, "", true, false, false, false, null);
            }
            return this;
        }

        private static int c(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private void a(String str, int i, int i2, boolean z, boolean z2) {
            String a2 = C7095oyb.a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (!h(a2)) {
                if (i(a2)) {
                    d();
                    return;
                }
                List<String> list = this.f;
                if (((String) list.get(list.size() - 1)).isEmpty()) {
                    List<String> list2 = this.f;
                    list2.set(list2.size() - 1, a2);
                } else {
                    this.f.add(a2);
                }
                if (z) {
                    this.f.add("");
                }
            }
        }

        private static String a(String str, int i, int i2) {
            return Kyb.a(C7095oyb.a(str, i, i2, false));
        }
    }

    C7095oyb(a aVar) {
        this.b = aVar.a;
        this.c = a(aVar.b, false);
        this.d = a(aVar.c, false);
        this.e = aVar.d;
        this.f = aVar.b();
        this.g = a(aVar.f, false);
        List<String> list = aVar.g;
        String str = null;
        this.h = list != null ? a(list, true) : null;
        String str2 = aVar.h;
        if (str2 != null) {
            str = a(str2, false);
        }
        this.i = str;
        this.j = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(Constants.SCHEME) ? 443 : -1;
    }

    public String b() {
        if (this.d.isEmpty()) {
            return "";
        }
        return this.j.substring(this.j.indexOf(58, this.b.length() + 3) + 1, this.j.indexOf(64));
    }

    public String c() {
        int indexOf = this.j.indexOf(47, this.b.length() + 3);
        String str = this.j;
        return this.j.substring(indexOf, Kyb.a(str, indexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int indexOf = this.j.indexOf(47, this.b.length() + 3);
        String str = this.j;
        int a2 = Kyb.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            int a3 = Kyb.a(this.j, i2, a2, '/');
            arrayList.add(this.j.substring(i2, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public String e() {
        if (this.h == null) {
            return null;
        }
        int indexOf = this.j.indexOf(63) + 1;
        String str = this.j;
        return this.j.substring(indexOf, Kyb.a(str, indexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7095oyb) && ((C7095oyb) obj).j.equals(this.j);
    }

    public String f() {
        if (this.c.isEmpty()) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.j;
        return this.j.substring(length, Kyb.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.e;
    }

    public boolean h() {
        return this.b.equals(Constants.SCHEME);
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.a = this.b;
        aVar.b = f();
        aVar.c = b();
        aVar.d = this.e;
        aVar.e = this.f != a(this.b) ? this.f : -1;
        aVar.f.clear();
        aVar.f.addAll(d());
        aVar.a(e());
        aVar.h = a();
        return aVar;
    }

    public int j() {
        return this.f;
    }

    public String k() {
        if (this.h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        a(sb, this.h);
        return sb.toString();
    }

    public String l() {
        a c2 = c("/...");
        String str = "";
        c2.g(str);
        c2.d(str);
        return c2.a().toString();
    }

    public String m() {
        return this.b;
    }

    public URI n() {
        a i2 = i();
        i2.c();
        String aVar = i2.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public URL o() {
        try {
            return new URL(this.j);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String toString() {
        return this.j;
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = (String) list.get(i2);
            String str2 = (String) list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public a c(String str) {
        try {
            a aVar = new a();
            aVar.a(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) list.get(i2));
        }
    }

    static List<String> e(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public C7095oyb f(String str) {
        a c2 = c(str);
        if (c2 != null) {
            return c2.a();
        }
        return null;
    }

    public static C7095oyb d(String str) {
        try {
            return b(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static C7095oyb b(String str) {
        a aVar = new a();
        aVar.a(null, str);
        return aVar.a();
    }

    public String a() {
        if (this.i == null) {
            return null;
        }
        return this.j.substring(this.j.indexOf(35) + 1);
    }

    static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String a(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                C6825lAb lab = new C6825lAb();
                lab.a(str, i2, i4);
                a(lab, str, i4, i3, z);
                return lab.B();
            }
        }
        return str.substring(i2, i3);
    }

    static void a(C6825lAb lab, String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt == 37) {
                int i4 = i2 + 2;
                if (i4 < i3) {
                    int a2 = Kyb.a(str.charAt(i2 + 1));
                    int a3 = Kyb.a(str.charAt(i4));
                    if (!(a2 == -1 || a3 == -1)) {
                        lab.writeByte((a2 << 4) + a3);
                        i2 = i4;
                        i2 += Character.charCount(codePointAt);
                    }
                    lab.c(codePointAt);
                    i2 += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                lab.writeByte(32);
                i2 += Character.charCount(codePointAt);
            }
            lab.c(codePointAt);
            i2 += Character.charCount(codePointAt);
        }
    }

    static boolean a(String str, int i2, int i3) {
        int i4 = i2 + 2;
        if (i4 >= i3 || str.charAt(i2) != '%' || Kyb.a(str.charAt(i2 + 1)) == -1 || Kyb.a(str.charAt(i4)) == -1) {
            return false;
        }
        return true;
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i4 = i3;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str.codePointAt(i5);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || a(str, i5, i3)))) && (codePointAt != 43 || !z3))) {
                    i5 += Character.charCount(codePointAt);
                }
            }
            C6825lAb lab = new C6825lAb();
            int i6 = i2;
            lab.a(str, i2, i5);
            a(lab, str, i5, i3, str2, z, z2, z3, z4, charset);
            return lab.B();
        }
        int i7 = i2;
        return str.substring(i2, i3);
    }

    static void a(C6825lAb lab, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C6825lAb lab2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    lab.f(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !a(str, i2, i3)))))) {
                    if (lab2 == null) {
                        lab2 = new C6825lAb();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        lab2.c(codePointAt);
                    } else {
                        lab2.a(str, i2, Character.charCount(codePointAt) + i2, charset);
                    }
                    while (!lab2.p()) {
                        byte readByte = lab2.readByte() & 255;
                        lab.writeByte(37);
                        lab.writeByte((int) a[(readByte >> 4) & 15]);
                        lab.writeByte((int) a[readByte & Ascii.SI]);
                    }
                } else {
                    lab.c(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
