package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

/* renamed from: q reason: default package and case insensitive filesystem */
/* compiled from: StateListDrawable */
class C1623q extends C1561o {
    private a n;
    private boolean o;

    /* renamed from: q$a */
    /* compiled from: StateListDrawable */
    static class a extends b {
        int[][] J;

        a(a aVar, C1623q qVar, Resources resources) {
            super(aVar, qVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[c()][];
            }
        }

        /* access modifiers changed from: 0000 */
        public int a(int[] iArr, Drawable drawable) {
            int a = a(drawable);
            this.J[a] = iArr;
            return a;
        }

        /* access modifiers changed from: 0000 */
        public void m() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public Drawable newDrawable() {
            return new C1623q(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1623q(this, resources);
        }

        /* access modifiers changed from: 0000 */
        public int a(int[] iArr) {
            int[][] iArr2 = this.J;
            int d = d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public void a(int i, int i2) {
            super.a(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.J, 0, iArr, 0, i);
            this.J = iArr;
        }
    }

    C1623q(a aVar, Resources resources) {
        a((b) new a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.o) {
            super.mutate();
            if (this == this) {
                this.n.m();
                this.o = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int a2 = this.n.a(iArr);
        if (a2 < 0) {
            a2 = this.n.a(StateSet.WILD_CARD);
        }
        return a(a2) || onStateChange;
    }

    /* access modifiers changed from: 0000 */
    public int[] a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    C1623q(a aVar) {
        if (aVar != null) {
            a((b) aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public a a() {
        return new a(this.n, this, null);
    }

    /* access modifiers changed from: protected */
    public void a(b bVar) {
        super.a(bVar);
        if (bVar instanceof a) {
            this.n = (a) bVar;
        }
    }
}
