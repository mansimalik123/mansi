package git1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@CucumberOptions(plugin= {"json:src\\test\\java\\git1\\output\\cucumber.json"})
@RunWith(Cucumber.class)
public class giitrunner {

}
