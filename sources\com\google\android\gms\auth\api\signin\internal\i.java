package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;

public final class i {
    private static Logger a = new Logger("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        a.d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        String str = "config";
        bundle.putParcelable(str, signInConfiguration);
        intent.putExtra(str, bundle);
        return intent;
    }

    public static PendingResult<Status> a(GoogleApiClient googleApiClient, Context context, boolean z) {
        a.d("Revoking access", new Object[0]);
        String d = b.a(context).d();
        a(context);
        if (z) {
            return e.a(d);
        }
        return googleApiClient.execute(new j(googleApiClient));
    }

    private static void a(Context context) {
        m.a(context).a();
        for (GoogleApiClient maybeSignOut : GoogleApiClient.getAllClients()) {
            maybeSignOut.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }
}
