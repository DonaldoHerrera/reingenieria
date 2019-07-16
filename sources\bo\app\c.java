package bo.app;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements d {
    private static final String a = Hg.a(c.class);
    private final int b;

    public c(int i) {
        this.b = i;
    }

    private HttpURLConnection b(URL url, JSONObject jSONObject, Map<String, String> map, w wVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) i.a(url);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(this.b);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod(wVar.toString());
            a(httpURLConnection, map);
            if (wVar == w.POST) {
                a(httpURLConnection, jSONObject);
            }
            return httpURLConnection;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not set up connection [");
            sb.append(url.toString());
            sb.append("] [");
            sb.append(e.getMessage());
            sb.append("].  Appboy will try to reconnect periodically.");
            throw new ar(sb.toString(), e);
        }
    }

    public JSONObject a(URI uri, Map<String, String> map) {
        return a(uri, (JSONObject) null, map, w.GET);
    }

    public JSONObject a(URI uri, Map<String, String> map, JSONObject jSONObject) {
        return a(uri, jSONObject, map, w.POST);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return a(r2, r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("Experienced IOException twice during request to [");
        r5.append(r2.toString());
        r5.append("], failing: [");
        r5.append(r3.getMessage());
        r5.append("]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        throw new bo.app.ar(r5.toString(), r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
    private JSONObject a(URI uri, JSONObject jSONObject, Map<String, String> map, w wVar) {
        URL a2 = ds.a(uri);
        if (a2 != null) {
            return a(a2, jSONObject, map, wVar);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0083 A[SYNTHETIC, Splitter:B:33:0x0083] */
    private JSONObject a(URL url, JSONObject jSONObject, Map<String, String> map, w wVar) {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        String str = "]";
        String str2 = "Caught an error trying to close the inputStream in getResult";
        if (url != null) {
            try {
                httpURLConnection = b(url, jSONObject, map, wVar);
            } catch (Throwable th) {
                th = th;
                httpURLConnection = null;
                inputStream = null;
                if (httpURLConnection != null) {
                }
                if (inputStream != null) {
                }
                throw th;
            }
        } else {
            httpURLConnection = null;
        }
        if (httpURLConnection != null) {
            try {
                inputStream = a(httpURLConnection);
                try {
                    JSONObject jSONObject2 = new JSONObject(a(new BufferedReader(new InputStreamReader(inputStream, "UTF-8"))));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e) {
                            Hg.b(a, str2, e);
                        }
                    }
                    return jSONObject2;
                } catch (IOException e2) {
                    String str3 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not read from response stream [");
                    sb.append(e2.getMessage());
                    sb.append(str);
                    Hg.b(str3, sb.toString());
                } catch (JSONException e3) {
                    String str4 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to parse response [");
                    sb2.append(e3);
                    sb2.append(str);
                    Hg.b(str4, sb2.toString());
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                    }
                    if (inputStream != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e4) {
                        Hg.b(a, str2, e4);
                    }
                }
                throw th;
            }
        } else {
            inputStream = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    Hg.b(a, str2, e5);
                }
            }
            String str5 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to get result from [");
            sb3.append(url);
            sb3.append("]. Returning null.");
            Hg.e(str5, sb3.toString());
            return null;
        }
    }

    private InputStream a(HttpURLConnection httpURLConnection) {
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() / 100 == 2) {
            if ("gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding())) {
                return new GZIPInputStream(httpURLConnection.getInputStream());
            }
            return new BufferedInputStream(httpURLConnection.getInputStream());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad Http response code from Appboy: [");
        sb.append(httpURLConnection.getResponseCode());
        sb.append("]");
        throw new ar(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject) {
        httpURLConnection.setDoOutput(true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private String a(BufferedReader bufferedReader) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine);
        }
    }
}
