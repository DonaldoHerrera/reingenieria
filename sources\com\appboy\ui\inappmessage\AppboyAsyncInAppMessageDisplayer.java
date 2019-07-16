package com.appboy.ui.inappmessage;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;

public class AppboyAsyncInAppMessageDisplayer extends AsyncTask<C0522cg, Integer, C0522cg> {
    /* access modifiers changed from: private */
    public static final String TAG = Hg.a(AppboyAsyncInAppMessageDisplayer.class);

    /* access modifiers changed from: 0000 */
    public boolean prepareInAppMessageWithBitmapDownload(C0522cg cgVar) {
        if (cgVar.getBitmap() != null) {
            Hg.c(TAG, "In-app message already contains image bitmap. Not downloading image from URL.");
            cgVar.setImageDownloadSuccessful(true);
            return true;
        }
        String localImageUrl = cgVar.getLocalImageUrl();
        if (!Ng.d(localImageUrl) && new File(localImageUrl).exists()) {
            Hg.c(TAG, "In-app message has local image url.");
            cgVar.setBitmap(Gg.a(Uri.parse(localImageUrl)));
        }
        if (cgVar.getBitmap() == null) {
            String remoteImageUrl = cgVar.getRemoteImageUrl();
            if (!Ng.d(remoteImageUrl)) {
                Hg.c(TAG, "In-app message has remote image url. Downloading.");
                Context applicationContext = AppboyInAppMessageManager.getInstance().getApplicationContext();
                Ff ff = Ff.NO_BOUNDS;
                if (cgVar instanceof C1510mg) {
                    ff = Ff.IN_APP_MESSAGE_SLIDEUP;
                } else if (cgVar instanceof C1479lg) {
                    ff = Ff.IN_APP_MESSAGE_MODAL;
                }
                cgVar.setBitmap(Gg.a(applicationContext, Uri.parse(remoteImageUrl), ff));
            } else {
                Hg.e(TAG, "In-app message has no remote image url. Not downloading image.");
                return true;
            }
        }
        if (cgVar.getBitmap() == null) {
            return false;
        }
        cgVar.setImageDownloadSuccessful(true);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean prepareInAppMessageWithFresco(C0522cg cgVar) {
        String localImageUrl = cgVar.getLocalImageUrl();
        if (Ng.d(localImageUrl) || !new File(localImageUrl).exists()) {
            cgVar.setLocalImageUrl(null);
            String remoteImageUrl = cgVar.getRemoteImageUrl();
            if (Ng.d(remoteImageUrl)) {
                Hg.e(TAG, "In-app message has no remote image url. Not downloading image.");
                return true;
            }
            DataSource prefetchToDiskCache = Fresco.getImagePipeline().prefetchToDiskCache(ImageRequest.fromUri(remoteImageUrl), new Object());
            do {
            } while (!prefetchToDiskCache.isFinished());
            boolean z = !prefetchToDiskCache.hasFailed();
            if (z) {
                cgVar.setImageDownloadSuccessful(true);
            } else if (prefetchToDiskCache.getFailureCause() == null) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Fresco disk prefetch failed with null cause for remote image url:");
                sb.append(remoteImageUrl);
                Hg.e(str, sb.toString());
            } else {
                String str2 = TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fresco disk prefetch failed with cause: ");
                sb2.append(prefetchToDiskCache.getFailureCause().getMessage());
                sb2.append(" with remote image url: ");
                sb2.append(remoteImageUrl);
                Hg.e(str2, sb2.toString());
            }
            prefetchToDiskCache.close();
            return z;
        }
        Hg.c(TAG, "In-app message has local image url for Fresco display. Not downloading image.");
        cgVar.setImageDownloadSuccessful(true);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean prepareInAppMessageWithHtml(C0522cg cgVar) {
        C1386ig igVar = (C1386ig) cgVar;
        String c = igVar.c();
        if (!Ng.d(c) && new File(c).exists()) {
            Hg.c(TAG, "Local assets for html in-app message are already populated. Not downloading assets.");
            return true;
        } else if (Ng.d(igVar.b())) {
            Hg.c(TAG, "Html in-app message has no remote asset zip. Continuing with in-app message preparation.");
            return true;
        } else {
            String a = Pg.a(Pg.a(AppboyInAppMessageManager.getInstance().getApplicationContext()), igVar.b());
            if (!Ng.d(a)) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Local url for html in-app message assets is ");
                sb.append(a);
                Hg.a(str, sb.toString());
                igVar.a(a);
                return true;
            }
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Download of html content to local directory failed for remote url: ");
            sb2.append(igVar.b());
            sb2.append(" . Returned local url is: ");
            sb2.append(a);
            Hg.e(str2, sb2.toString());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public C0522cg doInBackground(C0522cg... cgVarArr) {
        boolean z;
        try {
            Hg.a(TAG, "Starting asynchronous in-app message preparation.");
            C0522cg cgVar = cgVarArr[0];
            Context applicationContext = AppboyInAppMessageManager.getInstance().getApplicationContext();
            if (cgVar instanceof C1417jg) {
                z = prepareInAppMessageWithHtml(cgVar);
            } else if (FrescoLibraryUtils.canUseFresco(applicationContext)) {
                z = prepareInAppMessageWithFresco(cgVar);
            } else {
                z = prepareInAppMessageWithBitmapDownload(cgVar);
            }
            if (!z) {
                return null;
            }
            return cgVar;
        } catch (Exception e) {
            Hg.b(TAG, "Error running AsyncInAppMessageDisplayer", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(final C0522cg cgVar) {
        if (cgVar != null) {
            try {
                Hg.a(TAG, "Finished asynchronous in-app message preparation. Attempting to display in-app message.");
                new Handler(AppboyInAppMessageManager.getInstance().getApplicationContext().getMainLooper()).post(new Runnable() {
                    public void run() {
                        Hg.a(AppboyAsyncInAppMessageDisplayer.TAG, "Displaying in-app message.");
                        AppboyInAppMessageManager.getInstance().displayInAppMessage(cgVar, false);
                    }
                });
            } catch (Exception e) {
                Hg.b(TAG, "Error running onPostExecute", e);
            }
        } else {
            Hg.b(TAG, "Cannot display the in-app message because the in-app message was null.");
        }
    }
}
