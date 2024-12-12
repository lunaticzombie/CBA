# CBA Test Task 3

To run the reggretion Test Suite:
1. clone the repository in local machine which has Java and Maven installed and an editor like VS Code or IntelliJ
2. from IDE, run test cases inside PetTests class of api.test package

Immediate Improvements:
Add missing Test cases. Due to time limitation, I just did the basic CRUD operations..
Instead of Hardcoding test cases, test data can be moved to Input JSON file
Lot of Boilerplate code can be reduced, using annotations..
use Log4j2 library for Logger functionality
use Extent Report utility to create user friendly reporting
utilize plugins like compiler and Surefire, to be able to run test cases outside IDE. And extend this to POM file so that we can use tools like Jenkins for CI/CD
