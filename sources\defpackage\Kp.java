package defpackage;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Kp reason: default package */
/* compiled from: WebvttCueParser */
public final class Kp {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private final StringBuilder c = new StringBuilder();

    /* renamed from: Kp$a */
    /* compiled from: WebvttCueParser */
    private static final class a {
        private static final String[] a = new String[0];
        public final String b;
        public final int c;
        public final String d;
        public final String[] e;

        private a(String str, int i, String str2, String[] strArr) {
            this.c = i;
            this.b = str;
            this.d = str2;
            this.e = strArr;
        }

        public static a a(String str, int i) {
            String str2;
            String[] strArr;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a2 = C0471ar.a(trim, "\\.");
            String str3 = a2[0];
            if (a2.length > 1) {
                strArr = (String[]) Arrays.copyOfRange(a2, 1, a2.length);
            } else {
                strArr = a;
            }
            return new a(str3, i, str2, strArr);
        }

        public static a a() {
            String str = "";
            return new a(str, 0, str, new String[0]);
        }
    }

    /* renamed from: Kp$b */
    /* compiled from: WebvttCueParser */
    private static final class b implements Comparable<b> {
        public final int a;
        public final Hp b;

        public b(int i, Hp hp) {
            this.a = i;
            this.b = hp;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            return this.a - bVar.a;
        }
    }

