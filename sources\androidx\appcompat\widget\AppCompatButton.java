package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.l;

public class AppCompatButton extends Button implements C1629qc, b {
    private final C0348o a;
    private final A b;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0348o oVar = this.a;
        if (oVar != null) {
            oVar.a();
        }
        A a2 = this.b;
        if (a2 != null) {
            a2.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        A a2 = this.b;
        if (a2 != null) {
            return a2.c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        A a2 = this.b;
        if (a2 != null) {
            return a2.d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        A a2 = this.b;
        if (a2 != null) {
            return a2.e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        A a2 = this.b;
        if (a2 != null) {
            return a2.f();
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        int i = 0;
        if (b.a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        }
        A a2 = this.b;
        if (a2 != null) {
            return a2.g();
        }
        return 0;
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

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A a2 = this.b;
        if (a2 != null) {
            a2.a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A a2 = this.b;
        if (a2 != null && !b.a && a2.h()) {
            this.b.b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        A a2 = this.b;
        if (a2 != null) {
            a2.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        A a2 = this.b;
        if (a2 != null) {
            a2.a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        A a2 = this.b;
        if (a2 != null) {
            a2.a(i);
        }
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

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(l.a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        A a2 = this.b;
        if (a2 != null) {
            a2.a(z);
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

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        A a2 = this.b;
        if (a2 != null) {
            a2.a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (b.a) {
            super.setTextSize(i, f);
            return;
        }
        A a2 = this.b;
        if (a2 != null) {
            a2.a(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0294a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(ka.a(context), attributeSet, i);
        this.a = new C0348o(this);
        this.a.a(attributeSet, i);
        this.b = new A(this);
        this.b.a(attributeSet, i);
        this.b.a();
    }
}
