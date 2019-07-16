package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.B;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: al reason: default package and case insensitive filesystem */
/* compiled from: InAppPurchaseEventManager */
class C0311al {
    private static final String a = "al";
    private static final HashMap<String, Method> b = new HashMap<>();
    private static final HashMap<String, Class<?>> c = new HashMap<>();
    private static final String d = B.e().getPackageName();
    private static final SharedPreferences e = B.e().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences f = B.e().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    private static final SharedPreferences g = B.e().getSharedPreferences("com.facebook.internal.PURCHASE_SUBS", 0);

    public static Object a(Context context, IBinder iBinder) {
        return a(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
    }

    private static Map<String, String> b(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(3);
            objArr[1] = d;
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (a2 != null) {
                Bundle bundle2 = (Bundle) a2;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            hashMap.put(arrayList.get(i), stringArrayList.get(i));
                        }
                    }
                    a((Map<String, String>) hashMap);
                }
            }
        }
        return hashMap;
    }

    private static Boolean c(Context context, Object obj, String str) {
        boolean z = false;
        if (obj == null) {
            return Boolean.valueOf(false);
        }
        Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{Integer.valueOf(3), d, str});
        if (a2 != null && ((Integer) a2).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private static String a(Context context, String str, Object obj, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return (String) a(context, arrayList, obj, z).get(str);
    }

    public static Map<String, C1268el> c(Context context, Object obj) {
        HashMap hashMap = new HashMap();
        Iterator it = b(context, obj, "subs").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C1268el a2 = a(context, str, obj);
            if (!(a2 == C1268el.DUPLICATED || a2 == C1268el.UNKNOWN)) {
                hashMap.put(str, a2);
            }
        }
        return hashMap;
    }

    public static Map<String, String> a(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        Map<String, String> b2 = b(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!b2.containsKey(str)) {
                arrayList2.add(str);
            }
        }
        b2.putAll(b(context, arrayList2, obj, z));
        return b2;
    }

    private static void a(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Editor edit = e.edit();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            sb.append(";");
            sb.append((String) entry.getValue());
            edit.putString(str, sb.toString());
        }
        edit.apply();
    }

    private static Map<String, String> b(ArrayList<String> arrayList) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String string = e.getString(str, null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(str, split[1]);
                }
            }
        }
        return hashMap;
    }

    static ArrayList<String> a(Context context, Object obj, Set<Integer> set) {
        ArrayList<String> arrayList = new ArrayList<>();
        Map all = g.getAll();
        if (all.isEmpty()) {
            return arrayList;
        }
        ArrayList a2 = a(context, obj, "subs", set);
        HashSet hashSet = new HashSet();
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(new JSONObject((String) it.next()).getString("productId"));
            } catch (JSONException e2) {
                Log.e(a, "Error parsing purchase json", e2);
            }
        }
        HashSet<String> hashSet2 = new HashSet<>();
        for (Entry key : all.entrySet()) {
            String str = (String) key.getKey();
            if (!hashSet.contains(str)) {
                hashSet2.add(str);
            }
        }
        Editor edit = g.edit();
        for (String str2 : hashSet2) {
            String str3 = "";
            String string = g.getString(str2, str3);
            edit.remove(str2);
            if (!string.isEmpty()) {
                arrayList.add(g.getString(str2, str3));
            }
        }
        edit.apply();
        return arrayList;
    }

    public static ArrayList<String> b(Context context, Object obj) {
        return a(b(context, obj, "inapp"));
    }

    private static ArrayList<String> b(Context context, Object obj, String str) {
        return a(context, obj, str, (Set<Integer>) new HashSet<Integer>());
    }

    private static C1268el a(Context context, String str, Object obj) {
        C1268el elVar;
        String str2 = "autoRenewing";
        String str3 = "purchaseToken";
        C1268el elVar2 = null;
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("productId");
            String string2 = g.getString(string, "");
            JSONObject jSONObject2 = string2.isEmpty() ? new JSONObject() : new JSONObject(string2);
            if (!jSONObject2.optString(str3).equals(jSONObject.get(str3))) {
                if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) < 86400) {
                    String a2 = a(context, string, obj, true);
                    if (a2 != null) {
                        String optString = new JSONObject(a2).optString("freeTrialPeriod");
                        if (optString != null) {
                            if (!optString.isEmpty()) {
                                elVar = C1268el.START_TRIAL;
                                elVar2 = elVar;
                            }
                        }
                        elVar = C1268el.SUBSCRIBE;
                        elVar2 = elVar;
                    }
                }
                if (elVar2 == null) {
                    elVar2 = C1268el.HEARTBEAT;
                }
            }
            if (elVar2 == null && !string2.isEmpty()) {
                boolean z = jSONObject2.getBoolean(str2);
                boolean z2 = jSONObject.getBoolean(str2);
                if (!z2 && z) {
                    elVar2 = C1268el.CANCEL;
                } else if (!z && z2) {
                    elVar2 = C1268el.RESTORE;
                }
            }
            String str4 = "LAST_LOGGED_TIME_SEC";
            if (elVar2 == null) {
                if (!string2.isEmpty()) {
                    if (currentTimeMillis - jSONObject2.getLong(str4) > 43200) {
                        elVar2 = C1268el.HEARTBEAT;
                    } else {
                        elVar2 = C1268el.DUPLICATED;
                    }
                }
            }
            if (elVar2 != C1268el.DUPLICATED) {
                jSONObject.put(str4, currentTimeMillis);
                g.edit().putString(string, jSONObject.toString()).apply();
            }
            return elVar2;
        } catch (JSONException e2) {
            Log.e(a, "parsing purchase failure: ", e2);
            return C1268el.UNKNOWN;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067 A[EDGE_INSN: B:21:0x0067->B:17:0x0067 ?: BREAK  , SYNTHETIC] */
    private static ArrayList<String> a(Context context, Object obj, String str, Set<Integer> set) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (obj == null) {
            return arrayList;
        }
        if (c(context, obj, str).booleanValue()) {
            Object obj2 = null;
            int i = 0;
            do {
                Context context2 = context;
                Object a2 = a(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{Integer.valueOf(3), d, str, obj2}, set);
                if (a2 != null) {
                    Bundle bundle = (Bundle) a2;
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        if (stringArrayList == null) {
                            break;
                        }
                        i += stringArrayList.size();
                        arrayList.addAll(stringArrayList);
                        obj2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i >= 30) {
                            break;
                        }
                    }
                } else {
                    set.add(Integer.valueOf(7));
                }
                obj2 = null;
                if (i >= 30) {
                    break;
                    break;
                }
            } while (obj2 != null);
            if (i >= 30) {
                set.add(Integer.valueOf(6));
            }
        } else {
            set.add(Integer.valueOf(0));
        }
        return arrayList;
    }

    public static ArrayList<String> a(Context context, Object obj) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (obj == null) {
            return arrayList;
        }
        Class a2 = a(context, "com.android.vending.billing.IInAppBillingService");
        if (a2 == null || a(a2, "getPurchaseHistory") == null) {
            return arrayList;
        }
        return a(a(context, obj, "inapp"));
    }

    private static ArrayList<String> a(Context context, Object obj, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (c(context, obj, str).booleanValue()) {
            char c2 = 0;
            Boolean valueOf = Boolean.valueOf(false);
            Object obj2 = null;
            int i = 0;
            while (true) {
                Object[] objArr = new Object[5];
                objArr[c2] = Integer.valueOf(6);
                objArr[1] = d;
                objArr[2] = str;
                objArr[3] = obj2;
                objArr[4] = new Bundle();
                Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                if (a2 != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) a2;
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        Iterator it = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST").iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str2 = (String) it.next();
                            try {
                                if (currentTimeMillis - (new JSONObject(str2).getLong("purchaseTime") / 1000) > 1200) {
                                    valueOf = Boolean.valueOf(true);
                                    break;
                                }
                                arrayList.add(str2);
                                i++;
                            } catch (JSONException e2) {
                                Log.e(a, "parsing purchase failure: ", e2);
                            }
                        }
                        obj2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i >= 30 || obj2 == null || valueOf.booleanValue()) {
                            break;
                        }
                        c2 = 0;
                    }
                }
                obj2 = null;
                c2 = 0;
            }
        }
        return arrayList;
    }

    private static ArrayList<String> a(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Editor edit = f.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("productId");
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400) {
                    if (!f.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                }
            } catch (JSONException e2) {
                Log.e(a, "parsing purchase failure: ", e2);
            }
        }
        edit.apply();
        return arrayList2;
    }

    private static Method a(Class<?> cls, String str) {
        Method method = (Method) b.get(str);
        if (method != null) {
            return method;
        }
        Class[] clsArr = null;
        char c2 = 65535;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                clsArr = new Class[]{IBinder.class};
            } else if (c2 == 1) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, Bundle.class};
            } else if (c2 == 2) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class};
            } else if (c2 == 3) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class};
            } else if (c2 == 4) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class};
            }
            method = cls.getDeclaredMethod(str, clsArr);
            b.put(str, method);
        } catch (NoSuchMethodException e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(".");
            sb.append(str);
            sb.append(" method not found");
            Log.e(str2, sb.toString(), e2);
        }
        return method;
    }

    private static Class<?> a(Context context, String str) {
        Class<?> cls = (Class) c.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            c.put(str, cls);
        } catch (ClassNotFoundException e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is not available, please add ");
            sb.append(str);
            sb.append(" to the project.");
            Log.e(str2, sb.toString(), e2);
        }
        return cls;
    }

    private static Object a(Context context, String str, String str2, Object obj, Object[] objArr) {
        return a(context, str, str2, obj, objArr, new HashSet());
    }

    private static Object a(Context context, String str, String str2, Object obj, Object[] objArr, Set<Integer> set) {
        Class a2 = a(context, str);
        if (a2 == null) {
            set.add(Integer.valueOf(1));
            return null;
        }
        Method a3 = a(a2, str2);
        if (a3 == null) {
            set.add(Integer.valueOf(2));
            return null;
        }
        if (obj != null) {
            obj = a2.cast(obj);
        } else {
            set.add(Integer.valueOf(3));
        }
        try {
            return a3.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            set.add(Integer.valueOf(4));
            return null;
        } catch (InvocationTargetException unused2) {
            set.add(Integer.valueOf(5));
            return null;
        }
    }

    public static void a() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String str = "LAST_CLEARED_TIME";
        long j = e.getLong(str, 0);
        if (j == 0) {
            e.edit().putLong(str, currentTimeMillis).apply();
        } else if (currentTimeMillis - j > 604800) {
            e.edit().clear().putLong(str, currentTimeMillis).apply();
        }
    }
}
