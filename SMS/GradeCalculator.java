package SMS;

import java.util.List;

public class GradeCalculator {

    public double calculateAverage(List<Double> grades) {
        if (grades == null || grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.size();
    }
}