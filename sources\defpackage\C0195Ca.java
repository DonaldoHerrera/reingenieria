package defpackage;

/* renamed from: Ca reason: default package and case insensitive filesystem */
/* compiled from: ResolutionDimension */
public class C0195Ca extends C0198Da {
    float c = 0.0f;

    public void a(int i) {
        if (this.b == 0 || this.c != ((float) i)) {
            this.c = (float) i;
            if (this.b == 1) {
                b();
            }
            a();
        }
    }

    public void d() {
        super.d();
        this.c = 0.0f;
    }

    public void f() {
        this.b = 2;
    }
}
