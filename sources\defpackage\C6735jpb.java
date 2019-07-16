package defpackage;

import java.util.Comparator;

/* renamed from: jpb reason: default package and case insensitive filesystem */
/* compiled from: MemberComparator */
public class C6735jpb implements Comparator<C5272Rcb> {
    public static final C6735jpb a = new C6735jpb();

    private C6735jpb() {
    }

    private static int a(C5272Rcb rcb) {
        if (C6531gpb.n(rcb)) {
            return 8;
        }
        if (rcb instanceof C5242Qcb) {
            return 7;
        }
        if (rcb instanceof C7408tdb) {
            return ((C7408tdb) rcb).l() == null ? 6 : 5;
        }
        if (rcb instanceof C5582adb) {
            return ((C5582adb) rcb).l() == null ? 4 : 3;
        }
        if (rcb instanceof C5029Jcb) {
            return 2;
        }
        return rcb instanceof C4874Edb ? 1 : 0;
    }

    private static Integer b(C5272Rcb rcb, C5272Rcb rcb2) {
        int a2 = a(rcb2) - a(rcb);
        if (a2 != 0) {
            return Integer.valueOf(a2);
        }
        if (C6531gpb.n(rcb) && C6531gpb.n(rcb2)) {
            return Integer.valueOf(0);
        }
        int a3 = rcb.getName().compareTo(rcb2.getName());
        if (a3 != 0) {
            return Integer.valueOf(a3);
        }
        return null;
    }

    /* renamed from: a */
    public int compare(C5272Rcb rcb, C5272Rcb rcb2) {
        Integer b = b(rcb, rcb2);
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }
}
