package defpackage;

/* renamed from: yG reason: default package and case insensitive filesystem */
/* compiled from: QRCode */
public final class C3369yG {
    private C3209qG a;
    private C3190pG b;
    private C3229rG c;
    private int d = -1;
    private C3269tG e;

    public static boolean a(int i) {
        return i >= 0 && i < 8;
    }

    public C3269tG a() {
        return this.e;
    }

    public void b(int i) {
        this.d = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }

    public void a(C3209qG qGVar) {
        this.a = qGVar;
    }

    public void a(C3190pG pGVar) {
        this.b = pGVar;
    }

    public void a(C3229rG rGVar) {
        this.c = rGVar;
    }

    public void a(C3269tG tGVar) {
        this.e = tGVar;
    }
}
