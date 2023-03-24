
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class WeekDaysEnumTest{
    @Test
    public void ordinal() {
        assertThat(WeekDaysEnum.SUNDAY.ordinal(), is(0));
        assertThat(WeekDaysEnum.MONDAY.ordinal(), is(1));
    }

    @Test
    public void name() {
        assertThat(WeekDaysEnum.SUNDAY.name(), is("SUNDAY"));
        assertThat(WeekDaysEnum.MONDAY.name(), is("MONDAY"));
    }

    @Test
    public void valueOf() {
        assertThat(WeekDaysEnum.valueOf("SUNDAY"), is(WeekDaysEnum.SUNDAY));
        assertThat(WeekDaysEnum.valueOf("MONDAY"), is(WeekDaysEnum.MONDAY));
    }

    @Test
    public void values() {
        WeekDaysEnum[] values = WeekDaysEnum.values();
        assertThat(values.length, is(2));
        assertThat(values[0], is(WeekDaysEnum.SUNDAY));
        assertThat(values[1], is(WeekDaysEnum.MONDAY));
    }
}