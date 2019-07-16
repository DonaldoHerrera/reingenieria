package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.cast.C0704fa;
import com.google.android.gms.internal.cast.sa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "MediaMetadataCreator")
@Reserved({1})
public class MediaMetadata extends AbstractSafeParcelable {
    public static final Creator<MediaMetadata> CREATOR = new C0691y();
    private static final String[] a = {null, "String", "int", "double", "ISO-8601 date String"};
    private static final a b;
    @Field(getter = "getImages", id = 2)
    private final List<WebImage> c;
    @Field(id = 3)
    private final Bundle d;
    @Field(getter = "getMediaType", id = 4)
    private int e;

    private static class a {
        private final Map<String, String> a = new HashMap();
        private final Map<String, String> b = new HashMap();
        private final Map<String, Integer> c = new HashMap();

        public final a a(String str, String str2, int i) {
            this.a.put(str, str2);
            this.b.put(str2, str);
            this.c.put(str, Integer.valueOf(i));
            return this;
        }

        public final String b(String str) {
            return (String) this.b.get(str);
        }

        public final int c(String str) {
            Integer num = (Integer) this.c.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        public final String a(String str) {
            return (String) this.a.get(str);
        }
    }

    static {
        a aVar = new a();
        aVar.a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        aVar.a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        aVar.a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        aVar.a("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        aVar.a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        aVar.a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        aVar.a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        aVar.a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        aVar.a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        aVar.a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        aVar.a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        aVar.a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        aVar.a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        aVar.a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        aVar.a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        aVar.a("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        aVar.a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        aVar.a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        aVar.a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        aVar.a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        aVar.a("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        aVar.a("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        aVar.a("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        aVar.a("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        b = aVar;
    }

    @Constructor
    MediaMetadata(@Param(id = 2) List<WebImage> list, @Param(id = 3) Bundle bundle, @Param(id = 4) int i) {
        this.c = list;
        this.d = bundle;
        this.e = i;
    }

    public int F() {
        return this.e;
    }

    public boolean G() {
        List<WebImage> list = this.c;
        return list != null && !list.isEmpty();
    }

    public boolean a(String str) {
        return this.d.containsKey(str);
    }

    public String b(String str) {
        a(str, 1);
        return this.d.getString(str);
    }

    public long c(String str) {
        a(str, 5);
        return this.d.getLong(str);
    }

    public void clear() {
        this.d.clear();
        this.c.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return a(this.d, mediaMetadata.d) && this.c.equals(mediaMetadata.c);
    }

    public int hashCode() {
        int i = 17;
        for (String str : this.d.keySet()) {
            i = (i * 31) + this.d.get(str).hashCode();
        }
        return (i * 31) + this.c.hashCode();
    }

    public List<WebImage> i() {
        return this.c;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.e);
        } catch (JSONException unused) {
        }
        JSONArray a2 = sa.a(this.c);
        if (!(a2 == null || a2.length() == 0)) {
            try {
                jSONObject.put("images", a2);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = this.e;
        String str = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        String str2 = "com.google.android.gms.cast.metadata.SUBTITLE";
        String str3 = "com.google.android.gms.cast.metadata.TITLE";
        if (i == 0) {
            Collections.addAll(arrayList, new String[]{str3, "com.google.android.gms.cast.metadata.ARTIST", str2, str});
        } else if (i == 1) {
            Collections.addAll(arrayList, new String[]{str3, "com.google.android.gms.cast.metadata.STUDIO", str2, str});
        } else if (i == 2) {
            Collections.addAll(arrayList, new String[]{str3, "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"});
        } else if (i == 3) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 4) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"});
        } else if (i == 5) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", str3, "com.google.android.gms.cast.metadata.BOOK_TITLE", str2});
        }
        Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"});
        try {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                String str4 = (String) obj;
                if (this.d.containsKey(str4)) {
                    int c2 = b.c(str4);
                    if (c2 != 1) {
                        if (c2 == 2) {
                            jSONObject.put(b.a(str4), this.d.getInt(str4));
                        } else if (c2 == 3) {
                            jSONObject.put(b.a(str4), this.d.getDouble(str4));
                        } else if (c2 != 4) {
                            if (c2 == 5) {
                                jSONObject.put(b.a(str4), ((double) this.d.getLong(str4)) / 1000.0d);
                            }
                        }
                    }
                    jSONObject.put(b.a(str4), this.d.getString(str4));
                }
            }
            for (String str5 : this.d.keySet()) {
                if (!str5.startsWith("com.google.")) {
                    Object obj2 = this.d.get(str5);
                    if (obj2 instanceof String) {
                        jSONObject.put(str5, obj2);
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put(str5, obj2);
                    } else if (obj2 instanceof Double) {
                        jSONObject.put(str5, obj2);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, i(), false);
        SafeParcelWriter.writeBundle(parcel, 3, this.d, false);
        SafeParcelWriter.writeInt(parcel, 4, F());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private static void a(String str, int i) throws IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            int c2 = b.c(str);
            if (c2 != i && c2 != 0) {
                String str2 = a[i];
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                sb.append("Value for ");
                sb.append(str);
                sb.append(" must be a ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    public MediaMetadata() {
        this(0);
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "metadataType";
        clear();
        this.e = 0;
        try {
            this.e = jSONObject2.getInt(str);
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        if (optJSONArray != null) {
            sa.a(this.c, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.e;
        String str2 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        String str3 = "com.google.android.gms.cast.metadata.SUBTITLE";
        String str4 = "com.google.android.gms.cast.metadata.TITLE";
        if (i == 0) {
            Collections.addAll(arrayList, new String[]{str4, "com.google.android.gms.cast.metadata.ARTIST", str3, str2});
        } else if (i == 1) {
            Collections.addAll(arrayList, new String[]{str4, "com.google.android.gms.cast.metadata.STUDIO", str3, str2});
        } else if (i == 2) {
            Collections.addAll(arrayList, new String[]{str4, "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"});
        } else if (i == 3) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 4) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"});
        } else if (i == 5) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", str4, "com.google.android.gms.cast.metadata.BOOK_TITLE", str3});
        }
        if (C0704fa.h) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER"});
        }
        Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"});
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str5 = (String) keys.next();
                if (!str.equals(str5)) {
                    String b2 = b.b(str5);
                    if (b2 == null) {
                        Object obj = jSONObject2.get(str5);
                        if (obj instanceof String) {
                            this.d.putString(str5, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.d.putInt(str5, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.d.putDouble(str5, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(b2)) {
                        try {
                            Object obj2 = jSONObject2.get(str5);
                            if (obj2 != null) {
                                int c2 = b.c(b2);
                                if (c2 != 1) {
                                    if (c2 != 2) {
                                        if (c2 == 3) {
                                            double optDouble = jSONObject2.optDouble(str5);
                                            if (!Double.isNaN(optDouble)) {
                                                this.d.putDouble(b2, optDouble);
                                            }
                                        } else if (c2 != 4) {
                                            if (c2 == 5) {
                                                this.d.putLong(b2, (long) (((double) jSONObject2.optLong(str5)) * 1000.0d));
                                            }
                                        } else if ((obj2 instanceof String) && sa.a((String) obj2) != null) {
                                            this.d.putString(b2, (String) obj2);
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.d.putInt(b2, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.d.putString(b2, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    private final boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }
}
