Compile all source files intially:

javac -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" *.java

Then to run all the tests at once run the test suite:

java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestSuiteAll

// End of file
