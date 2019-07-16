package com.appboy;

import android.content.Context;
import com.appboy.ui.actions.NewsfeedAction;
import com.appboy.ui.actions.UriAction;

/* compiled from: IAppboyNavigator */
public interface n {
    void gotoNewsFeed(Context context, NewsfeedAction newsfeedAction);

    void gotoUri(Context context, UriAction uriAction);
}
