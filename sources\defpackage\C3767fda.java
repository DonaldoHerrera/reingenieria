package defpackage;

import com.google.android.gms.common.internal.ImagesContract;

/* renamed from: fda reason: default package and case insensitive filesystem */
/* compiled from: UrnNamespace */
public enum C3767fda {
    SOUNDCLOUD("soundcloud"),
    LOCAL(ImagesContract.LOCAL),
    OTHER("other");
    
    private String e;

    private C3767fda(String str) {
        this.e = str;
    }

    public String a() {
        return this.e;
    }

    public String toString() {
        return this.e;
    }

    static C3767fda a(String str) {
        C3767fda[] values;
        for (C3767fda fda : values()) {
            if (fda.a().equals(str)) {
                return fda;
            }
        }
        return OTHER;
    }
}
