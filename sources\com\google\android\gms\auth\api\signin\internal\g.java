package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class g implements a {
    public final PendingResult<Status> a(GoogleApiClient googleApiClient) {
        return i.a(googleApiClient, googleApiClient.getContext(), false);
    }
}