    private static void b(String str, defpackage.Jp.a aVar) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            aVar.a(c(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            aVar.a(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            aVar.a(Mp.a(str));
            aVar.b(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        aVar.a((float) parseInt);
        aVar.b(1);
    }

    private static void c(String str, defpackage.Jp.a aVar) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            aVar.c(c(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            aVar.c(Integer.MIN_VALUE);
        }
        aVar.b(Mp.a(str));
    }

    private static Alignment d(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 2;
                    break;
                }
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 3;
                    break;
                }
            case 100571:
                if (str.equals("end")) {
                    c2 = 4;
                    break;
                }
            case 3317767:
                if (str.equals("left")) {
                    c2 = 1;
                    break;
                }
            case 108511772:
                if (str.equals("right")) {
                    c2 = 5;
                    break;
                }
            case 109757538:
                if (str.equals("start")) {
                    c2 = 0;
                    break;
                }
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return Alignment.ALIGN_NORMAL;
        }
        if (c2 == 2 || c2 == 3) {
            return Alignment.ALIGN_CENTER;
        }
        if (c2 == 4 || c2 == 5) {
            return Alignment.ALIGN_OPPOSITE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid alignment value: ");
        sb.append(str);
        Iq.d("WebvttCueParser", sb.toString());
        return null;
    }

    public boolean a(Pq pq, defpackage.Jp.a aVar, List<Hp> list) {
        String j = pq.j();
        if (j == null) {
            return false;
        }
        Matcher matcher = a.matcher(j);
        if (matcher.matches()) {
            return a(null, matcher, pq, aVar, this.c, list);
        }
        String j2 = pq.j();
        if (j2 == null) {
            return false;
        }
        Matcher matcher2 = a.matcher(j2);
        if (!matcher2.matches()) {
            return false;
        }
        return a(j.trim(), matcher2, pq, aVar, this.c, list);
    }

    private static int c(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 1;
                    break;
                }
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 2;
                    break;
                }
            case 100571:
                if (str.equals("end")) {
                    c2 = 3;
                    break;
                }
            case 109757538:
                if (str.equals("start")) {
                    c2 = 0;
                    break;
                }
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 0;
        }
        if (c2 == 1 || c2 == 2) {
            return 1;
        }
        if (c2 == 3) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid anchor value: ");
        sb.append(str);
        Iq.d("WebvttCueParser", sb.toString());
        return Integer.MIN_VALUE;
    }

    static void a(String str, defpackage.Jp.a aVar) {
        String str2 = "WebvttCueParser";
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    b(group2, aVar);
                } else if ("align".equals(group)) {
                    aVar.a(d(group2));
                } else if ("position".equals(group)) {
                    c(group2, aVar);
                } else if ("size".equals(group)) {
                    aVar.c(Mp.a(group2));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    Iq.d(str2, sb.toString());
                }
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Skipping bad cue setting: ");
                sb2.append(matcher.group());
                Iq.d(str2, sb2.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063 A[ADDED_TO_REGION] */
    private static boolean b(String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode != 98) {
            if (hashCode != 99) {
                if (hashCode != 105) {
                    if (hashCode != 3314158) {
                        if (hashCode != 117) {
                            if (hashCode == 118 && str.equals("v")) {
                                c2 = 5;
                                return c2 != 0 || c2 == 1 || c2 == 2 || c2 == 3 || c2 == 4 || c2 == 5;
                            }
                        } else if (str.equals("u")) {
                            c2 = 4;
                            if (c2 != 0) {
                            }
                        }
                    } else if (str.equals("lang")) {
                        c2 = 3;
                        if (c2 != 0) {
                        }
                    }
                } else if (str.equals("i")) {
                    c2 = 2;
                    if (c2 != 0) {
                    }
                }
            } else if (str.equals("c")) {
                c2 = 1;
                if (c2 != 0) {
                }
            }
        } else if (str.equals("b")) {
            c2 = 0;
            if (c2 != 0) {
            }
        }
        c2 = 65535;
        if (c2 != 0) {
        }
    }

    static void a(String str, String str2, defpackage.Jp.a aVar, List<Hp> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = a(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    String a2 = a(substring);
                    if (a2 != null && b(a2)) {
                        if (z) {
                            while (!arrayDeque.isEmpty()) {
                                a aVar2 = (a) arrayDeque.pop();
                                a(str, aVar2, spannableStringBuilder, list, arrayList);
                                if (aVar2.b.equals(a2)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            arrayDeque.push(a.a(substring, spannableStringBuilder.length()));
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        a(str, a.a(), spannableStringBuilder, list, arrayList);
        aVar.a(spannableStringBuilder);
    }

    private static boolean a(String str, Matcher matcher, Pq pq, defpackage.Jp.a aVar, StringBuilder sb, List<Hp> list) {
        try {
            aVar.b(Mp.b(matcher.group(1)));
            aVar.a(Mp.b(matcher.group(2)));
            a(matcher.group(3), aVar);
            sb.setLength(0);
            while (true) {
                String j = pq.j();
                if (!TextUtils.isEmpty(j)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(j.trim());
                } else {
                    a(str, sb.toString(), aVar, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping cue with bad header: ");
            sb2.append(matcher.group());
            Iq.d("WebvttCueParser", sb2.toString());
            return false;
        }
    }

    private static int a(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    private static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode != 3309) {
            if (hashCode != 3464) {
                if (hashCode != 96708) {
                    if (hashCode == 3374865 && str.equals("nbsp")) {
                        c2 = 2;
                        if (c2 == 0) {
                            spannableStringBuilder.append('<');
                            return;
                        } else if (c2 == 1) {
                            spannableStringBuilder.append('>');
                            return;
                        } else if (c2 == 2) {
                            spannableStringBuilder.append(' ');
                            return;
                        } else if (c2 != 3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ignoring unsupported entity: '&");
                            sb.append(str);
                            sb.append(";'");
                            Iq.d("WebvttCueParser", sb.toString());
                            return;
                        } else {
                            spannableStringBuilder.append('&');
                            return;
                        }
                    }
                } else if (str.equals("amp")) {
                    c2 = 3;
                    if (c2 == 0) {
                    }
                }
            } else if (str.equals("lt")) {
                c2 = 0;
                if (c2 == 0) {
                }
            }
        } else if (str.equals("gt")) {
            c2 = 1;
            if (c2 == 0) {
            }
        }
        c2 = 65535;
        if (c2 == 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009e A[LOOP:0: B:43:0x009c->B:44:0x009e, LOOP_END] */
    private static void a(String str, a aVar, SpannableStringBuilder spannableStringBuilder, List<Hp> list, List<b> list2) {
        char c2;
        int size;
        int i = aVar.c;
        int length = spannableStringBuilder.length();
        String str2 = aVar.b;
        int hashCode = str2.hashCode();
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 98) {
                        if (hashCode != 99) {
                            if (hashCode != 117) {
                                if (hashCode == 118 && str2.equals("v")) {
                                    c2 = 5;
                                    switch (c2) {
                                        case 0:
                                            spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                                            break;
                                        case 1:
                                            spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                                            break;
                                        case 2:
                                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                            break;
                                        default:
                                            return;
                                    }
                                    list2.clear();
                                    a(list, str, aVar, list2);
                                    size = list2.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        a(spannableStringBuilder, ((b) list2.get(i2)).b, i, length);
                                    }
                                }
                            } else if (str2.equals("u")) {
                                c2 = 2;
                                switch (c2) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        break;
                                }
                                list2.clear();
                                a(list, str, aVar, list2);
                                size = list2.size();
                                while (i2 < size) {
                                }
                            }
                        } else if (str2.equals("c")) {
                            c2 = 3;
                            switch (c2) {
                                case 0:
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    break;
                            }
                            list2.clear();
                            a(list, str, aVar, list2);
                            size = list2.size();
                            while (i2 < size) {
                            }
                        }
                    } else if (str2.equals("b")) {
                        c2 = 0;
                        switch (c2) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                        }
                        list2.clear();
                        a(list, str, aVar, list2);
                        size = list2.size();
                        while (i2 < size) {
                        }
                    }
                } else if (str2.equals("lang")) {
                    c2 = 4;
                    switch (c2) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                    }
                    list2.clear();
                    a(list, str, aVar, list2);
                    size = list2.size();
                    while (i2 < size) {
                    }
                }
            } else if (str2.equals("i")) {
                c2 = 1;
                switch (c2) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                }
                list2.clear();
                a(list, str, aVar, list2);
                size = list2.size();
                while (i2 < size) {
                }
            }
        } else if (str2.equals("")) {
            c2 = 6;
            switch (c2) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
            }
            list2.clear();
            a(list, str, aVar, list2);
            size = list2.size();
            while (i2 < size) {
            }
        }
        c2 = 65535;
        switch (c2) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
        }
        list2.clear();
        a(list, str, aVar, list2);
        size = list2.size();
        while (i2 < size) {
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Hp hp, int i, int i2) {
        if (hp != null) {
            if (hp.f() != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(hp.f()), i, i2, 33);
            }
            if (hp.j()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (hp.k()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (hp.i()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(hp.b()), i, i2, 33);
            }
            if (hp.h()) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(hp.a()), i, i2, 33);
            }
            if (hp.c() != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(hp.c()), i, i2, 33);
            }
            if (hp.g() != null) {
                spannableStringBuilder.setSpan(new Standard(hp.g()), i, i2, 33);
            }
            int e = hp.e();
            if (e == 1) {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) hp.d(), true), i, i2, 33);
            } else if (e == 2) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(hp.d()), i, i2, 33);
            } else if (e == 3) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(hp.d() / 100.0f), i, i2, 33);
            }
        }
    }

    private static String a(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return C0471ar.b(trim, "[ \\.]")[0];
    }

    private static void a(List<Hp> list, String str, a aVar, List<b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Hp hp = (Hp) list.get(i);
            int a2 = hp.a(str, aVar.b, aVar.e, aVar.d);
            if (a2 > 0) {
                list2.add(new b(a2, hp));
            }
        }
        Collections.sort(list2);
    }
}
