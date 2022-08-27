package repository;

import enums.EmploymentStatus;
import enums.Gender;
import pojo.Seamfixer;

import java.util.Arrays;
import java.util.List;

public class DataSource {
    public static final List<Seamfixer> seamfixers = Arrays.asList(
            new Seamfixer("Chibuzor", "Duru", 25, 2, Gender.MALE, "System Admin", EmploymentStatus.FTE ),
            new Seamfixer("Chukwuemeka", "Chukwulobe", 25, 2, Gender.MALE, "Software Engineer", EmploymentStatus.FTE ),
            new Seamfixer("Jerimiah", "Ogoliegbune", 23, 2, Gender.MALE, "System Admin", EmploymentStatus.FTE ),
            new Seamfixer("Chibuzor", "Duru", 25, 2, Gender.MALE, "System Admin", EmploymentStatus.FTE ),
            new Seamfixer("Chibuzor", "Duru", 25, 2, Gender.MALE, "System Admin", EmploymentStatus.FTE ),
            new Seamfixer("Chibuzor", "Duru", 25, 2, Gender.MALE, "System Admin", EmploymentStatus.FTE ),
            new Seamfixer("Chibuzor", "Duru", 25, 2, Gender.MALE, "System Admin", EmploymentStatus.FTE ),
            new Seamfixer("Chibuzor", "Duru", 25, 2, Gender.MALE, "System Admin", EmploymentStatus.FTE ),
            new Seamfixer("Chibuzor", "Duru", 25, 2, Gender.MALE, "System Admin", EmploymentStatus.FTE ),
            new Seamfixer("Chibuzor", "Duru", 25, 2, Gender.MALE, "System Admin", EmploymentStatus.FTE ),
            new Seamfixer("Chibuzor", "Duru", 25, 2, Gender.MALE, "System Admin", EmploymentStatus.FTE )
    );
}
