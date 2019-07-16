package defpackage;

import com.comscore.android.id.IdHelperAndroid;

/* renamed from: MG reason: default package and case insensitive filesystem */
public enum C2161MG {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(IdHelperAndroid.NO_ID_AVAILABLE);
    
    private final String e;

    private C2161MG(String str) {
        this.e = str;
    }

    public String toString() {
        return this.e;
    }
}
