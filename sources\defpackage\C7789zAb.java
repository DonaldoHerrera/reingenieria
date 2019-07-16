package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: zAb reason: default package and case insensitive filesystem */
/* compiled from: Options */
public final class C7789zAb extends AbstractList<C7030oAb> implements RandomAccess {
    final C7030oAb[] a;
    final int[] b;

    private C7789zAb(C7030oAb[] oabArr, int[] iArr) {
        this.a = oabArr;
        this.b = iArr;
    }

    public static C7789zAb a(C7030oAb... oabArr) {
        if (oabArr.length == 0) {
            return new C7789zAb(new C7030oAb[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(oabArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(Integer.valueOf(-1));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, oabArr[i2]), Integer.valueOf(i2));
        }
        if (((C7030oAb) arrayList.get(0)).f() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                C7030oAb oab = (C7030oAb) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    C7030oAb oab2 = (C7030oAb) arrayList.get(i5);
                    if (!oab2.b(oab)) {
                        continue;
                        break;
                    } else if (oab2.f() == oab.f()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("duplicate option: ");
                        sb.append(oab2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            C6825lAb lab = new C6825lAb();
            a(0, lab, 0, arrayList, 0, arrayList.size(), arrayList2);
            int[] iArr = new int[a(lab)];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                iArr[i6] = lab.readInt();
            }
            if (lab.p()) {
                return new C7789zAb((C7030oAb[]) oabArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public final int size() {
        return this.a.length;
    }

    public C7030oAb get(int i) {
        return this.a[i];
    }

    private static void a(long j, C6825lAb lab, int i, List<C7030oAb> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        C6825lAb lab2;
        int i6;
        C6825lAb lab3 = lab;
        int i7 = i;
        List<C7030oAb> list3 = list;
        int i8 = i2;
        int i9 = i3;
        List<Integer> list4 = list2;
        if (i8 < i9) {
            int i10 = i8;
            while (i10 < i9) {
                if (((C7030oAb) list3.get(i10)).f() >= i7) {
                    i10++;
                } else {
                    throw new AssertionError();
                }
            }
            C7030oAb oab = (C7030oAb) list.get(i2);
            C7030oAb oab2 = (C7030oAb) list3.get(i9 - 1);
            int i11 = -1;
            if (i7 == oab.f()) {
                i11 = ((Integer) list4.get(i8)).intValue();
                i8++;
                oab = (C7030oAb) list3.get(i8);
            }
            int i12 = i8;
            if (oab.a(i7) != oab2.a(i7)) {
                int i13 = 1;
                for (int i14 = i12 + 1; i14 < i9; i14++) {
                    if (((C7030oAb) list3.get(i14 - 1)).a(i7) != ((C7030oAb) list3.get(i14)).a(i7)) {
                        i13++;
                    }
                }
                long a2 = j + ((long) a(lab)) + 2 + ((long) (i13 * 2));
                lab3.writeInt(i13);
                lab3.writeInt(i11);
                for (int i15 = i12; i15 < i9; i15++) {
                    byte a3 = ((C7030oAb) list3.get(i15)).a(i7);
                    if (i15 == i12 || a3 != ((C7030oAb) list3.get(i15 - 1)).a(i7)) {
                        lab3.writeInt((int) a3 & 255);
                    }
                }
                C6825lAb lab4 = new C6825lAb();
                int i16 = i12;
                while (i16 < i9) {
                    byte a4 = ((C7030oAb) list3.get(i16)).a(i7);
                    int i17 = i16 + 1;
                    int i18 = i17;
                    while (true) {
                        if (i18 >= i9) {
                            i5 = i9;
                            break;
                        } else if (a4 != ((C7030oAb) list3.get(i18)).a(i7)) {
                            i5 = i18;
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i17 == i5 && i7 + 1 == ((C7030oAb) list3.get(i16)).f()) {
                        lab3.writeInt(((Integer) list4.get(i16)).intValue());
                        i6 = i5;
                        lab2 = lab4;
                    } else {
                        lab3.writeInt((int) ((((long) a(lab4)) + a2) * -1));
                        i6 = i5;
                        lab2 = lab4;
                        a(a2, lab4, i7 + 1, list, i16, i5, list2);
                    }
                    lab4 = lab2;
                    i16 = i6;
                }
                C6825lAb lab5 = lab4;
                lab3.a(lab5, lab5.size());
                return;
            }
            int min = Math.min(oab.f(), oab2.f());
            int i19 = i7;
            int i20 = 0;
            while (i19 < min && oab.a(i19) == oab2.a(i19)) {
                i20++;
                i19++;
            }
            long a5 = 1 + j + ((long) a(lab)) + 2 + ((long) i20);
            lab3.writeInt(-i20);
            lab3.writeInt(i11);
            int i21 = i7;
            while (true) {
                i4 = i7 + i20;
                if (i21 >= i4) {
                    break;
                }
                lab3.writeInt((int) oab.a(i21) & 255);
                i21++;
            }
            if (i12 + 1 != i9) {
                C6825lAb lab6 = new C6825lAb();
                lab3.writeInt((int) ((((long) a(lab6)) + a5) * -1));
                a(a5, lab6, i4, list, i12, i3, list2);
                lab3.a(lab6, lab6.size());
            } else if (i4 == ((C7030oAb) list3.get(i12)).f()) {
                lab3.writeInt(((Integer) list4.get(i12)).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    private static int a(C6825lAb lab) {
        return (int) (lab.size() / 4);
    }
}
