package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class a02Lambda2 {


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, -1, 3, -8, 13, 17, 48,6, 9, 129, 15, 19, -78));
        List<String> strings = new ArrayList<>(Arrays.asList("yuns", "kk", "karazkaya", "a", "xyz"));
        System.out.println(noNeg(nums));
        System.out.println(no9(nums));
        System.out.println(noTeen(nums));
        System.out.println(noZ(strings));
        System.out.println(noLong(strings));
        System.out.println(no34(strings));
        System.out.println(noYY(strings));
        System.out.println(two2(nums));
        System.out.println(square56(nums));
    }

    /*

Given a list of integers, return a list of the integers, omitting any that are less than 0.
Gibt eine Liste von ganzen Zahlen zurück, wobei alle Zahlen, die kleiner als 0 sind, weggelassen werden.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []


     */
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(t -> t >= 0).collect(Collectors.toList());

    }

    /*

    Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
    Gibt eine Liste von nicht-negativen ganzen Zahlen zurück, wobei alle Zahlen, die mit 9 enden, weggelassen werden. (Hinweis: % durch 10)

    no9([1, 2, 19]) → [1, 2]
    no9([9, 19, 29, 3]) → [3]
    no9([1, 2, 3]) → [1, 2, 3]
     */
    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(t -> t % 10 != 9).collect(Collectors.toList());
    }


/*

Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
Gibt eine Liste ganzer Zahlen zurück, wobei alle Zahlen, die zwischen 13 und einschließlich 19 liegen, weggelassen werden.


noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
 */

    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(t -> t < 13 || t > 19).collect(Collectors.toList());
    }

    /*

Given a list of strings, return a list of the strings, omitting any string that contains a "z".
(Note: the str.contains(x) method returns a boolean)

Gibt eine Liste von Strings zurück, wobei alle Strings weggelassen werden, die ein "z" enthalten.
(Hinweis: Die Methode str.contains(x) gibt einen booleschen Wert zurück)

noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
     */

    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(t -> !t.contains("z")).collect(Collectors.toList());
    }

    /*

Given a list of strings, return a list of the strings, omitting any string length 4 or more.
Gibt eine Liste von Zeichenketten zurück, wobei alle Zeichenketten der Länge 4 oder mehr weggelassen werden.


noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
     */

    public static List<String> noLong(List<String> strings) {
        return strings.stream().filter(t -> t.length() < 4).collect(Collectors.toList());
    }


    /*

Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
Gibt eine Liste von Zeichenketten zurück, wobei alle Zeichenketten der Länge 3 oder 4 weggelassen werden.

no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]

     */

    public static List<String> no34(List<String> strings) {
        return strings.stream().filter(t -> (t.length() != 3) && (t.length() != 4)).collect(Collectors.toList());

    }

    /*

Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings
that contain "yy" as a substring anywhere.
Aus einer Liste von Zeichenketten wird eine Liste zurückgegeben, bei der an das Ende jeder Zeichenkette ein
 "y" angehängt wird, wobei alle resultierenden Zeichenketten, die irgendwo "yy" als Teilzeichenfolge enthalten, weggelassen werden.

noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
     */

    public static List<String> noYY(List<String> strings){
        return strings.stream().map(t->t+"y").filter(t->!t.contains("yy")).collect(Collectors.toList());
    }


    /*
    Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
Gibt eine Liste nichtnegativer ganzer Zahlen zurück, die mit 2 multipliziert wurde, wobei alle resultierenden Zahlen, die mit 2 enden, weggelassen werden.
                    two2([1, 2, 3]) → [4, 6]
                    two2([2, 6, 11]) → [4]
                    two2([0]) → [0]


     */

    public static List<Integer> two2(List<Integer> nums){
        return nums.stream().map(t->t*2).filter(t->t%10!=2).collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the
    resulting numbers that end in 5 or 6.

    Gibt eine Liste ganzer Zahlen zurück, in der diese Zahlen quadriert und das Produkt zu 10 addiert wird, wobei alle
     resultierenden Zahlen, die auf 5 oder 6 enden, weggelassen werden.


square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]
     */

    public static List<Integer> square56(List<Integer> nums){
        return nums.stream().map(t->(t*t)+10).filter(t->t%10!=6).filter(t->t%10!=5).collect(Collectors.toList());
    }
}
