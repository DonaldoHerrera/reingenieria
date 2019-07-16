package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: cg reason: default package and case insensitive filesystem */
public interface C0522cg extends C1294fg<JSONObject> {
    boolean getAnimateIn();

    boolean getAnimateOut();

    int getBackgroundColor();

    Bitmap getBitmap();

    Pf getClickAction();

    Qf getCropType();

    Rf getDismissType();

    int getDurationInMilliseconds();

    long getExpirationTimestamp();

    Map<String, String> getExtras();

    String getIcon();

    int getIconBackgroundColor();

    int getIconColor();

    boolean getImageDownloadSuccessful();

    String getLocalImageUrl();

    String getMessage();

    int getMessageTextColor();

    boolean getOpenUriInWebView();

    Uf getOrientation();

    String getRemoteAssetPathForPrefetch();

    String getRemoteImageUrl();

    Uri getUri();

    boolean logClick();

    boolean logImpression();

    void onAfterClosed();

    void setAnimateIn(boolean z);

    void setAnimateOut(boolean z);

    void setBitmap(Bitmap bitmap);

    void setExpirationTimestamp(long j);

    void setImageDownloadSuccessful(boolean z);

    void setLocalAssetPathForPrefetch(String str);

    void setLocalImageUrl(String str);
}
