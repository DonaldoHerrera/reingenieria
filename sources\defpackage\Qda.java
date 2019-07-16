package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Qda reason: default package */
/* compiled from: Station */
public class Qda implements Sda {
    private final String a;
    private final List<Tda> b;
    private final int c;
    private final C3508cda d;
    private final String e;
    private final String f;
    private final C4928GKa<String> g;

    public Qda(C3508cda cda, String str, String str2, List<Tda> list, String str3, Integer num, C4928GKa<String> gKa) {
        this.a = str2;
        this.b = list;
        this.d = cda;
        this.c = num.intValue();
        this.e = str;
        this.f = str3;
        this.g = gKa;
    }

    public static Qda a(Qda qda, List<Tda> list) {
        Qda qda2 = new Qda(qda.a(), qda.getTitle(), qda.getType(), list, qda.d(), Integer.valueOf(qda.c()), qda.b());
        return qda2;
    }

    public C4928GKa<String> b() {
        return this.g;
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.f;
    }

    public List<Tda> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Qda.class != obj.getClass()) {
            return false;
        }
        Qda qda = (Qda) obj;
        if (!C4804CKa.a(this.d, qda.d) || !C4804CKa.a(this.e, qda.e) || !C4804CKa.a(Integer.valueOf(this.c), Integer.valueOf(qda.c)) || !C4804CKa.a(this.b, qda.b)) {
            z = false;
        }
        return z;
    }

    public String getTitle() {
        return this.e;
    }

    public String getType() {
        return this.a;
    }

    public int hashCode() {
        return C4804CKa.a(this.d, this.e, Integer.valueOf(this.c), this.b);
    }

    public static Qda a(Sda sda, C3508cda cda) {
        List e2 = sda.e();
        ArrayList arrayList = new ArrayList(e2.size() + 1);
        arrayList.add(new Tda(cda, C3508cda.a));
        arrayList.addAll(e2);
        Qda qda = new Qda(sda.a(), sda.getTitle(), sda.getType(), arrayList, sda.d(), Integer.valueOf(sda.c()), sda.b());
        return qda;
    }

    public C3508cda a() {
        return this.d;
    }
}
