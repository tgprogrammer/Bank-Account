package gross_calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class MakeupExam {

    public static Map getOriginalGrades() {
        Map grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Johnny", 50);
        grades.put("Schlanda", 79);
        grades.put("Sean", 32);
        grades.put("Mark", 80);
        grades.put("Jeremy", 40);
        grades.put("Mary", 59);
        grades.put("Amber", 55);
        grades.put("Salah", 95);
        grades.put("Jason", 63);

        return grades;
    }

    public static Map getMakeUpGrades() {

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Johnny", 89);
        grades.put("Schlanda", 79);
        grades.put("Sean", 82);
        grades.put("Mark", 76);
        grades.put("Jeremy", 98);
        grades.put("Mary", 80);
        grades.put("Amber", 95);
        grades.put("Salah", 90);
        grades.put("Jason", 62);

        return grades;
    }

    public static void main(String[] args) {
        Map betterGrade = new HashMap();

        Map<String, Integer> originalGrades = getOriginalGrades();
        Map<String, Integer> makeupGrades = getMakeUpGrades();

        originalGrades.forEach((k,v) -> {
           if(makeupGrades.get(k) > v) {
               originalGrades.put(k, makeupGrades.get(k));
           }
        });
//        System.out.println(originalGrades);

        //print my name as tania goyal

        Function<Integer, Integer> square = (n) -> n * n;
        Function<Integer, Integer> add = (n) -> n + n;
        var result = square.andThen(add).apply(5);
        System.out.println(result);



    }
}
