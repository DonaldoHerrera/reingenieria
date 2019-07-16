package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.m;

public class AppCompatRadioButton extends RadioButton implements m {
    private final C0349p a;
    private final A b;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0349p pVar = this.a;
        return pVar != null ? pVar.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0349p pVar = this.a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        C0349p pVar = this.a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0349p pVar = this.a;
        if (pVar != null) {
            pVar.d();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0349p pVar = this.a;
        if (pVar != null) {
            pVar.a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        C0349p pVar = this.a;
        if (pVar != null) {
            pVar.a(mode);
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0294a.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(ka.a(context), attributeSet, i);
        this.a = new C0349p(this);
        this.a.a(attributeSet, i);
        this.b = new A(this);
        this.b.a(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C1437k.b(getContext(), i));
    }
}
