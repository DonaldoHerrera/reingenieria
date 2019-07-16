package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: Dr reason: default package */
public interface Dr extends IInterface {

    /* renamed from: Dr$a */
    public static abstract class a extends C1854xs implements Dr {

        /* renamed from: Dr$a$a reason: collision with other inner class name */
        public static class C0000a extends C1824ws implements Dr {
            C0000a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static Dr asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof Dr) {
                return (Dr) queryLocalInterface;
            }
            return new C0000a(iBinder);
        }
    }
}
