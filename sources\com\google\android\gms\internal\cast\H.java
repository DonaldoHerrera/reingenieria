package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.C0627a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

public abstract class H<R extends Result> extends ApiMethodImpl<R, N> {
    public H(GoogleApiClient googleApiClient) {
        super(C0627a.b, googleApiClient);
    }

    public final void a(int i) {
        setResult(createFailedResult(new Status(2001)));
    }
}
