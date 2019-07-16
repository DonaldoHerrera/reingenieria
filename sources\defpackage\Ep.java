package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Ep reason: default package */
/* compiled from: CssParser */
final class Ep {
    private static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private final Pq b = new Pq();
    private final StringBuilder c = new StringBuilder();

    static void b(Pq pq) {
        do {
        } while (!TextUtils.isEmpty(pq.j()));
    }

    static void c(Pq pq) {
        while (true) {
            boolean z = true;
            while (pq.a() > 0 && z) {
                if (!e(pq) && !d(pq)) {
                    z = false;
                }
            }
            return;
        }
    }

    private static String d(Pq pq, StringBuilder sb) {
        c(pq);
        if (pq.a() < 5) {
            return null;
        }
        if (!"::cue".equals(pq.b(5))) {
            return null;
        }
        int c2 = pq.c();
        String a2 = a(pq, sb);
        if (a2 == null) {
            return null;
        }
        if ("{".equals(a2)) {
            pq.e(c2);
            return "";
        }
        String f = "(".equals(a2) ? f(pq) : null;
        String a3 = a(pq, sb);
        if (!")".equals(a3) || a3 == null) {
            return null;
        }
        return f;
    }

    private static boolean e(Pq pq) {
        char a2 = a(pq, pq.c());
        if (a2 != 9 && a2 != 10 && a2 != 12 && a2 != 13 && a2 != ' ') {
            return false;
        }
        pq.f(1);
        return true;
    }

    private static String f(Pq pq) {
        int c2 = pq.c();
        int d = pq.d();
        boolean z = false;
        while (c2 < d && !z) {
            int i = c2 + 1;
            z = ((char) pq.a[c2]) == ')';
            c2 = i;
        }
        return pq.b((c2 - 1) - pq.c()).trim();
    }

    public Hp a(Pq pq) {
        String str;
        this.c.setLength(0);
        int c2 = pq.c();
        b(pq);
        this.b.a(pq.a, pq.c());
        this.b.e(c2);
        String d = d(this.b, this.c);
        if (d == null) {
            return null;
        }
        if (!"{".equals(a(this.b, this.c))) {
            return null;
        }
        Hp hp = new Hp();
        a(hp, d);
        String str2 = null;
        boolean z = false;
        while (true) {
            str = "}";
            if (z) {
                break;
            }
            int c3 = this.b.c();
            str2 = a(this.b, this.c);
            boolean z2 = str2 == null || str.equals(str2);
            if (!z2) {
                this.b.e(c3);
                a(this.b, hp, this.c);
            }
            z = z2;
        }
        if (str.equals(str2)) {
            return hp;
        }
        return null;
    }

    private static String b(Pq pq, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int c2 = pq.c();
        int d = pq.d();
        while (c2 < d && !z) {
            char c3 = (char) pq.a[c2];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z = true;
            } else {
                c2++;
                sb.append(c3);
            }
        }
        pq.f(c2 - pq.c());
        return sb.toString();
    }

    private static String c(Pq pq, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int c2 = pq.c();
            String a2 = a(pq, sb);
            if (a2 == null) {
                return null;
            }
            if ("}".equals(a2) || ";".equals(a2)) {
                pq.e(c2);
                z = true;
            } else {
                sb2.append(a2);
            }
        }
        return sb2.toString();
    }

    private static boolean d(Pq pq) {
        int c2 = pq.c();
        int d = pq.d();
        byte[] bArr = pq.a;
        if (c2 + 2 <= d) {
            int i = c2 + 1;
            if (bArr[c2] == 47) {
                int i2 = i + 1;
                if (bArr[i] == 42) {
                    while (true) {
                        int i3 = i2 + 1;
                        if (i3 >= d) {
                            pq.f(d - pq.c());
                            return true;
                        } else if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                            i2 = i3 + 1;
                            d = i2;
                        } else {
                            i2 = i3;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static void a(Pq pq, Hp hp, StringBuilder sb) {
        c(pq);
        String b2 = b(pq, sb);
        String str = "";
        if (!str.equals(b2)) {
            if (":".equals(a(pq, sb))) {
                c(pq);
                String c2 = c(pq, sb);
                if (c2 != null && !str.equals(c2)) {
                    int c3 = pq.c();
                    String a2 = a(pq, sb);
                    if (!";".equals(a2)) {
                        if ("}".equals(a2)) {
                            pq.e(c3);
                        }
                    }
                    if ("color".equals(b2)) {
                        hp.b(Aq.a(c2));
                    } else if ("background-color".equals(b2)) {
                        hp.a(Aq.a(c2));
                    } else if ("text-decoration".equals(b2)) {
                        if ("underline".equals(c2)) {
                            hp.c(true);
                        }
                    } else if ("font-family".equals(b2)) {
                        hp.a(c2);
                    } else if ("font-weight".equals(b2)) {
                        if ("bold".equals(c2)) {
                            hp.a(true);
                        }
                    } else if ("font-style".equals(b2) && "italic".equals(c2)) {
                        hp.b(true);
                    }
                }
            }
        }
    }

    static String a(Pq pq, StringBuilder sb) {
        c(pq);
        if (pq.a() == 0) {
            return null;
        }
        String b2 = b(pq, sb);
        String str = "";
        if (!str.equals(b2)) {
            return b2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append((char) pq.t());
        return sb2.toString();
    }

    private static char a(Pq pq, int i) {
        return (char) pq.a[i];
    }

    private void a(Hp hp, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = a.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    hp.d(matcher.group(1));
                }
                str = str.substring(0, indexOf);
            }
            String[] a2 = C0471ar.a(str, "\\.");
            String str2 = a2[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                hp.c(str2.substring(0, indexOf2));
                hp.b(str2.substring(indexOf2 + 1));
            } else {
                hp.c(str2);
            }
            if (a2.length > 1) {
                hp.a((String[]) Arrays.copyOfRange(a2, 1, a2.length));
            }
        }
    }
}
