package com.google.android.gms.internal.cast;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.C0672y;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.J;
import com.google.android.gms.cast.framework.K;
import com.google.android.gms.cast.framework.L;
import com.google.android.gms.cast.framework.T;
import com.google.android.gms.cast.framework.U;
import java.util.Map;

public interface Ia extends IInterface {
    K a(Dr dr, CastOptions castOptions, Ka ka, Map map) throws RemoteException;

    L a(CastOptions castOptions, Dr dr, J j) throws RemoteException;

    T a(Dr dr, Dr dr2, Dr dr3) throws RemoteException;

    U a(String str, String str2, C0672y yVar) throws RemoteException;

    C0703f a(Dr dr, C0705g gVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) throws RemoteException;
}
