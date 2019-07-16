package defpackage;

/* renamed from: wzb reason: default package and case insensitive filesystem */
/* compiled from: ErrorCode */
public enum C7649wzb {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public final int m;

    private C7649wzb(int i) {
        this.m = i;
    }

    public static C7649wzb a(int i) {
        C7649wzb[] values;
        for (C7649wzb wzb : values()) {
            if (wzb.m == i) {
                return wzb;
            }
        }
        return null;
    }
}
