package defpackage;

/* renamed from: Tu reason: default package */
abstract class Tu extends Eu<String> {
    final CharSequence c;
    private final Fu d;
    private final boolean e;
    private int f = 0;
    private int g;

    protected Tu(Ou ou, CharSequence charSequence) {
        this.d = ou.a;
        this.e = false;
        this.g = ou.d;
        this.c = charSequence;
    }

    /* access modifiers changed from: 0000 */
    public abstract int a(int i);

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a() {
        int i;
        int i2 = this.f;
        while (true) {
            int i3 = this.f;
            if (i3 != -1) {
                int a = a(i3);
                if (a == -1) {
                    a = this.c.length();
                    this.f = -1;
                } else {
                    this.f = b(a);
                }
                int i4 = this.f;
                if (i4 == i2) {
                    this.f = i4 + 1;
                    if (this.f > this.c.length()) {
                        this.f = -1;
                    }
                } else {
                    while (i2 < a && this.d.b(this.c.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.d.b(this.c.charAt(i - 1))) {
                        a = i - 1;
                    }
                    if (!this.e || i2 != i) {
                        int i5 = this.g;
                    } else {
                        i2 = this.f;
                    }
                }
            } else {
                b();
                return null;
            }
        }
        int i52 = this.g;
        if (i52 == 1) {
            i = this.c.length();
            this.f = -1;
            while (i > i2 && this.d.b(this.c.charAt(i - 1))) {
                i--;
            }
        } else {
            this.g = i52 - 1;
        }
        return this.c.subSequence(i2, i).toString();
    }

    /* access modifiers changed from: 0000 */
    public abstract int b(int i);
}
