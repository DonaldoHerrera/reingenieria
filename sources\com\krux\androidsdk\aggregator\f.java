package com.krux.androidsdk.aggregator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class f extends c {
    private static final String b = e.class.getSimpleName();
    private String c;
    private String d;
    private String e;
    private String f;

    public f(Context context, Intent intent) {
        super(context);
        this.c = intent.getExtras().getString("publisher_uuid");
        this.d = intent.getExtras().getString("advertising_id");
        this.e = intent.getExtras().getString("event_attributes");
        this.f = intent.getExtras().getString("event");
    }

    public final String a() {
        String str = this.e;
        String str2 = this.f;
        Bundle bundle = new Bundle();
        bundle.putString("_kpid", this.c);
        bundle.putString("_kuid", this.d);
        bundle.putString("_k_action_", str);
        return C2481cI.a(str2, bundle);
    }
}
