package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import java.util.List;
import java.util.Map;

public final class IcyHeaders implements Entry {
    public static final Creator<IcyHeaders> CREATOR = new b();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        C1852xq.a(i2 == -1 || i2 > 0);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f6  */
    public static IcyHeaders a(Map<String, List<String>> map) {
        int i;
        boolean z;
        List list;
        boolean z2;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z3;
        List list5;
        int i2;
        int i3;
        String str4 = "Invalid metadata interval: ";
        List list6 = (List) map.get("icy-br");
        String str5 = "IcyHeaders";
        int i4 = -1;
        if (list6 != null) {
            String str6 = (String) list6.get(0);
            try {
                i3 = Integer.parseInt(str6) * 1000;
                if (i3 > 0) {
                    z = true;
                } else {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid bitrate: ");
                        sb.append(str6);
                        Iq.d(str5, sb.toString());
                        z = false;
                        i3 = -1;
                    } catch (NumberFormatException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid bitrate header: ");
                        sb2.append(str6);
                        Iq.d(str5, sb2.toString());
                        i = i3;
                        z = false;
                        list = (List) map.get("icy-genre");
                        if (list != null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 != null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 != null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 != null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        if (z2) {
                        }
                    }
                }
                i = i3;
            } catch (NumberFormatException unused2) {
                i3 = -1;
                StringBuilder sb22 = new StringBuilder();
                sb22.append("Invalid bitrate header: ");
                sb22.append(str6);
                Iq.d(str5, sb22.toString());
                i = i3;
                z = false;
                list = (List) map.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) map.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) map.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) map.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) map.get("icy-metaint");
                if (list5 != null) {
                }
                if (z2) {
                }
            }
        } else {
            z = false;
            i = -1;
        }
        list = (List) map.get("icy-genre");
        if (list != null) {
            str = (String) list.get(0);
            z2 = true;
        } else {
            z2 = z;
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 != null) {
            str2 = (String) list2.get(0);
            z2 = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 != null) {
            str3 = (String) list3.get(0);
            z2 = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 != null) {
            z3 = ((String) list4.get(0)).equals("1");
            z2 = true;
        } else {
            z3 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str7 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str7);
                if (parseInt > 0) {
                    i4 = parseInt;
                    z2 = true;
                } else {
                    try {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str4);
                        sb3.append(str7);
                        Iq.d(str5, sb3.toString());
                    } catch (NumberFormatException unused3) {
                        i4 = parseInt;
                    }
                }
            } catch (NumberFormatException unused4) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(str7);
                Iq.d(str5, sb4.toString());
                i2 = i4;
                if (z2) {
                }
            }
            i2 = i4;
        } else {
            i2 = -1;
        }
        if (z2) {
            return null;
        }
        IcyHeaders icyHeaders = new IcyHeaders(i, str, str2, str3, z3, i2);
        return icyHeaders;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.a != icyHeaders.a || !C0471ar.a((Object) this.b, (Object) icyHeaders.b) || !C0471ar.a((Object) this.c, (Object) icyHeaders.c) || !C0471ar.a((Object) this.d, (Object) icyHeaders.d) || this.e != icyHeaders.e || this.f != icyHeaders.f) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (527 + this.a) * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IcyHeaders: name=\"");
        sb.append(this.c);
        sb.append("\", genre=\"");
        sb.append(this.b);
        sb.append("\", bitrate=");
        sb.append(this.a);
        sb.append(", metadataInterval=");
        sb.append(this.f);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        C0471ar.a(parcel, this.e);
        parcel.writeInt(this.f);
    }

    IcyHeaders(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = C0471ar.a(parcel);
        this.f = parcel.readInt();
    }
}
