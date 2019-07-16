package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService.Stub;

/* compiled from: PostMessageService */
class h extends Stub {
    final /* synthetic */ PostMessageService a;

    h(PostMessageService postMessageService) {
        this.a = postMessageService;
    }

    public void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
        iCustomTabsCallback.onMessageChannelReady(bundle);
    }

    public void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
        iCustomTabsCallback.onPostMessage(str, bundle);
    }
}
