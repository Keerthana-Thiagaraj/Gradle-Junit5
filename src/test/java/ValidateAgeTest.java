import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateAgeTest {

//    ValidateAge validateAge = new ValidateAge();
    private ValidateAge validateAge;

    @BeforeAll
    void initiateClass(){
        validateAge=new ValidateAge();
    }
    @Test
    void validAge() {
        assertEquals(1, validateAge.validateGivenAge(20));
    }

    @Test
    void invalidAge() {
        assertEquals(0, validateAge.validateGivenAge(2));
    }

    @Test
    void negativeAge(){
        assertEquals(0,validateAge.validateGivenAge(-2));
    }
}
