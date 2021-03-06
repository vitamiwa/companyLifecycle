package CompanyLifecycle.position;

import java.math.BigDecimal;


public class Tester implements Position {

    private static final Tester INSTANCE = new Tester();

    private final String task = "test program";

    private BigDecimal hourlyRate = new BigDecimal("5.1");

    private Tester(){}

    public static Tester getInstance() {
        return INSTANCE;
    }

    @Override
    public BigDecimal getRate(int hours) {
        BigDecimal decimal = BigDecimal.valueOf(hours);
        decimal = decimal.multiply(hourlyRate);
        return decimal;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getTask() {
        return task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tester tester = (Tester) o;

        if (!task.equals(tester.task)) return false;
        return hourlyRate.equals(tester.hourlyRate);

    }

    @Override
    public int hashCode() {
        int result = task.hashCode();
        result = 31 * result + hourlyRate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Tester";
    }
}
