package ExceptionHandling;

 class InvalidAgeException extends Exception {
    InvalidAgeException(String str) {
        super(str);
    }

}

class TestException {
    static void invalidAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You can not vote ");
        }
    }

    public static void main(String[] args) {
        try{
            invalidAge(14);
            System.out.println("You are eligible to vote");
        }
        catch(InvalidAgeException e){
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());

        }
    }
}
