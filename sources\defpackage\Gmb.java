package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: Gmb reason: default package */
/* compiled from: NameResolverImpl.kt */
public final class Gmb implements Emb {
    private final Wlb a;
    private final Rlb b;

    public Gmb(Wlb wlb, Rlb rlb) {
        C7471uYa.b(wlb, "strings");
        C7471uYa.b(rlb, "qualifiedNames");
        this.a = wlb;
        this.b = rlb;
    }

    private final MVa<List<String>, List<String>, Boolean> c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            b a2 = this.b.a(i);
            Wlb wlb = this.a;
            C7471uYa.a((Object) a2, "proto");
            String a3 = wlb.a(a2.l());
            C0151b j = a2.j();
            if (j != null) {
                int i2 = Fmb.a[j.ordinal()];
                if (i2 == 1) {
                    linkedList2.addFirst(a3);
                } else if (i2 == 2) {
                    linkedList.addFirst(a3);
                } else if (i2 == 3) {
                    linkedList2.addFirst(a3);
                    z = true;
                }
                i = a2.k();
            } else {
                C7471uYa.a();
                throw null;
            }
        }
        return new MVa<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    public boolean a(int i) {
        return ((Boolean) c(i).d()).booleanValue();
    }

    public String b(int i) {
        MVa c = c(i);
        List list = (List) c.a();
        String a2 = C7676xWa.a((List) c.b(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C7676xWa.a(list, "/", null, null, 0, null, null, 62, null));
        sb.append('/');
        sb.append(a2);
        return sb.toString();
    }

    public String getString(int i) {
        String a2 = this.a.a(i);
        C7471uYa.a((Object) a2, "strings.getString(index)");
        return a2;
    }
}
