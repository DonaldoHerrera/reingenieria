package defpackage;

import java.util.ArrayList;

/* renamed from: Fa reason: default package and case insensitive filesystem */
/* compiled from: WidgetContainer */
public class C0204Fa extends C1716ta {
    protected ArrayList<C1716ta> va = new ArrayList<>();

    public void D() {
        this.va.clear();
        super.D();
    }

    public void H() {
        super.H();
        ArrayList<C1716ta> arrayList = this.va;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1716ta taVar = (C1716ta) this.va.get(i);
                taVar.b(g(), h());
                if (!(taVar instanceof C1746ua)) {
                    taVar.H();
                }
            }
        }
    }

    public C1746ua J() {
        C1716ta k = k();
        C1746ua uaVar = this instanceof C1746ua ? (C1746ua) this : null;
        while (k != null) {
            C1716ta k2 = k.k();
            if (k instanceof C1746ua) {
                uaVar = (C1746ua) k;
            }
            k = k2;
        }
        return uaVar;
    }

    public void K() {
        H();
        ArrayList<C1716ta> arrayList = this.va;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1716ta taVar = (C1716ta) this.va.get(i);
                if (taVar instanceof C0204Fa) {
                    ((C0204Fa) taVar).K();
                }
            }
        }
    }

    public void L() {
        this.va.clear();
    }

    public void a(C1288fa faVar) {
        super.a(faVar);
        int size = this.va.size();
        for (int i = 0; i < size; i++) {
            ((C1716ta) this.va.get(i)).a(faVar);
        }
    }

    public void b(C1716ta taVar) {
        this.va.add(taVar);
        if (taVar.k() != null) {
            ((C0204Fa) taVar.k()).c(taVar);
        }
        taVar.a((C1716ta) this);
    }

    public void c(C1716ta taVar) {
        this.va.remove(taVar);
        taVar.a((C1716ta) null);
    }

    public void b(int i, int i2) {
        super.b(i, i2);
        int size = this.va.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C1716ta) this.va.get(i3)).b(o(), p());
        }
    }
}
