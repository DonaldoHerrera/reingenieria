package com.google.android.gms.internal.cast;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;

public final class J extends GoogleApi<NoOptions> {
    private static final ClientKey<M> a = new ClientKey<>();
    private static final AbstractClientBuilder<M, NoOptions> b = new L();
    private static final Api<NoOptions> c = new Api<>("CastApi.API", b, a);

    public J(Context context) {
        super(context, c, null, Settings.DEFAULT_SETTINGS);
    }
}
