package com.appboy.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.ui.activities.AppboyFeedActivity;

public class NewsfeedAction implements IAction {
    private final Hf mChannel;
    private final Bundle mExtras;

    public NewsfeedAction(Bundle bundle, Hf hf) {
        this.mExtras = bundle;
        this.mChannel = hf;
    }

    public void execute(Context context) {
        try {
            Intent intent = new Intent(context, AppboyFeedActivity.class);
            if (this.mExtras != null) {
                intent.putExtras(this.mExtras);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            Hg.b("ContentValues", "AppboyFeedActivity was not opened successfully.", e);
        }
    }
}
