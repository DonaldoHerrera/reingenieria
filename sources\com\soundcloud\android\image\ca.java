package com.soundcloud.android.image;

import android.graphics.Bitmap;
import android.view.View;

@EVa(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/image/LoadingState;", "", "()V", "Cancel", "Complete", "Fail", "Start", "Lcom/soundcloud/android/image/LoadingState$Start;", "Lcom/soundcloud/android/image/LoadingState$Cancel;", "Lcom/soundcloud/android/image/LoadingState$Fail;", "Lcom/soundcloud/android/image/LoadingState$Complete;", "image_release"}, mv = {1, 1, 15})
/* compiled from: ImageLoader.kt */
public abstract class ca {

    /* compiled from: ImageLoader.kt */
    public static final class a extends ca {
        private final String a;
        private final View b;

        public a(String str, View view) {
            super(null);
            this.a = str;
            this.b = view;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            View view = this.b;
            if (view != null) {
                i = view.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Cancel(imageUrl=");
            sb.append(this.a);
            sb.append(", view=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: ImageLoader.kt */
    public static final class b extends ca {
        private final String a;
        private final View b;
        private final Bitmap c;

        public b(String str, View view, Bitmap bitmap) {
            C7471uYa.b(bitmap, "loadedImage");
            super(null);
            this.a = str;
            this.b = view;
            this.c = bitmap;
        }

        public final Bitmap a() {
            return this.c;
        }

        public final View b() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.a, (Object) bVar.a)) {
                        if (C7471uYa.a((Object) this.b, (Object) bVar.b)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            View view = this.b;
            int hashCode2 = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
            Bitmap bitmap = this.c;
            if (bitmap != null) {
                i = bitmap.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Complete(imageUrl=");
            sb.append(this.a);
            sb.append(", view=");
            sb.append(this.b);
            sb.append(", loadedImage=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: ImageLoader.kt */
    public static final class c extends ca {
        private final String a;
        private final View b;
        private final Throwable c;

        public c(String str, View view, Throwable th) {
            C7471uYa.b(th, "cause");
            super(null);
            this.a = str;
            this.b = view;
            this.c = th;
        }

        public final Throwable a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final View c() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.a, (Object) cVar.a)) {
                        if (C7471uYa.a((Object) this.b, (Object) cVar.b)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            View view = this.b;
            int hashCode2 = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
            Throwable th = this.c;
            if (th != null) {
                i = th.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Fail(imageUrl=");
            sb.append(this.a);
            sb.append(", view=");
            sb.append(this.b);
            sb.append(", cause=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: ImageLoader.kt */
    public static final class d extends ca {
        private final String a;
        private final View b;

        public d(String str, View view) {
            super(null);
            this.a = str;
            this.b = view;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (C7471uYa.a((Object) this.a, (Object) dVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            View view = this.b;
            if (view != null) {
                i = view.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Start(imageUrl=");
            sb.append(this.a);
            sb.append(", view=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    private ca() {
    }

    public /* synthetic */ ca(C7264rYa rya) {
        this();
    }
}
