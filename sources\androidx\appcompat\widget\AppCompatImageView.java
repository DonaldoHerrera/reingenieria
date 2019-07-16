package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.n;

public class AppCompatImageView extends ImageView implements C1629qc, n {
    private final C0348o a;
    private final C0351s b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0348o oVar = this.a;
        if (oVar != null) {
            oVar.a();
        }
        C0351s sVar = this.b;
        if (sVar != null) {
            sVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0348o oVar = this.a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0348o oVar = this.a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0351s sVar = this.b;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        C0351s sVar = this.b;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.b.d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0348o oVar = this.a;
        if (oVar != null) {
            oVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0348o oVar = this.a;
        if (oVar != null) {
            oVar.a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0351s sVar = this.b;
        if (sVar != null) {
            sVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0351s sVar = this.b;
        if (sVar != null) {
            sVar.a();
        }
    }

    public void setImageResource(int i) {
        C0351s sVar = this.b;
        if (sVar != null) {
            sVar.a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0351s sVar = this.b;
        if (sVar != null) {
            sVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0348o oVar = this.a;
        if (oVar != null) {
            oVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0348o oVar = this.a;
        if (oVar != null) {
            oVar.a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0351s sVar = this.b;
        if (sVar != null) {
            sVar.a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        C0351s sVar = this.b;
        if (sVar != null) {
            sVar.a(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(ka.a(context), attributeSet, i);
        this.a = new C0348o(this);
        this.a.a(attributeSet, i);
        this.b = new C0351s(this);
        this.b.a(attributeSet, i);
    }
}
