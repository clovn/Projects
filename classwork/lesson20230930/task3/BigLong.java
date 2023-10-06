import java.util.Arrays;
import java.util.Objects;

public class BigLong {
    private int[] number;
    private int length;

    public BigLong(String num){

        length = num.length();

        // if(length < 20){
        // 	throw new SmallValueException();
        // }

        number = new int[length];

        for(int i = 0; i < length; i++){
            number[length - i - 1] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
    }

    public BigLong(int length){
        this.length = length;

        // if(length < 20){
        // 	throw new SmallValueException();
        // }

        number = new int[length];
    }


    public static BigLong sum(BigLong num1, BigLong num2){
        int resLength = Math.max(num1.length, num2.length);
        BigLong result = new BigLong(resLength);

        num1.number = Arrays.copyOf(num1.number, resLength);
        num2.number = Arrays.copyOf(num2.number, resLength);

        for(int i = 0; i < resLength; i++){
            int valueOfSum = num1.number[i] + num2.number[i];
            result.addDigits(valueOfSum, i);
        }

        return result;
    }

    public static BigLong product(BigLong num1, int digit){
        BigLong result = new BigLong(num1.length);

        for(int i = 0; i < num1.length; i++){
            int valueOfSum = num1.number[i]*digit;
            result.addDigits(valueOfSum, i);
        }

        return result;
    }

    private void addDigits(int digit, int index){
        if(index == length - 1 && digit > 9){
            number = Arrays.copyOf(number, length + 1);

            number[index] += digit % 10;
            number[index + 1] = digit / 10;

            length++;
        } else if (index == length - 1) {
            number[index] += digit;
        } else {
            number[index] += digit % 10;
            number[index + 1] = digit / 10;
        }
    }

    public int getLength(){
        return length;
    }

    @Override
    public String toString(){
        String res = "";

        for(int i = 0; i < length; i++){
            res += number[length - i - 1];
        }

        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BigLong bigLong = (BigLong) o;
        return length == bigLong.length && Arrays.equals(number, bigLong.number);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(length) + Arrays.hashCode(number);
    }
}

class SmallValueException extends RuntimeException {

}