package defpackage;

/* renamed from: bWa reason: default package and case insensitive filesystem */
/* compiled from: ArraysJVM.kt */
class C5642bWa {
    public static final void a(int i, int i2) {
        if (i > i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("toIndex (");
            sb.append(i);
            sb.append(") is greater than size (");
            sb.append(i2);
            sb.append(").");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }
}
