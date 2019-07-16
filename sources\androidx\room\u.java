package androidx.room;

/* compiled from: RoomMasterTable */
public class u {
    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(str);
        sb.append("')");
        return sb.toString();
    }
}
