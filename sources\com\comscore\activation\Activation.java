package com.comscore.activation;

import com.comscore.Analytics;
import com.comscore.ConfigurationListener;
import com.comscore.PublisherConfiguration;
import com.comscore.util.CrossPublisherIdUtil;
import com.comscore.util.CrossPublisherIdUtil.Listener;
import com.comscore.util.setup.Setup;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Activation {
    private static final String a = "http://segment-data-us-east.zqtk.net/%s?url=%s&c2=%s&c12=%s&ns_ap_bi=%s&ns_ap_sv=%s&ns_ap_an=%s&ns_ap_ver=%s&ns_ap_pn=android";
    private static final String b = "\\{\\s*\".*\"\\s*:\\s*[^\\}]*\\s*\\}";

    public interface ActivationListener {
        void onReceivedCategories(List<String> list);
    }

    private Activation() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012c, code lost:
        return new java.util.ArrayList();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0127 */
    public static List<String> b(String str, String str2, PublisherConfiguration publisherConfiguration, String str3) {
        JSONArray jSONArray;
        String str4 = "UTF-8";
        if (!Setup.isSetUpFinished() || publisherConfiguration == null) {
            return new ArrayList();
        }
        String publisherId = publisherConfiguration.getPublisherId();
        String publisherUniqueDeviceId = publisherConfiguration.getPublisherUniqueDeviceId();
        String applicationId = Setup.getJniComScoreHelper().getApplicationId();
        String version = Analytics.getVersion();
        String applicationName = Setup.getJniComScoreHelper().getApplicationName();
        String applicationVersion = Setup.getJniComScoreHelper().getApplicationVersion();
        if (publisherId == null || publisherUniqueDeviceId == null || applicationId == null || version == null || applicationName == null || applicationVersion == null || publisherId.isEmpty() || publisherUniqueDeviceId.isEmpty() || applicationId.isEmpty() || version.isEmpty() || applicationName.isEmpty() || applicationVersion.isEmpty()) {
            return new ArrayList();
        }
        try {
            String format = String.format(a, new Object[]{URLEncoder.encode(str, str4), URLEncoder.encode(str2, str4), URLEncoder.encode(publisherId, str4), URLEncoder.encode(publisherUniqueDeviceId, str4), URLEncoder.encode(applicationId, str4), URLEncoder.encode(version, str4), URLEncoder.encode(applicationName, str4), URLEncoder.encode(applicationVersion, str4)});
            if (str3 != null && !str3.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(format);
                sb.append("&ns_ak=");
                sb.append(URLEncoder.encode(str3, str4));
                format = sb.toString();
            }
            try {
                InputStream openStream = new URL(format).openStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                Matcher matcher = Pattern.compile(b).matcher(byteArrayOutputStream.toString(str4));
                if (!matcher.find()) {
                    return new ArrayList();
                }
                JSONObject jSONObject = new JSONObject(matcher.group(0));
                try {
                    jSONArray = jSONObject.getJSONArray("data");
                } catch (JSONException unused) {
                    jSONArray = jSONObject.getJSONArray("errors");
                }
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArray.optString(i));
                }
                return arrayList;
            } catch (IOException unused2) {
                return new ArrayList();
            }
        } catch (UnsupportedEncodingException unused3) {
            return new ArrayList();
        }
    }

    public static void getCategories(final String str, final String str2, final PublisherConfiguration publisherConfiguration, final ActivationListener activationListener) {
        if (Analytics.getConfiguration().isInitialized()) {
            CrossPublisherIdUtil.requestCrossPublisherId(new Listener() {
                public void onCrossPublisherIdRequested(final String str, boolean z) {
                    new Thread(new Runnable() {
                        public void run() {
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            activationListener.onReceivedCategories(Activation.b(str, str2, publisherConfiguration, str));
                        }
                    }).start();
                }
            });
        } else {
            Analytics.getConfiguration().addListener(new ConfigurationListener() {
                public void onConfigurationChanged(int i) {
                    if (i == 20307) {
                        Activation.getCategories(str, str2, publisherConfiguration, activationListener);
                        Analytics.getConfiguration().removeListener(this);
                    }
                }
            });
        }
    }
}
