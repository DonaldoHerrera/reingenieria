package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.ia.g;

/* renamed from: kIa reason: default package and case insensitive filesystem */
/* compiled from: ViewUtils */
public final class C6768kIa {
    private C6768kIa() {
    }

    public static void b(View view) {
        a(view, g.default_touch_extension);
    }

    /* access modifiers changed from: private */
    public static Iterable<View> c(ViewGroup viewGroup) {
        return new C6564hIa(viewGroup);
    }

    static /* synthetic */ void d(View view) {
        view.clearAnimation();
        view.setVisibility(8);
    }

    static /* synthetic */ void e(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    public static void f(View view) {
        g(view);
        view.setClickable(false);
    }

    private static void g(View view) {
        ((View) view.getParent()).setTouchDelegate(null);
    }

    public static int a(Context context, int i) {
        return a(context.getResources(), i);
    }

    public static Iterable<View> b(ViewGroup viewGroup) {
        return new C6700jIa(viewGroup);
    }

    public static FragmentActivity c(View view) {
        return a(view.getContext());
    }

    public static int a(Resources resources, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }

    public static void b(Iterable<View> iterable) {
        a(iterable, (C7733yKa<View>) C4986IGa.a);
    }

    public static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), (int) ((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), (int) ((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), (int) ((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }

    public static void a(View view, OnClickListener onClickListener) {
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        b(view);
    }

    public static void a(View view, int i) {
        View view2 = (View) view.getParent();
        view2.post(new C5017JGa(view, view.getContext().getResources().getDimensionPixelSize(i), view2));
    }

    static /* synthetic */ void a(View view, int i, View view2) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.left -= i;
        rect.right += i;
        rect.bottom += i;
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }

    public static float a(View view) {
        if (view != null) {
            Rect rect = new Rect();
            int width = view.getWidth() * view.getHeight();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            if (width > 0 && globalVisibleRect) {
                return (((float) (rect.width() * rect.height())) / ((float) width)) * 100.0f;
            }
        }
        return 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    public static FragmentActivity a(Context context) {
        boolean z;
        while (true) {
            z = context instanceof FragmentActivity;
            if (!z && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            } else if (!z) {
                return (FragmentActivity) context;
            } else {
                throw new IllegalStateException("Could not get FragmentActivity from view Context");
            }
        }
        if (!z) {
        }
    }

    public static void a(Iterable<View> iterable) {
        a(iterable, (C7733yKa<View>) C5049KGa.a);
    }

    public static float a(int i, float f, C7664xKa<Float, Float> xka) {
        float f2;
        float f3 = ((float) i) + f;
        float floatValue = ((Float) xka.a()).floatValue() * f;
        float floatValue2 = (((Float) xka.b()).floatValue() - ((Float) xka.a()).floatValue()) * f;
        float f4 = floatValue + floatValue2;
        if (((Float) xka.b()).floatValue() > ((Float) xka.a()).floatValue()) {
            f2 = Math.min(f4, Math.max(f3, floatValue));
        } else {
            f2 = Math.max(f4, Math.min(f3, floatValue));
        }
        return 1.0f - (Math.abs(f2 - floatValue) / Math.abs(floatValue2));
    }

    public static void a(Iterable<View> iterable, C7733yKa<View> yka) {
        for (View accept : iterable) {
            yka.accept(accept);
        }
    }
}
