package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dA reason: default package and case insensitive filesystem */
/* compiled from: ShapePath */
public class C1223dA {
    public float a;
    public float b;
    public float c;
    public float d;
    private final List<c> e = new ArrayList();

    /* renamed from: dA$a */
    /* compiled from: ShapePath */
    public static class a extends c {
        private static final RectF b = new RectF();
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;

        public a(float f2, float f3, float f4, float f5) {
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            b.set(this.c, this.d, this.e, this.f);
            path.arcTo(b, this.g, this.h, false);
            path.transform(matrix);
        }
    }

    /* renamed from: dA$b */
    /* compiled from: ShapePath */
    public static class b extends c {
        /* access modifiers changed from: private */
        public float b;
        /* access modifiers changed from: private */
        public float c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* renamed from: dA$c */
    /* compiled from: ShapePath */
    public static abstract class c {
        protected final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public C1223dA() {
        b(0.0f, 0.0f);
    }

    public void a(float f, float f2) {
        b bVar = new b();
        bVar.b = f;
        bVar.c = f2;
        this.e.add(bVar);
        this.c = f;
        this.d = f2;
    }

    public void b(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = f;
        this.d = f2;
        this.e.clear();
    }

    public void a(float f, float f2, float f3, float f4, float f5, float f6) {
        a aVar = new a(f, f2, f3, f4);
        aVar.g = f5;
        aVar.h = f6;
        this.e.add(aVar);
        double d2 = (double) (f5 + f6);
        this.c = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d2))));
        this.d = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d2))));
    }

    public void a(Matrix matrix, Path path) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((c) this.e.get(i)).a(matrix, path);
        }
    }
}
