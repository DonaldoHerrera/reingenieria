package defpackage;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: ENa reason: default package and case insensitive filesystem */
/* compiled from: FirebaseAppImpl */
final class C4869ENa implements C4838DNa {
    private final Method a;
    private final Object b;

    private C4869ENa(Class cls, Object obj) throws NoSuchMethodException {
        this.b = obj;
        this.a = cls.getDeclaredMethod("isDataCollectionDefaultEnabled", new Class[0]);
    }

    public static C4838DNa a(Context context) {
        String str = "Fabric";
        try {
            Class loadClass = context.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
            return new C4869ENa(loadClass, loadClass.getDeclaredMethod("getInstance", new Class[0]).invoke(loadClass, new Object[0]));
        } catch (ClassNotFoundException unused) {
            C5328TMa.e().d(str, "Could not find class: com.google.firebase.FirebaseApp");
            return null;
        } catch (NoSuchMethodException e) {
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find method: ");
            sb.append(e.getMessage());
            e2.d(str, sb.toString());
            return null;
        } catch (Exception e3) {
            C5328TMa.e().a(str, "Unexpected error loading FirebaseApp instance.", e3);
            return null;
        }
    }

    public boolean a() {
        try {
            return ((Boolean) this.a.invoke(this.b, new Object[0])).booleanValue();
        } catch (Exception e) {
            C5328TMa.e().a("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", e);
            return false;
        }
    }
}
