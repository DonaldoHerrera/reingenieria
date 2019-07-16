package com.soundcloud.android.profile;

import android.os.Bundle;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

/* compiled from: ProfileArguments */
public final class B {
    public static Bundle a(C3508cda cda, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo) {
        Bundle bundle = new Bundle();
        C5526_Ha.b(bundle, "user_urn_key", cda);
        bundle.putSerializable("screen_key", yca);
        bundle.putParcelable("search_query_source_info_key", searchQuerySourceInfo);
        return bundle;
    }
}
