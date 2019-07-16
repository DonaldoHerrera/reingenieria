package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.E.d;
import com.squareup.picasso.E.e;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a reason: case insensitive filesystem */
/* compiled from: Action */
abstract class C6236a<T> {
    final E a;
    final K b;
    final WeakReference<T> c;
    final boolean d;
    final int e;
    final int f;
    final int g;
    final Drawable h;
    final String i;
    final Object j;
    boolean k;
    boolean l;

    /* renamed from: com.squareup.picasso.a$a reason: collision with other inner class name */
    /* compiled from: Action */
    static class C0179a<M> extends WeakReference<M> {
        final C6236a a;

        C0179a(C6236a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.a = aVar;
        }
    }

    C6236a(E e2, T t, K k2, int i2, int i3, int i4, Drawable drawable, String str, Object obj, boolean z) {
        WeakReference<T> weakReference;
        this.a = e2;
        this.b = k2;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new C0179a<>(this, t, e2.m);
        }
        this.c = weakReference;
        this.e = i2;
        this.f = i3;
        this.d = z;
        this.g = i4;
        this.h = drawable;
        this.i = str;
        if (obj == 0) {
            obj = this;
        }
        this.j = obj;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.l = true;
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(Bitmap bitmap, d dVar);

    /* access modifiers changed from: 0000 */
    public abstract void a(Exception exc);

    /* access modifiers changed from: 0000 */
    public String b() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public int d() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public E e() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public e f() {
        return this.b.u;
    }

    /* access modifiers changed from: 0000 */
    public K g() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public Object h() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public T i() {
        WeakReference<T> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: 0000 */
    public boolean j() {
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public boolean k() {
        return this.k;
    }
}
