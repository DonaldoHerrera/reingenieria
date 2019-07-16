package defpackage;

import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.facebook.internal.ia;
import com.soundcloud.flippernative.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Hk reason: default package */
/* compiled from: ViewHierarchy */
public class Hk {
    private static final String a = "Hk";
    private static WeakReference<View> b = new WeakReference<>(null);
    private static Method c = null;

    public static JSONObject a(View view, JSONObject jSONObject) {
        try {
            String g = g(view);
            String f = f(view);
            Object tag = view.getTag();
            CharSequence contentDescription = view.getContentDescription();
            jSONObject.put("classname", view.getClass().getCanonicalName());
            jSONObject.put("classtypebitmask", j(view));
            jSONObject.put("id", view.getId());
            String str = "text";
            String str2 = "";
            if (!Fk.a(view)) {
                jSONObject.put(str, ia.a(ia.e(g), str2));
            } else {
                jSONObject.put(str, str2);
                jSONObject.put("is_user_input", true);
            }
            jSONObject.put("hint", ia.a(ia.e(f), str2));
            if (tag != null) {
                jSONObject.put("tag", ia.a(ia.e(tag.toString()), str2));
            }
            if (contentDescription != null) {
                jSONObject.put("description", ia.a(ia.e(contentDescription.toString()), str2));
            }
            jSONObject.put("dimension", k(view));
        } catch (JSONException e) {
            ia.a(a, (Exception) e);
        }
        return jSONObject;
    }

    public static List<View> b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    public static JSONObject c(View view) {
        if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
            b = new WeakReference<>(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            a(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List b2 = b(view);
            for (int i = 0; i < b2.size(); i++) {
                jSONArray.put(c((View) b2.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e) {
            Log.e(a, "Failed to create JSONObject for view.", e);
        }
        return jSONObject;
    }

    public static AccessibilityDelegate d(View view) {
        try {
            return (AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    public static OnTouchListener e(View view) {
        OnTouchListener onTouchListener;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
                onTouchListener = (OnTouchListener) declaredField2.get(obj);
            } else {
                onTouchListener = null;
            }
            return onTouchListener;
        } catch (NoSuchFieldException e) {
            ia.a(a, (Exception) e);
            return null;
        } catch (ClassNotFoundException e2) {
            ia.a(a, (Exception) e2);
            return null;
        } catch (IllegalAccessException e3) {
            ia.a(a, (Exception) e3);
            return null;
        }
    }

    public static String f(View view) {
        CharSequence charSequence = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    public static String g(View view) {
        Object text;
        Object obj = null;
        if (view instanceof TextView) {
            obj = ((TextView) view).getText();
            if (view instanceof Switch) {
                text = ((Switch) view).isChecked() ? "1" : BuildConfig.VERSION_NAME;
            }
            if (obj == null) {
                return "";
            }
            return obj.toString();
        }
        if (view instanceof Spinner) {
            Spinner spinner = (Spinner) view;
            if (spinner.getCount() > 0) {
                Object selectedItem = spinner.getSelectedItem();
                if (selectedItem != null) {
                    obj = selectedItem.toString();
                }
            }
        } else {
            int i = 0;
            if (view instanceof DatePicker) {
                DatePicker datePicker = (DatePicker) view;
                obj = String.format("%04d-%02d-%02d", new Object[]{Integer.valueOf(datePicker.getYear()), Integer.valueOf(datePicker.getMonth()), Integer.valueOf(datePicker.getDayOfMonth())});
            } else if (view instanceof TimePicker) {
                TimePicker timePicker = (TimePicker) view;
                obj = String.format("%02d:%02d", new Object[]{Integer.valueOf(timePicker.getCurrentHour().intValue()), Integer.valueOf(timePicker.getCurrentMinute().intValue())});
            } else if (view instanceof RadioGroup) {
                RadioGroup radioGroup = (RadioGroup) view;
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                int childCount = radioGroup.getChildCount();
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = radioGroup.getChildAt(i);
                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                        text = ((RadioButton) childAt).getText();
                        break;
                    }
                    i++;
                }
            } else if (view instanceof RatingBar) {
                obj = String.valueOf(((RatingBar) view).getRating());
            }
        }
        if (obj == null) {
        }
        obj = text;
        if (obj == null) {
        }
    }

    public static boolean h(View view) {
        boolean z = false;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(view);
                if (obj == null) {
                    return false;
                }
                Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                if (declaredField2 != null) {
                    if (((OnClickListener) declaredField2.get(obj)) != null) {
                        z = true;
                    }
                    return z;
                }
            }
        } catch (Exception e) {
            Log.e(a, "Failed to check if the view is clickable.", e);
        }
        return false;
    }

    public static boolean i(View view) {
        return view.getClass().getName().equals("com.facebook.react.ReactRootView");
    }

    private static int j(View view) {
        int i = view instanceof ImageView ? 2 : 0;
        if (h(view)) {
            i |= 32;
        }
        if (m(view)) {
            i |= 512;
        }
        if (view instanceof TextView) {
            int i2 = i | 1024 | 1;
            if (view instanceof Button) {
                i2 |= 4;
                if (view instanceof Switch) {
                    i2 |= 8192;
                } else if (view instanceof CheckBox) {
                    i2 |= 32768;
                }
            }
            if (view instanceof EditText) {
                return i2 | 2048;
            }
            return i2;
        } else if ((view instanceof Spinner) || (view instanceof DatePicker)) {
            return i | 4096;
        } else {
            if (view instanceof RatingBar) {
                return i | 65536;
            }
            if (view instanceof RadioGroup) {
                return i | 16384;
            }
            return (!(view instanceof ViewGroup) || !a(view, (View) b.get())) ? i : i | 64;
        }
    }

    private static JSONObject k(View view) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e) {
            Log.e(a, "Failed to create JSONObject for dimension.", e);
        }
        return jSONObject;
    }

    private static float[] l(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new float[]{(float) iArr[0], (float) iArr[1]};
    }

    private static boolean m(View view) {
        ViewParent parent = view.getParent();
        return (parent instanceof AdapterView) || (parent instanceof C1321gc);
    }

    public static View a(float[] fArr, View view) {
        a();
        Method method = c;
        if (!(method == null || view == null)) {
            try {
                View view2 = (View) method.invoke(null, new Object[]{fArr, view});
                if (view2 != null && view2.getId() > 0) {
                    View view3 = (View) view2.getParent();
                    if (view3 == null) {
                        view3 = null;
                    }
                    return view3;
                }
            } catch (IllegalAccessException e) {
                ia.a(a, (Exception) e);
            } catch (InvocationTargetException e2) {
                ia.a(a, (Exception) e2);
            }
        }
        return null;
    }

    public static boolean a(View view, View view2) {
        if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
            return false;
        }
        View a2 = a(l(view), view2);
        if (a2 == null || a2.getId() != view.getId()) {
            return false;
        }
        return true;
    }

    public static View a(View view) {
        while (view != null) {
            if (!i(view)) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        return null;
    }

    private static void a() {
        if (c == null) {
            try {
                c = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                c.setAccessible(true);
            } catch (ClassNotFoundException e) {
                ia.a(a, (Exception) e);
            } catch (NoSuchMethodException e2) {
                ia.a(a, (Exception) e2);
            }
        }
    }
}
