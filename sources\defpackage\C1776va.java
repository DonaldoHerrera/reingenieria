package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: va reason: default package and case insensitive filesystem */
/* compiled from: ConstraintWidgetGroup */
public class C1776va {
    public List<C1716ta> a;
    int b = -1;
    int c = -1;
    public boolean d = false;
    public final int[] e = {this.b, this.c};
    List<C1716ta> f = new ArrayList();
    List<C1716ta> g = new ArrayList();
    HashSet<C1716ta> h = new HashSet<>();
    HashSet<C1716ta> i = new HashSet<>();
    List<C1716ta> j = new ArrayList();
    List<C1716ta> k = new ArrayList();

    C1776va(List<C1716ta> list) {
        this.a = list;
    }

    public List<C1716ta> a(int i2) {
        if (i2 == 0) {
            return this.f;
        }
        if (i2 == 1) {
            return this.g;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public Set<C1716ta> b(int i2) {
        if (i2 == 0) {
            return this.h;
        }
        if (i2 == 1) {
            return this.i;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a(C1716ta taVar, int i2) {
        if (i2 == 0) {
            this.h.add(taVar);
        } else if (i2 == 1) {
            this.i.add(taVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((C1716ta) this.k.get(i2));
        }
    }

    /* access modifiers changed from: 0000 */
    public List<C1716ta> a() {
        if (!this.j.isEmpty()) {
            return this.j;
        }
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1716ta taVar = (C1716ta) this.a.get(i2);
            if (!taVar.ja) {
                a((ArrayList) this.j, taVar);
            }
        }
        this.k.clear();
        this.k.addAll(this.a);
        this.k.removeAll(this.j);
        return this.j;
    }

    C1776va(List<C1716ta> list, boolean z) {
        this.a = list;
        this.d = z;
    }

    private void a(ArrayList<C1716ta> arrayList, C1716ta taVar) {
        if (!taVar.la) {
            arrayList.add(taVar);
            taVar.la = true;
            if (!taVar.y()) {
                if (taVar instanceof C1866ya) {
                    C1866ya yaVar = (C1866ya) taVar;
                    int i2 = yaVar.wa;
                    for (int i3 = 0; i3 < i2; i3++) {
                        a(arrayList, yaVar.va[i3]);
                    }
                }
                for (C1656ra raVar : taVar.D) {
                    C1656ra raVar2 = raVar.d;
                    if (raVar2 != null) {
                        C1716ta taVar2 = raVar2.b;
                        if (!(raVar2 == null || taVar2 == taVar.k())) {
                            a(arrayList, taVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    private void a(C1716ta taVar) {
        C1656ra raVar;
        int i2;
        int i3;
        C1656ra raVar2;
        C1656ra raVar3;
        int i4;
        if (taVar.ja && !taVar.y()) {
            boolean z = false;
            boolean z2 = taVar.x.d != null;
            if (z2) {
                raVar = taVar.x.d;
            } else {
                raVar = taVar.v.d;
            }
            if (raVar != null) {
                C1716ta taVar2 = raVar.b;
                if (!taVar2.ka) {
                    a(taVar2);
                }
                c cVar = raVar.c;
                if (cVar == c.RIGHT) {
                    C1716ta taVar3 = raVar.b;
                    i2 = taVar3.s() + taVar3.L;
                } else if (cVar == c.LEFT) {
                    i2 = raVar.b.L;
                }
                if (!z2) {
                    i3 = i2 - taVar.x.b();
                } else {
                    i3 = i2 + taVar.v.b() + taVar.s();
                }
                taVar.a(i3 - taVar.s(), i3);
                raVar2 = taVar.z.d;
                if (raVar2 == null) {
                    C1716ta taVar4 = raVar2.b;
                    if (!taVar4.ka) {
                        a(taVar4);
                    }
                    C1716ta taVar5 = raVar2.b;
                    int i5 = (taVar5.M + taVar5.V) - taVar.V;
                    taVar.e(i5, taVar.I + i5);
                    taVar.ka = true;
                    return;
                }
                if (taVar.y.d != null) {
                    z = true;
                }
                if (z) {
                    raVar3 = taVar.y.d;
                } else {
                    raVar3 = taVar.w.d;
                }
                if (raVar3 != null) {
                    C1716ta taVar6 = raVar3.b;
                    if (!taVar6.ka) {
                        a(taVar6);
                    }
                    c cVar2 = raVar3.c;
                    if (cVar2 == c.BOTTOM) {
                        C1716ta taVar7 = raVar3.b;
                        i3 = taVar7.M + taVar7.i();
                    } else if (cVar2 == c.TOP) {
                        i3 = raVar3.b.M;
                    }
                }
                if (z) {
                    i4 = i3 - taVar.y.b();
                } else {
                    i4 = i3 + taVar.w.b() + taVar.i();
                }
                taVar.e(i4 - taVar.i(), i4);
                taVar.ka = true;
                return;
            }
            i2 = 0;
            if (!z2) {
            }
            taVar.a(i3 - taVar.s(), i3);
            raVar2 = taVar.z.d;
            if (raVar2 == null) {
            }
        }
    }
}
