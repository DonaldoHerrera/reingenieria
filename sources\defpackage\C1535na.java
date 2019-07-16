package defpackage;

import java.util.ArrayList;

/* renamed from: na reason: default package and case insensitive filesystem */
/* compiled from: Barrier */
public class C1535na extends C1866ya {
    private int xa = 0;
    private ArrayList<C0192Ba> ya = new ArrayList<>(4);
    private boolean za = true;

    public void F() {
        super.F();
        this.ya.clear();
    }

    public void G() {
        C0192Ba ba;
        float f;
        C0192Ba ba2;
        int i = this.xa;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                ba = this.x.d();
            } else if (i == 2) {
                ba = this.w.d();
            } else if (i == 3) {
                ba = this.y.d();
            } else {
                return;
            }
            f2 = 0.0f;
        } else {
            ba = this.v.d();
        }
        int size = this.ya.size();
        C0192Ba ba3 = null;
        int i2 = 0;
        while (i2 < size) {
            C0192Ba ba4 = (C0192Ba) this.ya.get(i2);
            if (ba4.b == 1) {
                int i3 = this.xa;
                if (i3 == 0 || i3 == 2) {
                    f = ba4.h;
                    if (f < f2) {
                        ba2 = ba4.g;
                    } else {
                        i2++;
                    }
                } else {
                    f = ba4.h;
                    if (f > f2) {
                        ba2 = ba4.g;
                    } else {
                        i2++;
                    }
                }
                ba3 = ba2;
                f2 = f;
                i2++;
            } else {
                return;
            }
        }
        if (C1350ha.e() != null) {
            C1381ia e = C1350ha.e();
            e.y++;
        }
        ba.g = ba3;
        ba.h = f2;
        ba.a();
        int i4 = this.xa;
        if (i4 == 0) {
            this.x.d().a(ba3, f2);
        } else if (i4 == 1) {
            this.v.d().a(ba3, f2);
        } else if (i4 == 2) {
            this.y.d().a(ba3, f2);
        } else if (i4 == 3) {
            this.w.d().a(ba3, f2);
        }
    }

    public void a(int i) {
        C0192Ba ba;
        C0198Da da;
        C1716ta taVar = this.G;
        if (taVar != null && ((C1746ua) taVar).t(2)) {
            int i2 = this.xa;
            if (i2 == 0) {
                ba = this.v.d();
            } else if (i2 == 1) {
                ba = this.x.d();
            } else if (i2 == 2) {
                ba = this.w.d();
            } else if (i2 == 3) {
                ba = this.y.d();
            } else {
                return;
            }
            ba.b(5);
            int i3 = this.xa;
            if (i3 == 0 || i3 == 1) {
                this.w.d().a((C0192Ba) null, 0.0f);
                this.y.d().a((C0192Ba) null, 0.0f);
            } else {
                this.v.d().a((C0192Ba) null, 0.0f);
                this.x.d().a((C0192Ba) null, 0.0f);
            }
            this.ya.clear();
            for (int i4 = 0; i4 < this.wa; i4++) {
                C1716ta taVar2 = this.va[i4];
                if (this.za || taVar2.a()) {
                    int i5 = this.xa;
                    if (i5 == 0) {
                        da = taVar2.v.d();
                    } else if (i5 == 1) {
                        da = taVar2.x.d();
                    } else if (i5 == 2) {
                        da = taVar2.w.d();
                    } else if (i5 != 3) {
                        da = null;
                    } else {
                        da = taVar2.y.d();
                    }
                    if (da != null) {
                        this.ya.add(da);
                        da.a(ba);
                    }
                }
            }
        }
    }

    public boolean a() {
        return true;
    }

    public void c(boolean z) {
        this.za = z;
    }

    public void t(int i) {
        this.xa = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r1 = true;
     */
    public void a(C1350ha haVar) {
        C1656ra[] raVarArr;
        boolean z;
        C1656ra[] raVarArr2 = this.D;
        raVarArr2[0] = this.v;
        raVarArr2[2] = this.w;
        raVarArr2[1] = this.x;
        raVarArr2[3] = this.y;
        int i = 0;
        while (true) {
            raVarArr = this.D;
            if (i >= raVarArr.length) {
                break;
            }
            raVarArr[i].j = haVar.a((Object) raVarArr[i]);
            i++;
        }
        int i2 = this.xa;
        if (i2 >= 0 && i2 < 4) {
            C1656ra raVar = raVarArr[i2];
            int i3 = 0;
            while (true) {
                if (i3 >= this.wa) {
                    z = false;
                    break;
                }
                C1716ta taVar = this.va[i3];
                if (this.za || taVar.a()) {
                    int i4 = this.xa;
                    if ((i4 != 0 && i4 != 1) || taVar.j() != a.MATCH_CONSTRAINT) {
                        int i5 = this.xa;
                        if ((i5 == 2 || i5 == 3) && taVar.q() == a.MATCH_CONSTRAINT) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            int i6 = this.xa;
            if (i6 == 0 || i6 == 1 ? k().j() == a.WRAP_CONTENT : k().q() == a.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.wa; i7++) {
                C1716ta taVar2 = this.va[i7];
                if (this.za || taVar2.a()) {
                    C1473la a = haVar.a((Object) taVar2.D[this.xa]);
                    C1656ra[] raVarArr3 = taVar2.D;
                    int i8 = this.xa;
                    raVarArr3[i8].j = a;
                    if (i8 == 0 || i8 == 2) {
                        haVar.b(raVar.j, a, z);
                    } else {
                        haVar.a(raVar.j, a, z);
                    }
                }
            }
            int i9 = this.xa;
            if (i9 == 0) {
                haVar.a(this.x.j, this.v.j, 0, 6);
                if (!z) {
                    haVar.a(this.v.j, this.G.x.j, 0, 5);
                }
            } else if (i9 == 1) {
                haVar.a(this.v.j, this.x.j, 0, 6);
                if (!z) {
                    haVar.a(this.v.j, this.G.v.j, 0, 5);
                }
            } else if (i9 == 2) {
                haVar.a(this.y.j, this.w.j, 0, 6);
                if (!z) {
                    haVar.a(this.w.j, this.G.y.j, 0, 5);
                }
            } else if (i9 == 3) {
                haVar.a(this.w.j, this.y.j, 0, 6);
                if (!z) {
                    haVar.a(this.w.j, this.G.w.j, 0, 5);
                }
            }
        }
    }
}
