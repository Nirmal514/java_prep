# Reversing a Number in Java
Here is a simple Java program that reverses a given number:

int num = 1234;
int rev = 0;

while (num != 0) {
    int digit = num % 10;
    rev = rev * 10 + digit;
    num /= 10;
}

System.out.println("Reversed: " + rev);