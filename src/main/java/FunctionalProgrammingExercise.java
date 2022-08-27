import enums.Gender;
import pojo.Seamfixer;

import java.util.List;

public class FunctionalProgrammingExercise {

    public double findAverageAgeOfFemaleSeamfixers(List<Seamfixer> seamfixers) {
     return seamfixers.stream()
                .filter(seamfixer -> seamfixer.getGender().equals(Gender.FEMALE))
                .mapToDouble(seamfixer -> (double) seamfixer.getAge())
                .average().getAsDouble();
    }

}
