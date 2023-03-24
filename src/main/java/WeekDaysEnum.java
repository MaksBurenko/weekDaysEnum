import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class WeekDaysEnum {

    private static final List<WeekDaysEnum> items = new ArrayList<>();
    private final String value;
    private final int ordinal;
    private static final Map<String, WeekDaysEnum> map = new HashMap<>();

    public static WeekDaysEnum SUNDAY = add("SUNDAY");
    public static WeekDaysEnum MONDAY = add("MONDAY");

    private static WeekDaysEnum add(String value) {
        WeekDaysEnum item = new WeekDaysEnum(value,items.size());
        items.add(item);
        map.put(value, item);
        return item;
    }

    public WeekDaysEnum(String value, int ordinal) {
        this.value = value;
        this.ordinal = ordinal;
    }

    public int ordinal() {
        return ordinal;
    }

    public String name() {
        return value;
    }

    public static WeekDaysEnum valueOf(String value){
        return map.get(value);
    }

    public static WeekDaysEnum[] values(){
        return items.toArray(items.toArray(new WeekDaysEnum[0]));
    }
}
