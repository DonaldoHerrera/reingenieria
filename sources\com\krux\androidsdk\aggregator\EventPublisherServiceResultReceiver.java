package com.krux.androidsdk.aggregator;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public class EventPublisherServiceResultReceiver extends ResultReceiver {
    d a;

    public EventPublisherServiceResultReceiver(Handler handler) {
        super(handler);
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.a(bundle);
        }
    }
}
