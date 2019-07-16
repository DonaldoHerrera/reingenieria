package com.soundcloud.android.foundation.playqueue;

import com.soundcloud.android.foundation.ads.C3676c;

/* compiled from: PlayableQueueItem */
public abstract class t extends q {
    protected final C3508cda c;
    protected final C3508cda d;
    protected final C3508cda e;
    protected final String f;
    protected final String g;
    protected final C3508cda h;
    protected final C3508cda i;
    protected final boolean j;
    protected final v k;
    protected boolean l;

    /* compiled from: PlayableQueueItem */
    public static abstract class a<T extends a<T>> {
        protected final C3508cda a;
        protected C3508cda b;
        protected boolean c;
        protected String d;
        protected String e;
        protected C4928GKa<C3676c> f;
        protected C3508cda g;
        protected C3508cda h;
        protected C3508cda i;
        protected v j;
        protected boolean k;

        public a(C3508cda cda) {
            this(cda, C3508cda.a);
        }

        /* access modifiers changed from: protected */
        public abstract T a();

        public T a(v vVar) {
            this.j = vVar;
            return a();
        }

        public T b() {
            this.f = C4928GKa.a();
            return a();
        }

        public a(C3508cda cda, C3508cda cda2) {
            String str = "";
            this.d = str;
            this.e = str;
            this.f = C4928GKa.a();
            C3508cda cda3 = C3508cda.a;
            this.g = cda3;
            this.h = cda3;
            this.i = cda3;
            this.a = cda;
            this.b = cda2;
        }

        public T a(String str) {
            this.d = str;
            return a();
        }

        public T b(boolean z) {
            this.k = z;
            return a();
        }

        public T a(String str, String str2) {
            this.d = str;
            this.e = str2;
            return a();
        }

        public T a(String str, String str2, C3508cda cda, C3508cda cda2) {
            this.d = str;
            this.e = str2;
            this.h = cda;
            this.i = cda2;
            return a();
        }

        public T a(t tVar) {
            this.d = tVar.p();
            this.e = tVar.r();
            this.h = tVar.q();
            this.i = tVar.m();
            this.j = tVar.k;
            return a();
        }

        public T a(C3676c cVar) {
            this.f = C4928GKa.c(cVar);
            return a();
        }

        public T a(boolean z) {
            this.c = z;
            return a();
        }

        public T a(C3508cda cda) {
            this.g = cda;
            return a();
        }
    }

    public t(C3508cda cda, C3508cda cda2, String str, String str2, C3508cda cda3, C3508cda cda4, boolean z, C3508cda cda5, C4928GKa<C3676c> gKa, v vVar, boolean z2) {
        this.g = str2;
        this.f = str;
        this.i = cda3;
        this.j = z;
        this.h = cda5;
        this.d = cda2;
        this.e = cda4;
        this.c = cda;
        this.k = vVar;
        this.l = z2;
        this.b = gKa;
        if (vVar == null) {
            throw new IllegalArgumentException("PlaybackContext can not be null");
        }
    }

    public boolean a(com.soundcloud.android.foundation.playqueue.v.a aVar) {
        return this.k.a().equals(aVar);
    }

    public C3508cda c() {
        return this.c;
    }

    public v l() {
        return this.k;
    }

    public C3508cda m() {
        return this.i;
    }

    public C3508cda n() {
        return this.e;
    }

    public C3508cda o() {
        return this.d;
    }

    public String p() {
        return this.f;
    }

    public C3508cda q() {
        return this.h;
    }

    public String r() {
        return this.g;
    }

    public boolean s() {
        return this.j;
    }

    public boolean t() {
        return this.l;
    }

    public boolean u() {
        return this.l || !a(com.soundcloud.android.foundation.playqueue.v.a.AUTO_PLAY);
    }

    public void v() {
        this.l = true;
    }
}
