package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: MAb reason: default package */
/* compiled from: CommandLine */
public class MAb implements Serializable {
    private List a = new LinkedList();
    private List b = new ArrayList();

    MAb() {
    }

    private SAb c(String str) {
        String b2 = ZAb.b(str);
        for (SAb sAb : this.b) {
            if (b2.equals(sAb.n())) {
                return sAb;
            }
            if (b2.equals(sAb.m())) {
                return sAb;
            }
        }
        return null;
    }

    public List a() {
        return this.a;
    }

    public boolean b(String str) {
        return this.b.contains(c(str));
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.a.add(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(SAb sAb) {
        this.b.add(sAb);
    }
}
