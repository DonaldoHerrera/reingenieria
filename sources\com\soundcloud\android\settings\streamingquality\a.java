package com.soundcloud.android.settings.streamingquality;

/* compiled from: StreamingQualitySettingsPresenter.kt */
public final class a {
    private final String a;

    public a(String str) {
        C7471uYa.b(str, "title");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.settings.streamingquality.a) r2).a) != false) goto L_0x0015;
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
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Setting(title=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
