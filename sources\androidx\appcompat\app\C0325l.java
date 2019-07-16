package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: androidx.appcompat.app.l reason: case insensitive filesystem */
/* compiled from: AlertDialog */
public class C0325l extends A implements DialogInterface {
    final AlertController c = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.l$a */
    /* compiled from: AlertDialog */
    public static class a {
        private final androidx.appcompat.app.AlertController.a a;
        private final int b;

        public a(Context context) {
            this(context, C0325l.a(context, 0));
        }

        public a a(View view) {
            this.a.g = view;
            return this;
        }

        public Context b() {
            return this.a.a;
        }

        public a c(int i) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.f = aVar.a.getText(i);
            return this;
        }

        public a(Context context, int i) {
            this.a = new androidx.appcompat.app.AlertController.a(new ContextThemeWrapper(context, C0325l.a(context, i)));
            this.b = i;
        }

        public a a(CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public a b(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public a c(int i, OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.i = aVar.a.getText(i);
            this.a.k = onClickListener;
            return this;
        }

        public a a(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public a b(int i) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.h = aVar.a.getText(i);
            return this;
        }

        public a a(int i) {
            TypedValue typedValue = new TypedValue();
            this.a.a.getTheme().resolveAttribute(i, typedValue, true);
            this.a.c = typedValue.resourceId;
            return this;
        }

        public a b(int i, OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.o = aVar.a.getText(i);
            this.a.q = onClickListener;
            return this;
        }

        public a c(CharSequence charSequence, OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.i = charSequence;
            aVar.k = onClickListener;
            return this;
        }

        public a b(CharSequence charSequence, OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.o = charSequence;
            aVar.q = onClickListener;
            return this;
        }

        public C0325l c() {
            C0325l a2 = a();
            a2.show();
            return a2;
        }

        public a a(int i, OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.l = aVar.a.getText(i);
            this.a.n = onClickListener;
            return this;
        }

        public a b(View view) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.z = view;
            aVar.y = 0;
            aVar.E = false;
            return this;
        }

        public a a(CharSequence charSequence, OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.l = charSequence;
            aVar.n = onClickListener;
            return this;
        }

        public a a(boolean z) {
            this.a.r = z;
            return this;
        }

        public a a(OnCancelListener onCancelListener) {
            this.a.s = onCancelListener;
            return this;
        }

        public a a(OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a a(ListAdapter listAdapter, OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.w = listAdapter;
            aVar.x = onClickListener;
            return this;
        }

        public a a(CharSequence[] charSequenceArr, boolean[] zArr, OnMultiChoiceClickListener onMultiChoiceClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.v = charSequenceArr;
            aVar.J = onMultiChoiceClickListener;
            aVar.F = zArr;
            aVar.G = true;
            return this;
        }

        public a a(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.v = charSequenceArr;
            aVar.x = onClickListener;
            aVar.I = i;
            aVar.H = true;
            return this;
        }

        public C0325l a() {
            C0325l lVar = new C0325l(this.a.a, this.b);
            this.a.a(lVar.c);
            lVar.setCancelable(this.a.r);
            if (this.a.r) {
                lVar.setCanceledOnTouchOutside(true);
            }
            lVar.setOnCancelListener(this.a.s);
            lVar.setOnDismissListener(this.a.t);
            OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                lVar.setOnKeyListener(onKeyListener);
            }
            return lVar;
        }
    }

    protected C0325l(Context context, int i) {
        super(context, a(context, i));
    }

    static int a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0294a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.c.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.c.b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.c.b(charSequence);
    }
}
