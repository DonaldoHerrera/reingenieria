package defpackage;

/* renamed from: Of reason: default package */
public enum Of implements C1294fg<String> {
    UNITY,
    REACT,
    CORDOVA,
    XAMARIN,
    SEGMENT,
    MPARTICLE;

    public String forJsonPut() {
        switch (Nf.a[ordinal()]) {
            case 1:
                return "unity";
            case 2:
                return "react";
            case 3:
                return "cordova";
            case 4:
                return "xamarin";
            case 5:
                return "segment";
            case 6:
                return "mparticle";
            default:
                return null;
        }
    }
}
