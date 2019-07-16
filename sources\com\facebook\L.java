package com.facebook;

import android.util.Log;
import com.facebook.internal.W;
import com.facebook.internal.ia;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: GraphResponse */
public class L {
    private static final String a = "L";
    private final HttpURLConnection b;
    private final JSONObject c;
    private final JSONArray d;
    private final FacebookRequestError e;
    private final String f;
    private final GraphRequest g;

    L(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    public final FacebookRequestError a() {
        return this.e;
    }

    public final JSONObject b() {
        return this.c;
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            String str2 = "%d";
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.b != null ? this.b.getResponseCode() : 200);
            str = String.format(locale, str2, objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{Response: ");
        sb.append(" responseCode: ");
        sb.append(str);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", error: ");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    L(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    static List<L> a(HttpURLConnection httpURLConnection, K k) {
        InputStream inputStream;
        String str = "Response <Error>: %s";
        String str2 = "Response";
        InputStream inputStream2 = null;
        try {
            if (B.s()) {
                if (httpURLConnection.getResponseCode() >= 400) {
                    inputStream = httpURLConnection.getErrorStream();
                } else {
                    inputStream = httpURLConnection.getInputStream();
                }
                return a(inputStream2, httpURLConnection, k);
            }
            String str3 = "GraphRequest can't be used when Facebook SDK isn't fully initialized";
            Log.e(a, str3);
            throw new C0594t(str3);
        } catch (C0594t e2) {
            W.a(O.REQUESTS, str2, str, e2);
            return a((List<GraphRequest>) k, httpURLConnection, e2);
        } catch (Exception e3) {
            W.a(O.REQUESTS, str2, str, e3);
            return a((List<GraphRequest>) k, httpURLConnection, new C0594t((Throwable) e3));
        } finally {
            ia.a(inputStream2);
        }
    }

    L(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    L(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.g = graphRequest;
        this.b = httpURLConnection;
        this.f = str;
        this.c = jSONObject;
        this.d = jSONArray;
        this.e = facebookRequestError;
    }

    static List<L> a(InputStream inputStream, HttpURLConnection httpURLConnection, K k) throws C0594t, JSONException, IOException {
        String a2 = ia.a(inputStream);
        W.a(O.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a2.length()), a2);
        return a(a2, httpURLConnection, k);
    }

    static List<L> a(String str, HttpURLConnection httpURLConnection, K k) throws C0594t, JSONException, IOException {
        List<L> a2 = a(httpURLConnection, (List<GraphRequest>) k, new JSONTokener(str).nextValue());
        W.a(O.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", k.k(), Integer.valueOf(str.length()), a2);
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    private static List<L> a(HttpURLConnection httpURLConnection, List<GraphRequest> list, Object obj) throws C0594t, JSONException {
        Object obj2;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            GraphRequest graphRequest = (GraphRequest) list.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", obj);
                jSONObject.put("code", httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj2 = jSONArray;
            } catch (JSONException e2) {
                arrayList.add(new L(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) e2)));
            } catch (IOException e3) {
                arrayList.add(new L(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) e3)));
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() == size) {
                    for (int i = 0; i < jSONArray2.length(); i++) {
                        GraphRequest graphRequest2 = (GraphRequest) list.get(i);
                        try {
                            arrayList.add(a(graphRequest2, httpURLConnection, jSONArray2.get(i), obj));
                        } catch (JSONException e4) {
                            arrayList.add(new L(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) e4)));
                        } catch (C0594t e5) {
                            arrayList.add(new L(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) e5)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new C0594t("Unexpected number of results");
        }
        obj2 = obj;
        if (obj2 instanceof JSONArray) {
        }
        throw new C0594t("Unexpected number of results");
    }

    private static L a(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a2 = FacebookRequestError.a(jSONObject, obj2, httpURLConnection);
            if (a2 != null) {
                Log.e(a, a2.toString());
                if (a2.b() == 190 && ia.a(graphRequest.d())) {
                    if (a2.h() != 493) {
                        AccessToken.b(null);
                    } else if (!AccessToken.c().n()) {
                        AccessToken.a();
                    }
                }
                return new L(graphRequest, httpURLConnection, a2);
            }
            Object a3 = ia.a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (a3 instanceof JSONObject) {
                return new L(graphRequest, httpURLConnection, a3.toString(), (JSONObject) a3);
            }
            if (a3 instanceof JSONArray) {
                return new L(graphRequest, httpURLConnection, a3.toString(), (JSONArray) a3);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new L(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Got unexpected object type in response, class: ");
        sb.append(obj.getClass().getSimpleName());
        throw new C0594t(sb.toString());
    }

    static List<L> a(List<GraphRequest> list, HttpURLConnection httpURLConnection, C0594t tVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new L((GraphRequest) list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) tVar)));
        }
        return arrayList;
    }
}
