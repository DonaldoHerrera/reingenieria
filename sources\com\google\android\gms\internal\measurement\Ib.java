package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

public interface Ib extends IInterface {
    Bundle i(Bundle bundle) throws RemoteException;
}
