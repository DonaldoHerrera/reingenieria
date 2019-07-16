package com.soundcloud.android.upsell;

import android.content.Context;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/soundcloud/android/upsell/UpsellItemCallback;", "", "()V", "Click", "Create", "Dismiss", "Lcom/soundcloud/android/upsell/UpsellItemCallback$Dismiss;", "Lcom/soundcloud/android/upsell/UpsellItemCallback$Click;", "Lcom/soundcloud/android/upsell/UpsellItemCallback$Create;", "base_release"}, mv = {1, 1, 15})
/* compiled from: UpsellItemRenderer.kt */
public abstract class l {

    /* compiled from: UpsellItemRenderer.kt */
    public static final class a extends l {
        private final Context a;

        public a(Context context) {
            C7471uYa.b(context, "context");
            super(null);
            this.a = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.upsell.l.a) r2).a) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Context context = this.a;
            if (context != null) {
                return context.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Click(context=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: UpsellItemRenderer.kt */
    public static final class b extends l {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* compiled from: UpsellItemRenderer.kt */
    public static final class c extends l {
        private final int a;

        public c(int i) {
            super(null);
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    if (this.a == ((c) obj).a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Dismiss(position=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    private l() {
    }

    public /* synthetic */ l(C7264rYa rya) {
        this();
    }
}
