package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.common.base.Function;
import com.soundcloud.android.view.ParallaxImageView;
import java.util.Collections;

/* renamed from: aJa reason: default package and case insensitive filesystem */
/* compiled from: RecyclerViewParallaxer */
public class C5561aJa extends m {
    static /* synthetic */ boolean b(View view) {
        return view instanceof ParallaxImageView;
    }

    static /* synthetic */ ParallaxImageView c(View view) {
        return (ParallaxImageView) view;
    }

    private Iterable<View> d(View view) {
        if (view instanceof ViewGroup) {
            return C1943BD.b(C6768kIa.b((ViewGroup) view), C5051KIa.a);
        }
        return Collections.emptyList();
    }

    private Iterable<ParallaxImageView> e(View view) {
        if (view instanceof ViewGroup) {
            return C1943BD.a(C1943BD.b(C6768kIa.b((ViewGroup) view), C4988IIa.a), (Function<? super F, ? extends T>) C5019JIa.a);
        }
        return Collections.emptyList();
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        int height = recyclerView.getHeight() / 2;
        float f = recyclerView.getResources().getDisplayMetrics().density * -10.0f;
        if (height > 0) {
            for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
                a(height, f, recyclerView.getChildAt(i3));
            }
        }
    }

    private void a(int i, float f, View view) {
        if (view instanceof ViewGroup) {
            for (View view2 : d(view)) {
                view2.setTranslationY((float) ((int) (a(i, view, view2) * ((double) f))));
            }
            for (ParallaxImageView parallaxImageView : e(view)) {
                parallaxImageView.setParallaxOffset(a(i, view, (View) parallaxImageView));
            }
        }
    }

    private double a(int i, View view, View view2) {
        return ((double) ((view.getTop() + ((view2.getTop() + view2.getBottom()) / 2)) - i)) / ((double) i);
    }
}
