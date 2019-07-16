package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: yy reason: default package and case insensitive filesystem */
public final class C1890yy {
    private static final Pattern a = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private static final Pattern b = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern c;
    private static final Pattern d;
    private String e = "application";
    private String f = "octet-stream";
    private final SortedMap<String, String> g = new TreeMap();
    private String h;

    static {
        String str = "[^\\s/=;\"]+";
        String str2 = ";.*";
        StringBuilder sb = new StringBuilder(str.length() + 14 + str.length() + str2.length());
        sb.append("\\s*(");
        sb.append(str);
        sb.append(")/(");
        sb.append(str);
        sb.append(")\\s*(");
        sb.append(str2);
        sb.append(")?");
        c = Pattern.compile(sb.toString(), 32);
        String str3 = "\"([^\"]*)\"";
        String str4 = "[^\\s;\"]*";
        StringBuilder sb2 = new StringBuilder(str3.length() + 1 + str4.length());
        sb2.append(str3);
        sb2.append("|");
        sb2.append(str4);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder(str.length() + 12 + String.valueOf(sb3).length());
        sb4.append("\\s*;\\s*(");
        sb4.append(str);
        sb4.append(")=(");
        sb4.append(sb3);
        sb4.append(")");
        d = Pattern.compile(sb4.toString());
    }

    public C1890yy(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if (a.matcher(group).matches()) {
                this.e = group;
                this.h = null;
                String group2 = matcher.group(2);
                if (a.matcher(group2).matches()) {
                    this.f = group2;
                    this.h = null;
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        Matcher matcher2 = d.matcher(group3);
                        while (matcher2.find()) {
                            String group4 = matcher2.group(1);
                            String group5 = matcher2.group(3);
                            if (group5 == null) {
                                group5 = matcher2.group(2);
                            }
                            b(group4, group5);
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Subtype contains reserved characters");
            }
            throw new IllegalArgumentException("Type contains reserved characters");
        }
        throw new IllegalArgumentException("Type must be in the 'maintype/subtype; parameter=value' format");
    }

    static boolean a(String str) {
        return b.matcher(str).matches();
    }

    private final C1890yy b(String str, String str2) {
        if (str2 == null) {
            this.h = null;
            this.g.remove(str.toLowerCase(Locale.US));
            return this;
        } else if (b.matcher(str).matches()) {
            this.h = null;
            this.g.put(str.toLowerCase(Locale.US), str2);
            return this;
        } else {
            throw new IllegalArgumentException("Name contains reserved characters");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1890yy)) {
            return false;
        }
        C1890yy yyVar = (C1890yy) obj;
        if (!a(yyVar) || !this.g.equals(yyVar.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }

    public final String a() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('/');
        sb.append(this.f);
        SortedMap<String, String> sortedMap = this.g;
        if (sortedMap != null) {
            for (Entry entry : sortedMap.entrySet()) {
                String str2 = (String) entry.getValue();
                sb.append("; ");
                sb.append((String) entry.getKey());
                sb.append("=");
                if (!a(str2)) {
                    String replace = str2.replace("\\", "\\\\");
                    String str3 = "\"";
                    String replace2 = replace.replace(str3, "\\\"");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(replace2).length() + 2);
                    sb2.append(str3);
                    sb2.append(replace2);
                    sb2.append(str3);
                    str2 = sb2.toString();
                }
                sb.append(str2);
            }
        }
        this.h = sb.toString();
        return this.h;
    }

    public final Charset b() {
        String str = (String) this.g.get("charset".toLowerCase(Locale.US));
        if (str == null) {
            return null;
        }
        return Charset.forName(str);
    }

    private final boolean a(C1890yy yyVar) {
        return yyVar != null && this.e.equalsIgnoreCase(yyVar.e) && this.f.equalsIgnoreCase(yyVar.f);
    }

    public static boolean a(String str, String str2) {
        return str2 != null && new C1890yy(str).a(new C1890yy(str2));
    }

    public final C1890yy a(Charset charset) {
        b("charset", charset == null ? null : charset.name());
        return this;
    }
}
