package androidx.mediarouter.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.appcompat.widget.va;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.FragmentActivity;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import androidx.mediarouter.media.h.e;

public class MediaRouteButton extends View {
    static final SparseArray<ConstantState> a = new SparseArray<>(2);
    private static final int[] b = {16842912};
    private static final int[] c = {16842911};
    private final h d;
    private final a e;
    private g f;
    private B g;
    private boolean h;
    b i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private ColorStateList m;
    private int n;
    private int o;

    private final class a extends androidx.mediarouter.media.h.a {
        a() {
        }

        public void a(h hVar, h.g gVar) {
            MediaRouteButton.this.a();
        }

        public void b(h hVar, h.g gVar) {
            MediaRouteButton.this.a();
        }

        public void c(h hVar, e eVar) {
            MediaRouteButton.this.a();
        }

        public void d(h hVar, h.g gVar) {
            MediaRouteButton.this.a();
        }

        public void e(h hVar, h.g gVar) {
            MediaRouteButton.this.a();
        }

        public void f(h hVar, h.g gVar) {
            MediaRouteButton.this.a();
        }

        public void a(h hVar, e eVar) {
            MediaRouteButton.this.a();
        }

        public void b(h hVar, e eVar) {
            MediaRouteButton.this.a();
        }
    }

    private final class b extends AsyncTask<Void, Void, Drawable> {
        private final int a;

        b(int i) {
            this.a = i;
        }

        private void c(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.a.put(this.a, drawable.getConstantState());
            }
            MediaRouteButton.this.i = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            return MediaRouteButton.this.getContext().getResources().getDrawable(this.a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Drawable drawable) {
            c(drawable);
            MediaRouteButton.this.setRemoteIndicatorDrawable(drawable);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onCancelled(Drawable drawable) {
            c(drawable);
        }
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    private void c() {
        int i2;
        if (this.l) {
            i2 = C1869yd.mr_cast_button_connecting;
        } else if (this.k) {
            i2 = C1869yd.mr_cast_button_connected;
        } else {
            i2 = C1869yd.mr_cast_button_disconnected;
        }
        setContentDescription(getContext().getString(i2));
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private C0370l getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).getSupportFragmentManager();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        h.g e2 = this.d.e();
        boolean z = false;
        boolean z2 = !e2.t() && e2.a(this.f);
        boolean z3 = z2 && e2.r();
        if (this.k != z2) {
            this.k = z2;
            z = true;
        }
        if (this.l != z3) {
            this.l = z3;
            z = true;
        }
        if (z) {
            c();
            refreshDrawableState();
        }
        if (this.h) {
            setEnabled(this.d.a(this.f, 1));
        }
        Drawable drawable = this.j;
        if (drawable != null && (drawable.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.j.getCurrent();
            if (this.h) {
                if ((z || z3) && !animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            } else if (z2 && !z3) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    public boolean b() {
        if (!this.h) {
            return false;
        }
        C0370l fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            h.g e2 = this.d.e();
            String str = "MediaRouteButton";
            if (e2.t() || !e2.a(this.f)) {
                String str2 = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
                if (fragmentManager.a(str2) != null) {
                    Log.w(str, "showDialog(): Route chooser dialog already showing!");
                    return false;
                }
                h b2 = this.g.b();
                b2.a(this.f);
                b2.show(fragmentManager, str2);
            } else {
                String str3 = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
                if (fragmentManager.a(str3) != null) {
                    Log.w(str, "showDialog(): Route controller dialog already showing!");
                    return false;
                }
                w c2 = this.g.c();
                c2.a(this.f);
                c2.show(fragmentManager, str3);
            }
            return true;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.j != null) {
            this.j.setState(getDrawableState());
            invalidate();
        }
    }

    public B getDialogFactory() {
        return this.g;
    }

    public g getRouteSelector() {
        return this.f;
    }

    public void jumpDrawablesToCurrentState() {
        if (getBackground() != null) {
            androidx.core.graphics.drawable.a.g(getBackground());
        }
        Drawable drawable = this.j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = true;
        if (!this.f.d()) {
            this.d.a(this.f, (androidx.mediarouter.media.h.a) this.e);
        }
        a();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.l) {
            View.mergeDrawableStates(onCreateDrawableState, c);
        } else if (this.k) {
            View.mergeDrawableStates(onCreateDrawableState, b);
        }
        return onCreateDrawableState;
    }

    public void onDetachedFromWindow() {
        this.h = false;
        if (!this.f.d()) {
            this.d.a((androidx.mediarouter.media.h.a) this.e);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.j != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.j.getIntrinsicWidth();
            int intrinsicHeight = this.j.getIntrinsicHeight();
            int i2 = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i3 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.j.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.j.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i3);
        int mode = MeasureSpec.getMode(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int i4 = this.n;
        Drawable drawable = this.j;
        int i5 = 0;
        int max = Math.max(i4, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i6 = this.o;
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            i5 = drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
        }
        int max2 = Math.max(i6, i5);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        if (b() || performClick) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void setCheatSheetEnabled(boolean z) {
        va.a(this, z ? getContext().getString(C1869yd.mr_button_content_description) : null);
    }

    public void setDialogFactory(B b2) {
        if (b2 != null) {
            this.g = b2;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        b bVar = this.i;
        if (bVar != null) {
            bVar.cancel(false);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.j);
        }
        if (drawable != null) {
            if (this.m != null) {
                drawable = androidx.core.graphics.drawable.a.i(drawable.mutate());
                androidx.core.graphics.drawable.a.a(drawable, this.m);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.j = drawable;
        refreshDrawableState();
        if (this.h) {
            Drawable drawable3 = this.j;
            if (drawable3 != null && (drawable3.getCurrent() instanceof AnimationDrawable)) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.j.getCurrent();
                if (this.l) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (this.k) {
                    if (animationDrawable.isRunning()) {
                        animationDrawable.stop();
                    }
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
        }
    }

    public void setRouteSelector(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f.equals(gVar)) {
            if (this.h) {
                if (!this.f.d()) {
                    this.d.a((androidx.mediarouter.media.h.a) this.e);
                }
                if (!gVar.d()) {
                    this.d.a(gVar, (androidx.mediarouter.media.h.a) this.e);
                }
            }
            this.f = gVar;
            a();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.j;
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1659rd.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i2) {
        super(E.a(context), attributeSet, i2);
        this.f = g.a;
        this.g = B.a();
        Context context2 = getContext();
        this.d = h.a(context2);
        this.e = new a();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Ad.MediaRouteButton, i2, 0);
        this.m = obtainStyledAttributes.getColorStateList(Ad.MediaRouteButton_mediaRouteButtonTint);
        this.n = obtainStyledAttributes.getDimensionPixelSize(Ad.MediaRouteButton_android_minWidth, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(Ad.MediaRouteButton_android_minHeight, 0);
        int resourceId = obtainStyledAttributes.getResourceId(Ad.MediaRouteButton_externalRouteEnabledDrawable, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            ConstantState constantState = (ConstantState) a.get(resourceId);
            if (constantState != null) {
                setRemoteIndicatorDrawable(constantState.newDrawable());
            } else {
                this.i = new b(resourceId);
                this.i.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }
        c();
        setClickable(true);
    }
}
