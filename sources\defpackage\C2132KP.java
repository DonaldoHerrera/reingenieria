package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import com.fasterxml.jackson.annotation.JsonCreator;

/* renamed from: KP reason: default package and case insensitive filesystem */
/* compiled from: ChartCategory */
public enum C2132KP {
    MUSIC("music"),
    AUDIO("audio"),
    NONE(IdHelperAndroid.NO_ID_AVAILABLE);
    
    private final String e;

    private C2132KP(String str) {
        this.e = str;
    }

    @JsonCreator
    public static C2132KP a(String str) {
        C2132KP[] values;
        if (!C5206PKa.a((CharSequence) str)) {
            for (C2132KP kp : values()) {
                if (kp.e.equalsIgnoreCase(str)) {
                    return kp;
                }
            }
        }
        return NONE;
    }
}
