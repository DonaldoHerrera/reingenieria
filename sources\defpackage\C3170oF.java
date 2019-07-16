package defpackage;

import com.comscore.streaming.ContentType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: oF reason: default package and case insensitive filesystem */
/* compiled from: HighLevelEncoder */
public final class C3170oF {
    static final String[] a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    private static final int[][] c;
    static final int[][] d;
    private final byte[] e;

    static {
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{5, 256});
        c = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            c[0][i] = (i - 65) + 2;
        }
        c[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            c[1][i2] = (i2 - 97) + 2;
        }
        c[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            c[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = c;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            c[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, ContentType.USER_GENERATED_LIVE, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                c[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(int.class, new int[]{6, 6});
        d = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = d;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public C3170oF(byte[] bArr) {
        this.e = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    public C3248sF a() {
        int i;
        Collection singletonList = Collections.singletonList(C3208qF.a);
        int i2 = 0;
        while (true) {
            byte[] bArr = this.e;
            if (i2 >= bArr.length) {
                return ((C3208qF) Collections.min(singletonList, new C3141nF(this))).a(this.e);
            }
            int i3 = i2 + 1;
            byte b2 = i3 < bArr.length ? bArr[i3] : 0;
            byte b3 = this.e[i2];
            if (b3 != 13) {
                if (b3 != 44) {
                    if (b3 != 46) {
                        if (b3 == 58 && b2 == 32) {
                            i = 5;
                            if (i > 0) {
                                singletonList = a((Iterable<C3208qF>) singletonList, i2, i);
                                i2 = i3;
                            } else {
                                singletonList = a(singletonList, i2);
                            }
                            i2++;
                        }
                    } else if (b2 == 32) {
                        i = 3;
                        if (i > 0) {
                        }
                        i2++;
                    }
                } else if (b2 == 32) {
                    i = 4;
                    if (i > 0) {
                    }
                    i2++;
                }
            } else if (b2 == 10) {
                i = 2;
                if (i > 0) {
                }
                i2++;
            }
            i = 0;
            if (i > 0) {
            }
            i2++;
        }
    }

    private Collection<C3208qF> a(Iterable<C3208qF> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (C3208qF a2 : iterable) {
            a(a2, i, (Collection<C3208qF>) linkedList);
        }
        return a(linkedList);
    }

    private void a(C3208qF qFVar, int i, Collection<C3208qF> collection) {
        char c2 = (char) (this.e[i] & 255);
        boolean z = c[qFVar.c()][c2] > 0;
        C3208qF qFVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = c[i2][c2];
            if (i3 > 0) {
                if (qFVar2 == null) {
                    qFVar2 = qFVar.b(i);
                }
                if (!z || i2 == qFVar.c() || i2 == 2) {
                    collection.add(qFVar2.a(i2, i3));
                }
                if (!z && d[qFVar.c()][i2] >= 0) {
                    collection.add(qFVar2.b(i2, i3));
                }
            }
        }
        if (qFVar.a() > 0 || c[qFVar.c()][c2] == 0) {
            collection.add(qFVar.a(i));
        }
    }

    private static Collection<C3208qF> a(Iterable<C3208qF> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C3208qF a2 : iterable) {
            a(a2, i, i2, linkedList);
        }
        return a(linkedList);
    }

    private static void a(C3208qF qFVar, int i, int i2, Collection<C3208qF> collection) {
        C3208qF b2 = qFVar.b(i);
        collection.add(b2.a(4, i2));
        if (qFVar.c() != 4) {
            collection.add(b2.b(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b2.a(2, 16 - i2).a(2, 1));
        }
        if (qFVar.a() > 0) {
            collection.add(qFVar.a(i).a(i + 1));
        }
    }

    private static Collection<C3208qF> a(Iterable<C3208qF> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C3208qF qFVar : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3208qF qFVar2 = (C3208qF) it.next();
                if (qFVar2.a(qFVar)) {
                    z = false;
                    break;
                } else if (qFVar.a(qFVar2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(qFVar);
            }
        }
        return linkedList;
    }
}
