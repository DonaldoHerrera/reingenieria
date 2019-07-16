package defpackage;

import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: Oi reason: default package */
/* compiled from: DefaultAppMeasurementEventListenerRegistrar */
class Oi implements InvocationHandler {
    final /* synthetic */ Pi a;

    Oi(Pi pi) {
        this.a = pi;
    }

    public boolean a(Object obj, Object obj2) {
        boolean z = true;
        if (obj == obj2) {
            return true;
        }
        if (obj2 == null || !Proxy.isProxyClass(obj2.getClass()) || !super.equals(Proxy.getInvocationHandler(obj2))) {
            z = false;
        }
        return z;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (objArr.length == 1 && name.equals("equals")) {
            return Boolean.valueOf(a(obj, objArr[0]));
        }
        if (objArr.length == 0 && name.equals("hashCode")) {
            return Integer.valueOf(super.hashCode());
        }
        if (objArr.length == 0 && name.equals("toString")) {
            return super.toString();
        }
        if (objArr.length == 4 && name.equals("onEvent") && Pi.a(objArr)) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            Bundle bundle = (Bundle) objArr[2];
            if (str != null && !str.equals("crash")) {
                Pi.b(this.a.b, str2, bundle);
                return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected method invoked on AppMeasurement.EventListener: ");
        sb.append(name);
        sb.append("(");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(objArr[i].getClass().getName());
        }
        sb2.append("); returning null");
        C5328TMa.e().e("CrashlyticsCore", sb2.toString());
        return null;
    }
}
