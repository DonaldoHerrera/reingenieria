package defpackage;

/* renamed from: qG reason: default package and case insensitive filesystem */
/* compiled from: Mode */
public enum C3209qG {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    private final int[] l;
    private final int m;

    private C3209qG(int[] iArr, int i) {
        this.l = iArr;
        this.m = i;
    }

    public int a(C3229rG rGVar) {
        int c = rGVar.c();
        char c2 = c <= 9 ? 0 : c <= 26 ? (char) 1 : 2;
        return this.l[c2];
    }

    public int a() {
        return this.m;
    }
}
