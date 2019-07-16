package com.appboy.ui;

import android.content.Context;
import com.appboy.n;
import com.appboy.ui.actions.NewsfeedAction;
import com.appboy.ui.actions.UriAction;

public class AppboyNavigator implements n {
    private static final String TAG = Hg.a(AppboyNavigator.class);
    private static volatile n sCustomAppboyNavigator;
    private static volatile n sDefaultAppboyNavigator = new AppboyNavigator();

    public static void executeNewsFeedAction(Context context, NewsfeedAction newsfeedAction) {
        if (newsfeedAction == null) {
            Hg.b(TAG, "IAppboyNavigator cannot open News feed because the news feed action object was null.");
        } else {
            newsfeedAction.execute(context);
        }
    }

    public static void executeUriAction(Context context, UriAction uriAction) {
        if (uriAction == null) {
            Hg.b(TAG, "IAppboyNavigator cannot open Uri because the Uri action object was null.");
        } else {
            uriAction.execute(context);
        }
    }

    public static n getAppboyNavigator() {
        if (sCustomAppboyNavigator != null) {
            return sCustomAppboyNavigator;
        }
        return sDefaultAppboyNavigator;
    }

    public void gotoNewsFeed(Context context, NewsfeedAction newsfeedAction) {
        executeNewsFeedAction(context, newsfeedAction);
    }

    public void gotoUri(Context context, UriAction uriAction) {
        executeUriAction(context, uriAction);
    }
}
