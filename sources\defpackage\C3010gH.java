package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gH reason: default package and case insensitive filesystem */
public class C3010gH {
    private static WindowManager a;
    private static String[] b = {"x", "y", "width", "height"};
    static float c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: gH$a */
    private static class a {
        final float a;
        final float b;

        a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }
    }

    static float a(int i) {
        return ((float) i) / c;
    }

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) a(i));
            jSONObject.put("y", (double) a(i2));
            jSONObject.put("width", (double) a(i3));
            jSONObject.put("height", (double) a(i4));
        } catch (JSONException e) {
            C3029hH.a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void a(Context context) {
        if (context != null) {
            c = context.getResources().getDisplayMetrics().density;
            a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject) {
        a b2 = b(jSONObject);
        try {
            jSONObject.put("width", (double) b2.a);
            jSONObject.put("height", (double) b2.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C3029hH.a("Error with setting ad session id", e);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            C3029hH.a(sb.toString(), e);
        }
    }

    public static void a(JSONObject jSONObject, List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
        } catch (JSONException e) {
            C3029hH.a("Error with setting friendly obstruction", e);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str = "childViews";
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put(str, optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        boolean z = true;
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        if (jSONArray.length() != jSONArray2.length()) {
            z = false;
        }
        return z;
    }

    private static a b(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
                return new a(f2, f);
            }
        } else if (a != null) {
            Point point = new Point(0, 0);
            a.getDefaultDisplay().getRealSize(point);
            f2 = a(point.x);
            f = a(point.y);
            return new a(f2, f);
        }
        f = 0.0f;
        return new a(f2, f);
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z = true;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (!c(jSONObject, jSONObject2) || !d(jSONObject, jSONObject2) || !e(jSONObject, jSONObject2) || !f(jSONObject, jSONObject2)) {
            z = false;
        }
        return z;
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        String str = "";
        String str2 = "adSessionId";
        return jSONObject.optString(str2, str).equals(jSONObject2.optString(str2, str));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        String str = "isFriendlyObstructionFor";
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        JSONArray optJSONArray2 = jSONObject2.optJSONArray(str);
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            String str2 = "";
            if (!optJSONArray.optString(i, str2).equals(optJSONArray2.optString(i, str2))) {
                return false;
            }
        }
        return true;
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        String str = "childViews";
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        JSONArray optJSONArray2 = jSONObject2.optJSONArray(str);
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
