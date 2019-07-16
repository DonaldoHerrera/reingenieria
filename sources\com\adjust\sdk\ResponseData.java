package com.adjust.sdk;

import org.json.JSONObject;

public class ResponseData {
    public ActivityKind activityKind;
    public String adid;
    public AdjustAttribution attribution;
    public JSONObject jsonResponse;
    public String message;
    public boolean success;
    public String timestamp;
    public TrackingState trackingState;
    public boolean willRetry;

    /* renamed from: com.adjust.sdk.ResponseData$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adjust$sdk$ActivityKind = new int[ActivityKind.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            $SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.SESSION.ordinal()] = 1;
            $SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.CLICK.ordinal()] = 2;
            $SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.ATTRIBUTION.ordinal()] = 3;
            try {
                $SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    protected ResponseData() {
    }

    public static ResponseData buildResponseData(ActivityPackage activityPackage) {
        ResponseData responseData;
        ResponseData responseData2;
        ActivityKind activityKind2 = activityPackage.getActivityKind();
        int i = AnonymousClass1.$SwitchMap$com$adjust$sdk$ActivityKind[activityKind2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                responseData = new SdkClickResponseData();
            } else if (i == 3) {
                responseData = new AttributionResponseData();
            } else if (i != 4) {
                responseData = new ResponseData();
            } else {
                responseData2 = new EventResponseData(activityPackage);
            }
            responseData.activityKind = activityKind2;
            return responseData;
        }
        responseData2 = new SessionResponseData(activityPackage);
        responseData = responseData2;
        responseData.activityKind = activityKind2;
        return responseData;
    }

    public String toString() {
        return Util.formatString("message:%s timestamp:%s json:%s", this.message, this.timestamp, this.jsonResponse);
    }
}
