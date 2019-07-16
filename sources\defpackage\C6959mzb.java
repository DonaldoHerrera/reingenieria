package defpackage;

import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: mzb reason: default package and case insensitive filesystem */
/* compiled from: HttpHeaders */
public final class C6959mzb {
    private static final C7030oAb a = C7030oAb.c("\"\\");
    private static final C7030oAb b = C7030oAb.c("\t ,=");

    public static long a(Ayb ayb) {
        return a(ayb.f());
    }

    public static boolean b(C7026nyb nyb) {
        return c(nyb).contains("*");
    }

    public static boolean c(Ayb ayb) {
        return b(ayb.f());
    }

    public static C7026nyb d(Ayb ayb) {
        return a(ayb.F().K().c(), ayb.f());
    }

    private static Set<String> e(Ayb ayb) {
        return c(ayb.f());
    }

    public static long a(C7026nyb nyb) {
        return a(nyb.b(HttpHeaders.CONTENT_LENGTH));
    }

    public static boolean b(Ayb ayb) {
        if (ayb.K().e().equals("HEAD")) {
            return false;
        }
        int d = ayb.d();
        if (((d >= 100 && d < 200) || d == 204 || d == 304) && a(ayb) == -1) {
            if ("chunked".equalsIgnoreCase(ayb.a("Transfer-Encoding"))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static Set<String> c(C7026nyb nyb) {
        Set emptySet = Collections.emptySet();
        int c = nyb.c();
        Set set = emptySet;
        for (int i = 0; i < c; i++) {
            if ("Vary".equalsIgnoreCase(nyb.a(i))) {
                String b2 = nyb.b(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : b2.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }

    private static long a(String str) {
        long j = -1;
        if (str == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        return j;
    }

    public static boolean a(Ayb ayb, C7026nyb nyb, C7647wyb wyb) {
        for (String str : e(ayb)) {
            if (!Objects.equals(nyb.c(str), wyb.b(str))) {
                return false;
            }
        }
        return true;
    }

    public static C7026nyb a(C7026nyb nyb, C7026nyb nyb2) {
        Set c = c(nyb2);
        if (c.isEmpty()) {
            return Kyb.c;
        }
        a aVar = new a();
        int c2 = nyb.c();
        for (int i = 0; i < c2; i++) {
            String a2 = nyb.a(i);
            if (c.contains(a2)) {
                aVar.a(a2, nyb.b(i));
            }
        }
        return aVar.a();
    }

    public static int b(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                break;
            }
            i++;
        }
        return i;
    }

    public static void a(C6549gyb gyb, C7095oyb oyb, C7026nyb nyb) {
        if (gyb != C6549gyb.a) {
            List a2 = C6413eyb.a(oyb, nyb);
            if (!a2.isEmpty()) {
                gyb.a(oyb, a2);
            }
        }
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (parseLong < 0) {
                return 0;
            }
            i = (int) parseLong;
            return i;
        } catch (NumberFormatException unused) {
        }
    }
}
