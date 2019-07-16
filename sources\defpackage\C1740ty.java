package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: ty reason: default package and case insensitive filesystem */
public final class C1740ty extends Tt {
    private static final C1524mu c = new C1617pu("=&-_.!~*'()@:$,;/?:", false);
    private String d;
    private String e;
    private String f;
    private int g;
    private List<String> h;
    private String i;

    public C1740ty() {
        this.g = -1;
    }

    private static List<String> c(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i2 = 0;
        while (z) {
            int indexOf = str.indexOf(47, i2);
            boolean z2 = indexOf != -1;
            if (z2) {
                str2 = str.substring(i2, indexOf);
            } else {
                str2 = str.substring(i2);
            }
            arrayList.add(C1555nu.b(str2));
            i2 = indexOf + 1;
            z = z2;
        }
        return arrayList;
    }

    private static URL d(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final URL a(String str) {
        try {
            return new URL(d(k()), str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void b(String str) {
        this.h = c(null);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C1740ty tyVar = (C1740ty) super.clone();
        List<String> list = this.h;
        if (list != null) {
            tyVar.h = new ArrayList(list);
        }
        return tyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof C1740ty)) {
            return false;
        }
        return k().equals(((C1740ty) obj).k());
    }

    public final int hashCode() {
        return k().hashCode();
    }

    public final /* synthetic */ Tt i() {
        return (C1740ty) clone();
    }

    public final String k() {
        StringBuilder sb = new StringBuilder();
        String str = this.d;
        Pu.a(str);
        sb.append(str);
        sb.append("://");
        String str2 = this.f;
        if (str2 != null) {
            sb.append(C1555nu.e(str2));
            sb.append('@');
        }
        String str3 = this.e;
        Pu.a(str3);
        sb.append(str3);
        int i2 = this.g;
        if (i2 != -1) {
            sb.append(':');
            sb.append(i2);
        }
        String valueOf = String.valueOf(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        List<String> list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str4 = (String) this.h.get(i3);
                if (i3 != 0) {
                    sb2.append('/');
                }
                if (str4.length() != 0) {
                    sb2.append(C1555nu.c(str4));
                }
            }
        }
        a(entrySet(), sb2);
        String str5 = this.i;
        if (str5 != null) {
            sb2.append('#');
            sb2.append(c.a(str5));
        }
        String valueOf2 = String.valueOf(sb2.toString());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final String toString() {
        return k();
    }

    public C1740ty(String str) {
        this(d(str));
    }

    public C1740ty(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    static void a(Set<Entry<String, Object>> set, StringBuilder sb) {
        boolean z = true;
        for (Entry entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String f2 = C1555nu.f((String) entry.getKey());
                if (value instanceof Collection) {
                    for (Object a : (Collection) value) {
                        z = a(z, sb, f2, a);
                    }
                } else {
                    z = a(z, sb, f2, value);
                }
            }
        }
    }

    private C1740ty(String str, String str2, int i2, String str3, String str4, String str5, String str6) {
        this.g = -1;
        this.d = str.toLowerCase(Locale.US);
        this.e = str2;
        this.g = i2;
        this.h = c(str3);
        String str7 = null;
        this.i = str4 != null ? C1555nu.b(str4) : null;
        if (str5 != null) {
            C1338gt.a(str5, this);
        }
        if (str6 != null) {
            str7 = C1555nu.b(str6);
        }
        this.f = str7;
    }

    private static boolean a(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            z = false;
            sb.append('?');
        } else {
            sb.append('&');
        }
        sb.append(str);
        String f2 = C1555nu.f(obj.toString());
        if (f2.length() != 0) {
            sb.append('=');
            sb.append(f2);
        }
        return z;
    }

    public final /* synthetic */ Tt a(String str, Object obj) {
        super.a(str, obj);
        return this;
    }
}
