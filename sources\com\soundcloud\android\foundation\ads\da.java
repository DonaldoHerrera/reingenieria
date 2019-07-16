package com.soundcloud.android.foundation.ads;

@EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;", "", "defaultTextColor", "", "defaultBackgroundColor", "pressedTextColor", "pressedBackgroundColor", "focusedTextColor", "focusedBackgroundColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDefaultBackgroundColor", "()Ljava/lang/String;", "getDefaultTextColor", "getFocusedBackgroundColor", "getFocusedTextColor", "getPressedBackgroundColor", "getPressedTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ads_release"}, mv = {1, 1, 15})
/* compiled from: VisualAdDisplayProperties.kt */
public final class da {
    public static final a a = new a(null);
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    /* compiled from: VisualAdDisplayProperties.kt */
    public static final class a {
        private a() {
        }

        public final da a(r rVar) {
            C7471uYa.b(rVar, "apiDisplayProperties");
            da daVar = new da(rVar.b(), rVar.a(), rVar.f(), rVar.e(), rVar.d(), rVar.c());
            return daVar;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public da(String str, String str2, String str3, String str4, String str5, String str6) {
        C7471uYa.b(str, "defaultTextColor");
        C7471uYa.b(str2, "defaultBackgroundColor");
        C7471uYa.b(str3, "pressedTextColor");
        C7471uYa.b(str4, "pressedBackgroundColor");
        C7471uYa.b(str5, "focusedTextColor");
        C7471uYa.b(str6, "focusedBackgroundColor");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.g, (java.lang.Object) r3.g) != false) goto L_0x0047;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof da) {
                da daVar = (da) obj;
                if (C7471uYa.a((Object) this.b, (Object) daVar.b)) {
                    if (C7471uYa.a((Object) this.c, (Object) daVar.c)) {
                        if (C7471uYa.a((Object) this.d, (Object) daVar.d)) {
                            if (C7471uYa.a((Object) this.e, (Object) daVar.e)) {
                                if (C7471uYa.a((Object) this.f, (Object) daVar.f)) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.d;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VisualAdDisplayProperties(defaultTextColor=");
        sb.append(this.b);
        sb.append(", defaultBackgroundColor=");
        sb.append(this.c);
        sb.append(", pressedTextColor=");
        sb.append(this.d);
        sb.append(", pressedBackgroundColor=");
        sb.append(this.e);
        sb.append(", focusedTextColor=");
        sb.append(this.f);
        sb.append(", focusedBackgroundColor=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
