package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import androidx.appcompat.widget.O;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: QGa reason: default package and case insensitive filesystem */
/* compiled from: AndroidUtils */
public final class C5232QGa {

    /* renamed from: QGa$a */
    /* compiled from: AndroidUtils */
    private static class a implements Comparator<String> {
        final Map<String, Integer> a;

        a(Map<String, Integer> map) {
            this.a = map;
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return ((Integer) this.a.get(str)).intValue() >= ((Integer) this.a.get(str2)).intValue() ? -1 : 1;
        }
    }

    private C5232QGa() {
    }

    public static ProgressDialog a(Context context, int i) {
        return a(context, i, 0);
    }

    public static String[] b(Context context) {
        Account[] accounts;
        HashMap hashMap = new HashMap();
        for (Account account : AccountManager.get(context).getAccounts()) {
            if (C7315sGa.a((CharSequence) account.name)) {
                if (hashMap.get(account.name) == null) {
                    hashMap.put(account.name, Integer.valueOf(1));
                } else {
                    String str = account.name;
                    hashMap.put(str, Integer.valueOf(((Integer) hashMap.get(str)).intValue() + 1));
                }
            }
        }
        return a((Map<String, Integer>) hashMap);
    }

    private static ProgressDialog a(Context context, int i, int i2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        if (i2 > 0) {
            progressDialog.setTitle(i2);
        }
        if (i > 0) {
            progressDialog.setMessage(context.getString(i));
        }
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(false);
        progressDialog.setOnCancelListener(null);
        a((Dialog) progressDialog);
        return progressDialog;
    }

    public static void a(Context context, O o) {
        if (!C6768kIa.a(context).isFinishing()) {
            o.d();
        }
    }

    public static String[] b(Context context, String str) {
        Account[] a2 = a(context, str);
        String[] strArr = new String[a2.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = a2[i].name;
        }
        return strArr;
    }

    public static boolean a(Dialog dialog) {
        if (C6768kIa.a(dialog.getContext()).isFinishing()) {
            return false;
        }
        dialog.show();
        return true;
    }

    public static void a(C0361c cVar, C0370l lVar, String str) {
        if (lVar != null && !lVar.f()) {
            cVar.show(lVar, str);
        }
    }

    public static void a(DialogFragment dialogFragment, FragmentManager fragmentManager, String str) {
        if (fragmentManager == null) {
            return;
        }
        if (VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) {
            dialogFragment.show(fragmentManager, str);
        }
    }

    public static void a(Context context, int i, Object... objArr) {
        Toast toast;
        if (objArr.length > 0) {
            toast = Toast.makeText(context, context.getString(i, objArr), 1);
        } else {
            toast = Toast.makeText(context, i, 1);
        }
        toast.show();
    }

    public static void a(Context context, CharSequence charSequence) {
        Toast.makeText(context, charSequence, 1).show();
    }

    public static boolean a() {
        try {
            return ActivityManager.isUserAMonkey();
        } catch (RuntimeException unused) {
            return true;
        }
    }

    public static boolean a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    static String[] a(Map<String, Integer> map) {
        TreeMap treeMap = new TreeMap(new a(map));
        treeMap.putAll(map);
        return (String[]) treeMap.keySet().toArray(new String[map.size()]);
    }

    public static Account[] a(Context context, String str) {
        return a(AccountManager.get(context), str);
    }

    public static Account[] a(AccountManager accountManager, String str) {
        return accountManager.getAccountsByType(str);
    }
}
