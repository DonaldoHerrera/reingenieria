package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: Jz reason: default package */
/* compiled from: ImageMatrixProperty */
public class Jz extends Property<ImageView, Matrix> {
    private final Matrix a = new Matrix();

    public Jz() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.a.set(imageView.getImageMatrix());
        return this.a;
    }
}
