package com.mattprecious.telescope;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TelescopeLayout extends FrameLayout {
    /* access modifiers changed from: private */
    public static final SimpleDateFormat a = new SimpleDateFormat("'telescope'-yyyy-MM-dd-HHmmss.'png'", Locale.US);
    private static Handler b;
    /* access modifiers changed from: private */
    public final MediaProjectionManager c;
    /* access modifiers changed from: private */
    public final WindowManager d;
    private final Vibrator e;
    private final Handler f;
    private final Runnable g;
    private final IntentFilter h;
    private final BroadcastReceiver i;
    private final float j;
    private final Paint k;
    private final ValueAnimator l;
    private final ValueAnimator m;
    private final ValueAnimator n;
    /* access modifiers changed from: private */
    public c o;
    private View p;
    private int q;
    private f r;
    private boolean s;
    private boolean t;
    /* access modifiers changed from: private */
    public float u;
    /* access modifiers changed from: private */
    public float v;
    private boolean w;
    private boolean x;
    /* access modifiers changed from: private */
    public boolean y;

    private class a extends AsyncTask<Void, Void, File> {
        private final Context a;
        private final Bitmap b;

        a(Bitmap bitmap) {
            this.a = TelescopeLayout.this.getContext();
            this.b = bitmap;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public File doInBackground(Void... voidArr) {
            if (this.b == null) {
                return null;
            }
            try {
                File a2 = TelescopeLayout.c(this.a);
                a2.mkdirs();
                File file = new File(a2, TelescopeLayout.a.format(new Date()));
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                this.b.compress(CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return file;
            } catch (IOException unused) {
                Log.e("Telescope", "Failed to save screenshot. Is the WRITE_EXTERNAL_STORAGE permission requested?");
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            TelescopeLayout.this.y = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(File file) {
            TelescopeLayout.this.y = false;
            TelescopeLayout.this.g();
            TelescopeLayout.this.o.a(file);
        }
    }

    public TelescopeLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    public static Handler getBackgroundHandler() {
        if (b == null) {
            HandlerThread handlerThread = new HandlerThread("telescope", 10);
            handlerThread.start();
            b = new Handler(handlerThread.getLooper());
        }
        return b;
    }

    /* access modifiers changed from: private */
    public View getTargetView() {
        View view = this.p;
        if (!this.s) {
            while (view.getRootView() != view) {
                view = view.getRootView();
            }
        }
        return view;
    }

    private void j() {
        this.w = false;
    }

    /* access modifiers changed from: private */
    public void k() {
        j();
        if (this.t && d(getContext())) {
            this.e.vibrate(50);
        }
        int i2 = s.a[this.r.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    new a(null).execute(new Void[0]);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown screenshot mode: ");
                sb.append(this.r);
                throw new IllegalStateException(sb.toString());
            }
        } else if (this.c != null && !this.s && this.p == this && !m()) {
            h();
            getContext().startActivity(new Intent(getContext(), RequestCaptureActivity.class));
            return;
        }
        d();
    }

    /* access modifiers changed from: private */
    public void l() {
        getContext().unregisterReceiver(this.i);
    }

    private boolean m() {
        boolean z;
        Context context = getContext();
        while (true) {
            z = context instanceof Activity;
            if (!z && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (!z || (((Activity) context).getWindow().getAttributes().flags & 8192) != 0) {
            return true;
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (!this.x) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f2 = this.u;
            if (f2 > 0.0f) {
                float f3 = this.j;
                float f4 = (float) measuredWidth;
                canvas.drawLine(0.0f, f3, f4 * f2, f3, this.k);
                float f5 = this.j;
                float f6 = f4 - f5;
                float f7 = f4 - f5;
                float f8 = (float) measuredHeight;
                canvas.drawLine(f6, 0.0f, f7, f8 * this.u, this.k);
                float f9 = this.j;
                canvas.drawLine(f4, f8 - f9, f4 - (this.u * f4), f8 - f9, this.k);
                float f10 = this.j;
                canvas.drawLine(f10, f8, f10, f8 - (this.u * f8), this.k);
            }
            float f11 = this.v;
            if (f11 < 1.0f) {
                float f12 = (float) measuredWidth;
                float f13 = f12 * f11;
                float f14 = this.j;
                canvas.drawLine(f13, f14, f12, f14, this.k);
                float f15 = this.j;
                float f16 = (float) measuredHeight;
                Canvas canvas2 = canvas;
                canvas2.drawLine(f12 - f15, f16 * this.v, f12 - f15, f16, this.k);
                float f17 = f12 - (this.v * f12);
                float f18 = this.j;
                canvas2.drawLine(f17, f16 - f18, 0.0f, f16 - f18, this.k);
                float f19 = this.j;
                canvas.drawLine(f19, f16 - (this.v * f16), f19, 0.0f, this.k);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.x || this.y) {
            return true;
        }
        if (motionEvent.getActionMasked() != 5 || motionEvent.getPointerCount() != this.q) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        i();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        if (r0 != 6) goto L_0x0043;
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (!this.x && !this.y) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 5) {
                                if (motionEvent.getPointerCount() == this.q) {
                                    if (!this.w) {
                                        i();
                                    }
                                    return true;
                                }
                                c();
                            }
                        }
                    } else if (this.w) {
                        invalidate();
                        return true;
                    }
                    return super.onTouchEvent(motionEvent);
                }
                if (this.w) {
                    c();
                }
                return false;
            } else if (!this.w && motionEvent.getPointerCount() == this.q) {
                i();
            }
        }
        return true;
    }

    public void setLens(c cVar) {
        d.a(cVar, "lens == null");
        this.o = cVar;
    }

    public void setPointerCount(int i2) {
        if (i2 >= 1) {
            this.q = i2;
            return;
        }
        throw new IllegalArgumentException("pointerCount < 1");
    }

    public void setProgressColor(int i2) {
        this.k.setColor(i2);
    }

    public void setScreenshotChildrenOnly(boolean z) {
        this.s = z;
    }

    public void setScreenshotMode(f fVar) {
        d.a(fVar, "screenshotMode == null");
        this.r = fVar;
    }

    public void setScreenshotTarget(View view) {
        d.a(view, "screenshotTarget == null");
        this.p = view;
    }

    public void setVibrate(boolean z) {
        this.t = z;
    }

    public TelescopeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c() {
        j();
        this.l.cancel();
        this.m.setFloatValues(new float[]{this.u, 0.0f});
        this.m.start();
        this.f.removeCallbacks(this.g);
    }

    /* access modifiers changed from: private */
    public void d() {
        f();
        post(new m(this));
    }

    /* access modifiers changed from: private */
    public void e() {
        this.x = false;
        this.n.start();
    }

    private void f() {
        this.l.end();
        this.u = 0.0f;
        this.x = true;
        invalidate();
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.o == null) {
            throw new IllegalStateException("Must call setLens() before capturing a screenshot.");
        }
    }

    private void h() {
        getContext().registerReceiver(this.i, this.h);
    }

    private void i() {
        this.w = true;
        this.l.setFloatValues(new float[]{this.u, 1.0f});
        this.l.start();
        this.f.postDelayed(this.g, 1000);
    }

    public TelescopeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f = new Handler();
        this.g = new g(this);
        setWillNotDraw(false);
        this.p = this;
        float f2 = context.getResources().getDisplayMetrics().density * 4.0f;
        this.j = f2 / 2.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.telescope_TelescopeLayout, i2, 0);
        this.q = obtainStyledAttributes.getInt(e.telescope_TelescopeLayout_telescope_pointerCount, 2);
        int color = obtainStyledAttributes.getColor(e.telescope_TelescopeLayout_telescope_progressColor, -14575885);
        this.r = f.values()[obtainStyledAttributes.getInt(e.telescope_TelescopeLayout_telescope_screenshotMode, f.SYSTEM.ordinal())];
        this.s = obtainStyledAttributes.getBoolean(e.telescope_TelescopeLayout_telescope_screenshotChildrenOnly, false);
        this.t = obtainStyledAttributes.getBoolean(e.telescope_TelescopeLayout_telescope_vibrate, true);
        obtainStyledAttributes.recycle();
        this.k = new Paint(1);
        this.k.setColor(color);
        this.k.setStrokeWidth(f2);
        this.k.setStyle(Style.STROKE);
        h hVar = new h(this);
        this.l = new ValueAnimator();
        this.l.setDuration(1000);
        this.l.addUpdateListener(hVar);
        this.m = new ValueAnimator();
        this.m.setDuration(250);
        this.m.addUpdateListener(hVar);
        this.v = 1.0f;
        this.n = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.n.setDuration(1000);
        this.n.addUpdateListener(new i(this));
        if (isInEditMode()) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.h = null;
            this.i = null;
            return;
        }
        this.d = (WindowManager) context.getSystemService("window");
        this.e = (Vibrator) context.getSystemService("vibrator");
        if (VERSION.SDK_INT < 21) {
            this.c = null;
            this.h = null;
            this.i = null;
        } else {
            this.c = (MediaProjectionManager) context.getSystemService("media_projection");
            this.h = new IntentFilter(RequestCaptureActivity.a(context));
            this.i = new k(this);
        }
    }

    public static void b(Context context) {
        File c2 = c(context);
        if (c2.exists()) {
            a(c2);
        }
    }

    private static boolean d(Context context) {
        return context.checkPermission("android.permission.VIBRATE", Process.myPid(), Process.myUid()) == 0;
    }

    private static void a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File a2 : listFiles) {
                    a(a2);
                }
            }
        }
        file.delete();
    }

    /* access modifiers changed from: private */
    public static File c(Context context) {
        return new File(context.getExternalFilesDir(null), "telescope");
    }

    /* access modifiers changed from: private */
    @TargetApi(21)
    public void a(MediaProjection mediaProjection) {
        f();
        post(new r(this, mediaProjection));
    }
}
