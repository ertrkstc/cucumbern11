### selenium-cucumber-java

This repository contains a collection of sample `selenium-cucumber-java` projects and libraries that demonstrate how to
use the tool and develop automation script using the Cucumber (v 3.0.0) BDD framework with Java as programming language.
It generate HTML and JSON reporters as well. 
 
### Installation (pre-requisites)

1. JDK 1.8+ (make sure Java class path is set)
2. Maven (make sure .m2 class path is set)
3. Intellij IDEA
4. Intellij IDEA Plugins for- Maven - Cucumber
5. Browser driver (make sure you have your desired browser driver and class path is set)


### The Page Object Design Pattern

Within your web app's UI there are areas that your tests interact with. A Page Object simply models these as objects
within the test code. This reduces the amount of duplicated code and means that if the UI changes, the fix need only be
applied in one place. In other wards one of the challenges of writing test automation is keeping your [selectors] (
classes, id's, or xpath' etc.) up to date with the latest version of your code. The next challenge is to keep the code
you write nice and `DRY (Don't Repeat Yourself)`. The page object pattern helps us accomplish this in one solution.
Instead of including our selectors in our step definitions(in cucumber) we instead place them in a <pagename>.java file
where we can manage all these selectors and methods together. Your test file should only call the test methods.
 

You can also place reusable methods or logic inside of these pages and call them from your step java files. The page
object serves as a layer of abstraction between tests and code. When A test fails, it fails on a individual step. That
step may call a selector that is no longer valid, but that selector may be used by many other steps. By having a single
source of truth of what the selector is supposed to be, fixing one selector on the page object could repair a number of
failing tests that were affected by the same selector.


### Contribution

Create a fork of the project into your own repository. Make all your necessary changes and create a pull request with a
description on what was added or removed and details explaining the changes in lines of code. If approved, project
owners will merge it.

 
