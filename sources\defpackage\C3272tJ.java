package defpackage;

/* renamed from: tJ reason: default package and case insensitive filesystem */
/* compiled from: OMTrackingExceptionType.kt */
public enum C3272tJ {
    OM_SESSION_NOT_DISPOSED("om_session_not_disposed"),
    OM_SESSION_CREATION_FAILED("om_session_failed_to_start"),
    OM_EVENT_TRACKING_FAILED("om_event_tracking_failed");
    
    private final String e;

    private C3272tJ(String str) {
        this.e = str;
    }

    public final String a() {
        return this.e;
    }
}
