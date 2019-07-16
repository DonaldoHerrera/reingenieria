package com.adjust.sdk;

import android.net.Uri;
import android.net.Uri.Builder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class UtilNetworking {
    /* access modifiers changed from: private */
    public static String userAgent;

    static class ConnectionOptions implements IConnectionOptions {
        ConnectionOptions() {
        }

        public void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str) {
            httpsURLConnection.setRequestProperty("Client-SDK", str);
            httpsURLConnection.setConnectTimeout(60000);
            httpsURLConnection.setReadTimeout(60000);
            if (UtilNetworking.userAgent != null) {
                httpsURLConnection.setRequestProperty("User-Agent", UtilNetworking.userAgent);
            }
        }
    }

    public interface IConnectionOptions {
        void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str);
    }

    private static String buildAuthorizationHeader(Map<String, String> map, String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Map signature = getSignature(map, str3, str);
        String sha256 = Util.sha256((String) signature.get("clear_signature"));
        String str4 = (String) signature.get("fields");
        String formatString = Util.formatString("Signature %s,%s,%s,%s", Util.formatString("secret_id=\"%s\"", str2), Util.formatString("signature=\"%s\"", sha256), Util.formatString("algorithm=\"%s\"", "sha256"), Util.formatString("headers=\"%s\"", str4));
        getLogger().verbose("authorizationHeader: %s", formatString);
        return formatString;
    }

    private static Uri buildUri(String str, Map<String, String> map, String str2) {
        String str3;
        Builder builder = new Builder();
        String str4 = Constants.SCHEME;
        String str5 = Constants.AUTHORITY;
        try {
            String baseUrl = AdjustFactory.getBaseUrl();
            if (str2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(baseUrl);
                sb.append(str2);
                baseUrl = sb.toString();
            }
            URL url = new URL(baseUrl);
            str4 = url.getProtocol();
            str5 = url.getAuthority();
            str3 = url.getPath();
        } catch (MalformedURLException e) {
            getLogger().error("Unable to parse endpoint (%s)", e.getMessage());
            str3 = "";
        }
        builder.scheme(str4);
        builder.encodedAuthority(str5);
        builder.path(str3);
        builder.appendPath(str);
        for (Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String str6 = "sent_at";
        builder.appendQueryParameter(str6, Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        return builder.build();
    }

    public static ResponseData createGETHttpsURLConnection(ActivityPackage activityPackage, String str) throws Exception {
        try {
            HashMap hashMap = new HashMap(activityPackage.getParameters());
            String extractAppSecret = extractAppSecret(hashMap);
            String extractSecretId = extractSecretId(hashMap);
            extractEventCallbackId(hashMap);
            HttpsURLConnection httpsURLConnection = AdjustFactory.getHttpsURLConnection(new URL(buildUri(activityPackage.getPath(), hashMap, str).toString()));
            AdjustFactory.getConnectionOptions().applyConnectionOptions(httpsURLConnection, activityPackage.getClientSdk());
            String buildAuthorizationHeader = buildAuthorizationHeader(hashMap, extractAppSecret, extractSecretId, activityPackage.getActivityKind().toString());
            if (buildAuthorizationHeader != null) {
                httpsURLConnection.setRequestProperty("Authorization", buildAuthorizationHeader);
            }
            httpsURLConnection.setRequestMethod("GET");
            return readHttpResponse(httpsURLConnection, activityPackage);
        } catch (Exception e) {
            throw e;
        }
    }

    public static ResponseData createPOSTHttpsURLConnection(String str, ActivityPackage activityPackage, int i) throws Exception {
        DataOutputStream dataOutputStream = null;
        try {
            HttpsURLConnection httpsURLConnection = AdjustFactory.getHttpsURLConnection(new URL(str));
            HashMap hashMap = new HashMap(activityPackage.getParameters());
            AdjustFactory.getConnectionOptions().applyConnectionOptions(httpsURLConnection, activityPackage.getClientSdk());
            String extractAppSecret = extractAppSecret(hashMap);
            String extractSecretId = extractSecretId(hashMap);
            extractEventCallbackId(hashMap);
            String buildAuthorizationHeader = buildAuthorizationHeader(hashMap, extractAppSecret, extractSecretId, activityPackage.getActivityKind().toString());
            if (buildAuthorizationHeader != null) {
                httpsURLConnection.setRequestProperty("Authorization", buildAuthorizationHeader);
            }
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream2 = new DataOutputStream(httpsURLConnection.getOutputStream());
            try {
                dataOutputStream2.writeBytes(getPostDataString(hashMap, i));
                ResponseData readHttpResponse = readHttpResponse(httpsURLConnection, activityPackage);
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (Exception unused) {
                }
                return readHttpResponse;
            } catch (Exception e) {
                e = e;
                dataOutputStream = dataOutputStream2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            throw e;
        }
    }

    private static String extractAppSecret(Map<String, String> map) {
        return (String) map.remove("app_secret");
    }

    private static void extractEventCallbackId(Map<String, String> map) {
        map.remove("event_callback_id");
    }

    private static String extractSecretId(Map<String, String> map) {
        return (String) map.remove("secret_id");
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    private static String getPostDataString(Map<String, String> map, int i) throws UnsupportedEncodingException {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        while (true) {
            str = "";
            str2 = "=";
            str3 = "&";
            str4 = "UTF-8";
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), str4);
            String str5 = (String) entry.getValue();
            if (str5 != null) {
                str = URLEncoder.encode(str5, str4);
            }
            if (sb.length() > 0) {
                sb.append(str3);
            }
            sb.append(encode);
            sb.append(str2);
            sb.append(str);
        }
        String format = Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis()));
        sb.append(str3);
        sb.append(URLEncoder.encode("sent_at", str4));
        sb.append(str2);
        sb.append(URLEncoder.encode(format, str4));
        if (i > 0) {
            sb.append(str3);
            sb.append(URLEncoder.encode("queue_size", str4));
            sb.append(str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(i);
            sb.append(URLEncoder.encode(sb2.toString(), str4));
        }
        return sb.toString();
    }

    private static Map<String, String> getSignature(Map<String, String> map, String str, String str2) {
        String str3 = "created_at";
        String str4 = (String) map.get(str3);
        String validIdentifier = getValidIdentifier(map);
        String str5 = (String) map.get(validIdentifier);
        HashMap hashMap = new HashMap();
        hashMap.put("app_secret", str2);
        hashMap.put(str3, str4);
        hashMap.put("activity_kind", str);
        hashMap.put(validIdentifier, str5);
        String str6 = "";
        String str7 = str6;
        for (Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str6);
                sb.append((String) entry.getKey());
                sb.append(" ");
                str6 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str7);
                sb2.append((String) entry.getValue());
                str7 = sb2.toString();
            }
        }
        String substring = str6.substring(0, str6.length() - 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("clear_signature", str7);
        hashMap2.put("fields", substring);
        return hashMap2;
    }

    private static String getValidIdentifier(Map<String, String> map) {
        String str = "gps_adid";
        if (map.get(str) != null) {
            return str;
        }
        String str2 = "fire_adid";
        if (map.get(str2) != null) {
            return str2;
        }
        String str3 = "android_id";
        if (map.get(str3) != null) {
            return str3;
        }
        String str4 = "mac_sha1";
        if (map.get(str4) != null) {
            return str4;
        }
        String str5 = "mac_md5";
        if (map.get(str5) != null) {
            return str5;
        }
        String str6 = "android_uuid";
        if (map.get(str6) != null) {
            return str6;
        }
        return null;
    }

    private static ResponseData readHttpResponse(HttpsURLConnection httpsURLConnection, ActivityPackage activityPackage) throws Exception {
        InputStream inputStream;
        JSONObject jSONObject;
        StringBuffer stringBuffer = new StringBuffer();
        ILogger logger = getLogger();
        ResponseData buildResponseData = ResponseData.buildResponseData(activityPackage);
        try {
            httpsURLConnection.connect();
            Integer valueOf = Integer.valueOf(httpsURLConnection.getResponseCode());
            if (valueOf.intValue() >= 400) {
                inputStream = httpsURLConnection.getErrorStream();
            } else {
                inputStream = httpsURLConnection.getInputStream();
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            String stringBuffer2 = stringBuffer.toString();
            logger.verbose("Response: %s", stringBuffer2);
            if (valueOf.intValue() == 429) {
                logger.error("Too frequent requests to the endpoint (429)", new Object[0]);
                return buildResponseData;
            }
            if (!(stringBuffer2 == null || stringBuffer2.length() == 0)) {
                try {
                    jSONObject = new JSONObject(stringBuffer2);
                } catch (JSONException e) {
                    String formatString = Util.formatString("Failed to parse json response. (%s)", e.getMessage());
                    logger.error(formatString, new Object[0]);
                    buildResponseData.message = formatString;
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return buildResponseData;
                }
                buildResponseData.jsonResponse = jSONObject;
                String optString = jSONObject.optString("message", null);
                buildResponseData.message = optString;
                buildResponseData.timestamp = jSONObject.optString("timestamp", null);
                buildResponseData.adid = jSONObject.optString("adid", null);
                String optString2 = jSONObject.optString("tracking_state", null);
                if (optString2 != null && optString2.equals("opted_out")) {
                    buildResponseData.trackingState = TrackingState.OPTED_OUT;
                }
                if (optString == null) {
                    optString = "No message found";
                }
                String str = "%s";
                if (valueOf == null || valueOf.intValue() != 200) {
                    logger.error(str, optString);
                } else {
                    logger.info(str, optString);
                    buildResponseData.success = true;
                }
            }
            return buildResponseData;
        } catch (Exception e2) {
            logger.error("Failed to read response. (%s)", e2.getMessage());
            throw e2;
        } catch (Throwable th) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static void setUserAgent(String str) {
        userAgent = str;
    }
}
