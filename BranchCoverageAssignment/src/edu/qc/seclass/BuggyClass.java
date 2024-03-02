package edu.qc.seclass;

public class BuggyClass {

    public int buggyMethod1(int x, int y) {
        int quotient = 0;
        quotient = x/y;
        if(quotient>0){
            System.out.println("You entered a valid input.");
            System.out.println("If y equals 0, you messed up.");
        }
        return quotient;
    }

    public int buggyMethod2(int x, int y) {
        int quotient = 0;
        if(x>=0){
            System.out.println("Good choice for x, we can divide values greater than or equal to zero, but 0 divided by anything is always 0.");
        } else if(x<0){
            System.out.println("We can divide negative values, so this is fine too.");
        }
        quotient=x/y;
        return quotient;

    }

    public int buggyMethod3(int x, int y){
        int quotient = 0;
        if(x>0){
            System.out.println("Good choice for x, we can divide values greater than zero.");
        } else if(x<0){
            System.out.println("We can divide negative values, so this is fine too.");
        }
        quotient=x/y;
        return quotient;
    }

    public void buggyMethod4(int x, int y){
        //I do not believe it is possible to have 100% statement coverage and reveal a fault, but have 100% branch coverage and not reveal the fault. Statement coverage executes every
        //statement. 100% branch coverage implies 100% statement coverage, so if there is a fault found in the statement coverage, it would also be found in the branch coverage.
    }

    public void buggyMethod5(int i){
        //I do not believe it is possible to have 100% statement coverage and not reveal the fault given the code skeleton.
        //With 100% statement coverage, that would mean that we have to execute every line of code. Since 'i' is the numerator, and is the only variable, it changes nothing.
        //We can make as many test cases as we want, but the denominator will always be zero. Since we are executing every line of code, even if we make 1,000,000 test cases
        //that go around that line of code, we will eventually have to hit that line of code to get 100% statement coverage, which will reveal the fault.

    }


}
