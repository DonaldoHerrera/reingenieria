package defpackage;

import android.graphics.BitmapFactory;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: xp reason: default package and case insensitive filesystem */
/* compiled from: TtmlNode */
final class C1851xp {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final Ap f;
    private final String[] g;
    public final String h;
    public final String i;
    private final HashMap<String, Integer> j;
    private final HashMap<String, Integer> k;
    private List<C1851xp> l;

    private C1851xp(String str, String str2, long j2, long j3, Ap ap, String[] strArr, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = ap;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j2;
        this.e = j3;
        C1852xq.a(str3);
        this.h = str3;
        this.j = new HashMap<>();
        this.k = new HashMap<>();
    }

    public static C1851xp a(String str) {
        C1851xp xpVar = new C1851xp(null, C1911zp.a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null);
        return xpVar;
    }

    public long[] b() {
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int i3 = i2 + 1;
            jArr[i2] = ((Long) it.next()).longValue();
            i2 = i3;
        }
        return jArr;
    }

    public static C1851xp a(String str, long j2, long j3, Ap ap, String[] strArr, String str2, String str3) {
        C1851xp xpVar = new C1851xp(str, null, j2, j3, ap, strArr, str2, str3);
        return xpVar;
    }

    public boolean a(long j2) {
        return (this.d == -9223372036854775807L && this.e == -9223372036854775807L) || (this.d <= j2 && this.e == -9223372036854775807L) || ((this.d == -9223372036854775807L && j2 < this.e) || (this.d <= j2 && j2 < this.e));
    }

    public void a(C1851xp xpVar) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(xpVar);
    }

    public C1851xp a(int i2) {
        List<C1851xp> list = this.l;
        if (list != null) {
            return (C1851xp) list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        List<C1851xp> list = this.l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        boolean equals2 = "div".equals(this.a);
        if (z || equals || (equals2 && this.i != null)) {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                ((C1851xp) this.l.get(i2)).a(treeSet, z || equals);
            }
        }
    }

    public List<Uo> a(long j2, Map<String, Ap> map, Map<String, C1881yp> map2, Map<String, String> map3) {
        long j3 = j2;
        Map<String, C1881yp> map4 = map2;
        ArrayList<Pair> arrayList = new ArrayList<>();
        a(j3, this.h, (List<Pair<String, String>>) arrayList);
        TreeMap treeMap = new TreeMap();
        a(j2, false, this.h, (Map<String, SpannableStringBuilder>) treeMap);
        a(j3, map, (Map<String, SpannableStringBuilder>) treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                C1881yp ypVar = (C1881yp) map4.get(pair.first);
                Uo uo = new Uo(BitmapFactory.decodeByteArray(decode, 0, decode.length), ypVar.b, 1, ypVar.c, ypVar.e, ypVar.f, Float.MIN_VALUE);
                arrayList2.add(uo);
            }
        }
        for (Entry entry : treeMap.entrySet()) {
            C1881yp ypVar2 = (C1881yp) map4.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            a(spannableStringBuilder);
            Uo uo2 = new Uo((CharSequence) spannableStringBuilder, (Alignment) null, ypVar2.c, ypVar2.d, ypVar2.e, ypVar2.b, Integer.MIN_VALUE, ypVar2.f, ypVar2.g, ypVar2.h);
            arrayList2.add(uo2);
        }
        return arrayList2;
    }

    private void a(long j2, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (a(j2)) {
            if ("div".equals(this.a)) {
                String str2 = this.i;
                if (str2 != null) {
                    list.add(new Pair(str, str2));
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < a(); i2++) {
            a(i2).a(j2, str, list);
        }
    }

    private void a(long j2, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.j.clear();
        this.k.clear();
        if (!"metadata".equals(this.a)) {
            if (!"".equals(this.h)) {
                str = this.h;
            }
            if (!this.c || !z) {
                if ("br".equals(this.a) && z) {
                    a(str, map).append(10);
                } else if (a(j2)) {
                    for (Entry entry : map.entrySet()) {
                        this.j.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
                    }
                    boolean equals = "p".equals(this.a);
                    for (int i2 = 0; i2 < a(); i2++) {
                        a(i2).a(j2, z || equals, str, map);
                    }
                    if (equals) {
                        C1911zp.a(a(str, map));
                    }
                    for (Entry entry2 : map.entrySet()) {
                        this.k.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                    }
                }
            } else {
                a(str, map).append(this.b);
            }
        }
    }

    private static SpannableStringBuilder a(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    private void a(long j2, Map<String, Ap> map, Map<String, SpannableStringBuilder> map2) {
        int i2;
        if (a(j2)) {
            Iterator it = this.k.entrySet().iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                if (this.j.containsKey(str)) {
                    i2 = ((Integer) this.j.get(str)).intValue();
                }
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i2 != intValue) {
                    a(map, (SpannableStringBuilder) map2.get(str), i2, intValue);
                }
            }
            while (i2 < a()) {
                a(i2).a(j2, map, map2);
                i2++;
            }
        }
    }

    private void a(Map<String, Ap> map, SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        Ap a2 = C1911zp.a(this.f, this.g, map);
        if (a2 != null) {
            C1911zp.a(spannableStringBuilder, i2, i3, a2);
        }
    }

    private SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder) {
        int i2;
        int i3;
        int i4 = 0;
        int length = spannableStringBuilder.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (spannableStringBuilder.charAt(i5) == ' ') {
                int i6 = i5 + 1;
                int i7 = i6;
                while (i7 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i7) == ' ') {
                    i7++;
                }
                int i8 = i7 - i6;
                if (i8 > 0) {
                    spannableStringBuilder.delete(i5, i5 + i8);
                    length -= i8;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i9 = 0;
        while (true) {
            i2 = length - 1;
            if (i9 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i9) == 10) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    spannableStringBuilder.delete(i10, i9 + 2);
                    length--;
                }
            }
            i9++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == ' ') {
            spannableStringBuilder.delete(i2, length);
            length--;
        }
        while (true) {
            i3 = length - 1;
            if (i4 >= i3) {
                break;
            }
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i11 = i4 + 1;
                if (spannableStringBuilder.charAt(i11) == 10) {
                    spannableStringBuilder.delete(i4, i11);
                    length--;
                }
            }
            i4++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i3) == 10) {
            spannableStringBuilder.delete(i3, length);
        }
        return spannableStringBuilder;
    }
}
