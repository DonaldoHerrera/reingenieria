package com.soundcloud.android.ads;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.aa;

@EVa(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/ads/AdItemCallback;", "", "()V", "AdItemClick", "VideoFullscreenClick", "VideoTextureBind", "WhyAdsClicked", "Lcom/soundcloud/android/ads/AdItemCallback$AdItemClick;", "Lcom/soundcloud/android/ads/AdItemCallback$VideoTextureBind;", "Lcom/soundcloud/android/ads/AdItemCallback$VideoFullscreenClick;", "Lcom/soundcloud/android/ads/AdItemCallback$WhyAdsClicked;", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.ads.ra reason: case insensitive filesystem */
/* compiled from: AdItemRenderer.kt */
public abstract class C2617ra {

    /* renamed from: com.soundcloud.android.ads.ra$a */
    /* compiled from: AdItemRenderer.kt */
    public static final class a extends C2617ra {
        private final C3676c a;

        public a(C3676c cVar) {
            C7471uYa.b(cVar, "adData");
            super(null);
            this.a = cVar;
        }

        public final C3676c a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.ads.C2617ra.a) r2).a) != false) goto L_0x0015;
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
            C3676c cVar = this.a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AdItemClick(adData=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.ads.ra$b */
    /* compiled from: AdItemRenderer.kt */
    public static final class b extends C2617ra {
        private final aa a;

        public b(aa aaVar) {
            C7471uYa.b(aaVar, "videoAd");
            super(null);
            this.a = aaVar;
        }

        public final aa a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.ads.C2617ra.b) r2).a) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            aa aaVar = this.a;
            if (aaVar != null) {
                return aaVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("VideoFullscreenClick(videoAd=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.ads.ra$c */
    /* compiled from: AdItemRenderer.kt */
    public static final class c extends C2617ra {
        private final TextureView a;
        private final View b;
        private final aa c;

        public c(TextureView textureView, View view, aa aaVar) {
            C7471uYa.b(textureView, "textureView");
            C7471uYa.b(view, "viewabilityLayer");
            C7471uYa.b(aaVar, "videoAd");
            super(null);
            this.a = textureView;
            this.b = view;
            this.c = aaVar;
        }

        public final TextureView a() {
            return this.a;
        }

        public final aa b() {
            return this.c;
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
            TextureView textureView = this.a;
            int i = 0;
            int hashCode = (textureView != null ? textureView.hashCode() : 0) * 31;
            View view = this.b;
            int hashCode2 = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
            aa aaVar = this.c;
            if (aaVar != null) {
                i = aaVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("VideoTextureBind(textureView=");
            sb.append(this.a);
            sb.append(", viewabilityLayer=");
            sb.append(this.b);
            sb.append(", videoAd=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.ads.ra$d */
    /* compiled from: AdItemRenderer.kt */
    public static final class d extends C2617ra {
        private final Context a;

        public d(Context context) {
            C7471uYa.b(context, "context");
            super(null);
            this.a = context;
        }

        public final Context a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.ads.C2617ra.d) r2).a) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
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
            sb.append("WhyAdsClicked(context=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    private C2617ra() {
    }

    public /* synthetic */ C2617ra(C7264rYa rya) {
        this();
    }
}
