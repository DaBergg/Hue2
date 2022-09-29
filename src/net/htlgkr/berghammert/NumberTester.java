package net.htlgkr.berghammert;

public class NumberTester {
    private String filename;
    NumberTest oddTeser;
    NumberTest primeTester;
    NumberTest palindromeTester;

    public NumberTester(String fileName) {
        this.filename = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTeser = oddTester;
    }
    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }
    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }
    public void testFile() {

    }
}
