package defpackage;

/* renamed from: YNa reason: default package and case insensitive filesystem */
/* compiled from: Priority */
public enum C5474YNa {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    static <Y> int a(C5702cOa coa, Y y) {
        C5474YNa yNa;
        if (y instanceof C5702cOa) {
            yNa = ((C5702cOa) y).j();
        } else {
            yNa = NORMAL;
        }
        return yNa.ordinal() - coa.j().ordinal();
    }
}
