package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: up reason: default package and case insensitive filesystem */
/* compiled from: SubripDecoder */
public final class C1761up extends Vo {
    private static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    private static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder q = new StringBuilder();
    private final ArrayList<String> r = new ArrayList<>();

    public C1761up() {
        super("SubripDecoder");
    }

    static float b(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public C1791vp a(byte[] bArr, int i, boolean z) {
        String str;
        String str2 = "SubripDecoder";
        ArrayList arrayList = new ArrayList();
        Jq jq = new Jq();
        Pq pq = new Pq(bArr, i);
        while (true) {
            String j = pq.j();
            if (j == null) {
                break;
            } else if (j.length() != 0) {
                try {
                    Integer.parseInt(j);
                    String j2 = pq.j();
                    if (j2 == null) {
                        Iq.d(str2, "Unexpected end");
                        break;
                    }
                    Matcher matcher = o.matcher(j2);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        jq.a(a(matcher, 1));
                        int i2 = 0;
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            jq.a(a(matcher, 6));
                        } else {
                            z2 = false;
                        }
                        this.q.setLength(0);
                        this.r.clear();
                        while (true) {
                            String j3 = pq.j();
                            if (TextUtils.isEmpty(j3)) {
                                break;
                            }
                            if (this.q.length() > 0) {
                                this.q.append("<br>");
                            }
                            this.q.append(a(j3, this.r));
                        }
                        Spanned fromHtml = Html.fromHtml(this.q.toString());
                        while (true) {
                            if (i2 >= this.r.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.r.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(a(fromHtml, str));
                        if (z2) {
                            arrayList.add(null);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Skipping invalid timing: ");
                        sb.append(j2);
                        Iq.d(str2, sb.toString());
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Skipping invalid index: ");
                    sb2.append(j);
                    Iq.d(str2, sb2.toString());
                }
            }
        }
        Uo[] uoArr = new Uo[arrayList.size()];
        arrayList.toArray(uoArr);
        return new C1791vp(uoArr, jq.b());
    }

    private String a(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = p.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    private Uo a(Spanned spanned, String str) {
        char c;
        char c2;
        String str2 = str;
        if (str2 == null) {
            return new Uo(spanned);
        }
        Spanned spanned2 = spanned;
        String str3 = "{\\an8}";
        String str4 = "{\\an7}";
        String str5 = "{\\an6}";
        String str6 = "{\\an5}";
        String str7 = "{\\an4}";
        String str8 = "{\\an3}";
        String str9 = "{\\an2}";
        String str10 = "{\\an1}";
        switch (str.hashCode()) {
            case -685620710:
                if (str2.equals(str10)) {
                    c = 0;
                    break;
                }
            case -685620679:
                if (str2.equals(str9)) {
                    c = 6;
                    break;
                }
            case -685620648:
                if (str2.equals(str8)) {
                    c = 3;
                    break;
                }
            case -685620617:
                if (str2.equals(str7)) {
                    c = 1;
                    break;
                }
            case -685620586:
                if (str2.equals(str6)) {
                    c = 7;
                    break;
                }
            case -685620555:
                if (str2.equals(str5)) {
                    c = 4;
                    break;
                }
            case -685620524:
                if (str2.equals(str4)) {
                    c = 2;
                    break;
                }
            case -685620493:
                if (str2.equals(str3)) {
                    c = 8;
                    break;
                }
            case -685620462:
                if (str2.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
            default:
                c = 65535;
                break;
        }
        int i = (c == 0 || c == 1 || c == 2) ? 0 : (c == 3 || c == 4 || c == 5) ? 2 : 1;
        switch (str.hashCode()) {
            case -685620710:
                if (str2.equals(str10)) {
                    c2 = 0;
                    break;
                }
            case -685620679:
                if (str2.equals(str9)) {
                    c2 = 1;
                    break;
                }
            case -685620648:
                if (str2.equals(str8)) {
                    c2 = 2;
                    break;
                }
            case -685620617:
                if (str2.equals(str7)) {
                    c2 = 6;
                    break;
                }
            case -685620586:
                if (str2.equals(str6)) {
                    c2 = 7;
                    break;
                }
            case -685620555:
                if (str2.equals(str5)) {
                    c2 = 8;
                    break;
                }
            case -685620524:
                if (str2.equals(str4)) {
                    c2 = 3;
                    break;
                }
            case -685620493:
                if (str2.equals(str3)) {
                    c2 = 4;
                    break;
                }
            case -685620462:
                if (str2.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
            default:
                c2 = 65535;
                break;
        }
        int i2 = (c2 == 0 || c2 == 1 || c2 == 2) ? 2 : (c2 == 3 || c2 == 4 || c2 == 5) ? 0 : 1;
        Uo uo = new Uo(spanned, null, b(i2), 0, i2, b(i), i, Float.MIN_VALUE);
        return uo;
    }

    private static long a(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }
}
