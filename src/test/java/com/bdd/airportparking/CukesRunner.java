package com.bdd.airportparking;

import cucumber.api.junit.*;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"pretty", "html:target/cucumber", "html:target/thml/"},
		features="src/test/resources"
		
		)

public class CukesRunner {}
