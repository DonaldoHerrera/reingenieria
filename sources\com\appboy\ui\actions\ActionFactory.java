package com.appboy.ui.actions;

import android.net.Uri;
import android.os.Bundle;

public class ActionFactory {
    public static UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean z, Hf hf) {
        if (uri != null) {
            return new UriAction(uri, bundle, z, hf);
        }
        return null;
    }

    public static UriAction createUriActionFromUrlString(String str, Bundle bundle, boolean z, Hf hf) {
        if (!Ng.d(str)) {
            return createUriActionFromUri(Uri.parse(str), bundle, z, hf);
        }
        return null;
    }
}
