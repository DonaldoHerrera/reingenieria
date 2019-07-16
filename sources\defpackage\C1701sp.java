package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: sp reason: default package and case insensitive filesystem */
/* compiled from: SsaDecoder */
public final class C1701sp extends Vo {
    private static final Pattern o = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    private final boolean p;
    private int q;
    private int r;
    private int s;
    private int t;

    public C1701sp(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.p = false;
            return;
        }
        this.p = true;
        String a = C0471ar.a((byte[]) list.get(0));
        C1852xq.a(a.startsWith("Format: "));
        b(a);
        a(new Pq((byte[]) list.get(1)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    private void b(String str) {
        char c;
        String[] split = TextUtils.split(str.substring(8), ",");
        this.q = split.length;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        for (int i = 0; i < this.q; i++) {
            String g = C0471ar.g(split[i].trim());
            int hashCode = g.hashCode();
            if (hashCode != 100571) {
                if (hashCode != 3556653) {
                    if (hashCode == 109757538 && g.equals("start")) {
                        c = 0;
                        if (c != 0) {
                            this.r = i;
                        } else if (c == 1) {
                            this.s = i;
                        } else if (c == 2) {
                            this.t = i;
                        }
                    }
                } else if (g.equals("text")) {
                    c = 2;
                    if (c != 0) {
                    }
                }
            } else if (g.equals("end")) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
        if (this.r == -1 || this.s == -1 || this.t == -1) {
            this.q = 0;
        }
    }

    /* access modifiers changed from: protected */
    public C1731tp a(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        Jq jq = new Jq();
        Pq pq = new Pq(bArr, i);
        if (!this.p) {
            a(pq);
        }
        a(pq, (List<Uo>) arrayList, jq);
        Uo[] uoArr = new Uo[arrayList.size()];
        arrayList.toArray(uoArr);
        return new C1731tp(uoArr, jq.b());
    }

    private void a(Pq pq) {
        String j;
        do {
            j = pq.j();
            if (j == null) {
                return;
            }
        } while (!j.startsWith("[Events]"));
    }

    private void a(Pq pq, List<Uo> list, Jq jq) {
        while (true) {
            String j = pq.j();
            if (j == null) {
                return;
            }
            if (!this.p && j.startsWith("Format: ")) {
                b(j);
            } else if (j.startsWith("Dialogue: ")) {
                a(j, list, jq);
            }
        }
    }

    private void a(String str, List<Uo> list, Jq jq) {
        long j;
        String str2 = "SsaDecoder";
        if (this.q == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Skipping dialogue line before complete format: ");
            sb.append(str);
            Iq.d(str2, sb.toString());
            return;
        }
        String[] split = str.substring(10).split(",", this.q);
        if (split.length != this.q) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping dialogue line with fewer columns than format: ");
            sb2.append(str);
            Iq.d(str2, sb2.toString());
            return;
        }
        long a = a(split[this.r]);
        String str3 = "Skipping invalid timing: ";
        if (a == -9223372036854775807L) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            Iq.d(str2, sb3.toString());
            return;
        }
        String str4 = split[this.s];
        if (!str4.trim().isEmpty()) {
            j = a(str4);
            if (j == -9223372036854775807L) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str3);
                sb4.append(str);
                Iq.d(str2, sb4.toString());
                return;
            }
        } else {
            j = -9223372036854775807L;
        }
        String replaceAll = split[this.t].replaceAll("\\{.*?\\}", "");
        String str5 = "\n";
        list.add(new Uo(replaceAll.replaceAll("\\\\N", str5).replaceAll("\\\\n", str5)));
        jq.a(a);
        if (j != -9223372036854775807L) {
            list.add(null);
            jq.a(j);
        }
    }

    public static long a(String str) {
        Matcher matcher = o.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }
}
