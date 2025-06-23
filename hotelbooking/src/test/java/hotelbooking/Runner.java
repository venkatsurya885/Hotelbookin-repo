package hotelbooking;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

features ="C:\\Users\\hp\\eclipse-workspace\\hotelbooking\\src\\test\\resources\\Hotel\\Hotel.feature",
glue="hotelbooking"


)
public class Runner {

}
