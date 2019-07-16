package com.soundcloud.android.playback;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: VideoTextureContainer */
class me implements SurfaceTextureListener {
    private final String a;
    private final b b;
    private final com.soundcloud.android.playback.ke.b c;
    private final C3469VY d;
    private WeakReference<View> e;
    private List<WeakReference<View>> f;
    private Surface g;
    private SurfaceTexture h;
    private TextureView i;

    /* compiled from: VideoTextureContainer */
    static class a {
        private final C3469VY a;

        a(C3469VY vy) {
            this.a = vy;
        }

        /* access modifiers changed from: 0000 */
        public me a(String str, com.soundcloud.android.playback.ke.b bVar, TextureView textureView, View view, List<WeakReference<View>> list, b bVar2) {
            me meVar = new me(str, bVar, textureView, view, list, bVar2, this.a);
            return meVar;
        }
    }

    /* compiled from: VideoTextureContainer */
    public interface b {
        void a(String str, Surface surface);
    }

    me(String str, com.soundcloud.android.playback.ke.b bVar, TextureView textureView, View view, List<WeakReference<View>> list, b bVar2, C3469VY vy) {
        this.a = str;
        this.c = bVar;
        this.b = bVar2;
        this.d = vy;
        this.e = new WeakReference<>(view);
        this.f = list;
        b(textureView);
    }

    private void b(TextureView textureView) {
        this.i = textureView;
        this.i.setSurfaceTextureListener(this);
    }

    private boolean c(TextureView textureView) {
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        return surfaceTexture != null && surfaceTexture.equals(this.h);
    }

    /* access modifiers changed from: 0000 */
    public void a(TextureView textureView, View view, List<WeakReference<View>> list) {
        this.e = new WeakReference<>(view);
        this.f = list;
        b(textureView);
        if (this.h != null && !c(textureView)) {
            textureView.setSurfaceTexture(this.h);
        }
    }

    /* access modifiers changed from: 0000 */
    public String d() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public View e() {
        WeakReference<View> weakReference = this.e;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        this.d.a(new NullPointerException("viewabilityView field is null"), new HVa[0]);
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        Surface surface = this.g;
        if (surface != null) {
            surface.release();
        }
        this.g = null;
        this.e = null;
        this.i = null;
        this.h = null;
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        this.e = null;
        this.i = null;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.h == null) {
            this.h = surfaceTexture;
            this.g = new Surface(surfaceTexture);
            this.b.a(this.a, this.g);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return this.h == null;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* access modifiers changed from: 0000 */
    public com.soundcloud.android.playback.ke.b b() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public Surface c() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(TextureView textureView) {
        return textureView.equals(this.i);
    }

    /* access modifiers changed from: 0000 */
    public List<WeakReference<View>> a() {
        return this.f;
    }
}
